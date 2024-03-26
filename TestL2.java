import java.util.Scanner;


public class TestL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInp = "";
        Labyrint2 lab = null;
        
        System.out.println("Velkommen til labyrintløseren");

        while (!userInp.equals("-1")) {

            System.out.println("'1' for å laste inn ny labyrint\n'2' for å printe labyrint\n'3' for å vise åpninger\n'4' for å vise traversering\n'-1' for å avslutte");
            userInp = sc.nextLine();
            switch (userInp) {
                case "1":
                    lab = lesFraFil(sc);
                    break;
                case "2":
                    try {   
                        lab.tegnLab();
                    } catch (NullPointerException e) {
                        System.err.println("Labyrinten er ikke lastet inn, forsøk å lese ny labyrint fra fil først");
                    }
                    break;
                case "3":
                    lab.finnUtveifra(1, 1);
                    break;
                case "4":
                    lab.tegnTraversering();
                    break;
            }
        }

        sc.close();
    }

    public static Labyrint2 lesFraFil(Scanner scanner) {
        System.out.println("Oppgi filbane eller skriv '-1' for å gå tilbake");
        String inp = scanner.nextLine();
        while (!inp.equals("-1")) {

            Labyrint2 nyLab = new Labyrint2(inp);
            if (nyLab.antRader > 0) {
                System.out.println("Lastet inn labyrint fra " + inp);
                return nyLab;
            } else {
                inp = scanner.nextLine();
            }
        }
        return null;
    }
    
}
