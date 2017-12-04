package com.github.tommyettinger.tablab.generated;

import static com.github.tommyettinger.tablab.generated.TabLabTools.makeMap;

import java.io.Serializable;
import java.util.Map;

public class Talent implements Serializable {
  public static final long serialVersionUID = 1L;

  public static final Talent[] ENTRIES = new Talent[] {
    new Talent("Haze", "Your presence clouds the minds of nearby enemies, decreasing their Accuracy."),
    new Talent("Warding Tome", "Carrying a Spellbook sharply increases your Defense."),
    new Talent("Destruction", "Your attacks ignore Defense from shields."),
    new Talent("Poison", "When your attacks deal damage, half that damage is dealt again in one round."),
    new Talent("Martial Arts", "You are immune to the Inaction and Grappled conditions."),
  };

  public static final Map<String, Talent> MAPPING = makeMap(
  "Haze", ENTRIES[0], "Warding Tome", ENTRIES[1], "Destruction", ENTRIES[2], "Poison",
  ENTRIES[3], "Martial Arts", ENTRIES[4]);

  public String name;

  public String description;

  public Talent() {
  }

  public Talent(String name, String description) {
    this.name = name;
    this.description = description;
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
    return result * (a | 1L) ^ (result >>> 27 | result << 37);
  }

  public int hashCode() {
    return (int)(hash64() & 0xFFFFFFFFL);
  }

  public static Talent get(String item) {
    return MAPPING.get(item);
  }
}
