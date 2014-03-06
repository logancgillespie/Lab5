/**
 * An enumeration representing swords we might encounter in a fantasy type
 * game.
 * @author Dr. William Kreahling
 *
 * No other comments on purpose.
 */
public enum Sword {

    VORPAL("Vorpal", 50),
    KALIS("Kalis", 15),
    LONG("Long", 30),
    BUTTERFLY("Butterfly", 20),
    RAPIER("Rapier", 32);

    private final String    name;
    private final int       damage;

    private Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + " sword, " + " damage: " + damage;
    }
}
