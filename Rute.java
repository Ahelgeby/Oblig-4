
abstract class Rute {
    static int teller = 1;
    int radnummer;
    int kolonnenummer;
    Labyrint lab;
    Labyrint2 lab2;
    Rute[] naboer;
    int antnaboer = 0;
    Boolean aapning = false;
    String tegn;
    String farge;
    int rutenr;

    public Rute(int rad, int kolonne, Labyrint l){
        radnummer = rad;
        kolonnenummer = kolonne;
        lab = l;
        naboer = new Rute[4];
        naboer[0] = null;   //Nord
        naboer[1] = null;   //Vest
        naboer[2] = null;   //Øst
        naboer[3] = null;   //Syd
    }

    public Rute(int rad, int kolonne, Labyrint2 l){
        radnummer = rad;
        kolonnenummer = kolonne;
        lab2 = l;
        naboer = new Rute[4];
        naboer[0] = null;   //Nord
        naboer[1] = null;   //Vest
        naboer[2] = null;   //Øst
        naboer[3] = null;   //Syd
    }

    public String hentFarge(){
        return this.farge;
    }
    
    public String hentTegn(){
        return this.tegn;
    }

    public int hentAntNaboer(){
        return this.antnaboer;
    }

    public boolean erAapning(){
        return this.aapning;
    }
    public Rute hentRute(int i, int j){
        try{
            if (lab == null) {
                return lab2.ruter[i][j];
            } else if (lab2 == null) {
                return lab.ruter[i][j];
            } else {return null;}

        }catch(IndexOutOfBoundsException e){
            return null;
        }
    }
    public int hentRuteNr(){
        return rutenr;
    }
    //Setter alle naboreferanser henholdsvis til ruten nord,vest,øst,eller syd for aktuell rute
    public void settNaboer(){
        if(hentRute(radnummer -1, kolonnenummer) != null){
            naboer[0] = hentRute(radnummer -1, kolonnenummer);
            antnaboer ++;
        }
        if(hentRute(radnummer, kolonnenummer -1) != null){
            naboer[1] = hentRute(radnummer, kolonnenummer -1);
            antnaboer ++;
        }
        if(hentRute(radnummer, kolonnenummer +1) != null){
            naboer[2] = hentRute(radnummer, kolonnenummer +1);
            antnaboer ++;
        }
        if(hentRute(radnummer +1, kolonnenummer) != null){
            naboer[3] = hentRute(radnummer +1, kolonnenummer);
            antnaboer ++;
        }
    }

    //går igjennom alle rutene i listen over naboer, så lenge ruten ikke er null, og ruten metoden ble kalt fra kaller den på "finn()" på naboruten
    public void finn(Rute fra){
        for(Rute rute : naboer){
            if(rute != null && rute != fra){
                fra = rute;
                rute.finn(this);
            }
            }
        }
    

    public String toString(){
        return "Radnummer: " + radnummer + " Kolonnenummer: " + kolonnenummer;
    }

}
