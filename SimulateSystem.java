package FirstComp1112Project;

import java.util.Scanner;

public class SimulateSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        Player a = new Player();
        Team b = new Team();
        Contract c = new Contract();
        TransferBoard d = new TransferBoard();
        System.out.println("Press [1] for open system");
        int choose = scan.nextInt();
        while (choose != 3) {

            System.out.println("Enter the number of what you want to do?");
            System.out.println(" [1]Teams \n [2]Free players \n [3]Exit");
            choose = scan.nextInt();
            //  System.out.println("[1]GS / [2]FB / [3]TS / [4]BJK / [5]KSP / [6]BFK / [7]ÇRS / [8]FT / [0]EXIT");

            switch (choose) {
                case 1:
                    System.out.println("-Teams-\n");
                    System.out.println(" [1]GS \n [2]FB \n [3]TS \n [4]BJK \n [5]KSP \n [6]BFK \n [7]ÇRS \n [8]Exit");
                    System.out.println("Select the team: ");
                    int chooseTeam = scan.nextInt();
                    switch (chooseTeam) {
                        case 1:
                            System.out.println("\t" + "Galatasaray" + "\t" + "[GS]\t" + "Team value: " + (b.sumGS + a.teamsplayerGs.get(a.teamsplayerGs.size() - 1).marketValue) + "\tTeam size: " + a.teamsplayerGs.size() + "\n");

                            System.out.println(a.teamsplayerGs);
                            System.out.println(" [1]Contrats \n [2]Make transfer \n [3]Contrat delete \n [4]Exit");
                            int choosew1 = scan.nextInt();
                            switch (choosew1) {
                                case 1:
                                    System.out.println("-Galatasaray  [GS]-\n");

                                    System.out.println(c.contractGs);
                                    break;
                                case 2:
                                    //Make transfer
                                    for (int i = 1; i < b.teams.size(); i++) {
                                        System.out.println("[" + i + "]" + b.teams.get(i));
                                    }
                                    System.out.println("Select which team you want to transfer with: ");
                                    int trcho1 = scan.nextInt();
                                    switch (trcho1) {
                                        case 1:
                                            System.out.println("-Fenerbahçe  [FB]-\n]");
                                            System.out.println(a.teamsplayerFb);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractGs, a.teamsplayerGs, a.teamsplayerFb, c.contractFb));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 2:
                                            System.out.println("-Trabzonpor  [TS]-\n");
                                            System.out.println(a.teamsplayerTs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractGs, a.teamsplayerGs, a.teamsplayerTs, c.contractTs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 3:
                                            System.out.println("-Beşiktaş  [BJK]-\n");

                                            System.out.println(a.teamsplayerBjk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractGs, a.teamsplayerGs, a.teamsplayerBjk, c.contractBjk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 4:
                                            System.out.println("-Kasımpaşa  [KSP]-\n");

                                            System.out.println(a.teamsplayerKsp);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractGs, a.teamsplayerGs, a.teamsplayerKsp, c.contractKsp));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 5:
                                            System.out.println("-Başakşehir  [BFK]-\n");

                                            System.out.println(a.teamsplayerBfk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractGs, a.teamsplayerGs, a.teamsplayerBfk, c.contractBfk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 6:
                                            System.out.println("-Rizespor  [ÇRS]-\n");
                                            System.out.println(a.teamsplayerÇrs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractGs, a.teamsplayerGs, a.teamsplayerÇrs, c.contractÇrs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 7:
                                            System.out.println(a.teamPlayerFree);
                                    }
                                    break;
                                case 3:
                                    //contratDelete
                                    System.out.println("Enter the backNumber of you want to delete contrat: ");
                                    c.contratDelete(c.contractGs, a.teamsplayerGs, a.teamPlayerFree);
                                    System.out.println("Contract delected.");
                                    System.out.println("Player move on the free players.");
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 2:

                            System.out.println("\t" + "Fenerbahçe" + "\t" + "[FB]\t" + "Team value: " + (b.sumFB + a.teamsplayerFb.get(a.teamsplayerFb.size() - 1).marketValue) + "\tTeam size: " + a.teamsplayerFb.size() + "\n");
                            System.out.println(a.teamsplayerFb);
                            System.out.println(" [1]Contrats \n [2]Make transfer \n [3]Contrat delete \n [4]Exit");
                            int choosew2 = scan.nextInt();
                            switch (choosew2) {
                                case 1:
                                    System.out.println("-Fenerbahçe  [FB]-\n");
                                    System.out.println(c.contractFb);
                                    break;
                                case 2:
                                    //Make transfer
                                    System.out.println("[" + 1 + "]" + b.teams.get(0));
                                    for (int i = 2; i < b.teams.size(); i++) {

                                        System.out.println("[" + i + "]" + b.teams.get(i));
                                    }
                                    System.out.println("Select which team you want to transfer with: ");
                                    int trcho2 = scan.nextInt();
                                    switch (trcho2) {
                                        case 1:
                                            System.out.println("-Galatasaray  [GS]-\n");

                                            System.out.println(a.teamsplayerGs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractFb, a.teamsplayerFb, a.teamsplayerGs, c.contractGs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 2:
                                            System.out.println("-Trabzonpor  [TS]-\n");

                                            System.out.println(a.teamsplayerTs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractFb, a.teamsplayerFb, a.teamsplayerTs, c.contractTs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 3:
                                            System.out.println("-Beşiktaş  [BJK]-\n");

                                            System.out.println(a.teamsplayerBjk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractFb, a.teamsplayerFb, a.teamsplayerBjk, c.contractBjk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 4:
                                            System.out.println("-Kasımpaşa  [KSP]-\n");

                                            System.out.println(a.teamsplayerKsp);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractFb, a.teamsplayerFb, a.teamsplayerKsp, c.contractKsp));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 5:
                                            System.out.println("-Başakşehir  [BFK]-\n");

                                            System.out.println(a.teamsplayerBfk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractFb, a.teamsplayerFb, a.teamsplayerBfk, c.contractBfk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 6:
                                            System.out.println("-Rizespor  [ÇRS]-\n");

                                            System.out.println(a.teamsplayerÇrs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractFb, a.teamsplayerFb, a.teamsplayerÇrs, c.contractÇrs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 7:
                                            System.out.println(a.teamPlayerFree);
                                        // a.allplayers.get(d.makeContract(c.contractFb,a.teamsplayerFb,a.teamPlayerFree,c.contract)).setCurrentTeam("FB");

                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter the backNumber of you want to delete contrat: ");
                                    c.contratDelete(c.contractFb, a.teamsplayerFb, a.teamPlayerFree);
                                     System.out.println("Contract delected.");
                                    System.out.println("Player move on the free players.");
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 3:

                            System.out.println("\t" + "Trabzonspor" + "\t" + "[FB]\t" + "Team value: " + (b.sumTS + a.teamsplayerTs.get(a.teamsplayerTs.size() - 1).marketValue) + "\tTeam size: " + a.teamsplayerTs.size() + "\n");
                            System.out.println(a.teamsplayerTs);
                            System.out.println(" [1]Contrats \n [2]Make transfer \n [3]Contrat delete \n [4]Exit");
                            int choosew3 = scan.nextInt();
                            switch (choosew3) {
                                case 1:
                                    System.out.println("-Trabzonspor  [TS]-\n");
                                    System.out.println(c.contractTs);
                                    break;
                                case 2:
                                    //Make transfer
                                    System.out.println("[" + 1 + "]" + b.teams.get(0));
                                    System.out.println("[" + 2 + "]" + b.teams.get(1));
                                    for (int i = 3; i < b.teams.size(); i++) {

                                        System.out.println("[" + i + "]" + b.teams.get(i));
                                    }
                                    System.out.println("Select which team you want to transfer with: ");
                                    int trcho2 = scan.nextInt();
                                    switch (trcho2) {
                                        case 1:
                                            System.out.println("-Galatasaray  [GS]-\n");

                                            System.out.println(a.teamsplayerGs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractTs, a.teamsplayerTs, a.teamsplayerGs, c.contractGs));

                                            System.out.println("Adding Successful");
                                            break;
                                        case 2:
                                            System.out.println("-Fenerbahçe  [FB]-\n");

                                            System.out.println(a.teamsplayerFb);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractTs, a.teamsplayerTs, a.teamsplayerFb, c.contractFb));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 3:
                                            System.out.println("-Beşiktaş  [BJK]-\n");

                                            System.out.println(a.teamsplayerBjk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractTs, a.teamsplayerTs, a.teamsplayerBjk, c.contractBjk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 4:
                                            System.out.println("-Kasımpaşa  [KSP]-\n");

                                            System.out.println(a.teamsplayerKsp);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractTs, a.teamsplayerTs, a.teamsplayerKsp, c.contractKsp));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 5:
                                            System.out.println("-Başakşehir  [BFK]-\n");

                                            System.out.println(a.teamsplayerBfk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractTs, a.teamsplayerTs, a.teamsplayerBfk, c.contractBfk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 6:
                                            System.out.println("-Rizespor  [ÇRS]-\n");

                                            System.out.println(a.teamsplayerÇrs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractTs, a.teamsplayerTs, a.teamsplayerÇrs, c.contractÇrs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 7:
                                            System.out.println(a.teamPlayerFree);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter the backNumber of you want to delete contrat: ");
                                    c.contratDelete(c.contractTs, a.teamsplayerTs, a.teamPlayerFree);
                                     System.out.println("Contract delected.");
                                    System.out.println("Player move on the free players.");
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 4:

                            System.out.println("\t" + "Beşiktaş" + "\t" + "[BJK]\t" + "Team value: " + (b.sumBJK + a.teamsplayerBjk.get(a.teamsplayerBjk.size() - 1).marketValue) + "\tTeam size: " + a.teamsplayerBjk.size() + "\n");
                            System.out.println(a.teamsplayerBjk);
                            System.out.println(" [1]Contrats \n [2]Make transfer \n [3]Contrat delete \n [4]Exit");
                            int choosew4 = scan.nextInt();
                            switch (choosew4) {
                                case 1:
                                    System.out.println("-Beşiktaş  [BJK]-\n");
                                    System.out.println(c.contractBjk);
                                    break;
                                case 2:
                                    //Make transfer
                                    System.out.println("[" + 1 + "]" + b.teams.get(0));
                                    System.out.println("[" + 2 + "]" + b.teams.get(1));
                                    System.out.println("[" + 3 + "]" + b.teams.get(2));

                                    for (int i = 4; i < b.teams.size(); i++) {

                                        System.out.println("[" + i + "]" + b.teams.get(i));
                                    }
                                    System.out.println("Select which team you want to transfer with: ");
                                    int trcho2 = scan.nextInt();
                                    switch (trcho2) {
                                        case 1:
                                            System.out.println("-Galatasaray  [GS]-\n");

                                            System.out.println(a.teamsplayerGs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBjk, a.teamsplayerBjk, a.teamsplayerGs, c.contractGs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 2:
                                            System.out.println("-Fenerbahçe  [FB]-\n");

                                            System.out.println(a.teamsplayerFb);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBjk, a.teamsplayerBjk, a.teamsplayerFb, c.contractFb));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 3:
                                            System.out.println("-Trabzonpor  [TS]-\n");

                                            System.out.println(a.teamsplayerTs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBjk, a.teamsplayerBjk, a.teamsplayerTs, c.contractTs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 4:
                                            System.out.println("-Kasımpaşa  [KSP]-\n");

                                            System.out.println(a.teamsplayerKsp);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBjk, a.teamsplayerBjk, a.teamsplayerKsp, c.contractKsp));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 5:
                                            System.out.println("-Başakşehir  [BFK]-\n");

                                            System.out.println(a.teamsplayerBfk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBjk, a.teamsplayerBjk, a.teamsplayerBfk, c.contractBfk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 6:
                                            System.out.println("-Rizespor  [ÇRS]-\n");

                                            System.out.println(a.teamsplayerÇrs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBjk, a.teamsplayerBjk, a.teamsplayerÇrs, c.contractÇrs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 7:
                                            System.out.println(a.teamPlayerFree);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter the backNumber of you want to delete contrat: ");
                                    c.contratDelete(c.contractBjk, a.teamsplayerBjk, a.teamPlayerFree);
                                     System.out.println("Contract delected.");
                                    System.out.println("Player move on the free players.");
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 5:

                            System.out.println("\t" + "Kasımpaşa" + "\t" + "[KSP]\t" + "Team value: " + (b.sumKSP + a.teamsplayerKsp.get(a.teamsplayerKsp.size() - 1).marketValue) + "\tTeam size: " + a.teamsplayerKsp.size() + "\n");
                            System.out.println(a.teamsplayerKsp);
                            System.out.println(" [1]Contrats \n [2]Make transfer \n [3]Contrat delete \n [4]Exit");
                            int choosew5 = scan.nextInt();
                            switch (choosew5) {
                                case 1:
                                    System.out.println("-Kasımpaşa  [KSP]-\n");
                                    System.out.println(c.contractKsp);
                                    break;
                                case 2:
                                    //Make transfer

                                    for (int i = 0; i < b.teams.size() - 4; i++) {

                                        System.out.println("[" + (i + 1) + "]" + b.teams.get(i));
                                    }
                                    System.out.println("[" + 5 + "]" + b.teams.get(5));

                                    System.out.println("[" + 6 + "]" + b.teams.get(6));
                                    System.out.println("[" + 7 + "]" + b.teams.get(7));

                                    System.out.println("Select which team you want to transfer with: ");
                                    int trcho2 = scan.nextInt();
                                    switch (trcho2) {
                                        case 1:
                                            System.out.println("-Galatasaray  [GS]-\n");

                                            System.out.println(a.teamsplayerGs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractKsp, a.teamsplayerKsp, a.teamsplayerGs, c.contractGs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 2:
                                            System.out.println("-Fenerbahçe  [FB]-\n");

                                            System.out.println(a.teamsplayerFb);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractKsp, a.teamsplayerKsp, a.teamsplayerFb, c.contractFb));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 3:
                                            System.out.println("-Trabzonpor  [TS]-\n");

                                            System.out.println(a.teamsplayerTs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractKsp, a.teamsplayerKsp, a.teamsplayerTs, c.contractTs));
                                            System.out.println("Adding Successful");
                                            break;

                                        case 4:
                                            System.out.println("-Beşiktaş  [BJK]-\n");

                                            System.out.println(a.teamsplayerBjk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractKsp, a.teamsplayerKsp, a.teamsplayerBjk, c.contractBjk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 5:
                                            System.out.println("-Başakşehir  [BFK]-\n");

                                            System.out.println(a.teamsplayerBfk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractKsp, a.teamsplayerKsp, a.teamsplayerBfk, c.contractBfk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 6:
                                            System.out.println("-Rizespor  [ÇRS]-\n");

                                            System.out.println(a.teamsplayerÇrs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractKsp, a.teamsplayerKsp, a.teamsplayerÇrs, c.contractÇrs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 7:
                                            System.out.println(a.teamPlayerFree);
                                    }

                                    break;
                                case 3:
                                    System.out.println("Enter the backNumber of you want to delete contrat: ");
                                    c.contratDelete(c.contractKsp, a.teamsplayerKsp, a.teamPlayerFree);
                                     System.out.println("Contract delected.");
                                    System.out.println("Player move on the free players.");
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 6:

                            System.out.println("\t" + "Başakşehir" + "\t" + "[BFK]\t" + "Team value: " + (b.sumBFK + a.teamsplayerBfk.get(a.teamsplayerBfk.size() - 1).marketValue) + "\tTeam size: " + a.teamsplayerBfk.size() + "\n");
                            System.out.println(a.teamsplayerBfk);
                            System.out.println(" [1]Contrats \n [2]Make transfer \n [3]Contrat delete \n [4]Exit");
                            int choosew6 = scan.nextInt();
                            switch (choosew6) {
                                case 1:
                                    System.out.println("-Başakşehir  [BFK]-\n");
                                    System.out.println(c.contractBfk);
                                    break;
                                case 2:
                                    //Make transfer
                                    for (int i = 0; i < b.teams.size() - 3; i++) {

                                        System.out.println("[" + (i + 1) + "]" + b.teams.get(i));
                                    }

                                    System.out.println("[" + 6 + "]" + b.teams.get(6));
                                    System.out.println("[" + 7 + "]" + b.teams.get(7));

                                    System.out.println("Select which team you want to transfer with: ");
                                    int trcho2 = scan.nextInt();
                                    switch (trcho2) {
                                        case 1:
                                            System.out.println("-Galatasaray  [GS]-\n");

                                            System.out.println(a.teamsplayerGs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBfk, a.teamsplayerBfk, a.teamsplayerGs, c.contractGs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 2:
                                            System.out.println("-Fenerbahçe  [FB]-\n");

                                            System.out.println(a.teamsplayerFb);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBfk, a.teamsplayerBfk, a.teamsplayerFb, c.contractFb));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 3:
                                            System.out.println("-Trabzonpor  [TS]-\n");

                                            System.out.println(a.teamsplayerTs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBfk, a.teamsplayerBfk, a.teamsplayerTs, c.contractTs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 4:
                                            System.out.println("-Beşiktaş  [BJK]-\n");

                                            System.out.println(a.teamsplayerBjk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBfk, a.teamsplayerBfk, a.teamsplayerBjk, c.contractBjk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 5:
                                            System.out.println("-Kasımpaşa  [KSP]-\n");

                                            System.out.println(a.teamsplayerKsp);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBfk, a.teamsplayerBfk, a.teamsplayerKsp, c.contractKsp));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 6:
                                            System.out.println("-Rizespor  [ÇRS]-\n");

                                            System.out.println(a.teamsplayerÇrs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractBfk, a.teamsplayerBfk, a.teamsplayerÇrs, c.contractÇrs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 7:
                                            System.out.println(a.teamPlayerFree);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter the backNumber of you want to delete contrat: ");
                                    c.contratDelete(c.contractBfk, a.teamsplayerBfk, a.teamPlayerFree);
                                     System.out.println("Contract delected.");
                                    System.out.println("Player move on the free players.");
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 7:

                            System.out.println("\t" + "Rizespor" + "\t" + "[ÇRS]\t" + "Team value: " + (b.sumÇRS + a.teamsplayerÇrs.get(a.teamsplayerÇrs.size() - 1).marketValue) + "\tTeam size: " + a.teamsplayerÇrs.size() + "\n");
                            System.out.println(a.teamsplayerÇrs);
                            System.out.println(" [1]Contrats \n [2]Make transfer \n [3]Contrat delete \n [4]Exit");
                            int choosew7 = scan.nextInt();
                            switch (choosew7) {
                                case 1:
                                    System.out.println("-Rizespor  [ÇRS]-\n");
                                    System.out.println(c.contractÇrs);
                                    break;
                                case 2:
                                    for (int i = 0; i < b.teams.size() - 2; i++) {

                                        System.out.println("[" + (i + 1) + "]" + b.teams.get(i));
                                    }

                                    System.out.println("Select which team you want to transfer with: ");
                                    int trcho2 = scan.nextInt();
                                    switch (trcho2) {
                                        case 1:
                                            System.out.println("-Galatasaray  [GS]-\n");
                                            System.out.println(a.teamsplayerGs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractÇrs, a.teamsplayerÇrs, a.teamsplayerGs, c.contractGs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 2:
                                            System.out.println("-Fenerbahçe  [FB]-\n");

                                            System.out.println(a.teamsplayerFb);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractÇrs, a.teamsplayerÇrs, a.teamsplayerFb, c.contractFb));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 3:
                                            System.out.println("-Trabzonpor  [TS]-\n");

                                            System.out.println(a.teamsplayerTs);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractÇrs, a.teamsplayerÇrs, a.teamsplayerTs, c.contractTs));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 4:
                                            System.out.println("-Beşiktaş  [BJK]-\n");

                                            System.out.println(a.teamsplayerBjk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractÇrs, a.teamsplayerÇrs, a.teamsplayerBjk, c.contractBjk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 5:
                                            System.out.println("-Kasımpaşa  [KSP]-\n");

                                            System.out.println(a.teamsplayerKsp);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractÇrs, a.teamsplayerÇrs, a.teamsplayerKsp, c.contractKsp));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 6:
                                            System.out.println("-Başakşehir  [BFK]-\n");

                                            System.out.println(a.teamsplayerBfk);
                                            System.out.println("Select the player backNumber for transfer: ");
                                            a.allplayers.get(d.makeContract(c.contractÇrs, a.teamsplayerÇrs, a.teamsplayerBfk, c.contractBfk));
                                            System.out.println("Adding Successful");
                                            break;
                                        case 7:
                                            System.out.println(a.teamPlayerFree);
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter the backNumber of you want to delete contrat: ");
                                    c.contratDelete(c.contractÇrs, a.teamsplayerÇrs, a.teamPlayerFree);
                                     System.out.println("Contract delected.");
                                    System.out.println("Player move on the free players.");
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 8:
                            System.exit(0);
                    }
                    break;

                case 2:
                    System.out.println(a.teamPlayerFree);

                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }//main

}//class
 