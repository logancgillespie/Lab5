import java.util.Random;

/**
 * Enumeration representing Spells we might encounter in a fantasy type game!
 *
 * @author William Kreahling
 *         <p/>
 *         NO other comments on purpose.
 */
public enum Spell {

    RAY_OF_FROST("Ray of Frost", 3),
    MAGIC_MISSILE("Magic Missile", 4),
    BURNING_HANDS("Burning Hands", 12),
    FIREBALL("Fireball", 24),
    CHAIN_LIGHTNING("Chain Lightning", 9),
    DETECT_MAGIC("Detect Magic", 0),
    FOUNTAIN_OF_FLAME("Fountain of Flame", 20),
    ICE_STORM("Ice Storm", 20),
    EARTHQUAKE("Earthquake", 18),
    SUNBURST("Sunburst", 24),
    TELEPORT("Teleport", 0);


    private String name;
    private final int maxDamage;
    private final Random random;

    private Spell(String name, int damage) {
        this.name = name;
        this.maxDamage = damage;
        this.random = new Random();
    }

    public int getDamage() {
        return random.nextInt(maxDamage) + 1;
    }
}