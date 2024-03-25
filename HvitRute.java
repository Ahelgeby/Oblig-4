
public class HvitRute extends Rute{
    String farge;

    public HvitRute(int rad, int kolonne, Labyrint l){
        super(rad,kolonne,l);
        farge = "hvit";
        tegn = ".";
        rutenr = 0;
    }

    public HvitRute(int rad, int kolonne, Labyrint2 l){
        super(rad,kolonne,l);
        farge = "hvit";
        tegn = ".";
        rutenr = 0;
    }
    
    @Override
    public String hentFarge(){
        return this.farge;
    }
    @Override
    public String hentTegn(){
        return this.tegn;
    }

    public int hentRuteNr(){
        return rutenr;
    }
    
    //Sjekker alle naborutene og kaller på deres finn() metode så lenge referansen ikke er null, eller den forrige ruten
    @Override
    public void finn(Rute fra){
        rutenr = teller;
        teller++;
        for(Rute rute : naboer){
            if(rute != null && rute != fra){
                rute.finn(this);
                
            }
        }
    }
    @Override
    public String toString(){
        return super.toString();
    }

}


