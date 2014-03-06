/**
 * Created by LoganGillespie on 3/6/14.
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
        s += "Fighter name " + name + " points " + points + " race " + race + " level " + level + " armor" +
                +armor + " sword " + sw;
        return s;
    }
}
