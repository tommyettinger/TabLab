package generated;

import static generated.TabLabTools.makeMap;

import java.io.Serializable;
import java.util.Map;

public class Weapon implements Serializable {
  public static final long serialVersionUID = 1L;

  public static final Weapon[] ENTRIES = new Weapon[] {
    new Weapon("Axe", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 2, 2, 0, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, -1, -1, 4, 0, 0),
    new Weapon("Backpack", 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 0, 0, -3, -2, 0, 5, 0, 0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0),
    new Weapon("Ball", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 5, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0),
    new Weapon("Barrel", 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 2, 0, 0, 2, 0, 0, 1, 5, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0, 0, 2, -2, -2, 0, 5, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 0, 0),
    new Weapon("Bat", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 3, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 5, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0),
    new Weapon("Belt", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 4, 4, 0, 0, 5, 0, 3, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 2, -1, 0, -2),
    new Weapon("Blade", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 3, 2, 0, 3, 1, 0, 0, 0, 0, 3, 0, 0, -1, -1, -1, 0, 0, 0),
    new Weapon("Bomb", 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 5, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 3, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 3, 1, 0, 0, 0, 4, 0, -2, 0, -3, 0, 0, 0, 0, 5, 3, 0, 2, -5, -2, 2, 1, 1),
    new Weapon("Book", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 0, 2, 0, 0, 0),
    new Weapon("Boomerang", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 5, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 3, 0, 0, 0, -2, 1, 1, 0),
    new Weapon("Bow", 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 3, 1, 0, -2, -1, 3, 0, 4, 0, 0, 0, 0, 0, -1, 0, -1, 1, 0, 0),
    new Weapon("Bowling Pin", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 2, 0, 0, 0, 1, 0, 0, 0, 4, 0, 1, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 4, 0, 3, -1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, -1, 0, -1),
    new Weapon("Box", 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 5, 2, 0, 0, 0, 0, 4, 3, 0, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 5, 0, 0, 0, 0, 1, 0, -2, 0, 2, -2, -2, -1),
    new Weapon("Briefcase", 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, -2, -1, 0, 5, 0, 0, 0, 0, 5, 0, 3, 0, -2, 0, -1, 0),
    new Weapon("Broom", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 1, 0, 0, 3, 0, 0, 0, 0, 0, 1, 0, 1, 0, 3, 0, 2, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 2, -1, 2, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 3, -1, 0, -1),
    new Weapon("Can", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 3, 0, 1, 0, 0, 0, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, -1, 1, 0, 0, 0, 0, 1, 0, 3, 0, 4, 1, 0, 0),
    new Weapon("Candlestick", 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 4, 0, 0, 1, 0, 0, 0, 0, 0, 1, 2, 0, 2, 0, 0, 0, 0, 0, 1, 2, 0, 2, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 5, 0, 0, 0, 1, 0, 1, 0, 0, 2, 0, 0),
    new Weapon("Cane", 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 1, 2, 5, 0, 0, 0, 0, 0, 2, 5, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1, -1, 0, -1),
    new Weapon("Cape", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 3, 1, 1, 1, 3, 0, 0, 0, 0, 2, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, -1, 0, -1, 0, 0, 0),
    new Weapon("Card", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, -2, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 4, -1, 0, 1, 0, 0, 0, 0, 2, 5, 0, 2, 0, -2, 0),
    new Weapon("Cell Phone", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 5, 0, 0, 0, 0, 0, 5, 1, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 4, 0, 0, 0, 0, 3, 0, -1, 0, 2, 4),
    new Weapon("Chain", 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 2, 1, 1, 3, 0, 0, 0, 0, 4, 0, 2, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 3, 1, 0, -2, 0, 0, 1, 0, 0),
    new Weapon("Chainsaw", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 0, -1, 4, 0, 0, 0, 0, 1, 0, 0, 5, 5, 0, -2, -1, 0, 0, 0, 0, 0, 5, 0, 0, -3, -1, -1, 5, 2, 0),
    new Weapon("Chair", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 2, 3, 0, 0, 1, 0, 0, 4, 0, 0, 4, 0, 4, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 1, 0, 0),
    new Weapon("Crossbow", 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 5, 4, 0, -2, -3, 3, 0, 2, 0, 0, 0, 0, 0, -1, 0, -1, 1, 0, 1),
    new Weapon("Crowbar", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5),
    new Weapon("Dart", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 3, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, -1, 2, 0, 2, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0),
    new Weapon("Dice", 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 5, 5, -2, -1, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 1, -1, -2, 1),
    new Weapon("Discus", 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 2, 0, 4, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 1, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0),
    new Weapon("Dumbbell", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 4, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -1, -3, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 1, 0, 0, 2),
    new Weapon("Fan", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 5, 0, 0, 2, 0, 1, 2, 0, 0, 0, 0, 0, 5, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0, -2),
    new Weapon("Firework", 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 1, 1, -2, -2, 0, 0, 0, 0, 0, 0, 5, 0, 0, -2, 1, 3, 2, 0),
    new Weapon("Fist", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 2, 0, 0, 0, 1, 0, 5, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, -3),
    new Weapon("Flail", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 3, 4, 0, 0, 1, 0, 0, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 5, 4, 1, -1, 0, 0, 0, 0, 0, 0, 4, 0, 0, -3, -1, -2, 0, 1, 0),
    new Weapon("Flamethrower", 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 5, 0, 0, 0, 5, 5, 5, -3, -1, 0, 0, 0, 0, 0, 5, 1, 0, -3, -3, -3, 5, 2, 0),
    new Weapon("Flashlight", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 1, 0, 5, 2, 0, 2, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 1, 2, 0),
    new Weapon("Flute", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 4, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 3, -2, 1, 0, 0, 0, 0, 0, 0, 5, 0, -1, 0, -1, 1, 0, -1),
    new Weapon("Fork", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 2, 3, 0, 0, 0, 0, 0, 1, 0, 4, 0, 4, 0, -1, -2),
    new Weapon("Frying Pan", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 5, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
    new Weapon("Garbage Bin", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 2, 0, 3, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, -2, -2, -3, 5, 0, 0, 2, 0, 2, 0, -2, 0, 2, -3, 2, -1),
    new Weapon("Golf Club", 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 5, 0, 0, -1, 0, 2, 0, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0),
    new Weapon("Guitar", 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 3, 0, 0, 1, 0, 0, 1, 0, 2, 0, 0, 0, 2, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 2, -2, 1, 0, 0, 0, 0, 0, 0, 3, 0, -2, 0, 0, -2, 1, -2),
    new Weapon("Hairdryer", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 1, 1, 3, 2, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 1, 2, -2),
    new Weapon("Hammer", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 3, 1, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -1, -2, 1, 0, 0, 0, 0, 1, 0, 0, -2, 0, 2, -1, 0, 1),
    new Weapon("Hat", 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 3, 0, 0, 2, 0, 1, 0, 0, 0, 1, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, -1, 1, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0, 1, -1),
    new Weapon("Hatchet", 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, -1, 0, 0, 0, 0, 2, 0, 0, 0, -1, -1, 2, 0, 0),
    new Weapon("Hockey Stick", 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 4, 0, 0, 0, 0, 0, 3, 3, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 1, 0),
    new Weapon("Hook", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 4, 5, 4, 0, 0, 4, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, -3, 0, -1, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, 1, -1, 0),
    new Weapon("Hoop", 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 4, 1, 5, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 3, -3, 1, 0, 0, 0, 0, 0, 0, 2, 2, -2, 0, 1, -2, -2, -2),
    new Weapon("Hose", 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 2, 3, 0, 0, 3, 2, 4, 5, 0, 0, 0, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 1, 1),
    new Weapon("Jumprope", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, 0, 2, 3, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 1, 0, -2, -2),
    new Weapon("Knife", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 2, 0, 0, -1),
    new Weapon("Lamp", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 4, 0, 0, 5, 0, 0, 0, 1, 0, 3, 5, 0, 2, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 3, 0, -3, 0, 2, 0, 2, 0),
    new Weapon("Laptop", 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 1, 0, 5, 2, 0, 0, 0, -2, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 5, 0, 0, 1, 0, 1, 0, -1, -1, 0, 5),
    new Weapon("Lasso", 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 5, 5, 0, 0, 5, 5, 0, 0, 5, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -3, -1, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 2, 1, 0, -2),
    new Weapon("Leaf Blower", 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 4, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 5, 0, 3, 2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 3, -1, -2, 0, 0, 0, 0, 0, 0, 3, 0, -3, 0, 1, 1, 1, 0),
    new Weapon("Machete", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 3, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -2, -1, -2, 3, -2, -1),
    new Weapon("Microphone", 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 5, 0, 0, 1, 0, 0, 4, 0, 5, 0, 0, 0, 0, 0, 5, 2, 0, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, -1, 2, -2),
    new Weapon("Mop", 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 3, 2, 1, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 3, 0, 1, -1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 1, -2, 0, 2),
    new Weapon("Mouse", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 1, 2, 3, 4, 0, 0, 0, 0, 2, 1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1, 0, 2, -2),
    new Weapon("Mug", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 4, 5, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, -1, 2, 0, 0, 0, 0, 1, 0, 2, 0, 2, -1, 1, -2),
    new Weapon("Nail Gun", 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, 3, 3, 4, 4, 5, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 1, 1, 0),
    new Weapon("Needles", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 2, 2, 4, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, -2, -1),
    new Weapon("Night Stick", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 2, 1, 2, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 1, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0),
    new Weapon("Nunchucks", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 5, 5, 0, 3, 0, 0, 0, 0, 0, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0),
    new Weapon("Paddle", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 4, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, -2, 0, 0, 0, 0, 3, 0, 0, -1, 0, -1, -1, 1, -1),
    new Weapon("Pistol", 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 3, 0, -2, 0, 0, 4, 0, 0, 0, 1, 0, 0, 5, 3, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 1, -3, 0, 1, -2, -2),
    new Weapon("Plank", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 4, 3, 3, 0, 4, 0, 0, 0, 0, 0, 5, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, 0, 2, 0, 0, 0, 1, 0, -3, 0, 2, 1, 0, -1),
    new Weapon("Plunger", 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 5, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 1, 0, 0, 3, -2, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 1),
    new Weapon("Pole", 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 4, 3, 3, 0, 3, 0, 1, 4, 0, 0, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, -1, 0, 0, 0, 0, 0, 0, 2, -3, 0, 1, -1, 0, -1),
    new Weapon("Rake", 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 2, 2, 4, 2, 4, 0, 0, 0, 0, 1, 3, 2, 0, 2, 2, 0, 0, 0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, -2, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 2, 1, 1, -2),
    new Weapon("Ray Gun", 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 5, 1, 3, 0, 5, -3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 0, 0, 0, 2, 0, -5, -4, -1, -2, 3),
    new Weapon("Razor", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 3, 5, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2, -1, -2, -1),
    new Weapon("Rifle", 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0, 4, 0, -1, 0, 0, 4, 0, 0, 0, 1, 0, 0, 5, 4, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, -3, -3, 0, 2, -2, -2),
    new Weapon("Rock", 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 3, -2, 1, -2),
    new Weapon("Rolling Pin", 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 4, 2, 0, 0, 0, 2, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 1, 0),
    new Weapon("Ruler", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 5, 2, 0, 0, 0, 0, 0, 0, 1, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 0, 0, 0, 0, 3, 0, 0, 1, 0, 2, -2, 0, -2),
    new Weapon("Scissors", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 2, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 5, 4, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, -2, -2, 0),
    new Weapon("Screwdriver", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, -2, -2, 4),
    new Weapon("Scythe", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 3, 5, 0, 4, 0, 0, 0, 0, 0, 2, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -2, 0, -1, 0, 0, 0, 0, 5, 0, 2, -3, -2, -2, 1, -1, 0),
    new Weapon("Shield", 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 5, 5, 0, 2, 0, 0, 1, 0, 0, 4, 0, 0, 5, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -2, -1, -3, 0, 0, 0, 0, 0, 1, 0, -3, -1, -1, 2, 0, 1),
    new Weapon("Shoe", 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 3, 0, 2, 0, 0, 0, 3, 0, 0, 0, 3, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, -2, 1, 0, 0, 0, 0, 4, 0, 2, 0, 2, -2, 1, -2),
    new Weapon("Shotgun", 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 4, 0, -3, 0, 0, 4, 0, 0, 0, 1, 0, 0, 5, 5, 0, 0, -1, -2, 0, 0, 0, 0, 5, 0, 0, -3, -3, 0, 5, -2, -2),
    new Weapon("Shovel", 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 0, 3, 0, 0, 4, 0, 0, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 2, 1, -1, 1),
    new Weapon("Skateboard", 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 3, 1, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 2, 2, 0, 2, -2, 0, 0, 0, 0, 0, 2, 0, -1, 0, 1, -1, 2, -1),
    new Weapon("Spear", 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 2, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 4, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 4, 2, 0, -1, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, -1, -1, 2, -1, 0),
    new Weapon("Spray Paint", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 4, 1, 0, 1, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 5, 2, 2, 0, 0, -1, 1, 0, 5, 0, 2, 0, 1, 0, 2, -2, 0, 0, 1, 1),
    new Weapon("Stapler", 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 2, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 3, -2, 0, 3, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, -1, 2, 2),
    new Weapon("Steam Iron", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 4, 0, 0, 0, 1, 0, 0, 3, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 5, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 1, 0, -1),
    new Weapon("Stun Gun", 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 1, 0, 3, 5, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 3, 5, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 1, -1, -2, 0, 1, 1),
    new Weapon("Table", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 2, 0, 0, 2, 0, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -3, -1, -3, 0, 0, 0, 0, 0, 3, 0, -3, 0, 2, 1, 0, -1),
    new Weapon("Throwing Star", 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 4, 2, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 2, 0, 0, 0, 0, 0, 0, 1, 2, -1, -2, -2, -1, -1),
    new Weapon("Tongs", 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 4, -1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 2, 0),
    new Weapon("Trumpet", 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 5, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 4, -2, 2, -1, 0, 0, 0, 0, 0, 2, 0, -1, 0, -1, 1, 1, -2),
    new Weapon("Umbrella", 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 5, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 2, -2, 0, 0, 0, 0, 0, 4, 0, 1, 0, 2, 0, 1, -1),
    new Weapon("Vacuum", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 2, 0, 5, 4, 0, 0, 0, 0, 4, 3, 5, 0, 4, 0, 0, 0, -1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, -2, -2, -3, 0, 0, 0, 0, 0, 2, 0, -2, 0, 2, 3, 0, -2),
    new Weapon("Welding Torch", 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 4, 5, 3, 0, 0, 0, 5, 0, 0, 3, 0, 4, 0, 5, 0, 0, 0, 0, -3, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, -3, -2, 1, 0, 0, 0, 0, 2, 0, 0, -3, 0, -2, 1, -2, 3),
    new Weapon("Whip", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 3, 5, 5, 0, 0, 0, 0, 2, 0, 5, 3, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, -2, -1, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 1, 1, -2),
    new Weapon("Wrench", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 1, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1, 4),
    new Weapon("Yoyo", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 2, 4, 4, 4, 0, 0, 0, 0, 0, 0, 2, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 1, -2),
  };

  public static final Map<String, Weapon> MAPPING = makeMap(
  "Axe", ENTRIES[0], "Backpack", ENTRIES[1], "Ball", ENTRIES[2], "Barrel", ENTRIES[3],
  "Bat", ENTRIES[4], "Belt", ENTRIES[5], "Blade", ENTRIES[6], "Bomb",
  ENTRIES[7], "Book", ENTRIES[8], "Boomerang", ENTRIES[9], "Bow", ENTRIES[10],
  "Bowling Pin", ENTRIES[11], "Box", ENTRIES[12], "Briefcase", ENTRIES[13],
  "Broom", ENTRIES[14], "Can", ENTRIES[15], "Candlestick", ENTRIES[16],
  "Cane", ENTRIES[17], "Cape", ENTRIES[18], "Card", ENTRIES[19], "Cell Phone",
  ENTRIES[20], "Chain", ENTRIES[21], "Chainsaw", ENTRIES[22], "Chair",
  ENTRIES[23], "Crossbow", ENTRIES[24], "Crowbar", ENTRIES[25], "Dart", ENTRIES[26],
  "Dice", ENTRIES[27], "Discus", ENTRIES[28], "Dumbbell", ENTRIES[29],
  "Fan", ENTRIES[30], "Firework", ENTRIES[31], "Fist", ENTRIES[32], "Flail",
  ENTRIES[33], "Flamethrower", ENTRIES[34], "Flashlight", ENTRIES[35], "Flute",
  ENTRIES[36], "Fork", ENTRIES[37], "Frying Pan", ENTRIES[38], "Garbage Bin",
  ENTRIES[39], "Golf Club", ENTRIES[40], "Guitar", ENTRIES[41], "Hairdryer",
  ENTRIES[42], "Hammer", ENTRIES[43], "Hat", ENTRIES[44], "Hatchet",
  ENTRIES[45], "Hockey Stick", ENTRIES[46], "Hook", ENTRIES[47], "Hoop",
  ENTRIES[48], "Hose", ENTRIES[49], "Jumprope", ENTRIES[50], "Knife", ENTRIES[51],
  "Lamp", ENTRIES[52], "Laptop", ENTRIES[53], "Lasso", ENTRIES[54], "Leaf Blower",
  ENTRIES[55], "Machete", ENTRIES[56], "Microphone", ENTRIES[57], "Mop",
  ENTRIES[58], "Mouse", ENTRIES[59], "Mug", ENTRIES[60], "Nail Gun", ENTRIES[61],
  "Needles", ENTRIES[62], "Night Stick", ENTRIES[63], "Nunchucks", ENTRIES[64],
  "Paddle", ENTRIES[65], "Pistol", ENTRIES[66], "Plank", ENTRIES[67],
  "Plunger", ENTRIES[68], "Pole", ENTRIES[69], "Rake", ENTRIES[70], "Ray Gun",
  ENTRIES[71], "Razor", ENTRIES[72], "Rifle", ENTRIES[73], "Rock", ENTRIES[74],
  "Rolling Pin", ENTRIES[75], "Ruler", ENTRIES[76], "Scissors", ENTRIES[77],
  "Screwdriver", ENTRIES[78], "Scythe", ENTRIES[79], "Shield", ENTRIES[80],
  "Shoe", ENTRIES[81], "Shotgun", ENTRIES[82], "Shovel", ENTRIES[83],
  "Skateboard", ENTRIES[84], "Spear", ENTRIES[85], "Spray Paint", ENTRIES[86],
  "Stapler", ENTRIES[87], "Steam Iron", ENTRIES[88], "Stun Gun", ENTRIES[89],
  "Table", ENTRIES[90], "Throwing Star", ENTRIES[91], "Tongs", ENTRIES[92],
  "Trumpet", ENTRIES[93], "Umbrella", ENTRIES[94], "Vacuum", ENTRIES[95],
  "Welding Torch", ENTRIES[96], "Whip", ENTRIES[97], "Wrench", ENTRIES[98],
  "Yoyo", ENTRIES[99]);

  public String name;

  public int mode_ranged;

  public int mode_melee;

  public int mode_thrown;

  public int weight_heavy;

  public int weight_light;

  public int uses_armor;

  public int uses_brawn;

  public int uses_caution;

  public int uses_deception;

  public int uses_endurance;

  public int uses_finesse;

  public int uses_insight;

  public int uses_knowledge;

  public int uses_persuasion;

  public int uses_quickness;

  public int uses_senses;

  public int uses_tenacity;

  public int harms_armor;

  public int harms_brawn;

  public int harms_caution;

  public int harms_deception;

  public int harms_endurance;

  public int harms_finesse;

  public int harms_insight;

  public int harms_knowledge;

  public int harms_persuasion;

  public int harms_quickness;

  public int harms_senses;

  public int harms_tenacity;

  public int grid_range;

  public int grid_cone;

  public int grid_grenade;

  public int grid_sweep;

  public int maneuver_block;

  public int maneuver_counter;

  public int maneuver_disarm;

  public int maneuver_trip;

  public int maneuver_aim;

  public int maneuver_guide;

  public int maneuver_pin;

  public int maneuver_bounce;

  public int maneuver_grab;

  public int maneuver_push;

  public int maneuver_pull;

  public int maneuver_distract;

  public int maneuver_bonk;

  public int maneuver_threat;

  public int maneuver_distant_bonk;

  public int maneuver_distant_threat;

  public int limit_battery;

  public int limit_ammo;

  public int limit_fuel;

  public int damage_slashing;

  public int damage_piercing;

  public int damage_blunt;

  public int damage_flexible;

  public int damage_energy;

  public int damage_sound;

  public int damage_luck;

  public int damage_air;

  public int critical_power;

  public int critical_frequency;

  public int critical_combo;

  public int motion_clumsy;

  public int motion_quick;

  public int motion_precise;

  public int bonus_container;

  public int bonus_flammable;

  public int bonus_electronic;

  public int bonus_toxic;

  public int bonus_scary;

  public int bonus_confusing;

  public int bonus_focus;

  public int social_concealable;

  public int social_illegal;

  public int social_obtainable;

  public int bane_wild;

  public int bane_psychic;

  public int bane_tech;

  public Weapon() {
  }

  public Weapon(String name, int mode_ranged, int mode_melee, int mode_thrown, int weight_heavy,
      int weight_light, int uses_armor, int uses_brawn, int uses_caution, int uses_deception,
      int uses_endurance, int uses_finesse, int uses_insight, int uses_knowledge,
      int uses_persuasion, int uses_quickness, int uses_senses, int uses_tenacity, int harms_armor,
      int harms_brawn, int harms_caution, int harms_deception, int harms_endurance,
      int harms_finesse, int harms_insight, int harms_knowledge, int harms_persuasion,
      int harms_quickness, int harms_senses, int harms_tenacity, int grid_range, int grid_cone,
      int grid_grenade, int grid_sweep, int maneuver_block, int maneuver_counter,
      int maneuver_disarm, int maneuver_trip, int maneuver_aim, int maneuver_guide,
      int maneuver_pin, int maneuver_bounce, int maneuver_grab, int maneuver_push,
      int maneuver_pull, int maneuver_distract, int maneuver_bonk, int maneuver_threat,
      int maneuver_distant_bonk, int maneuver_distant_threat, int limit_battery, int limit_ammo,
      int limit_fuel, int damage_slashing, int damage_piercing, int damage_blunt,
      int damage_flexible, int damage_energy, int damage_sound, int damage_luck, int damage_air,
      int critical_power, int critical_frequency, int critical_combo, int motion_clumsy,
      int motion_quick, int motion_precise, int bonus_container, int bonus_flammable,
      int bonus_electronic, int bonus_toxic, int bonus_scary, int bonus_confusing, int bonus_focus,
      int social_concealable, int social_illegal, int social_obtainable, int bane_wild,
      int bane_psychic, int bane_tech) {
    this.name = name;
    this.mode_ranged = mode_ranged;
    this.mode_melee = mode_melee;
    this.mode_thrown = mode_thrown;
    this.weight_heavy = weight_heavy;
    this.weight_light = weight_light;
    this.uses_armor = uses_armor;
    this.uses_brawn = uses_brawn;
    this.uses_caution = uses_caution;
    this.uses_deception = uses_deception;
    this.uses_endurance = uses_endurance;
    this.uses_finesse = uses_finesse;
    this.uses_insight = uses_insight;
    this.uses_knowledge = uses_knowledge;
    this.uses_persuasion = uses_persuasion;
    this.uses_quickness = uses_quickness;
    this.uses_senses = uses_senses;
    this.uses_tenacity = uses_tenacity;
    this.harms_armor = harms_armor;
    this.harms_brawn = harms_brawn;
    this.harms_caution = harms_caution;
    this.harms_deception = harms_deception;
    this.harms_endurance = harms_endurance;
    this.harms_finesse = harms_finesse;
    this.harms_insight = harms_insight;
    this.harms_knowledge = harms_knowledge;
    this.harms_persuasion = harms_persuasion;
    this.harms_quickness = harms_quickness;
    this.harms_senses = harms_senses;
    this.harms_tenacity = harms_tenacity;
    this.grid_range = grid_range;
    this.grid_cone = grid_cone;
    this.grid_grenade = grid_grenade;
    this.grid_sweep = grid_sweep;
    this.maneuver_block = maneuver_block;
    this.maneuver_counter = maneuver_counter;
    this.maneuver_disarm = maneuver_disarm;
    this.maneuver_trip = maneuver_trip;
    this.maneuver_aim = maneuver_aim;
    this.maneuver_guide = maneuver_guide;
    this.maneuver_pin = maneuver_pin;
    this.maneuver_bounce = maneuver_bounce;
    this.maneuver_grab = maneuver_grab;
    this.maneuver_push = maneuver_push;
    this.maneuver_pull = maneuver_pull;
    this.maneuver_distract = maneuver_distract;
    this.maneuver_bonk = maneuver_bonk;
    this.maneuver_threat = maneuver_threat;
    this.maneuver_distant_bonk = maneuver_distant_bonk;
    this.maneuver_distant_threat = maneuver_distant_threat;
    this.limit_battery = limit_battery;
    this.limit_ammo = limit_ammo;
    this.limit_fuel = limit_fuel;
    this.damage_slashing = damage_slashing;
    this.damage_piercing = damage_piercing;
    this.damage_blunt = damage_blunt;
    this.damage_flexible = damage_flexible;
    this.damage_energy = damage_energy;
    this.damage_sound = damage_sound;
    this.damage_luck = damage_luck;
    this.damage_air = damage_air;
    this.critical_power = critical_power;
    this.critical_frequency = critical_frequency;
    this.critical_combo = critical_combo;
    this.motion_clumsy = motion_clumsy;
    this.motion_quick = motion_quick;
    this.motion_precise = motion_precise;
    this.bonus_container = bonus_container;
    this.bonus_flammable = bonus_flammable;
    this.bonus_electronic = bonus_electronic;
    this.bonus_toxic = bonus_toxic;
    this.bonus_scary = bonus_scary;
    this.bonus_confusing = bonus_confusing;
    this.bonus_focus = bonus_focus;
    this.social_concealable = social_concealable;
    this.social_illegal = social_illegal;
    this.social_obtainable = social_obtainable;
    this.bane_wild = bane_wild;
    this.bane_psychic = bane_psychic;
    this.bane_tech = bane_tech;
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
    result += (a ^= 0x8329C6EB9E6AD3E3L * mode_ranged);
    result += (a ^= 0x8329C6EB9E6AD3E3L * mode_melee);
    result += (a ^= 0x8329C6EB9E6AD3E3L * mode_thrown);
    result += (a ^= 0x8329C6EB9E6AD3E3L * weight_heavy);
    result += (a ^= 0x8329C6EB9E6AD3E3L * weight_light);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_armor);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_brawn);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_caution);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_deception);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_endurance);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_finesse);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_insight);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_knowledge);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_persuasion);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_quickness);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_senses);
    result += (a ^= 0x8329C6EB9E6AD3E3L * uses_tenacity);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_armor);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_brawn);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_caution);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_deception);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_endurance);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_finesse);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_insight);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_knowledge);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_persuasion);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_quickness);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_senses);
    result += (a ^= 0x8329C6EB9E6AD3E3L * harms_tenacity);
    result += (a ^= 0x8329C6EB9E6AD3E3L * grid_range);
    result += (a ^= 0x8329C6EB9E6AD3E3L * grid_cone);
    result += (a ^= 0x8329C6EB9E6AD3E3L * grid_grenade);
    result += (a ^= 0x8329C6EB9E6AD3E3L * grid_sweep);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_block);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_counter);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_disarm);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_trip);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_aim);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_guide);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_pin);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_bounce);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_grab);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_push);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_pull);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_distract);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_bonk);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_threat);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_distant_bonk);
    result += (a ^= 0x8329C6EB9E6AD3E3L * maneuver_distant_threat);
    result += (a ^= 0x8329C6EB9E6AD3E3L * limit_battery);
    result += (a ^= 0x8329C6EB9E6AD3E3L * limit_ammo);
    result += (a ^= 0x8329C6EB9E6AD3E3L * limit_fuel);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_slashing);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_piercing);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_blunt);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_flexible);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_energy);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_sound);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_luck);
    result += (a ^= 0x8329C6EB9E6AD3E3L * damage_air);
    result += (a ^= 0x8329C6EB9E6AD3E3L * critical_power);
    result += (a ^= 0x8329C6EB9E6AD3E3L * critical_frequency);
    result += (a ^= 0x8329C6EB9E6AD3E3L * critical_combo);
    result += (a ^= 0x8329C6EB9E6AD3E3L * motion_clumsy);
    result += (a ^= 0x8329C6EB9E6AD3E3L * motion_quick);
    result += (a ^= 0x8329C6EB9E6AD3E3L * motion_precise);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bonus_container);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bonus_flammable);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bonus_electronic);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bonus_toxic);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bonus_scary);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bonus_confusing);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bonus_focus);
    result += (a ^= 0x8329C6EB9E6AD3E3L * social_concealable);
    result += (a ^= 0x8329C6EB9E6AD3E3L * social_illegal);
    result += (a ^= 0x8329C6EB9E6AD3E3L * social_obtainable);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bane_wild);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bane_psychic);
    result += (a ^= 0x8329C6EB9E6AD3E3L * bane_tech);
    return result * (a | 1L) ^ (result >>> 27 | result << 37);
  }

  public int hashCode() {
    return (int)(hash64() & 0xFFFFFFFFL);
  }

  public static Weapon get(String item) {
    return MAPPING.get(item);
  }
}
