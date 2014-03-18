/*
$Log$
*/

import java.util.ArrayList;
import java.util.List;

public class Round {
    final String name;
    List<Game> games = new ArrayList<Game>();

    public Round(String name) {
        this.name = name;
    }

    public Game addGame(Team team, Team team1) {
        Game game = new Game(team, team1);
        games.add(game);
        return game;
    }

    public Game addGame(Game previousGame1, Game previousGame2) {
        Game game = new Game(previousGame1, previousGame2);
        games.add(game);
        return game;
    }
}
