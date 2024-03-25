import java.util.Scanner;
import java.io.File;
public class Test {
    protected static File fil;
    protected static Labyrint lab;
    static Scanner in;
    public static void main(String[] args) {
        System.out.println("Skriv inn filnavnet paa labyrinten du vil se paa");
        Scanner in = new Scanner(System.in);
        velgBrett(in.nextLine());
        System.out.println("Tast 1 for aa spille, tast -1 for aa avslutte, tast 2 for aa velge nytt brett");
        in.close();
        velg();
}
    private static void velgBrett(String arg){
        String filnavn = arg;
        fil = new File(filnavn);
        Labyrint lab = new Labyrint(fil);
        System.out.println("Slik ser brettet ut");
        lab.tegnLab();
    }

    private static void spill(){
        int les = 0;
        while (les != -1){
        System.out.println("Velgstartspunktkordinater <rad> <kolonne>");
        Scanner innn = new Scanner(System.in);
        int rad = innn.nextInt();
        int kolonne = innn.nextInt();
        innn.close();
        lab = new Labyrint(fil);
        lab.finnUtveifra(rad, kolonne);
        System.out.println("Tast 1 for aa spille, tast -1 for aa avslutte, eller 2 for aa bytte brett");
        velg();
    }
    System.out.println("Spillet avslutter");

    }

    private static void velg(){
        Scanner inn = new Scanner(System.in);
        int les = inn.nextInt();
        while(les != -1){
        if(les == 1){
            spill();
        } else if (les == 2){
            System.out.println("Skriv inn filnavnet paa labyrinten du vil se paa: ");
            velgBrett(in.nextLine());
            velg();
        }
        inn.close();
    }
        System.out.println("spillet avslutter");
        inn.close();
        return;
    }
}
