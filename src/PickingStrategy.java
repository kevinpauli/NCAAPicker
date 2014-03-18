/*
$Log$
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 */
public class PickingStrategy {

    Map<Integer, Map<Integer, Double>> history = new HashMap<Integer, Map<Integer, Double>>();

    public PickingStrategy() {
        {
            Map<Integer, Double> seed_1 = new HashMap<Integer, Double>();
            seed_1.put(16, .9816);  //actual
            // dec by (.9816 - .5) / 15 = .0321
            seed_1.put(15, .9495);
            seed_1.put(14, .9174);
            seed_1.put(13, .8853);
            seed_1.put(12, .8532);
            seed_1.put(11, .8211);
            seed_1.put(10, .789);
            seed_1.put(9, .7569);
            seed_1.put(8, .7248);
            seed_1.put(7, .6927);
            seed_1.put(6, .6606);
            seed_1.put(5, .6285);
            seed_1.put(4, .5964);
            seed_1.put(3, .5643);
            seed_1.put(2, .5322);
            seed_1.put(1, .50); //actual
            history.put(1, seed_1);
        }

        {
            Map<Integer, Double> seed_2 = new HashMap<Integer, Double>();
            seed_2.put(16, .9954);
            seed_2.put(15, .96);  //actual
            // dec by (.96 - .5) / 13 = .0354
            seed_2.put(14, .9246);
            seed_2.put(13, .8892);
            seed_2.put(12, .8538);
            seed_2.put(11, .8184);
            seed_2.put(10, .783);
            seed_2.put(9, .7476);
            seed_2.put(8, .7122);
            seed_2.put(7, .6768);
            seed_2.put(6, .6414);
            seed_2.put(5, .606);
            seed_2.put(4, .5706);
            seed_2.put(3, .5352);
            seed_2.put(2, .50); //actual
            history.put(2, seed_2);
        }

        {
            Map<Integer, Double> seed_3 = new HashMap<Integer, Double>();
            seed_3.put(16, .9136);
            seed_3.put(15, .8818);
            seed_3.put(14, .85);  //actual
            // dec by *.85 - .5) / 11 = .0318
            seed_3.put(13, .8182);
            seed_3.put(12, .7864);
            seed_3.put(11, .7546);
            seed_3.put(10, .7228);
            seed_3.put(9, .691);
            seed_3.put(8, .6592);
            seed_3.put(7, .6274);
            seed_3.put(6, .5956);
            seed_3.put(5, .5638);
            seed_3.put(4, .532);
            seed_3.put(3, .50); //actual
            history.put(3, seed_3);
        }

        {
            Map<Integer, Double> seed_4 = new HashMap<Integer, Double>();
            seed_4.put(16, .8866);
            seed_4.put(15, .8544);
            seed_4.put(14, .8222);
            seed_4.put(13, .79);  //actual
            // dec by .79 - .5 / 9 = .0322
            seed_4.put(12, .7578);
            seed_4.put(11, .7256);
            seed_4.put(10, .6934);
            seed_4.put(9, .6612);
            seed_4.put(8, .629);
            seed_4.put(7, .5968);
            seed_4.put(6, .5646);
            seed_4.put(5, .5324);
            seed_4.put(4, .50);
            history.put(4, seed_4);
        }

        {
            Map<Integer, Double> seed_5 = new HashMap<Integer, Double>();
            seed_5.put(16, .84572);
            seed_5.put(15, .81429);
            seed_5.put(14, .78286);
            seed_5.put(13, .75143);
            seed_5.put(12, .72);  //actual is .67
            // dec by .72 - .5 / 7 = .03143
            seed_5.put(11, .68857);
            seed_5.put(10, .65714);
            seed_5.put(9, .62571);
            seed_5.put(8, .59428);
            seed_5.put(7, .56285);
            seed_5.put(6, .53142);
            seed_5.put(5, .50);
            history.put(5, seed_5);
        }

        {
            Map<Integer, Double> seed_6 = new HashMap<Integer, Double>();
            seed_6.put(16, .82);
            seed_6.put(15, .788);
            seed_6.put(14, .756);
            seed_6.put(13, .724);
            seed_6.put(12, .692);
            seed_6.put(11, .66);  //actual is .67
            // dec by .66 - .5 / 5 = .032
            seed_6.put(10, .628);
            seed_6.put(9, .596);
            seed_6.put(8, .564);
            seed_6.put(7, .532);
            seed_6.put(6, .50);
            history.put(6, seed_6);
        }

        {
            Map<Integer, Double> seed_7 = new HashMap<Integer, Double>();
            seed_7.put(16, .8004);
            seed_7.put(15, .767);
            seed_7.put(14, .7336);
            seed_7.put(13, .7002);
            seed_7.put(12, .6668);
            seed_7.put(11, .6334);
            seed_7.put(10, .60);  //actual
            // dec by .60 - .5 / 3 = .03333
            seed_7.put(9, .5666);
            seed_7.put(8, .5332);
            seed_7.put(7, .50);
            history.put(7, seed_7);
        }

        {
            Map<Integer, Double> seed_8 = new HashMap<Integer, Double>();
            seed_8.put(16, .78); // guestimate
            // dec by .78 - .5 / 8 = .035
            seed_8.put(15, .745);
            seed_8.put(14, .71);
            seed_8.put(13, .675);
            seed_8.put(12, .64);
            seed_8.put(11, .605);
            seed_8.put(10, .57);
            seed_8.put(9, .535);  //actual is .47
            seed_8.put(8, .50);
            history.put(8, seed_8);
        }

        {
            Map<Integer, Double> seed_9 = new HashMap<Integer, Double>();
            seed_9.put(16, .76); // guestimate
            // dec by .76 - .5 / 7 = .03714
            seed_9.put(15, .72886);
            seed_9.put(14, .68572);
            seed_9.put(13, .64858);
            seed_9.put(12, .61144);
            seed_9.put(11, .5743);
            seed_9.put(10, .53716);
            seed_9.put(9, .50);  //actual
            history.put(9, seed_9);
        }

        {
            Map<Integer, Double> seed_10 = new HashMap<Integer, Double>();
            seed_10.put(16, .74);  // guestimate
            // dec by .74 - .5 / 6 = .04
            seed_10.put(15, .70);
            seed_10.put(14, .66);
            seed_10.put(13, .62);
            seed_10.put(12, .58);
            seed_10.put(11, .54);
            seed_10.put(10, .50);  //actual
            history.put(10, seed_10);
        }

        {
            Map<Integer, Double> seed_11 = new HashMap<Integer, Double>();
            seed_11.put(16, .72);  // guestimate
            // dec by .72 - .5 / 5 = .044
            seed_11.put(15, .676);
            seed_11.put(14, .632);
            seed_11.put(13, .588);
            seed_11.put(12, .544);
            seed_11.put(11, .50);  //actual
            history.put(11, seed_11);
        }

        {
            Map<Integer, Double> seed_12 = new HashMap<Integer, Double>();
            seed_12.put(16, .70);  // guestimate
            // dec by .70 - .5 / 4 = .05
            seed_12.put(15, .65);
            seed_12.put(14, .60);
            seed_12.put(13, .55);
            seed_12.put(12, .50);  //actual
            history.put(12, seed_12);
        }

        {
            Map<Integer, Double> seed_13 = new HashMap<Integer, Double>();
            seed_13.put(16, .64);  // guestimate
            // dec by .64 - .5 / 3 = .0466
            seed_13.put(15, .5934);
            seed_13.put(14, .5468);
            seed_13.put(13, .50);  //actual
            history.put(13, seed_13);
        }

        {
            Map<Integer, Double> seed_14 = new HashMap<Integer, Double>();
            seed_14.put(16, .58);
            // dec by .58 - .5 / 2 = .04
            seed_14.put(15, .54);
            seed_14.put(14, .50);  //actual
            history.put(14, seed_14);
        }

        {
            Map<Integer, Double> seed_15 = new HashMap<Integer, Double>();
            seed_15.put(16, .53);
            seed_15.put(15, .50);  //actual
            history.put(15, seed_15);
        }

    }

    public Team pickWinningTeam(Team team1, Team team2) {
        int winningSeed = pickWinningSeed(team1.seed, team2.seed);
        final Team winningTeam = winningSeed == team1.seed ? team1 : team2;
        final Team losingTeam = winningTeam == team1 ? team2 : team1;
        System.out.println(winningTeam.seed + " " + winningTeam.name + " beats " + losingTeam.seed + " " + losingTeam.name + (winningTeam.seed > losingTeam.seed ? " - UPSET!!!" : ""));
        return winningTeam;
    }

    private int pickWinningSeed(int seed1, int seed2) {
        int lowerSeed = Math.min(seed1, seed2);
        int higherSeed = Math.max(seed1, seed2);
        double probLowerSeedWins = history.get(lowerSeed).get(higherSeed);
        double rand = new Random().nextDouble();
        return rand < probLowerSeedWins ? lowerSeed : higherSeed;
    }
}
