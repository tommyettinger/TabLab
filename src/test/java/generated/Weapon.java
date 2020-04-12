package generated;

import static generated.TabLabTools.makeMap;

import java.io.Serializable;
import java.util.Map;

public class Weapon implements Serializable {
  public static final long serialVersionUID = 1L;

  public static final Weapon[] ENTRIES = new Weapon[] {
    new Weapon("Axe", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 2, 2, 0, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, -1, -1, 4, 0, 0, -4044634906157204555L),
    new Weapon("Backpack", 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 0, 0, -3, -2, 0, 5, 0, 0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, -1713530235158940752L),
    new Weapon("Ball", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 5, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 4904121962129847482L),
    new Weapon("Barrel", 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 2, 0, 0, 2, 0, 0, 1, 5, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0, 0, 2, -2, -2, 0, 5, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 0, 0, 5965296866346077058L),
    new Weapon("Bat", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 3, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 5, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, -3498762377324223526L),
    new Weapon("Belt", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 4, 4, 0, 0, 5, 0, 3, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 2, -1, 0, -2, 7809185974929204610L),
    new Weapon("Blade", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 3, 2, 0, 3, 1, 0, 0, 0, 0, 3, 0, 0, -1, -1, -1, 0, 0, 0, -7631190341502626271L),
    new Weapon("Bomb", 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 5, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 3, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 3, 1, 0, 0, 0, 4, 0, -2, 0, -3, 0, 0, 0, 0, 5, 3, 0, 2, -5, -2, 2, 1, 1, 6496352340060870430L),
    new Weapon("Book", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 0, 2, 0, 0, 0, 2191233078725729782L),
    new Weapon("Boomerang", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 5, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 3, 0, 0, 0, -2, 1, 1, 0, 4496843979768033204L),
    new Weapon("Bow", 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 3, 1, 0, -2, -1, 3, 0, 4, 0, 0, 0, 0, 0, -1, 0, -1, 1, 0, 0, 3681572859103311652L),
    new Weapon("Bowling Pin", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 2, 0, 0, 0, 1, 0, 0, 0, 4, 0, 1, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 4, 0, 3, -1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, -1, 0, -1, -4685913301963624387L),
    new Weapon("Box", 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 5, 2, 0, 0, 0, 0, 4, 3, 0, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 5, 0, 0, 0, 0, 1, 0, -2, 0, 2, -2, -2, -1, 3855465032904994861L),
    new Weapon("Briefcase", 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, -2, -1, 0, 5, 0, 0, 0, 0, 5, 0, 3, 0, -2, 0, -1, 0, -820897620861854591L),
    new Weapon("Broom", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 1, 0, 0, 3, 0, 0, 0, 0, 0, 1, 0, 1, 0, 3, 0, 2, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 2, -1, 2, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 3, -1, 0, -1, -6391867147270043558L),
    new Weapon("Can", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 3, 0, 1, 0, 0, 0, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, -1, 1, 0, 0, 0, 0, 1, 0, 3, 0, 4, 1, 0, 0, 7732782178935207605L),
    new Weapon("Candlestick", 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 4, 0, 0, 1, 0, 0, 0, 0, 0, 1, 2, 0, 2, 0, 0, 0, 0, 0, 1, 2, 0, 2, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 5, 0, 0, 0, 1, 0, 1, 0, 0, 2, 0, 0, 3505607474732856832L),
    new Weapon("Cane", 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 1, 2, 5, 0, 0, 0, 0, 0, 2, 5, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1, -1, 0, -1, 6503017652616010443L),
    new Weapon("Cape", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 3, 1, 1, 1, 3, 0, 0, 0, 0, 2, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, -1, 0, -1, 0, 0, 0, -2895083157032871983L),
    new Weapon("Card", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, -2, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 4, -1, 0, 1, 0, 0, 0, 0, 2, 5, 0, 2, 0, -2, 0, 1731933207291069931L),
    new Weapon("Cell Phone", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 5, 0, 0, 0, 0, 0, 5, 1, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 4, 0, 0, 0, 0, 3, 0, -1, 0, 2, 4, -561856151712451630L),
    new Weapon("Chain", 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 2, 1, 1, 3, 0, 0, 0, 0, 4, 0, 2, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 3, 1, 0, -2, 0, 0, 1, 0, 0, 6624035801208865683L),
    new Weapon("Chainsaw", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 0, -1, 4, 0, 0, 0, 0, 1, 0, 0, 5, 5, 0, -2, -1, 0, 0, 0, 0, 0, 5, 0, 0, -3, -1, -1, 5, 2, 0, 2102220303482040245L),
    new Weapon("Chair", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 2, 3, 0, 0, 1, 0, 0, 4, 0, 0, 4, 0, 4, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 1, 0, 0, 7455275856942738078L),
    new Weapon("Crossbow", 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 5, 4, 0, -2, -3, 3, 0, 2, 0, 0, 0, 0, 0, -1, 0, -1, 1, 0, 1, -8822317334783555611L),
    new Weapon("Crowbar", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 9048923071220552221L),
    new Weapon("Dart", 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 3, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, -1, 2, 0, 2, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 4715538364214050515L),
    new Weapon("Dice", 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 5, 5, -2, -1, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 1, -1, -2, 1, -5537626413964707978L),
    new Weapon("Discus", 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 2, 0, 4, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 1, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, -3644690882086478668L),
    new Weapon("Dumbbell", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 4, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -1, -3, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 1, 0, 0, 2, -640118346194609107L),
    new Weapon("Fan", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 5, 0, 0, 2, 0, 1, 2, 0, 0, 0, 0, 0, 5, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0, -2, 8710401400305647240L),
    new Weapon("Firework", 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 1, 1, -2, -2, 0, 0, 0, 0, 0, 0, 5, 0, 0, -2, 1, 3, 2, 0, -2185955397846561123L),
    new Weapon("Fist", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 2, 0, 0, 0, 1, 0, 5, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, -3, -2459613795929237919L),
    new Weapon("Flail", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 3, 4, 0, 0, 1, 0, 0, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 5, 4, 1, -1, 0, 0, 0, 0, 0, 0, 4, 0, 0, -3, -1, -2, 0, 1, 0, -8316101848328367297L),
    new Weapon("Flamethrower", 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 5, 0, 0, 0, 5, 5, 5, -3, -1, 0, 0, 0, 0, 0, 5, 1, 0, -3, -3, -3, 5, 2, 0, -6736245245387705943L),
    new Weapon("Flashlight", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 1, 0, 5, 2, 0, 2, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 1, 2, 0, 6841445583059778629L),
    new Weapon("Flute", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 4, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 3, -2, 1, 0, 0, 0, 0, 0, 0, 5, 0, -1, 0, -1, 1, 0, -1, -463028364558635609L),
    new Weapon("Fork", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 2, 3, 0, 0, 0, 0, 0, 1, 0, 4, 0, 4, 0, -1, -2, -3207199915368794145L),
    new Weapon("Frying Pan", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 5, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, -4747443574455679287L),
    new Weapon("Garbage Bin", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 2, 0, 3, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, -2, -2, -3, 5, 0, 0, 2, 0, 2, 0, -2, 0, 2, -3, 2, -1, 3600236779965388093L),
    new Weapon("Golf Club", 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 5, 0, 0, -1, 0, 2, 0, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0, -7091646146021320796L),
    new Weapon("Guitar", 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 3, 0, 0, 1, 0, 0, 1, 0, 2, 0, 0, 0, 2, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 2, -2, 1, 0, 0, 0, 0, 0, 0, 3, 0, -2, 0, 0, -2, 1, -2, 2323621555770459732L),
    new Weapon("Hairdryer", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 1, 1, 3, 2, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 1, 2, -2, -1477680581675526176L),
    new Weapon("Hammer", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 3, 1, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -1, -2, 1, 0, 0, 0, 0, 1, 0, 0, -2, 0, 2, -1, 0, 1, 2287573478222837252L),
    new Weapon("Hat", 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 3, 0, 0, 2, 0, 1, 0, 0, 0, 1, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, -1, 1, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0, 1, -1, 4567819538515222086L),
    new Weapon("Hatchet", 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, -1, 0, 0, 0, 0, 2, 0, 0, 0, -1, -1, 2, 0, 0, 2175913828983517933L),
    new Weapon("Hockey Stick", 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 4, 0, 0, 0, 0, 0, 3, 3, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 1, 0, -8488110619186119976L),
    new Weapon("Hook", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 4, 5, 4, 0, 0, 4, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, -3, 0, -1, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, 1, -1, 0, -4259353552297269909L),
    new Weapon("Hoop", 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 4, 1, 5, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 3, -3, 1, 0, 0, 0, 0, 0, 0, 2, 2, -2, 0, 1, -2, -2, -2, -8735012153586039651L),
    new Weapon("Hose", 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 2, 3, 0, 0, 3, 2, 4, 5, 0, 0, 0, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 1, 1, 9032993771107989908L),
    new Weapon("Jumprope", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, 0, 2, 3, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 1, 0, -2, -2, -7204645583591974141L),
    new Weapon("Knife", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 2, 0, 0, -1, -480849278306361984L),
    new Weapon("Lamp", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 4, 0, 0, 5, 0, 0, 0, 1, 0, 3, 5, 0, 2, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 3, 0, -3, 0, 2, 0, 2, 0, -2909568462547871868L),
    new Weapon("Laptop", 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 1, 0, 5, 2, 0, 0, 0, -2, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 5, 0, 0, 1, 0, 1, 0, -1, -1, 0, 5, -5864883558421003399L),
    new Weapon("Lasso", 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 5, 5, 0, 0, 5, 5, 0, 0, 5, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -3, -1, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 2, 1, 0, -2, -5513376639687049378L),
    new Weapon("Leaf Blower", 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 4, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 5, 0, 3, 2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 3, -1, -2, 0, 0, 0, 0, 0, 0, 3, 0, -3, 0, 1, 1, 1, 0, 8602843234372390962L),
    new Weapon("Machete", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 3, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -2, -1, -2, 3, -2, -1, -7067463027561212185L),
    new Weapon("Microphone", 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 5, 0, 0, 1, 0, 0, 4, 0, 5, 0, 0, 0, 0, 0, 5, 2, 0, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, -1, 2, -2, -4091295596259221830L),
    new Weapon("Mop", 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 3, 2, 1, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 3, 0, 1, -1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 1, -2, 0, 2, 3650830302826368980L),
    new Weapon("Mouse", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 1, 2, 3, 4, 0, 0, 0, 0, 2, 1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1, 0, 2, -2, -7280011689453304963L),
    new Weapon("Mug", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 4, 5, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, -1, 2, 0, 0, 0, 0, 1, 0, 2, 0, 2, -1, 1, -2, -5799339778717977204L),
    new Weapon("Nail Gun", 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, 3, 3, 4, 4, 5, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 1, 1, 0, -1848282355171820609L),
    new Weapon("Needles", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 2, 2, 4, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, -2, -1, 5552885129442278941L),
    new Weapon("Night Stick", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 2, 1, 2, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 1, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 5527467737818847876L),
    new Weapon("Nunchucks", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 5, 5, 0, 3, 0, 0, 0, 0, 0, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, -6425410722489458746L),
    new Weapon("Paddle", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 4, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, -2, 0, 0, 0, 0, 3, 0, 0, -1, 0, -1, -1, 1, -1, -2495873601199554424L),
    new Weapon("Pistol", 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 3, 0, -2, 0, 0, 4, 0, 0, 0, 1, 0, 0, 5, 3, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 1, -3, 0, 1, -2, -2, -377839409318545906L),
    new Weapon("Plank", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 4, 3, 3, 0, 4, 0, 0, 0, 0, 0, 5, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, 0, 2, 0, 0, 0, 1, 0, -3, 0, 2, 1, 0, -1, 8018728910790000631L),
    new Weapon("Plunger", 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 5, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 1, 0, 0, 3, -2, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 1, 4904576843730267697L),
    new Weapon("Pole", 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 4, 3, 3, 0, 3, 0, 1, 4, 0, 0, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, -1, 0, 0, 0, 0, 0, 0, 2, -3, 0, 1, -1, 0, -1, 2509490260623336639L),
    new Weapon("Rake", 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 2, 2, 4, 2, 4, 0, 0, 0, 0, 1, 3, 2, 0, 2, 2, 0, 0, 0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, -2, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 2, 1, 1, -2, -6228700226279602220L),
    new Weapon("Ray Gun", 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 5, 1, 3, 0, 5, -3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 0, 0, 0, 2, 0, -5, -4, -1, -2, 3, -723797435711058825L),
    new Weapon("Razor", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 3, 5, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2, -1, -2, -1, -8018751312939134893L),
    new Weapon("Rifle", 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0, 4, 0, -1, 0, 0, 4, 0, 0, 0, 1, 0, 0, 5, 4, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, -3, -3, 0, 2, -2, -2, 1778052921489108747L),
    new Weapon("Rock", 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 3, -2, 1, -2, -8206547534715924716L),
    new Weapon("Rolling Pin", 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 4, 2, 0, 0, 0, 2, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 1, 0, -6785617174941827946L),
    new Weapon("Ruler", 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 5, 2, 0, 0, 0, 0, 0, 0, 1, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 0, 0, 0, 0, 3, 0, 0, 1, 0, 2, -2, 0, -2, -8934844086597197940L),
    new Weapon("Scissors", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 2, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 5, 4, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, -2, -2, 0, -6218092747824821103L),
    new Weapon("Screwdriver", 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, -2, -2, 4, -1979145101703484345L),
    new Weapon("Scythe", 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 3, 5, 0, 4, 0, 0, 0, 0, 0, 2, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -2, 0, -1, 0, 0, 0, 0, 5, 0, 2, -3, -2, -2, 1, -1, 0, -7736295148284780014L),
    new Weapon("Shield", 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 5, 5, 0, 2, 0, 0, 1, 0, 0, 4, 0, 0, 5, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -2, -1, -3, 0, 0, 0, 0, 0, 1, 0, -3, -1, -1, 2, 0, 1, -601901454591214870L),
    new Weapon("Shoe", 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 3, 0, 2, 0, 0, 0, 3, 0, 0, 0, 3, 2, 0, 2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, -2, 1, 0, 0, 0, 0, 4, 0, 2, 0, 2, -2, 1, -2, -5178746132473072720L),
    new Weapon("Shotgun", 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 4, 0, -3, 0, 0, 4, 0, 0, 0, 1, 0, 0, 5, 5, 0, 0, -1, -2, 0, 0, 0, 0, 5, 0, 0, -3, -3, 0, 5, -2, -2, 6739545525160892877L),
    new Weapon("Shovel", 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 0, 3, 0, 0, 4, 0, 0, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 2, 1, -1, 1, -5576376297520805668L),
    new Weapon("Skateboard", 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 3, 1, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 3, 2, 2, 0, 2, -2, 0, 0, 0, 0, 0, 2, 0, -1, 0, 1, -1, 2, -1, -5781224567556853361L),
    new Weapon("Spear", 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 2, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 4, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 4, 2, 0, -1, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, -1, -1, 2, -1, 0, -4688999331775811300L),
    new Weapon("Spray Paint", 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 4, 1, 0, 1, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 5, 2, 2, 0, 0, -1, 1, 0, 5, 0, 2, 0, 1, 0, 2, -2, 0, 0, 1, 1, -6436666201858108071L),
    new Weapon("Stapler", 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 2, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 3, -2, 0, 3, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, -1, 2, 2, -3509732013294430052L),
    new Weapon("Steam Iron", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 4, 0, 0, 0, 1, 0, 0, 3, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 5, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 1, 0, -1, -8524573806887412919L),
    new Weapon("Stun Gun", 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 1, 0, 3, 5, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 3, 5, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 1, -1, -2, 0, 1, 1, 2363639910941151660L),
    new Weapon("Table", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 2, 0, 0, 2, 0, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, -3, -1, -3, 0, 0, 0, 0, 0, 3, 0, -3, 0, 2, 1, 0, -1, -492965948034428494L),
    new Weapon("Throwing Star", 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 4, 2, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 2, 0, 0, 0, 0, 0, 0, 1, 2, -1, -2, -2, -1, -1, 4803755869873041530L),
    new Weapon("Tongs", 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 4, -1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 2, 0, -3036124489841583936L),
    new Weapon("Trumpet", 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 5, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 4, -2, 2, -1, 0, 0, 0, 0, 0, 2, 0, -1, 0, -1, 1, 1, -2, -6515461253604367910L),
    new Weapon("Umbrella", 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 5, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 2, -2, 0, 0, 0, 0, 0, 4, 0, 1, 0, 2, 0, 1, -1, -1368230520796314435L),
    new Weapon("Vacuum", 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 2, 0, 5, 4, 0, 0, 0, 0, 4, 3, 5, 0, 4, 0, 0, 0, -1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, -2, -2, -3, 0, 0, 0, 0, 0, 2, 0, -2, 0, 2, 3, 0, -2, 6130510204833916980L),
    new Weapon("Welding Torch", 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 4, 5, 3, 0, 0, 0, 5, 0, 0, 3, 0, 4, 0, 5, 0, 0, 0, 0, -3, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, -3, -2, 1, 0, 0, 0, 0, 2, 0, 0, -3, 0, -2, 1, -2, 3, 1843440793153875419L),
    new Weapon("Whip", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 3, 5, 5, 0, 0, 0, 0, 2, 0, 5, 3, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, -2, -1, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 1, 1, -2, -1283639955517948190L),
    new Weapon("Wrench", 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 1, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 5, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1, 4, -1717394480958509898L),
    new Weapon("Yoyo", 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 2, 4, 4, 4, 0, 0, 0, 0, 0, 0, 2, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 1, -2, -6747742720699014877L),
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

  private long __code;

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
      int bane_psychic, int bane_tech, long __code) {
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
    Weapon other = (Weapon) o;
    if (name != null ? !name.equals(other.name) : other.name != null) return false;
    if (mode_ranged != other.mode_ranged) return false;
    if (mode_melee != other.mode_melee) return false;
    if (mode_thrown != other.mode_thrown) return false;
    if (weight_heavy != other.weight_heavy) return false;
    if (weight_light != other.weight_light) return false;
    if (uses_armor != other.uses_armor) return false;
    if (uses_brawn != other.uses_brawn) return false;
    if (uses_caution != other.uses_caution) return false;
    if (uses_deception != other.uses_deception) return false;
    if (uses_endurance != other.uses_endurance) return false;
    if (uses_finesse != other.uses_finesse) return false;
    if (uses_insight != other.uses_insight) return false;
    if (uses_knowledge != other.uses_knowledge) return false;
    if (uses_persuasion != other.uses_persuasion) return false;
    if (uses_quickness != other.uses_quickness) return false;
    if (uses_senses != other.uses_senses) return false;
    if (uses_tenacity != other.uses_tenacity) return false;
    if (harms_armor != other.harms_armor) return false;
    if (harms_brawn != other.harms_brawn) return false;
    if (harms_caution != other.harms_caution) return false;
    if (harms_deception != other.harms_deception) return false;
    if (harms_endurance != other.harms_endurance) return false;
    if (harms_finesse != other.harms_finesse) return false;
    if (harms_insight != other.harms_insight) return false;
    if (harms_knowledge != other.harms_knowledge) return false;
    if (harms_persuasion != other.harms_persuasion) return false;
    if (harms_quickness != other.harms_quickness) return false;
    if (harms_senses != other.harms_senses) return false;
    if (harms_tenacity != other.harms_tenacity) return false;
    if (grid_range != other.grid_range) return false;
    if (grid_cone != other.grid_cone) return false;
    if (grid_grenade != other.grid_grenade) return false;
    if (grid_sweep != other.grid_sweep) return false;
    if (maneuver_block != other.maneuver_block) return false;
    if (maneuver_counter != other.maneuver_counter) return false;
    if (maneuver_disarm != other.maneuver_disarm) return false;
    if (maneuver_trip != other.maneuver_trip) return false;
    if (maneuver_aim != other.maneuver_aim) return false;
    if (maneuver_guide != other.maneuver_guide) return false;
    if (maneuver_pin != other.maneuver_pin) return false;
    if (maneuver_bounce != other.maneuver_bounce) return false;
    if (maneuver_grab != other.maneuver_grab) return false;
    if (maneuver_push != other.maneuver_push) return false;
    if (maneuver_pull != other.maneuver_pull) return false;
    if (maneuver_distract != other.maneuver_distract) return false;
    if (maneuver_bonk != other.maneuver_bonk) return false;
    if (maneuver_threat != other.maneuver_threat) return false;
    if (maneuver_distant_bonk != other.maneuver_distant_bonk) return false;
    if (maneuver_distant_threat != other.maneuver_distant_threat) return false;
    if (limit_battery != other.limit_battery) return false;
    if (limit_ammo != other.limit_ammo) return false;
    if (limit_fuel != other.limit_fuel) return false;
    if (damage_slashing != other.damage_slashing) return false;
    if (damage_piercing != other.damage_piercing) return false;
    if (damage_blunt != other.damage_blunt) return false;
    if (damage_flexible != other.damage_flexible) return false;
    if (damage_energy != other.damage_energy) return false;
    if (damage_sound != other.damage_sound) return false;
    if (damage_luck != other.damage_luck) return false;
    if (damage_air != other.damage_air) return false;
    if (critical_power != other.critical_power) return false;
    if (critical_frequency != other.critical_frequency) return false;
    if (critical_combo != other.critical_combo) return false;
    if (motion_clumsy != other.motion_clumsy) return false;
    if (motion_quick != other.motion_quick) return false;
    if (motion_precise != other.motion_precise) return false;
    if (bonus_container != other.bonus_container) return false;
    if (bonus_flammable != other.bonus_flammable) return false;
    if (bonus_electronic != other.bonus_electronic) return false;
    if (bonus_toxic != other.bonus_toxic) return false;
    if (bonus_scary != other.bonus_scary) return false;
    if (bonus_confusing != other.bonus_confusing) return false;
    if (bonus_focus != other.bonus_focus) return false;
    if (social_concealable != other.social_concealable) return false;
    if (social_illegal != other.social_illegal) return false;
    if (social_obtainable != other.social_obtainable) return false;
    if (bane_wild != other.bane_wild) return false;
    if (bane_psychic != other.bane_psychic) return false;
    if (bane_tech != other.bane_tech) return false;
    return true;
  }

  public static Weapon get(String item) {
    return MAPPING.get(item);
  }
}
