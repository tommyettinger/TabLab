package com.github.tommyettinger.tablab.generated;

import static com.github.tommyettinger.tablab.generated.TabLabTools.makeMap;

import java.util.Map;

public class Talent {
  public static final Talent[] ENTRIES = new Talent[] {
    new Talent("Haze", "Your presence clouds the minds of enemies, decreasing their Accuracy."),
    new Talent("Warding Tome", "Carrying a Spellbook sharply increases your Defense."),
    new Talent("Poison", "When your attacks deal damage, half that damage is dealt again in one round."),
    new Talent("Martial Arts", "You are immune to the Inaction condition."),
  };

  public static final Map<String, Talent> MAPPING = makeMap(
  "Haze", ENTRIES[0], "Warding Tome", ENTRIES[1], "Poison", ENTRIES[2], "Martial Arts",
  ENTRIES[3]);

  public String name;

  public String description;

  public Talent(String name, String description) {
    this.name = name;
    this.description = description;
  }
}
