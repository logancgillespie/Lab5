/**
 * Note this book holds 10 spells only!
 */

public class SpellBook implements Comparable<SpellBook> {
    private Spell[] list;
    private int  numSpells;

    public SpellBook() {
        list        = new Spell[10];
        numSpells   = 0;
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

    @Override
    public boolean compareTo(SpellBook) {

    }

}