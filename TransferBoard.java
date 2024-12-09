package FirstComp1112Project;

import java.util.ArrayList;
import java.util.Scanner;

public class TransferBoard {

    private final ArrayList<Contract> contracts;
    private final ArrayList<Player> players;
    private final ArrayList<Team> teams;


    public TransferBoard() {
        this.contracts = new ArrayList<>();
        this.players = new ArrayList<>();
        this.teams = new ArrayList<>();
    }

  

  public int makeContract(ArrayList<Contract> teamplayerselectedc, ArrayList<Player> teamplayerselected, ArrayList<Player> teamplayer, ArrayList<Contract> teamplayerc) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for (int i = 0; i <= teamplayer.size(); i++) {
            if (x == teamplayer.get(i).getBackNumber()) {
                System.out.println(" [1]Permanent \n [2]Rented \n [3]Exit");
                x = scn.nextInt();
                switch (x) {
                 
                case (1):
                case (2):
                    Contract selectedContract = teamplayerc.get(i); // Öncelikle seçilen sözleşmeyi bir değişkene atayın
                    selectedContract.setType(x == 1 ? "Permanent" : "Rented"); // Tipi ayarlayın
                    teamplayerselectedc.add(selectedContract); // Güncellenmiş sözleşmeyi ekleyin
                    teamplayerc.remove(i); // Eski sözleşmeyi kaldırın
                    
                    teamplayerselected.add(teamplayer.get(i)); // Oyuncuyu yeni listeye ekleyin
                    teamplayer.remove(i); // Oyuncuyu eski listesinden kaldırın
                    return i; // İndex'i döndürün
                    case (3):
                        break;
                }

            }

        }
        return 0;

    } 

  

    // Getter and Setter methods as required
}
