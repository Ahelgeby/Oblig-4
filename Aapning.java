public class Aapning extends HvitRute {
    Boolean aapning = true;

    public Aapning(int rad, int kolonne, Labyrint l){
        super(rad,kolonne,l);
    }

    public Aapning(int rad, int kolonne, Labyrint2 l){
        super(rad,kolonne,l);
    }

    @Override
    public boolean erAapning(){
        return aapning;
    }
    @Override
    //Skriver ut denne rutens kordinater, og at dette er en åpningsrute og stopper rekursjonen
    public void finn(Rute fra){
        rutenr = teller;
        teller++;
        System.out.println(this);
        return;
        }
    
    
    @Override
    public String toString(){
        return "Solve: " + "Radnr: " + radnummer + "KolonneNr: " + kolonnenummer;
    }



}
