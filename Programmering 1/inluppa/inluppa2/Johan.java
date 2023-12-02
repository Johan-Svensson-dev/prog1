package inluppa2;

public class Johan {

	public static void main(String[] args) {
        char[] chararray = fill(200); // Skapar en char-array med x antal tecken
        System.out.println(chararray);   //printar ut arrayn
        System.out.println("Antal 'a' i arrayen: " + counter(chararray)); // Räknar och skriver ut antalet 'a'
	}
	
	
	//metod för att fylla arrayn med gemener
	public static char[] fill(int storlek) {
		char[] chararray = new char [storlek];     
		
		for(int i=0; i < chararray.length; i++) {
			chararray[i] = (char) ((int) ((Math.random() * (122 - 97)) +97));   //fyller i med gemer med hjälp av ASCII
		}
		
		return chararray;
		
	}
	
	//metod för att räkna antal a
	
	public static int counter(char[] chararray) {
		int count = 0;
		for(int i : chararray) {
			if(i== 'a') {             //"sökmetod" för att hitta a, för varje a=count++
				count++;
			}
		}
		return count;
	}
	
	

}
