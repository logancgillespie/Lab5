/**
 * Enumeration representing the types of characters we might find in a fantasy
 * game.
 *
 * @author William Kreahling
 *         <p/>
 *         NO other comments on purpose
 */
public enum Race {
    HUMAN("Human"),
    ELF("Elf"),
    DRAGONBORN("Dragonborn"),
    DWARF("Dwarf"),
    HALFLING("Halfling"),
    TIEFLING("Tiefling");

    private final String race;

    private Race(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return race;
    }

}