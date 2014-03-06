/**
 * @author Logan Gillespie and Matt Anger
 * @version 1.1
 */
public class Adventurer extends Creature {
    protected int armor;

    public Adventurer() {
        super(null, -1, null, -1);
        armor = -1;
    }

    public Adventurer(String name, int points, Race r, int level, int armor) {
        super(name, points, r, level);
        this.armor = armor;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Name = " + name + "," + " Hit points " + points + "," + " armor Class = " + armor + ".";
        return s;
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Adventurer) {
            Adventurer o = (Adventurer) c;
            if (this.name.equals(o.name)) {
                return true;
            }
        }
        return false;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }


}
