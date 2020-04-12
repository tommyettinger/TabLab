package generated;

import java.io.Serializable;
import java.util.Map;

import static generated.TabLabTools.makeMap;

public class Talent implements Serializable {
  public static final long serialVersionUID = 1L;

  public static final Talent[] ENTRIES = new Talent[] {
    new Talent("Haze", "Your presence clouds the minds of nearby enemies, decreasing their Accuracy.", -6467888656123427746L),
    new Talent("Warding Tome", "Carrying a Spellbook sharply increases your Defense.", -1688605669775076427L),
    new Talent("Destruction", "Your attacks ignore Defense from shields.", -6657196988632068660L),
    new Talent("Poison", "When your attacks deal damage, half that damage is dealt again in one round.", -5229996026654093878L),
    new Talent("Martial Arts", "You are immune to the Inaction and Grappled conditions.", -242869033625184715L),
  };

  public static final Map<String, Talent> MAPPING = makeMap(
  "Haze", ENTRIES[0], "Warding Tome", ENTRIES[1], "Destruction", ENTRIES[2], "Poison",
  ENTRIES[3], "Martial Arts", ENTRIES[4]);

  public String name;

  public String description;

  private long __code;

  public Talent() {
  }

  public Talent(String name, String description, long __code) {
    this.name = name;
    this.description = description;
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
    Talent other = (Talent) o;
    if (name != null ? !name.equals(other.name) : other.name != null) return false;
    if (description != null ? !description.equals(other.description) : other.description != null) return false;
    return true;
  }

  public static Talent get(String item) {
    return MAPPING.get(item);
  }
}
