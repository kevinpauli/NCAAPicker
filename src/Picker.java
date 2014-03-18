/*
$Log$
*/

public class Picker {

    private static Bracket bracket = new Bracket();
    private static PickingStrategy pickingStrategy = new PickingStrategy();

    public static void main(String[] args) {
        for (Round round : bracket.rounds) {
            pickRound(round);
        }
    }

    private static void pickRound(Round round) {
        System.out.println(round.name);
        System.out.println("====================================");
        for (Game game : round.games) {
            game.pick(pickingStrategy);
        }
        System.out.println("====================================");
        System.out.println();
    }
}
