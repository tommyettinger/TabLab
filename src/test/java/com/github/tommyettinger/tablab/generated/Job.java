package com.github.tommyettinger.tablab.generated;

import java.lang.String;

public class Job {
  public static final Job[] ENTRIES = new Job[] {
    new Job("Abjurer", "A defensive mage", 1, 9, new String[] {"Haze", "Mist Shackles", "Barricade", "Stony Shield", "Body of Iron"}, new int[] {3, 1, 2, 3, 1}),
    new Job("Ninja", "A nimble assassin", 9, 1, new String[] {"Vanish", "Poison", "Smoke Bomb", "Ninjutsu"}, new int[] {4, 2, 1, 3}),
  };

  public String name;

  public String description;

  public int offense;

  public int defense;

  public String[] skills;

  public int[] ranks;

  public Job(String name, String description, int offense, int defense, String[] skills,
      int[] ranks) {
    this.name = name;
    this.description = description;
    this.offense = offense;
    this.defense = defense;
    this.skills = skills;
    this.ranks = ranks;
  }
}
