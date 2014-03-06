/**
 * Created by LoganGillespie on 3/5/14.
 */
public class Adventurer extends Creature{
    public int armor;

    public Adventurer() {
        super(null, -1, null, -1);
        armor = -1;
    }

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



    
}
