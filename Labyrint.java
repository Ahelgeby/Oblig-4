import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Labyrint {
    Rute[][] ruter;
    int antRader;
    int antKolonner;
    Scanner les;
    Scanner sc;
    File innfil;
    

    public Labyrint(File fil){
        antRader = 0;
        antKolonner = 0;
        innfil = fil;
        lagLabyrint();
        kobleRuter();
        }
    //Tar inn dimensjonene på labyrinten og oppretter en matrise
    //Leser filen linje for linje, og char for char for å opprette riktig ruteobjekt på hver index i matrisen

    public void lagLabyrint(){
        int i = 0;
        try{
            sc = new Scanner(innfil);
                antRader = sc.nextInt();
                antKolonner = sc.nextInt();
                ruter = new Rute[antRader][antKolonner];
                sc.nextLine();
                while (sc.hasNextLine()){
                    String line = sc.nextLine();
                    for(int j = 0; j <antKolonner; j++){            
                        //Går igjennom hver char på linjen og sjekker hva slags rute som skal lages på bakgrunn av charen
                        if(line.charAt(j) == '#'){                  
                            ruter[i][j] = new SvartRute(i,j,this);

                        }else if(line.charAt(j) == '.'){                                        //sjekker om den aktuelle, hvite ruten er på siden til en av brettene, og oppretter
                            if(i == 0 || i == antRader-1 || j == 0 || j == antKolonner -1){     //en instans av klassen Aapning om dette er tilfelle
                                ruter[i][j] = new Aapning(i, j, this);
                            }else{
                            ruter[i][j] = new HvitRute(i,j,this);                               //Alle indre hvite ruter blir vanlige hvite ruter
                            }
                        }
                    }
                    i++;
                        
                }
                }catch(FileNotFoundException e){
                    System.out.println("fant ikke filen");
                }finally{
                    sc.close();
                }
    }
    //Går igjennom matrisen og kaller på hver rutes "settnaboer()" metode, og kobler rutene sammen
    public void kobleRuter(){
        for (int x = 0; x<antRader; x++){
            for (int y = 0; y<antKolonner; y++){
                ruter[x][y].settNaboer();
            }
        }
    }
    

    public void finnUtveifra(int rad, int kolonne){
        if(ruter[rad][kolonne].hentFarge() == "hvit"){
        ruter[rad][kolonne].finn(null);
        }else{
            System.out.println("Kan ikke starte paa sort rute");
        }
    }
    public void tegnLab(){

        for(int i = 0; i<antRader;i++){
            for(int j= 0; j<antKolonner;j++){
                System.out.print(ruter[i][j].hentTegn() + "  ");
            }
            System.out.println();
        }
    }

    public void tegnTraversering(){
        for(int i = 0; i<antRader; i++){
            for(int j = 0; j<antKolonner; j++){
                if(ruter[i][j].hentFarge() == "hvit"){
                    String ruteNr = Integer.toString(ruter[i][j].hentRuteNr());
                    if (ruteNr.length() == 1) {
                        System.out.print(ruteNr + "  ");
                    }
                    else if (ruteNr.length() > 1) {
                        System.out.print(ruteNr + " ");
                    }
                    //System.out.print(ruter[i][j].hentRuteNr() + " ");
                }else{
                    System.out.print(ruter[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        String returStreng = "";
        for (int i = 0; i<antRader; i++) {
            for (int j = 0; j<antKolonner; j++) {
                returStreng = returStreng + (ruter[i][j].hentTegn() + "  ");
            }
            returStreng = returStreng + "\n";
        }

        return returStreng;
    }

}


