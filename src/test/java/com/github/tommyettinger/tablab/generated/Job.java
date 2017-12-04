package com.github.tommyettinger.tablab.generated;

import static com.github.tommyettinger.tablab.generated.TabLabTools.makeMap;

import java.io.Serializable;
import java.util.Map;

public class Job implements Serializable {
  public static final long serialVersionUID = 1L;

  public static final Job[] ENTRIES = new Job[] {
    new Job("Abjurer", "A defensive mage", 1, 9, new Talent[] {Talent.get("Haze"), Talent.get("Warding Tome")}, makeMap("Mist Shackles", 1, "Barricade", 2, "Stony Shield", 3, "Body of Iron", 1)),
    new Job("Brute", "A hulking bruiser", 10, 0, new Talent[] {Talent.get("Destruction")}, TabLabTools.<String, Integer>makeMap()),
    new Job("Ninja", "A nimble assassin", 9, 1, new Talent[] {Talent.get("Poison"), Talent.get("Martial Arts")}, makeMap("Vanish", 2, "Smoke Bomb", 1, "Shadow Dagger", 2)),
  };

  public static final Map<String, Job> MAPPING = makeMap(
  "Abjurer", ENTRIES[0], "Brute", ENTRIES[1], "Ninja", ENTRIES[2]);

  public String name;

  public String description;

  public int offense;

  public int defense;

  public Talent[] talents;

  public Map<String, Integer> skills;

  public Job() {
  }

  public Job(String name, String description, int offense, int defense, Talent[] talents,
      Map<String, Integer> skills) {
    this.name = name;
    this.description = description;
    this.offense = offense;
    this.defense = defense;
    this.talents = talents;
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
    result += (a ^= 0x8329C6EB9E6AD3E3L * hashBasic(skills));
    return result * (a | 1L) ^ (result >>> 27 | result << 37);
  }

  public int hashCode() {
    return (int)(hash64() & 0xFFFFFFFFL);
  }

  public static Job get(String item) {
    return MAPPING.get(item);
  }
}
