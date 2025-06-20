# TabLab
A tool that generates Java source code from tab-separated value files, such as those from spreadsheets.

First off, TabLab probably doesn't have much application for most people. It's meant for cases where a lot of data needs
to be entered in a convenient manner, then exported so that Java can read it without involving any 3rd-party libraries.
If you don't like working with spreadsheets for data entry, or your data is highly-relational and would work better with
a SQL-like database than a only-slightly-relational spreadsheet, then you may want to look into alternatives that fit
your usage. But if you have some case where there are many fields, all strongly-typed, and you don't want to enter large
amounts of boilerplate to make the data usable, TabLab may come in handy. It has some extra features that may "sweeten
the deal," like being able to have one cell of a spreadsheet (that is, one string with no tabs in it, corresponding to a
single row and column) refer to an array of items with a certain type, or even a Map of keys to values (with keys and
values potentially having different types). It generates normal Java source code, with the only runtime dependency
beyond the data files being a two-method "library" file also generated to allow Map cells to be conveniently used. Even
that micro-library file isn't necessary if you already use [SquidLib](https://github.com/SquidPony/SquidLib), since
TabLab has an option to generate OrderedMap files using that class from SquidLib's collections, instead of the default
LinkedHashMap from the JDK. Even more features are available if you use [jdkgdxds](https://github.com/tommyettinger/jdkgdxds)
collections, such as primitive-key and/or primitive-value Maps as items of cells, and Junction cells that represent
easy-to-read instructions for a predicate to operate by.

## Usage

Typically, you don't need to build TabLab, and can use the runnable .jar file or the Windows .bat files that wrap that
.jar, with the current stable version conveniently in the Releases section of the repo,
https://github.com/tommyettinger/TabLab . Most of the instructions to TabLab are in the input files themselves, rather
than given at the command line. Currently, the only input that TabLab takes on the command line consists of the file
name(s) of the input file(s) to process, and optionally one of these case-insensitive arguments:

 - `--libGDX` will generate code that uses [libGDX](https://libgdx.com) collections instead of JDK ones.
 - `--SquidLib` will generate code that uses [SquidLib](https://github.com/yellowstonegames/SquidLib) collections instead of JDK ones.
 - `--jdkgdxds` will generate code that uses [jdkgdxds](https://github.com/tommyettinger/jdkgdxds) collections instead of JDK ones (recommended).

The .bat files allow dragging-and-dropping one or more input files
onto the .bat file, which will process all of them and wait for a key press at the end. Within the input file, the
syntax is mostly that rows are separated by newlines (Unix or Win32 conventions both work), and the cells of each row
are separated by tabs. Currently only Win32-style bat files are provided, but if someone provides Unix .sh scripts that
do the same drag-and-drop task, I'll gladly add them to the repo.

The first part of the input file is, as in most TSV files, a header line. It contains the column names and types, with
one cell per column. This means both name and type are in the same cell; they are separated by a colon, `:`. If a caret,
`^`, is present at the end of a cell immediately after the type (or after the name if no colon is present), it marks
that column as the key if it has the String type (the default). The key can be used to look up specific matching lines
given a String identifier with the static `get(String)` method on each generated class, as well as allowing other TabLab
input files to reference lines of content from that TabLab file. The Strings used as keys should be unique, but having
duplicates won't change the generated array `ENTRIES`, only the generated Map `MAPPING` and static method `get(String)`.

Supported "basic" types are:
  - `String`, referring to `java.lang.String`
    - This is the default if no type at all is specified for a column, when no colon is present.
    - It can also be written with the aliases `str` and `s`.
    - This may be used as a key in a map if you use jdkgdxds.
    - Only this type can be used as a key to the generated MAPPING; typically the first column is a String for the key.
  - `boolean`, the primitive true-or-false type; this will be boxed if used in a map.
    - It can also be written with the aliases `bool` and `b`.
  - `char`, the primitive character type; this will be boxed if used in a map.
    - It can also be written with the alias `c`.
  - `int`, the primitive 32-bit integer type; this will be boxed if used in a map, unless you use jdkgdxds.
    - It can also be written with the alias `i`.
    - This may be used as a key in a map if you use jdkgdxds.
  - `long`, the primitive 64-bit integer type; this will be boxed if used in a map, unless you use jdkgdxds.
    - It can also be written with the alias `l`; be careful that this isn't mistaken for another symbol, like `1`.
    - This may be used as a key in a map if you use jdkgdxds.
  - `float`, the primitive 32-bit floating-point type; this will be boxed if used in a map, unless you use jdkgdxds.
    - It can also be written with the alias `f`.
  - `double`, the primitive 64-bit floating-point type; this will be boxed if used in a map.
    - It can also be written with the alias `d`.
  - `Junction`, a class only in jdkgdxds that acts as an easy-to-read predicate for Collections of String.
    - This may be used as a key in a map if you use jdkgdxds.
    - If used without jdkgdxds, this is treated as a String. 
    - It can also be written with the alias `j`.
  - Any class generated by TabLab in the same package, as long as the other class has a key column.
    - The type here should be just the class section of the top line, such as `Job`, not `generated.Job`.

In addition to this, there are some "group" types with multiple values in one cell, with the boundary between values
specified in the name of the type. The boundary is meant to be adapted to fit whatever data you have, so if you have
String values separated by a comma and a space in a list inside a cell, you could use `, ` as the separator in an array
type. This would look like `String[, ]` as the type. You could also use String as the type if you want to parse it
yourself, or if you have some especially complicated case in each cell. Supported "group" types are:

  - Arrays containing items of a basic type (one type per array).
    - These are written with the basic type's name or alias, followed immediately by square brackets with the boundary
      inside those brackets.
    - This looks like `String[ ]` for space-separated Strings, or `i[;;]` for ints separated by two semicolons.
    - When you write an array value, you separate each basic item in it with the boundary. In the first example given,
      with the type `String[ ]`, this would look like `Bill Bob Carl Joe` to produce a 4-element array of Strings.
  - Maps containing keys of a basic type and values of a possibly-different basic type (one key type, one value type).
    - These are written with the key type's name or alias, followed immediately by curly braces with the boundary inside
      those braces, and immediately after that the value type's name or alias.
    - This looks like `String{, }double` for maps with String keys and Double values (the doubles become boxed in maps)
      separated by comma and space, or `i{ }s` for maps with Integer keys and String values separated by space.
    - When you write a map value, you separate each key and each value in it with the boundary. In the first example
      given, with the type `String{, }double`, this would look like `Bill, 2.3, Bob, 4.2, Carl, 3.14, Joe, 9999` to
      produce a map with 4 key-value pairs.
    - If you use the `--jdkgdxds` argument, you can use int or long keys, and they won't be boxed. Similarly, you can
      use int, long, or float values without boxing. The syntax is the same.
  - Maps containing keys of a basic type and values that are each arrays of a basic type (one type for the keys and one
    array type for the values).
    - This looks like `String{,}int[/]` for a case where keys are `String`s and values are arrays of `int`.
    - A sample that uses this would be `"Jim,1/2/4,Pam,5/1/1,Dwight,0/0/-1"`

An example header line looks like:

```
name	description	offense:int	defense:int	talents:Talent[;;]	skills:str{,}int
```

Here, name and description are String type because no type is specified, offense and defense are int type, talents is an
array of Talent values (where Talent is expected to be made by TabLab at some point before this class is compiled)
separated by two semicolons, and skills is a map of String keys to int values, separated by commas. Since the top
line specified name as the key column, this `Job` class could be used from other TabLab data, where a row would be
referenced by a (unique) value in the name column here.

After the header line, it's just filling as many rows as you need with data that matches the types in the header.
With the header above, a row of that data could look like:

```
Ninja	A nimble assassin	9	1	Poison;;Martial Arts	Vanish,2,Smoke Bomb,1,Shadow Dagger,2
```

This makes the name (and so the key) `Ninja`, the description `A nimble assassin`, the offense value `9`, the defense
value `1`, the Talents array reference two talents called `Poison` and `Martial Arts`, and the skills map consisting
of `Vanish` mapped to `2`, `Smoke Bomb` mapped to `1`, and `Shadow Dagger` mapped to `2`. The Talent objects will be
looked up in a class in the same package (by default, `generated.tablab`), calling `Talent.get("Poison")` to get the
first Talent instance and `Talent.get("Martial Arts")` to get the other. If you have your own non-TabLab class that you
want to use like Talent is used here, you just need it to have a static method `get()` that takes a String and returns
an appropriate instance of that class.

## Generated Code

The code generated by TabLab will typically all be in one package, `generated.tablab` by default, which will also
include the micro-library file `TabLabTools.java` unless SquidLib or jdkgdxds is being used. Every generated file that
corresponds to a tab-separated value input file will have fields that match the columns in the input (including types,
with String as the default), plus a constructor that sets all fields, a zero-argument constructor, a `hashCode()` method
that hashes by value, an `equals()` method that compares all fields, a static array `ENTRIES` that stores references to
all the rows of data in the input file, and (if there was a key column) a static Map `MAPPING` of key Strings to values
of this data type with a `get(String)` method in this class to easily retrieve them. There's also a `hash64()` method,
which mainly matters if you want a probably-unique 64-bit long to associate with a row of data, or if you have some
collection that can use 64-bit hashes; it's used here to ensure the result of `hashCode()` is the same on GWT (which
does math correctly on longs, but not necessarily on ints) as on desktop and other platforms. You may want to wrap the
generated data in some other class (in another file) to add functionality, so updates to the input files can be
processed and the resulting output files can replace old generated data, without needing to re-enter the changes for new
functionality.

OK, enjoy!
