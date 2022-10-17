// Nu hämtar jag java util för att kunna använda scanner
import java.util.*;
public class Hej2 {
    public static void main (String[] arg) {
        String förnamn;
        String efternamn;
        String hälsning;
        System.out.print("Förnamn? ");
        Scanner input = new Scanner(System.in);
        förnamn = input.nextLine();
        System.out.print("Efternamn? ");
        efternamn = input.nextLine();
        System.out.print("vad heter du? ");
        Scanner scan = new Scanner(System.in);
        hälsning = "välkommen" + förnamn+ " " +efternamn;
        System.out.println(hälsning);

    }
}
