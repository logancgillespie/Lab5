/**
 * Note this book holds 10 spells only!
 * Modified March 6, 2014 by Logan Gillespie and Matt Anger
 */

public class SpellBook implements Comparable<SpellBook> {
    private Spell[] list;
    private int numSpells;

    @Override
    public int compareTo(SpellBook o) {
        int r;
        if (o.numSpells == numSpells) {
            r = 1;
        }
        r = 0;
        return r;

    }


    public SpellBook() {
        list = new Spell[10];
        numSpells = 0;
    }

    public void add(Spell spell) {
        list[numSpells++] = spell;
    }

    public void removeSpell() {
        numSpells--;
    }

    public int getNumSpells() {
        return numSpells;
    }

    @Override
    public String toString() {
        String result = "";
        if (numSpells > 0) {
            result = "\t" + list[0];
        }
        for (int i = 1; i < numSpells; i++) {
            result += "\n\t" + list[i];
        }
        return result;
    }

}

