import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        List<Creature> players = new ArrayList<Creature>();
        SpellBook book = new SpellBook();
        book.add(Spell.RAY_OF_FROST);
        book.add(Spell.FIREBALL);
        book.add(Spell.ICE_STORM);
        book.add(Spell.MAGIC_MISSILE);
        book.add(Spell.TELEPORT);
        book.add(Spell.CHAIN_LIGHTNING);

        players.add(new Creature("Forrest Gulp", 43, Race.ELF, 1));
        players.add(new Adventurer("Smaugy Weather", 100, Race.DRAGONBORN, 2,
                20));
        players.add(new Wizard("Gan D. Alf", 70, Race.HUMAN, 50, 10, book));
        players.add(new Fighter("Barbara Barian", 40, Race.TIEFLING, 30, 25,
                Sword.VORPAL));
        players.add(new Adventurer("Barbara Barian", 40, Race.TIEFLING, 30,
                25));

        System.out.print("--------------------------Print all Creatures");
        System.out.println("--------------------------");
        for (Creature avatar : players) {
            System.out.println(avatar);
        }
        System.out.print("---------------------------------------------");
        System.out.println("--------------------------");
        System.out.println();
        System.out.print("Please a key (and press enter) to continue > ");
        String junk = scanIn.next();
        System.out.println();

        for (int i = 0; i < players.size(); ++i) {
            for (int j = 0; j < players.size(); ++j) {
                System.out.print("------------------------------------------");
                System.out.println("-----------------------------");

                if (players.get(i).equals(players.get(j))) {
                    System.out.println(players.get(i) + "\n\tIS EQUAL TO\n"
                            + players.get(j));
                } else {
                    System.out.print(players.get(i) + "\n\tIS NOT EQUAL");
                    System.out.println(" TO\n" + players.get(j));
                }
                System.out.print("------------------------------------------");
                System.out.println("-----------------------------");
                System.out.println();
                System.out.print("Please a key (and press enter) ");
                System.out.print("to continue > ");
                junk = scanIn.next();
                System.out.println();
            }
        }
        System.out.println();

        Creature stranger = new Fighter("Forrest Gulp", 43, Race.ELF, 1, 19,
                Sword.RAPIER);
        if (stranger.equals(players.get(0))) {
            System.out.println(stranger + "\n\tIS EQUAL TO\n" +
                    players.get(0));
        } else {
            System.out.println(stranger + "\n\tIS NOT EQUAL TO\n" +
                    players.get(0));
        }
        System.out.println();


        if (players.get(0).equals(stranger)) {
            System.out.println(players.get(0) + "\n\tIS EQUAL TO\n" +
                    stranger);
        } else {
            System.out.println(players.get(0) + "\n\tIS NOT EQUAL TO\n" +
                    stranger);
        }
    }
}
