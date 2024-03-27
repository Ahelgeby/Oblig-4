import java.util.ArrayList;
public class SvartRute extends Rute{
    String farge;

    public SvartRute(int rad, int kolonne, Labyrint l){
        super(rad,kolonne,l);
        farge = "Sort";
        tegn = "#";
        t = new Tuppel(radnummer, kolonnenummer);
        sti = new ArrayList<Tuppel>();
        sti.add(t);
    }

    // public SvartRute(int rad, int kolonne, Labyrint2 l){
    //     super(rad,kolonne,l);
    //     farge = "Sort";
    //     tegn = "#";
    // }

    @Override
    public String hentFarge(){
        return this.farge;
    }
    @Override
    public String hentTegn(){
        return this.tegn;
    }
    //Stopper å lete etter neste rute fordi denne er svart
    @Override
    public void finn(Rute fra, ArrayList<Tuppel> sti){
        return;
    }
    @Override
    public int hentRuteNr(){
        return rutenr;
    }

    @Override
    public String toString(){
        return hentTegn();
    }
}
