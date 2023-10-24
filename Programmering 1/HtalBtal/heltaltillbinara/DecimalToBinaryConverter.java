package heltaltillbinara;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Läs in ett heltal från användaren
        System.out.print("Ange ett heltal: ");
        int decimal = scanner.nextInt();

        // Skapa en sträng för att lagra den binära representationen
        String binary = "";

        // Om inget heltal ges, är den binära representationen också 0
        if (decimal == 0) {
            binary = "0";
        } else {
            // Utför division och lagrar resterna tills decimal är 0
            while (decimal > 0) {
                int remainder = decimal % 2; // Beräkna resten vid division med 2
                binary = remainder + binary; // Lägg till siffran i början av strängen
                decimal = decimal / 2; // Uppdatera heltalet för nästa iteration
            }
        }

        // Skriv ut den binära representationen
        System.out.println("Binär representation: " + binary);

        scanner.close(); // Stäng scanner för att undvika läckor
    }
}
