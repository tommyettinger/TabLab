package generated;

import static generated.TabLabTools.makeMap;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

public class Job implements Serializable {
  public static final long serialVersionUID = 1L;

  public static final Job[] ENTRIES = new Job[] {
    new Job("Abjurer", "A defensive mage", 1, 9, new Talent[] {Talent.get("Haze"), Talent.get("Warding Tome")}, Talent.get("Haze"), makeMap("Mist Shackles", new int[] {-1, 3}, "Barricade", new int[] {-3, 5}, "Stony Shield",
    new int[] {1, 1}, "Body of Iron", new int[] {0, 2}), 8342000984166875779L),
    new Job("Brute", "A hulking bruiser", 10, 0, new Talent[] {Talent.get("Destruction")}, Talent.get("Destruction"), TabLabTools.<String, int[]>makeMap(), -1442867205731791938L),
    new Job("Ninja", "A nimble assassin", 9, 1, new Talent[] {Talent.get("Poison"), Talent.get("Martial Arts")}, Talent.get("Martial Arts"), makeMap("Vanish", new int[] {0, 2}, "Smoke Bomb", new int[] {1, 1}, "Shadow Dagger", new int[] {4, -2}), 4420379283455912804L),
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

  private long __code;

  public Job() {
  }

  public Job(String name, String description, int offense, int defense, Talent[] talents,
      Talent favorite, Map<String, int[]> skills, long __code) {
    this.name = name;
    this.description = description;
    this.offense = offense;
    this.defense = defense;
    this.talents = talents;
    this.favorite = favorite;
    this.skills = skills;
    this.__code = __code;
  }

  public long hash64() {
    return __code;
  }

  public int hashCode() {
    return (int)__code;
  }

  private static boolean stringArrayEquals(String[] left, String[] right) {
    if (left == right) return true;
    if (left == null || right == null) return false;
    final int len = left.length;
    if(len != right.length) return false;
    for (int i = 0; i < len; i++) { if(!java.util.Objects.equals(left[i], right[i])) return false; }
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
