/**
 * @author Logan Gillespie and Matt Anger
 * @version 1.1
 */
public class Fighter extends Adventurer {
    Sword sw;


    public Fighter() {
        super(null, -1, null, -1, -1);
    }

    public Fighter(String name, int points, Race r, int level, int armor, Sword sword) {
        super(name, points, r, level, armor);
        sw = sword;
    }

    public Sword getSw() {
        return sw;
    }

    public void setSw(Sword sw) {
        this.sw = sw;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Name = " + name + "," + " Hit points = " + points + "," + " armor Class = " + armor + "." +
                "\n \t" + " sword = " + sw;
        return s;
    }
}
