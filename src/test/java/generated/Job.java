package generated;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

import static generated.TabLabTools.makeMap;

public class Job implements Serializable {
  public static final long serialVersionUID = 1L;

  public static final Job[] ENTRIES = new Job[] {
    new Job("Abjurer", "A defensive mage", 1, 9, new Talent[] {Talent.get("Haze"), Talent.get("Warding Tome")}, Talent.get("Haze"), makeMap("Mist Shackles", new int[] {-1, 3}, "Barricade", new int[] {-3, 5}, "Stony Shield",
    new int[] {1, 1}, "Body of Iron", new int[] {0, 2})),
    new Job("Brute", "A hulking bruiser", 10, 0, new Talent[] {Talent.get("Destruction")}, Talent.get("Destruction"), TabLabTools.<String, int[]>makeMap()),
    new Job("Ninja", "A nimble assassin", 9, 1, new Talent[] {Talent.get("Poison"), Talent.get("Martial Arts")}, Talent.get("Martial Arts"), makeMap("Vanish", new int[] {0, 2}, "Smoke Bomb", new int[] {1, 1}, "Shadow Dagger", new int[] {4, -2})),
  };

  public static final Map<String, Job> MAPPING = makeMap(
  "Abjurer", ENTRIES[0], "Brute", ENTRIES[1], "Ninja", ENTRIES[2]);

  public String name;

  public String description;

  public int offense;

  public int defense;

  public Talent[] talents;

  public Talent favorite;

  public Map<String, int[]> skills;

  public Job() {
  }

  public Job(String name, String description, int offense, int defense, Talent[] talents,
      Talent favorite, Map<String, int[]> skills) {
    this.name = name;
    this.description = description;
    this.offense = offense;
    this.defense = defense;
    this.talents = talents;
    this.favorite = favorite;
    this.skills = skills;
  }

  private static long hash64(String data) {
    if (data == null) return 0;
    long result = 0x9E3779B97F4A7C94L, a = 0x632BE59BD9B4E019L;
    final int len = data.length();
    for (int i = 0; i < len; i++)
      result += (a ^= 0x8329C6EB9E6AD3E3L * data.charAt(i));
    return result * (a | 1L) ^ (result >>> 27 | result << 37);
  }

  private static long hashBasic(Object data) {
    return (data == null) ? 0 : data.hashCode() * 0x5851F42D4C957F2DL + 0x14057B7EF767814FL;
  }

  public long hash64() {
    long result = 0x9E3779B97F4A7C94L, a = 0x632BE59BD9B4E019L, innerR, innerA;
    int len;
    result += (a ^= 0x8329C6EB9E6AD3E3L * hash64(name));
    result += (a ^= 0x8329C6EB9E6AD3E3L * hash64(description));
    result += (a ^= 0x8329C6EB9E6AD3E3L * offense);
    result += (a ^= 0x8329C6EB9E6AD3E3L * defense);
    innerR = 0x9E3779B97F4A7C94L;
    innerA = 0x632BE59BD9B4E019L;
    len = (talents == null ? 0 : talents.length);
    for (int i = 0; i < len; i++) innerR += (innerA ^= 0x8329C6EB9E6AD3E3L * hashBasic(talents[i]));
    a += innerA;
    result ^= innerR * (innerA | 1L) ^ (innerR >>> 27 | innerR << 37);
    result += (a ^= 0x8329C6EB9E6AD3E3L * hashBasic(favorite));
    result += (a ^= 0x8329C6EB9E6AD3E3L * hashBasic(skills));
    return result * (a | 1L) ^ (result >>> 27 | result << 37);
  }

  public int hashCode() {
    return (int)(hash64() & 0xFFFFFFFFL);
  }

  private static boolean stringArrayEquals(String[] left, String[] right) {
    if (left == right) return true;
    if (left == null || right == null) return false;
    final int len = left.length;
    if(len != right.length) return false;
    String l, r;
    for (int i = 0; i < len; i++) { if(((l = left[i]) != (r = right[i])) && (((l == null) != (r == null)) || !l.equals(r))) { return false; } }
    return true;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Job other = (Job) o;
    if (name != null ? !name.equals(other.name) : other.name != null) return false;
    if (description != null ? !description.equals(other.description) : other.description != null) return false;
    if (offense != other.offense) return false;
    if (defense != other.defense) return false;
    if(!Arrays.deepEquals(talents, other.talents)) return false;
    if (favorite != null ? !favorite.equals(other.favorite) : other.favorite != null) return false;
    if (skills != null ? !skills.equals(other.skills) : other.skills != null) return false;
    return true;
  }

  public static Job get(String item) {
    return MAPPING.get(item);
  }
}
