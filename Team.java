package FirstComp1112Project;

import java.util.ArrayList;

public class Team {

    Player a = new Player();
    ArrayList<Team> teams = new ArrayList<>();

    private String fullName;
    private int value;
    private String shortName;
    private int size;
    //private int maxsize=22;
    int sumGS = 0;
    int sumFB = 0;
    int sumTS = 0;
    int sumBJK = 0;
    int sumKSP = 0;
    int sumBFK = 0;
    int sumÇRS = 0;
    int sumFree = 0;

    public Team(String fullName, String shortName, int value, int size) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.value = value;
        this.size = size;

    }

     

    public void removePlayer(Player player) {
        a.allplayers.remove(player);
    }

    public String getShortName() {
        return shortName;

    } //returns the team’s shortName.

    public String getfullName() {
        return fullName;

    }//returns the team’s longName.

    public int getTotalValue() {
        return value;

    }
//returns the current total value of the team,
//which is equal to the sum of players’ individual values.

    public int getSize() {
        return size;
        //returns the total size, i.e., the number of players
    }

    public String toString() {
        return fullName + "\t" + "[" + shortName + "]" + "\t" + "TeamValue: " + value + "\t" + "Team size: " + size + "\n";
    }

    public void cSum() {
        for (int i = 0; i < a.teamsplayerGs.size(); i++) {
            sumGS += a.teamsplayerGs.get(i).getMarketValue();

        }

        for (int i = 0; i < a.teamsplayerFb.size(); i++) {
            sumFB += a.teamsplayerFb.get(i).getMarketValue();

        }
        for (int i = 0; i < a.teamsplayerTs.size(); i++) {
            sumTS += a.teamsplayerTs.get(i).getMarketValue();

        }
        for (int i = 0; i < a.teamsplayerBjk.size(); i++) {
            sumBJK += a.teamsplayerBjk.get(i).getMarketValue();

        }

        for (int i = 0; i < a.teamsplayerKsp.size(); i++) {
            sumKSP += a.teamsplayerKsp.get(i).getMarketValue();

        }

        for (int i = 0; i < a.teamsplayerBfk.size(); i++) {
            sumBFK += a.teamsplayerBfk.get(i).getMarketValue();

        }

        for (int i = 0; i < a.teamsplayerÇrs.size(); i++) {
            sumÇRS += a.teamsplayerÇrs.get(i).getMarketValue();

        }

        for (int i = 0; i < a.teamPlayerFree.size(); i++) {
            sumFree += a.teamPlayerFree.get(i).getMarketValue();
        }

    }

    public Team() {

        cSum();
        Team GS = new Team("Galatasaray", "GS", sumGS, a.teamsplayerGs.size());
        teams.add(GS);
        Team FB = new Team("Fenerbahçe", "FB", sumFB, a.teamsplayerFb.size());
        teams.add(FB);
        Team TS = new Team("Trabzonspor", "TS", sumTS, a.teamsplayerTs.size());
        teams.add(TS);
        Team BJK = new Team("Beşiktaş", "BJK", sumBJK, a.teamsplayerBjk.size());
        teams.add(BJK);
        Team KSP = new Team("Kasımpaşa", "KSP", sumKSP, a.teamsplayerKsp.size());
        teams.add(KSP);
        Team BFK = new Team("Başakşehir", "BFK", sumBFK, a.teamsplayerBfk.size());
        teams.add(BFK);
        Team ÇRS = new Team("Rizespor", "ÇRS", sumÇRS, a.teamsplayerÇrs.size());
        teams.add(ÇRS);
        Team free = new Team("TeamFree", "TF", sumFree, a.teamPlayerFree.size());
        teams.add(free);

    }

}
