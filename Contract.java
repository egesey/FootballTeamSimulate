package FirstComp1112Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Contract {

    Player x = new Player();
    ArrayList<Contract> contractGs = new ArrayList<>();
    ArrayList<Contract> contractFb = new ArrayList<>();
    ArrayList<Contract> contractTs = new ArrayList<>();
    ArrayList<Contract> contractBjk = new ArrayList<>();
    ArrayList<Contract> contractKsp = new ArrayList<>();
    ArrayList<Contract> contractBfk = new ArrayList<>();
    ArrayList<Contract> contractÇrs = new ArrayList<>();

    private String player;
    private String teamContract;
    private String type;
    private long value;

    public Contract(String player, String type, long value) {
        this.player = player;
        this.type = type;
        this.value = value;

    }

    public String getPlayer() {
        return player;
    }

    public String getTeam() {
        return teamContract;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public void setTeam(String teamContract) {
        this.teamContract = teamContract;
    }

    public void setType(String type) {
        if (!type.equals("Permanent") && !type.equals("Rented")) {
            System.out.println("Wrong contract type...");
        } else if (type.equals("Permanent")) {
            this.type = type;
        } else if (type.equals("Rented")) {
            this.type = type;
        } else {
            System.out.println("Wrong contract type...");
        }

    }

    public int contratDelete(ArrayList<Contract> contratTeams, ArrayList<Player> teamSelected, ArrayList<Player> contratFree) {
        Scanner scn = new Scanner(System.in);
        int y = scn.nextInt();
        for (int i = 0; i <= teamSelected.size(); i++) {
            if (y == teamSelected.get(i).getBackNumber()) {
                contratTeams.remove(i);
                contratFree.add(teamSelected.get(i));
                teamSelected.remove(i);
return i;
            } 

        }
        return 0;
    }

    public String toString() {

        return player + "    \t" + type + "   \tMarketVal: " + value + "\n";
    }

    public Contract() {
        //GS
        Contract MusleraC = new Contract("Muslera", "Permanent", x.teamsplayerGs.get(0).getMarketValue());
        Contract KaanC = new Contract("Kaan", "Rented", x.teamsplayerGs.get(1).getMarketValue());
        Contract ToreiraC = new Contract("Toreira", "Permanent", x.teamsplayerGs.get(2).getMarketValue());
        Contract IcardiC = new Contract("Icardi", "Permanent", x.teamsplayerGs.get(3).getMarketValue());
        Contract KeremC = new Contract("Kerem", "Permanent", x.teamsplayerGs.get(4).getMarketValue());
        Contract AbdüşC = new Contract("Abdüş", "Rented", x.teamsplayerGs.get(5).getMarketValue());
        Contract OlivC = new Contract("Oliv", "Rented", x.teamsplayerGs.get(6).getMarketValue());
        Contract MertensC = new Contract("Mertens", "Permanent", x.teamsplayerGs.get(7).getMarketValue());
        Contract BakambuC = new Contract("Bakambu", "Permanent", x.teamsplayerGs.get(8).getMarketValue());
        Contract NellsonC = new Contract("Nellson", "Permanent", x.teamsplayerGs.get(9).getMarketValue());
        Contract BoeyC = new Contract("Boey", "Rented", x.teamsplayerGs.get(10).getMarketValue());
        Contract EyüpC = new Contract("Eyüp", "Permanent", x.teamsplayerGs.get(11).getMarketValue());
        Contract BerkanC = new Contract("Berkan", "Permanent", x.teamsplayerGs.get(12).getMarketValue());
        Contract TeteC = new Contract("Tete", "Permanent", x.teamsplayerGs.get(13).getMarketValue());
        contractGs.add(MusleraC);
        contractGs.add(KaanC);
        contractGs.add(ToreiraC);
        contractGs.add(IcardiC);
        contractGs.add(KeremC);
        contractGs.add(AbdüşC);
        contractGs.add(OlivC);
        contractGs.add(MertensC);
        contractGs.add(BakambuC);
        contractGs.add(NellsonC);
        contractGs.add(BoeyC);
        contractGs.add(EyüpC);
        contractGs.add(BerkanC);
        contractGs.add(TeteC);

        //FB
        Contract livaC = new Contract("liva", "Rented", x.teamsplayerFb.get(0).getMarketValue());
        Contract ÇağlarC = new Contract("Çağlar", "Permanent", x.teamsplayerFb.get(1).getMarketValue());
        Contract DjikuC = new Contract("Djiku", "Permanent", x.teamsplayerFb.get(2).getMarketValue());
        Contract RodrigoC = new Contract("Rodrigo", "Permanent", x.teamsplayerFb.get(3).getMarketValue());
        Contract PeresC = new Contract("Peres", "Permanent", x.teamsplayerFb.get(4).getMarketValue());
        Contract LeoC = new Contract("Leo", "Rented", x.teamsplayerFb.get(5).getMarketValue());
        Contract SerdarC = new Contract("Serdar", "Permanent", x.teamsplayerFb.get(6).getMarketValue());
        Contract FerdiC = new Contract("Ferdi", "Permanent", x.teamsplayerFb.get(7).getMarketValue());
        Contract MertC = new Contract("Mert", "Rented", x.teamsplayerFb.get(8).getMarketValue());
        Contract KentC = new Contract("Kent", "Permanent", x.teamsplayerFb.get(9).getMarketValue());
        Contract EgemenC = new Contract("Egemen", "Permanent", x.teamsplayerFb.get(10).getMarketValue());
        Contract ErdemC = new Contract("Erdem", "Permanent", x.teamsplayerFb.get(11).getMarketValue());
        Contract BerkayC = new Contract("Berkay", "Rented", x.teamsplayerFb.get(12).getMarketValue());
        Contract KenanC = new Contract("Kenan", "Permanent", x.teamsplayerFb.get(13).getMarketValue());
        contractFb.add(livaC);
        contractFb.add(ÇağlarC);
        contractFb.add(DjikuC);
        contractFb.add(RodrigoC);
        contractFb.add(PeresC);
        contractFb.add(LeoC);
        contractFb.add(SerdarC);
        contractFb.add(FerdiC);
        contractFb.add(MertC);
        contractFb.add(KentC);
        contractFb.add(EgemenC);
        contractFb.add(ErdemC);
        contractFb.add(BerkayC);
        contractFb.add(KenanC);

        //TS
        Contract UğurcanC = new Contract("Uğurcan", "Rented", x.teamsplayerFb.get(0).getMarketValue());
        Contract EgeC = new Contract("Ege", "Permanent", x.teamsplayerFb.get(1).getMarketValue());
        Contract TahaC = new Contract("Taha", "Permanent", x.teamsplayerFb.get(2).getMarketValue());
        Contract ErenC = new Contract("Eren", "Permanent", x.teamsplayerFb.get(3).getMarketValue());
        Contract ArifcanC = new Contract("Arifcan", "Rented", x.teamsplayerFb.get(4).getMarketValue());
        Contract FarukC = new Contract("Faruk", "Rented", x.teamsplayerFb.get(5).getMarketValue());
        Contract MislavC = new Contract("Mislav", "Permanent", x.teamsplayerFb.get(6).getMarketValue());
        Contract EdinC = new Contract("Edin", "Permanent", x.teamsplayerFb.get(7).getMarketValue());
        Contract EnisC = new Contract("Enis", "Rented", x.teamsplayerFb.get(8).getMarketValue());
        Contract UmutcanC = new Contract("Umutcan", "Permanent", x.teamsplayerFb.get(9).getMarketValue());
        Contract BeratC = new Contract("Berat", "Permanent", x.teamsplayerFb.get(10).getMarketValue());
        Contract GöktanC = new Contract("Göktan", "Permanent", x.teamsplayerFb.get(11).getMarketValue());
        Contract MehmetC = new Contract("Mehmet", "Rented", x.teamsplayerFb.get(12).getMarketValue());
        Contract ÖmerC = new Contract("Ömer", "Permanent", x.teamsplayerFb.get(13).getMarketValue());
        contractTs.add(UğurcanC);
        contractTs.add(EgeC);
        contractTs.add(TahaC);
        contractTs.add(ErenC);
        contractTs.add(ArifcanC);
        contractTs.add(FarukC);
        contractTs.add(MislavC);
        contractTs.add(EdinC);
        contractTs.add(EnisC);
        contractTs.add(UmutcanC);
        contractTs.add(BeratC);
        contractTs.add(GöktanC);
        contractTs.add(MehmetC);
        contractTs.add(ÖmerC);

        //BJK 
        Contract SergenC = new Contract("Sergen", "Permanent", x.teamsplayerFb.get(0).getMarketValue());
        Contract UtkuC = new Contract("Utku", "Permanent", x.teamsplayerFb.get(1).getMarketValue());
        Contract OmarC = new Contract("Omar", "Permanent", x.teamsplayerFb.get(2).getMarketValue());
        Contract TayyipC = new Contract("Tayyip", "Permanent", x.teamsplayerFb.get(3).getMarketValue());
        Contract EmrecanC = new Contract("Emrecan", "Rented", x.teamsplayerFb.get(4).getMarketValue());
        Contract NecipC = new Contract("Necip", "Rented", x.teamsplayerFb.get(5).getMarketValue());
        Contract AytuğC = new Contract("Aytuğ", "Permanent", x.teamsplayerFb.get(6).getMarketValue());
        Contract UmutC = new Contract("Umut", "Permanent", x.teamsplayerFb.get(7).getMarketValue());
        Contract OnurC = new Contract("Onur", "Rented", x.teamsplayerFb.get(8).getMarketValue());
        Contract MilotC = new Contract("Milot", "Permanent", x.teamsplayerFb.get(9).getMarketValue());
        Contract ArifC = new Contract("Arif", "Permanent", x.teamsplayerFb.get(10).getMarketValue());
        Contract EfeC = new Contract("Efe", "Permanent", x.teamsplayerFb.get(11).getMarketValue());
        Contract AliC = new Contract("Ali", "Rented", x.teamsplayerFb.get(12).getMarketValue());
        Contract TuncayC = new Contract("Tuncay", "Rented", x.teamsplayerFb.get(13).getMarketValue());
        contractBjk.add(SergenC);
        contractBjk.add(UtkuC);
        contractBjk.add(OmarC);
        contractBjk.add(TayyipC);
        contractBjk.add(EmrecanC);
        contractBjk.add(NecipC);
        contractBjk.add(AytuğC);
        contractBjk.add(UmutC);
        contractBjk.add(OnurC);
        contractBjk.add(MilotC);
        contractBjk.add(ArifC);
        contractBjk.add(EfeC);
        contractBjk.add(AliC);
        contractBjk.add(TuncayC);

        //KSP
        Contract AndreasC = new Contract("Andreas", "Rented", x.teamsplayerKsp.get(0).getMarketValue());
        Contract EmreC = new Contract("Emre", "Permanent", x.teamsplayerKsp.get(1).getMarketValue());
        Contract MelihC = new Contract("Melih", "Permanent", x.teamsplayerKsp.get(2).getMarketValue());
        Contract YasinC = new Contract("Yasin", "Rented", x.teamsplayerKsp.get(3).getMarketValue());
        Contract SadıkC = new Contract("Sadık", "Rented", x.teamsplayerKsp.get(4).getMarketValue());
        Contract TaylanC = new Contract("Taylan", "Rented", x.teamsplayerKsp.get(5).getMarketValue());
        Contract AdnanC = new Contract("Adnan", "Permanent", x.teamsplayerKsp.get(6).getMarketValue());
        Contract GökhanC = new Contract("Gökhan", "Rented", x.teamsplayerKsp.get(7).getMarketValue());
        Contract LoretC = new Contract("Loret", "Permanent", x.teamsplayerKsp.get(8).getMarketValue());
        Contract SamuelC = new Contract("Samuel", "Rented", x.teamsplayerKsp.get(9).getMarketValue());
        Contract AytaçC = new Contract("Aytaç", "Permanent", x.teamsplayerKsp.get(10).getMarketValue());
        Contract SelimC = new Contract("Selim", "Permanent", x.teamsplayerKsp.get(11).getMarketValue());
        Contract KanuniC = new Contract("Kanuni", "Permanent", x.teamsplayerKsp.get(12).getMarketValue());
        Contract RochinC = new Contract("Rochin", "Permanent", x.teamsplayerKsp.get(13).getMarketValue());
        contractKsp.add(AndreasC);
        contractKsp.add(EmreC);
        contractKsp.add(MelihC);
        contractKsp.add(YasinC);
        contractKsp.add(SadıkC);
        contractKsp.add(TaylanC);
        contractKsp.add(AdnanC);
        contractKsp.add(GökhanC);
        contractKsp.add(LoretC);
        contractKsp.add(SamuelC);
        contractKsp.add(AytaçC);
        contractKsp.add(SelimC);
        contractKsp.add(KanuniC);
        contractKsp.add(RochinC);

        //BFK
        Contract MamiC = new Contract("Mami", "Permanent", x.teamsplayerBfk.get(0).getMarketValue());
        Contract DenizC = new Contract("Deniz", "Rented", x.teamsplayerBfk.get(1).getMarketValue());
        Contract VolkanC = new Contract("Volkan", "Permanent", x.teamsplayerBfk.get(2).getMarketValue());
        Contract LeonC = new Contract("Leon", "Rented", x.teamsplayerBfk.get(3).getMarketValue());
        Contract YusufC = new Contract("Yusuf", "Permanent", x.teamsplayerBfk.get(4).getMarketValue());
        Contract JeromeC = new Contract("Jerome", "Rented", x.teamsplayerBfk.get(5).getMarketValue());
        Contract HamzaC = new Contract("Hamza", "Permanent", x.teamsplayerBfk.get(6).getMarketValue());
        Contract ArdaC = new Contract("Arda", "Permanent", x.teamsplayerBfk.get(7).getMarketValue());
        Contract YağızC = new Contract("Yağız", "Permanent", x.teamsplayerBfk.get(8).getMarketValue());
        Contract OnurcanC = new Contract("Onurcan", "Permanent", x.teamsplayerBfk.get(9).getMarketValue());
        Contract SouzaC = new Contract("Souza", "Permanent", x.teamsplayerBfk.get(10).getMarketValue());
        Contract EmirhanC = new Contract("Emirhan", "Rented", x.teamsplayerBfk.get(11).getMarketValue());
        Contract MahmutC = new Contract("Mahmut", "Rented", x.teamsplayerBfk.get(12).getMarketValue());
        Contract OlivierC = new Contract("Olivier", "Rented", x.teamsplayerBfk.get(13).getMarketValue());
        contractBfk.add(MamiC);
        contractBfk.add(DenizC);
        contractBfk.add(VolkanC);
        contractBfk.add(LeonC);
        contractBfk.add(YusufC);
        contractBfk.add(JeromeC);
        contractBfk.add(HamzaC);
        contractBfk.add(ArdaC);
        contractBfk.add(YağızC);
        contractBfk.add(OnurcanC);
        contractBfk.add(SouzaC);
        contractBfk.add(EmirhanC);
        contractBfk.add(MahmutC);
        contractBfk.add(OlivierC);

        //ÇRS
        Contract GökoC = new Contract("Göko", "Rented", x.teamsplayerÇrs.get(0).getMarketValue());
        Contract TarıkC = new Contract("Tarık", "Rented", x.teamsplayerÇrs.get(1).getMarketValue());
        Contract CanberkC = new Contract("Canberk", "Permanent", x.teamsplayerÇrs.get(2).getMarketValue());
        Contract EmirC = new Contract("Emir", "Permanent", x.teamsplayerÇrs.get(3).getMarketValue());
        Contract AtillaC = new Contract("Atilla", "Rented", x.teamsplayerÇrs.get(4).getMarketValue());
        Contract ErayC = new Contract("Eray", "Rented", x.teamsplayerÇrs.get(5).getMarketValue());
        Contract TahacanC = new Contract("Tahacan", "Permanent", x.teamsplayerÇrs.get(6).getMarketValue());
        Contract İbrahimC = new Contract("İbrahim", "Permanent", x.teamsplayerÇrs.get(7).getMarketValue());
        Contract DalC = new Contract("Dal", "Rented", x.teamsplayerÇrs.get(8).getMarketValue());
        Contract AltinC = new Contract("Altin", "Permanent", x.teamsplayerÇrs.get(9).getMarketValue());
        Contract GüvençC = new Contract("Güvenç", "Permanent", x.teamsplayerÇrs.get(10).getMarketValue());
        Contract DavidC = new Contract("David", "Permanent", x.teamsplayerÇrs.get(11).getMarketValue());
        Contract AhmetC = new Contract("Ahmet", "Rented", x.teamsplayerÇrs.get(12).getMarketValue());
        Contract ErtemC = new Contract("Ertem", "Permanent", x.teamsplayerÇrs.get(13).getMarketValue());
        contractÇrs.add(GökoC);
        contractÇrs.add(TarıkC);
        contractÇrs.add(CanberkC);
        contractÇrs.add(EmirC);
        contractÇrs.add(AtillaC);
        contractÇrs.add(ErayC);
        contractÇrs.add(TahacanC);
        contractÇrs.add(İbrahimC);
        contractÇrs.add(DalC);
        contractÇrs.add(AltinC);
        contractÇrs.add(GüvençC);
        contractÇrs.add(DavidC);
        contractÇrs.add(AhmetC);
        contractÇrs.add(ErtemC);

    }

}
