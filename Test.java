import java.util.Scanner;
import java.io.File;

public class Test {
    /*public static void main (String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        do {
            
            input = sc.nextLine();

        }
        while (!input.equals("-1"));
        sc.close();

        Labyrint2 lab = new Labyrint2("2.in");
        System.out.println(lab);
    }


}*/

    
    protected static File fil;
    protected static Labyrint lab;
    static Scanner in;
    public static void main(String[] args) {
        System.out.println("Skriv inn filnavnet paa labyrinten du vil se paa");
        Scanner in = new Scanner(System.in);
        velgBrett(in.nextLine(), in);
        System.out.println("Tast 1 for aa spille, tast -1 for aa avslutte, tast 2 for aa velge nytt brett");
        
        velg(in);
}
    private static void velgBrett(String arg, Scanner in ){
        String filnavn = arg;
        fil = new File(filnavn);
        Labyrint lab = new Labyrint(fil);
        System.out.println("Slik ser brettet ut");
        lab.tegnLab();
    }

    private static void spill(Scanner in){
        int les = 0;
        while (les != -1){
        System.out.println("Velgstartspunktkordinater <rad> <kolonne>");
        //Scanner in = new Scanner(System.in);
        int rad = in.nextInt();
        int kolonne = in.nextInt();
        lab = new Labyrint(fil);
        lab.finnUtveifra(rad, kolonne);
        System.out.println("Tast 1 for aa spille, tast -1 for aa avslutte, eller 2 for aa bytte brett");
        velg(in);
    }
    System.out.println("Spillet avslutter");

    }

    private static void velg(Scanner in){
        //Scanner in = new Scanner(System.in);
        int les = in.nextInt();
        while(les != -1){
        if(les == 1){
            spill(in);
        } else if (les == 2){
            System.out.println("Skriv inn filnavnet paa labyrinten du vil se paa: ");
            velgBrett(in.nextLine(), in);
            velg(in);
        }
        
    }
        System.out.println("spillet avslutter");
        in.close();
        return;
    }
}
