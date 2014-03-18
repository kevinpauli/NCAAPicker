/*
$Log$
*/

class Game {
    Slot slot1 = new Slot();
    Slot slot2 = new Slot();
    Slot nextSlot;

    Game(Team team1, Team team2) {
        slot1.team = team1;
        slot2.team = team2;
    }

    public Game(Game previousGame1, Game previousGame2) {
        previousGames(previousGame1, previousGame2);
    }

    public Game() {
    }

    public void previousGames(Game previousGame1, Game previousGame2) {
        previousGame1.nextSlot = slot1;
        previousGame2.nextSlot = slot2;
    }

    public void pick(PickingStrategy pickingStrategy) {
        Team winner = pickingStrategy.pickWinningTeam(slot1.team, slot2.team);
        if (nextSlot != null)
            nextSlot.team = winner;
    }
}
