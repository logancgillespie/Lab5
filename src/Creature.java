/**
 * By Logan Gillespie and Matt Anger
 * Version 1.1
 */
public class Creature {
    protected String name;
    protected int points;
    protected Race race;
    protected int level;


    public Creature(String name, int points, Race r, int level) {
        this.name = name;
        this.points = points;
        race = r;
        this.level = level;

    }

    public Creature() {
        this.name = null;
        this.points = -1;
        race = null;
        this.level = -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {

        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Creature) {
            Creature o = (Creature) c;
            if (this.name.equals(o.name)) {
                return true;
            }

        }

        return false;
    }


    @Override
    public String toString() {
        String s;
        s = "Name = " + name + ", " + "Hit points = " + points + ".";
        return s;

    }
}
