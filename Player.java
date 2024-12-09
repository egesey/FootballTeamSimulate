package FirstComp1112Project;

import java.util.ArrayList;

public class Player {

    ArrayList<Player> allplayers = new ArrayList<>();
    ArrayList<Player> teamsplayerGs = new ArrayList<>();
    ArrayList<Player> teamsplayerFb = new ArrayList<>();
    ArrayList<Player> teamsplayerTs = new ArrayList<>();
    ArrayList<Player> teamsplayerBjk = new ArrayList<>();
    ArrayList<Player> teamsplayerKsp = new ArrayList<>();
    ArrayList<Player> teamsplayerBfk = new ArrayList<>();
    ArrayList<Player> teamsplayerÇrs = new ArrayList<>();
    ArrayList<Player> teamPlayerFree = new ArrayList<>();

    private int backNumber;
    private String name;
    private String position;
    long marketValue;
    private String currentTeam;
    private String previousTeam;
    private int totalGoals;
    private int totalYellowCards;
//private Contract contract;

    public Player(String name, int backNumber, String position, long marketValue, int totalGoals, int totalYellowCards) {
        this.name = name;
        this.backNumber = backNumber;
        this.position = position;
        this.marketValue = marketValue;
        this.previousTeam = null;
        this.totalGoals = totalGoals;
        this.totalYellowCards = totalYellowCards;

        // this.currentTeam = currentTeam;
    }

    // Getters
    public int getBackNumber() {
        return backNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public long getMarketValue() {
        return marketValue;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public String getPreviousTeam() {
        return previousTeam;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int getTotalYellowCards() {
        return totalYellowCards;
    }

    public String setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
        return currentTeam;
    }

    public String toString() {
        return name + "[" + backNumber + "]" + "\t" + position + "\tMarketValue: " + marketValue + "\tTotalGoals: " + totalGoals + "\tTotalYCard: " + totalYellowCards + "\n";
    }

    public Player() {

        //GS players
        Player Muslera = new Player("Muslera", 1, "Keeper", 4206082, 0, 1);
        Player Kaan = new Player("Kaan", 2, "Def", 5610853, 3, 0);
        Player Toreira = new Player("Toreira", 3, "Mid", 8638797, 4, 0);
        Player Icardi = new Player("Icardi", 4, "For", 693890, 17, 1);
        Player Kerem = new Player("Kerem", 5, "Mid", 14773576, 8, 0);
        Player Abdüş = new Player("Abdüş", 6, "Def", 14727274, 5, 0);
        Player Oliv = new Player("Oliv", 7, "Mid", 9738735, 3, 1);
        Player Mertens = new Player("Mertens", 8, "Mid", 5112339, 4, 0);
        Player Bakambu = new Player("Bakambu", 9, "For", 9609087, 5, 1);
        Player Nellson = new Player("Nellson", 10, "Def", 5616722, 6, 1);
        Player Boey = new Player("Boey", 11, "Def", 8899724, 2, 0);
        Player Eyüp = new Player("Eyüp", 12, "Mid", 1571168, 4, 0);
        Player Berkan = new Player("Berkan", 13, "For", 8837632, 2, 0);
        Player Tete = new Player("Tete", 14, "For", 14489001, 6, 1);
        teamsplayerGs.add(Muslera);
        teamsplayerGs.add(Kaan);
        teamsplayerGs.add(Toreira);
        teamsplayerGs.add(Icardi);
        teamsplayerGs.add(Kerem);
        teamsplayerGs.add(Abdüş);
        teamsplayerGs.add(Oliv);
        teamsplayerGs.add(Mertens);
        teamsplayerGs.add(Bakambu);
        teamsplayerGs.add(Nellson);
        teamsplayerGs.add(Boey);
        teamsplayerGs.add(Eyüp);
        teamsplayerGs.add(Berkan);
        teamsplayerGs.add(Tete);

        allplayers.add(Muslera);
        allplayers.add(Kaan);
        allplayers.add(Toreira);
        allplayers.add(Icardi);
        allplayers.add(Kerem);
        allplayers.add(Abdüş);
        allplayers.add(Oliv);
        allplayers.add(Mertens);
        allplayers.add(Bakambu);
        allplayers.add(Nellson);
        allplayers.add(Boey);
        allplayers.add(Eyüp);
        allplayers.add(Berkan);
        allplayers.add(Tete);

        //FB
        Player liva = new Player("Liva", 15, "Keeper", 11946217, 0, 1);
        Player Çağlar = new Player("Çağlar", 16, "Def", 10071167, 3, 0);
        Player Djiku = new Player("Djiku", 17, "Mid", 8056464, 4, 0);
        Player Rodrigo = new Player("Rodrigo", 18, "For", 5014168, 15, 1);
        Player Peres = new Player("Peres", 19, "Mid", 13136013, 4, 0);
        Player Leo = new Player("Leo", 20, "Def", 12007828, 5, 1);
        Player Serdar = new Player("Serdar", 21, "Mid", 5400751, 6, 1);
        Player Ferdi = new Player("Ferdi", 22, "Mid", 2586682, 2, 1);
        Player Mert = new Player("Mert", 23, "For", 2678758, 3, 1);
        Player Kent = new Player("Kent", 24, "Def", 359109, 5, 0);
        Player Egemen = new Player("Egemen", 25, "Def", 7656427, 2, 0);
        Player Erdem = new Player("Erdem", 26, "Mid", 9984555, 7, 0);
        Player Berkay = new Player("Berkay", 27, "For", 6187438, 8, 0);
        Player Kenan = new Player("Kenan", 28, "For", 11668648, 3, 1);
        teamsplayerFb.add(liva);
        teamsplayerFb.add(Çağlar);
        teamsplayerFb.add(Djiku);
        teamsplayerFb.add(Rodrigo);
        teamsplayerFb.add(Peres);
        teamsplayerFb.add(Leo);
        teamsplayerFb.add(Serdar);
        teamsplayerFb.add(Ferdi);
        teamsplayerFb.add(Mert);
        teamsplayerFb.add(Kent);
        teamsplayerFb.add(Egemen);
        teamsplayerFb.add(Erdem);
        teamsplayerFb.add(Berkay);
        teamsplayerFb.add(Kenan);

        allplayers.add(liva);
        allplayers.add(Çağlar);
        allplayers.add(Djiku);
        allplayers.add(Rodrigo);
        allplayers.add(Peres);
        allplayers.add(Leo);
        allplayers.add(Serdar);
        allplayers.add(Ferdi);
        allplayers.add(Mert);
        allplayers.add(Kent);
        allplayers.add(Egemen);
        allplayers.add(Erdem);
        allplayers.add(Berkay);
        allplayers.add(Kenan);

        //TS
        Player Uğurcan = new Player("Uğurcan", 29, "Keeper", 12951886, 1, 0);
        Player Ege = new Player("Ege", 30, "Def", 14635654, 12, 0);
        Player Taha = new Player("Taha", 31, "Mid", 9926595, 4, 0);
        Player Eren = new Player("Eren", 32, "For", 909647, 2, 0);
        Player Arifcan = new Player("Arifcan", 33, "Mid", 4633751, 5, 0);
        Player Faruk = new Player("Faruk", 34, "Def", 3184612, 7, 1);
        Player Mislav = new Player("Mislav", 35, "Mid", 1110052, 8, 1);
        Player Edin = new Player("Edin", 36, "Mid", 11584056, 7, 0);
        Player Enis = new Player("Enis", 37, "For", 199048, 4, 0);
        Player Umutcan = new Player("Umutcan", 38, "Def", 14753758, 5, 0);
        Player Berat = new Player("Berat", 39, "Def", 8359427, 3, 0);
        Player Göktan = new Player("Göktan", 40, "Mid", 8285974, 4, 0);
        Player Mehmet = new Player("Mehmet", 41, "For", 823113, 8, 0);
        Player Ömer = new Player("Ömer", 42, "For", 10503337, 2, 1);
        teamsplayerTs.add(Uğurcan);
        teamsplayerTs.add(Ege);
        teamsplayerTs.add(Taha);
        teamsplayerTs.add(Eren);
        teamsplayerTs.add(Arifcan);
        teamsplayerTs.add(Faruk);
        teamsplayerTs.add(Mislav);
        teamsplayerTs.add(Edin);
        teamsplayerTs.add(Enis);
        teamsplayerTs.add(Umutcan);
        teamsplayerTs.add(Berat);
        teamsplayerTs.add(Göktan);
        teamsplayerTs.add(Mehmet);
        teamsplayerTs.add(Ömer);

        allplayers.add(Uğurcan);
        allplayers.add(Ege);
        allplayers.add(Taha);
        allplayers.add(Eren);
        allplayers.add(Arifcan);
        allplayers.add(Faruk);
        allplayers.add(Mislav);
        allplayers.add(Edin);
        allplayers.add(Enis);
        allplayers.add(Umutcan);
        allplayers.add(Berat);
        allplayers.add(Göktan);
        allplayers.add(Mehmet);
        allplayers.add(Ömer);

        //BJK
        Player Sergen = new Player("Sergen", 43, "Keeper", 12938313, 0, 0);
        Player Utku = new Player("Utku", 44, "Def", 787252, 6, 1);
        Player Omar = new Player("Omar", 45, "Mid", 4238313, 7, 1);
        Player Tayyip = new Player("Tayyip", 46, "For", 12814002, 3, 1);
        Player Emrecan = new Player("Emrecan", 47, "Mid", 3403745, 8, 0);
        Player Necip = new Player("Necip", 48, "Def", 14134791, 5, 0);
        Player Aytuğ = new Player("Aytuğ", 49, "Mid", 192831, 8, 1);
        Player Umut = new Player("Umut", 50, "Mid", 10629006, 9, 1);
        Player Onur = new Player("Onur", 51, "For", 104273, 3, 0);
        Player Milot = new Player("Milot", 52, "Def", 1191787, 2, 0);
        Player Arif = new Player("Arif", 53, "Def", 10397550, 7, 0);
        Player Efe = new Player("Efe", 54, "Mid", 14053713, 2, 0);
        Player Ali = new Player("Ali", 55, "For", 13429242, 8, 1);
        Player Tuncay = new Player("Tuncay", 56, "For", 8855859, 10, 1);
        teamsplayerBjk.add(Sergen);
        teamsplayerBjk.add(Utku);
        teamsplayerBjk.add(Omar);
        teamsplayerBjk.add(Tayyip);
        teamsplayerBjk.add(Emrecan);
        teamsplayerBjk.add(Necip);
        teamsplayerBjk.add(Aytuğ);
        teamsplayerBjk.add(Umut);
        teamsplayerBjk.add(Onur);
        teamsplayerBjk.add(Milot);
        teamsplayerBjk.add(Arif);
        teamsplayerBjk.add(Efe);
        teamsplayerBjk.add(Ali);
        teamsplayerBjk.add(Tuncay);

        allplayers.add(Sergen);
        allplayers.add(Utku);
        allplayers.add(Omar);
        allplayers.add(Tayyip);
        allplayers.add(Emrecan);
        allplayers.add(Necip);
        allplayers.add(Aytuğ);
        allplayers.add(Umut);
        allplayers.add(Onur);
        allplayers.add(Milot);
        allplayers.add(Arif);
        allplayers.add(Efe);
        allplayers.add(Ali);
        allplayers.add(Tuncay);

        //KSP
        Player Andreas = new Player("Andreas", 57, "Keeper", 13184846, 0, 1);
        Player Emre = new Player("Emre", 58, "Def", 1384465, 4, 0);
        Player Melih = new Player("Melih", 59, "Mid", 5581285, 6, 0);
        Player Yasin = new Player("Yasin", 60, "For", 4618859, 8, 0);
        Player Sadık = new Player("Sadık", 61, "Mid", 277421, 2, 0);
        Player Taylan = new Player("Taylan", 62, "Def", 6900922, 5, 0);
        Player Adnan = new Player("Adnan", 63, "Mid", 8872685, 6, 0);
        Player Gökhan = new Player("Gökhan", 64, "Mid", 12465068, 7, 1);
        Player Loret = new Player("Loret", 65, "For", 5055858, 2, 1);
        Player Samuel = new Player("Samuel", 66, "Def", 10653673, 4, 0);
        Player Aytaç = new Player("Aytaç", 67, "Def", 2870494, 12, 0);
        Player Selim = new Player("Selim", 68, "Mid", 10114779, 8, 1);
        Player Kanuni = new Player("Mehmet", 69, "For", 8877500, 2, 0);
        Player Rochin = new Player("Rochin", 70, "For", 3961770, 4, 1);
        teamsplayerKsp.add(Andreas);
        teamsplayerKsp.add(Emre);
        teamsplayerKsp.add(Melih);
        teamsplayerKsp.add(Yasin);
        teamsplayerKsp.add(Sadık);
        teamsplayerKsp.add(Taylan);
        teamsplayerKsp.add(Adnan);
        teamsplayerKsp.add(Gökhan);
        teamsplayerKsp.add(Loret);
        teamsplayerKsp.add(Samuel);
        teamsplayerKsp.add(Aytaç);
        teamsplayerKsp.add(Selim);
        teamsplayerKsp.add(Kanuni);
        teamsplayerKsp.add(Rochin);

        allplayers.add(Andreas);
        allplayers.add(Emre);
        allplayers.add(Melih);
        allplayers.add(Yasin);
        allplayers.add(Sadık);
        allplayers.add(Taylan);
        allplayers.add(Adnan);
        allplayers.add(Gökhan);
        allplayers.add(Loret);
        allplayers.add(Samuel);
        allplayers.add(Aytaç);
        allplayers.add(Selim);
        allplayers.add(Kanuni);
        allplayers.add(Rochin);

        //BFK
        Player Mami = new Player("Mami", 71, "Keeper", 12245023, 0, 0);
        Player Deniz = new Player("Deniz", 72, "Def", 11796467, 3, 1);
        Player Volkan = new Player("Volkan", 73, "Mid", 30000, 5, 0);
        Player Leon = new Player("Leon", 74, "For", 10792653, 5, 0);
        Player Yusuf = new Player("Yusuf", 75, "Mid", 3015354, 6, 0);
        Player Jerome = new Player("Jerome", 76, "Def", 1822256, 7, 0);
        Player Hamza = new Player("Hamza", 77, "Mid", 10594090, 9, 0);
        Player Arda = new Player("Arda", 78, "Mid", 2925465, 3, 1);
        Player Yağız = new Player("Yağız", 79, "For", 9030395, 5, 0);
        Player Onurcan = new Player("Onurcan", 80, "Def", 5924679, 7, 0);
        Player Souza = new Player("Souza", 81, "Def", 14223698, 8, 0);
        Player Emirhan = new Player("Selim", 82, "Mid", 9693609, 4, 1);
        Player Mahmut = new Player("Mehmet", 83, "For", 13189482, 5, 1);
        Player Olivier = new Player("Olivier", 84, "For", 5605282, 6, 1);
        teamsplayerBfk.add(Mami);
        teamsplayerBfk.add(Deniz);
        teamsplayerBfk.add(Volkan);
        teamsplayerBfk.add(Leon);
        teamsplayerBfk.add(Yusuf);
        teamsplayerBfk.add(Jerome);
        teamsplayerBfk.add(Hamza);
        teamsplayerBfk.add(Arda);
        teamsplayerBfk.add(Yağız);
        teamsplayerBfk.add(Onurcan);
        teamsplayerBfk.add(Souza);
        teamsplayerBfk.add(Emirhan);
        teamsplayerBfk.add(Mahmut);
        teamsplayerBfk.add(Olivier);

        allplayers.add(Mami);
        allplayers.add(Deniz);
        allplayers.add(Volkan);
        allplayers.add(Leon);
        allplayers.add(Yusuf);
        allplayers.add(Jerome);
        allplayers.add(Hamza);
        allplayers.add(Arda);
        allplayers.add(Yağız);
        allplayers.add(Onurcan);
        allplayers.add(Souza);
        allplayers.add(Emirhan);
        allplayers.add(Mahmut);
        allplayers.add(Olivier);

        //ÇRS
        Player Göko = new Player("Göko", 85, "Keeper", 801180, 0, 0);
        Player Tarık = new Player("Tarık", 86, "Def", 11629546, 3, 0);
        Player Canberk = new Player("Canberk", 87, "Mid", 7003814, 2, 0);
        Player Emir = new Player("Emir", 88, "For", 8544303, 5, 0);
        Player Atilla = new Player("Atilla", 89, "Mid", 12795864, 2, 0);
        Player Eray = new Player("Eray", 90, "Def", 3952244, 1, 0);
        Player Tahacan = new Player("Tahacan", 91, "Mid", 855491, 4, 1);
        Player İbrahim = new Player("İbrahim", 92, "Mid", 14124879, 5, 1);
        Player Dal = new Player("Dal", 93, "For", 2108664, 5, 1);
        Player Altin = new Player("Altin", 94, "Def", 685884, 3, 0);
        Player Güvenç = new Player("Güvenç", 95, "Def", 8215130, 6, 1);
        Player David = new Player("David", 96, "Mid", 8497300, 2, 0);
        Player Ahmet = new Player("Ahmet", 97, "For", 9670381, 6, 1);
        Player Ertem = new Player("Ertem", 98, "For", 3635086, 9, 0);
        teamsplayerÇrs.add(Göko);
        teamsplayerÇrs.add(Tarık);
        teamsplayerÇrs.add(Canberk);
        teamsplayerÇrs.add(Emir);
        teamsplayerÇrs.add(Atilla);
        teamsplayerÇrs.add(Eray);
        teamsplayerÇrs.add(Tahacan);
        teamsplayerÇrs.add(İbrahim);
        teamsplayerÇrs.add(Dal);
        teamsplayerÇrs.add(Altin);
        teamsplayerÇrs.add(Güvenç);
        teamsplayerÇrs.add(David);
        teamsplayerÇrs.add(Ahmet);
        teamsplayerÇrs.add(Ertem);

        allplayers.add(Göko);
        allplayers.add(Tarık);
        allplayers.add(Canberk);
        allplayers.add(Emir);
        allplayers.add(Atilla);
        allplayers.add(Eray);
        allplayers.add(Tahacan);
        allplayers.add(İbrahim);
        allplayers.add(Dal);
        allplayers.add(Altin);
        allplayers.add(Güvenç);
        allplayers.add(David);
        allplayers.add(Ahmet);
        allplayers.add(Ertem);

        //Free Players
        Player Melo = new Player("Melo", 99, "Mid", 10567382, 12, 1);
        Player Nwakaeme = new Player("Nwakaeme", 100, "For", 14376923, 14, 1);
        Player Hagi = new Player("Hagi", 101, "For", 14987567, 16, 0);
        Player Hami = new Player("Hami", 102, "For", 14230567, 15, 0);
        Player Nazario = new Player("Nazario", 103, "For", 21768982, 27, 1);
        teamPlayerFree.add(Melo);
        teamPlayerFree.add(Nwakaeme);
        teamPlayerFree.add(Hagi);
        teamPlayerFree.add(Hami);
        teamPlayerFree.add(Nazario);

    }

}
 