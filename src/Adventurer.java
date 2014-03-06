/**
 * Created by LoganGillespie on 3/5/14.
 */
public class Adventurer extends Creature{
    public int armor;

    public Adventurer(String name, int points, Race r, int level, int armor){
        super(name,points,r,level);
        this.armor = armor;
    }

    @Override
    public String toString(){
        String s = "";
        s+="Adventurer name " + name + " points " + points + " race " + r + " level " + " armor" +
                " level" + armor;
        return s;
    }

    @Override
    public boolean equals(Object c){
        if (c instanceof Adventurer){
            Adventurer o = (Adventurer) c;
            if (this.name.equals(o.name)){
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

    public void setName(String name){
        super.setName(name);
    }

    public void setPoints(int points){
        super.setPoints(points);
    }

    public void setLevel(int level){
         super.setLevel(level);
    }
    public String getName(){
        return super.getName();
    }

    public int getPoints(){
        return super.getPoints();
    }

    public int getLevel(){
        return super.getLevel();
    }

    
}
