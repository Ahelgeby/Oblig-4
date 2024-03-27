// import java.util.Scanner;
// import java.io.File;
// public class Innlevering3 {
//     File filnavn;
//     public static void main(String[] args) {
//         if(args.length != 1){
//             System.out.println("du må sende med filnavn som parameter");
//             return;
//         }
//         String filnavn = args[0];
//         File fil = new File(filnavn);
//         System.out.println("slik ser labyrinten ut: ");
//         Labyrint lab = new Labyrint(fil);
//         lab.tegnLab();
//         Scanner in = new Scanner(System.in);
//         System.out.println("Tast 1 for aa spille, tast -1 for aa avslutte");
//         int les = in.nextInt();

//         while (les != -1){
//         System.out.println("Velgstartspunktkordinater <rad> <kolonne>");
//         int rad = in.nextInt();
//         int kolonne = in.nextInt();
//         lab.finnUtveifra(rad, kolonne);
//         lab.tegnTraversering();
//         System.out.println("Tast 1 for aa spille, tast -1 for aa avslutte");
//         les = in.nextInt();
//     }
//     System.out.println("Spillet avslutter");

//     in.close();
// }
    
// }
