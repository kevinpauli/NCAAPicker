/*
$Log$
*/

public class Bracket {
    private Round roundOf64 = new Round("Round of 64");
    private Round roundOf32 = new Round("Round of 32");
    private Round sweetSixteen = new Round("Sweet Sixteen");
    private Round eliteEight = new Round("Elite Eight");
    private Round finalFour = new Round("Final Four");
    private Round championship = new Round("Championship");

    Round[] rounds = new Round[] {roundOf64, roundOf32, sweetSixteen, eliteEight, finalFour, championship};

    public Bracket() {

        Team[] south = new Team[]{
                new Team("Florida", 1),
                new Team("Kansas", 2),
                new Team("Syracuse", 3),
                new Team("UCLA", 4),
                new Team("VCU", 5),
                new Team("Ohio State", 6),
                new Team("New Mexico", 7),
                new Team("Colorado", 8),
                new Team("Pittsburgh", 9),
                new Team("Stanford", 10),
                new Team("Dayton", 11),
                new Team("SF Austin", 12),
                new Team("Tulsa", 13),
                new Team("W Michigan", 14),
                new Team("SE Kentucky", 15),
                new Team("UA/M S Mary", 16)};
        Game southChampionship = setupRegion(south);

        Team[] west = new Team[]{
                new Team("Arizona", 1),
                new Team("Wisconsin", 2),
                new Team("Creighton", 3),
                new Team("San Diego St", 4),
                new Team("Oklahoma", 5),
                new Team("Baylor", 6),
                new Team("Oregon", 7),
                new Team("Gonzaga", 8),
                new Team("Oklahoma St", 9),
                new Team("BYU", 10),
                new Team("Nebraska", 11),
                new Team("ND State", 12),
                new Team("NM State", 13),
                new Team("Louisiana", 14),
                new Team("American", 15),
                new Team("Weber State", 16)};
        Game westChampionship = setupRegion(west);

        Team[] east = new Team[]{
                new Team("Virginia", 1),
                new Team("Villanova", 2),
                new Team("Iowa St", 3),
                new Team("Michigan St", 4),
                new Team("Cincinnati", 5),
                new Team("UNC", 6),
                new Team("Connecticut", 7),
                new Team("Memphis", 8),
                new Team("G Wash", 9),
                new Team("St Joe's", 10),
                new Team("Providence", 11),
                new Team("Harvard", 12),
                new Team("Delaware", 13),
                new Team("NC Central", 14),
                new Team("Milwaukee", 15),
                new Team("Coastal Car", 16)};
        Game eastChampionship = setupRegion(east);

        Team[] midwest = new Team[]{
                new Team("Wichita St", 1),
                new Team("Michigan", 2),
                new Team("Duke", 3),
                new Team("Louisville", 4),
                new Team("Saint Louis", 5),
                new Team("U Mass", 6),
                new Team("Texas", 7),
                new Team("Kentucky", 8),
                new Team("Kansas St", 9),
                new Team("Arizona St", 10),
                new Team("Iowa/Tenn", 11),
                new Team("NC St/Xavier", 12),
                new Team("Manhattan", 13),
                new Team("Mercer", 14),
                new Team("Wofford", 15),
                new Team("CalPoly/TX", 16)};
        Game midwestChampionship = setupRegion(midwest);

        finalFour.games.add(new Game(southChampionship, eastChampionship));
        finalFour.games.add(new Game(westChampionship, midwestChampionship));

        championship.games.add(new Game(finalFour.games.get(0), finalFour.games.get(1)));
    }

    private Game setupRegion(Team[] teams) {
        Game g_1_1 = roundOf64.addGame(teams[0], teams[15]);
        Game g_1_2 = roundOf64.addGame(teams[7], teams[8]);
        Game g_1_3 = roundOf64.addGame(teams[4], teams[11]);
        Game g_1_4 = roundOf64.addGame(teams[3], teams[12]);
        Game g_1_5 = roundOf64.addGame(teams[5], teams[10]);
        Game g_1_6 = roundOf64.addGame(teams[2], teams[13]);
        Game g_1_7 = roundOf64.addGame(teams[6], teams[9]);
        Game g_1_8 = roundOf64.addGame(teams[1], teams[14]);

        Game g_2_1 = roundOf32.addGame(g_1_1, g_1_2);
        Game g_2_2 = roundOf32.addGame(g_1_3, g_1_4);
        Game g_2_3 = roundOf32.addGame(g_1_5, g_1_6);
        Game g_2_4 = roundOf32.addGame(g_1_7, g_1_8);

        Game g_3_1 = sweetSixteen.addGame(g_2_1, g_2_2);
        Game g_3_2 = sweetSixteen.addGame(g_2_3, g_2_4);

        return eliteEight.addGame(g_3_1, g_3_2);
    }
}
