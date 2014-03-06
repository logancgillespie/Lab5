/**
 * @author Logan Gillespie and Matt Anger
 * @version 1.1
 */
public class Wizard extends Adventurer {
    private SpellBook sb;

    public Wizard() {
        super(null, -1, null, -1, -1);
    }

    public Wizard(String name, int points, Race r, int level, int armor, SpellBook sb) {
        super(name, points, r, level, armor);
        this.sb = sb;
    }

    public SpellBook getSb() {
        return sb;
    }

    public void setSb(SpellBook sb) {
        this.sb = sb;
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Wizard) {
            Wizard o = (Wizard) c;
            if (this.sb.getNumSpells() == (o.sb.getNumSpells())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Name = " + name + "," + " points " + points + "," + " level " + level + "," +
                "" + " armor Class = " + armor + ".";
        s += "\n \t Spells: " + "\n" + sb;
        return s;
    }
}
