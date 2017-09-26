package com.github.tommyettinger.tablab.generated;

import java.lang.String;

public class Job {
  public static final Job[] ENTRIES = new Job[] {
    new Job("Abjurer", "A defensive mage", 1, 9, new String[] {"Haze", "Mist Shackles", "Barricade", "Stony Shield", "Body of Iron"}),
    new Job("Ninja", "A nimble assassin", 9, 1, new String[] {"Vanish", "Poison", "Smoke Bomb", "Ninjutsu"}),
  };

  public String name;

  public String description;

  public int offense;

  public int defense;

  public String[] skills;

  public Job(String name, String description, int offense, int defense, String[] skills) {
    this.name = name;
    this.description = description;
    this.offense = offense;
    this.defense = defense;
    this.skills = skills;
  }
}
