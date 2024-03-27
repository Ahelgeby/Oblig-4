import java.util.ArrayList;
public class Aapning extends HvitRute {
    Boolean aapning = true;

    public Aapning(int rad, int kolonne, Labyrint l){
        super(rad,kolonne,l);
        t = new Tuppel(radnummer, kolonnenummer);
        sti = new ArrayList<Tuppel>();
    }

    // public Aapning(int rad, int kolonne, Labyrint2 l){
    //     super(rad,kolonne,l);
    // }

    @Override
    public boolean erAapning(){
        return aapning;
    }
    @Override
    //Skriver ut denne rutens kordinater, og at dette er en åpningsrute og stopper rekursjonen
    public void finn(Rute fra, ArrayList<Tuppel> sti){
        sti.add(t);
        ArrayList<Tuppel> nysti = new ArrayList<>(sti);
        rutenr = teller;
        teller++;
        System.out.println(this);
        lab.loesninger.add(nysti);
        return;
        }
    
    
    @Override
    public String toString(){
        return "Solve: " + "Radnr: " + radnummer + "KolonneNr: " + kolonnenummer;
    }



}
