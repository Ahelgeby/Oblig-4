import java.util.ArrayList;
public class HvitRute extends Rute{
    String farge;

    public HvitRute(int rad, int kolonne, Labyrint l){
        super(rad,kolonne,l);
        farge = "hvit";
        tegn = ".";
        rutenr = 0;
        t = new Tuppel(radnummer, kolonnenummer);
        sti = new ArrayList<Tuppel>();
    }

    // public HvitRute(int rad, int kolonne, Labyrint2 l){
    //     super(rad,kolonne,l);
    //     farge = "hvit";
    //     tegn = ".";
    //     rutenr = 0;
    // }
    
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
    @Override
    public ArrayList<Tuppel> hentSti(){
        return sti;
    }
    
    //Sjekker alle naborutene og kaller på deres finn() metode så lenge referansen ikke er null, eller den forrige ruten
    @Override
    public void finn(Rute fra, ArrayList<Tuppel> sti){  //Første metodekall får inn fra = null og en tom sti
        sti.add(t);                                     //Legger til denne rutens tuppel i stien
        // ArrayList<Tuppel> nysti = new ArrayList<>(sti); Denne kan ikke stå her fordi den legger til tuppelet til venstre i "nysti" på metodekall vest, og bruker "nysti"
        // som inneholder tuppelet til vest når finn.øst blir kalt med nysti 
        rutenr = teller;
        teller++;
        for(Rute rute : naboer){
            if(rute != null && rute != fra){
                ArrayList<Tuppel> nysti = new ArrayList<>(sti); //Oppretter ny sti som kopi av den gamle, inneholder kun tuppelet til første rute på første metodekall
                rute.finn(this, nysti);          

                
            }
        }
    }
    @Override
    public String toString(){
        return super.toString();
    }

}


