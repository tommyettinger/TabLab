package com.github.tommyettinger.tablab.generated;

import static com.github.tommyettinger.tablab.generated.TabLabTools.makeMap;

import java.util.Map;

public class Job {
  public static final Job[] ENTRIES = new Job[] {
    new Job("Abjurer", "A defensive mage", 1, 9, new String[] {"Haze", "Warding Tome"}, makeMap("Mist Shackles", 1, "Barricade", 2, "Stony Shield", 3, "Body of Iron", 1)),
    new Job("Ninja", "A nimble assassin", 9, 1, new String[] {"Poison", "Martial Arts"}, makeMap("Vanish", 2, "Smoke Bomb", 1, "Shadow Dagger", 2)),
  };

  public String name;

  public String description;

  public int offense;

  public int defense;

  public String[] talents;

  public Map<String, Integer> skills;

  public Job(String name, String description, int offense, int defense, String[] talents,
      Map<String, Integer> skills) {
    this.name = name;
    this.description = description;
    this.offense = offense;
    this.defense = defense;
    this.talents = talents;
    this.skills = skills;
  }
}
