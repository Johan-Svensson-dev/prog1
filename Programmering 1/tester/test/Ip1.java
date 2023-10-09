package test;

public class Ip1 {

	public static void main(String[] args) {
	//	Hur deklarerar man en variabel av typen:
		//	heltal __________________________________     int
		//	decimaltal ____________ eller _______________ float eller double
		//	tecken _________________________________	char
		//	textsträng _______________________________	string
		//	boolsk variabel ___________________________		boolean
		//	heltalsfält ________________________________	array
		//	Vad bör man tänka på när man ger String ett värde?______________________   String-värden bör omges av dubbla citattecken (").
		//	Vad bör man tänka på när man ger char ett värde?_______________________		omges av enkla citattecken (')
		
		

        int räknare = 0;
int[ ] array = {1, 2, 3, 4};
for(int i = 0; i<array.length; i++) {
räknare++;
                   array[i] +=2; 
}



//Vilket värde kommer räknare att ha efter koden ovan körts ___________   13
System.out.println(räknare);
//Vilka tal ryms i array efter körning? ____, ______, ______, ______ [3, 4, 5, 6]. Vi har ökat varje element i arrayen med 2. Dessutom ökar räknare med ett varje gång loopen körs, så räknare kommer att vara 4 när loopen är klar eftersom det finns fyra element i array.


boolean choise = true;
if(choise) {
	choise = false;
}



//Vilket värde kommer choise ha efter körningen ovan?: false, Efter att koden har körts, kommer choise att ha värdet false. Här är hur koden fungerar steg för steg: boolean choise = true;: Här deklareras och initieras en boolean-variabel choise med värdet true. if (choise) { choise = false; }: Detta är en villkorskontroll. Eftersom choise är true, kommer koden inuti if-blocket att exekveras. Inuti blocket sätts värdet på choise till false. Eftersom choise ändrades till false inuti if-blocket, kommer den att ha värdet false efter att koden har körts.



int[ ] talSamling = {1, 2, 4, 6};
               int summa = 0;
for(int i = 0; i<talSamling.length; i++) {
	summa += talSamling[i];
}

//Vilket värde har summa efter koden ovan körts?
System.out.println(summa);
//13, lägger ihop varje index i summa


double längd = input.nextDouble();
boolean switch1 = false;
if(längd < 1) {
switch1 = false;
}
else {
switch1 = true;
}


}

//Vad gör koden ovan? beskriv kortfattat: 
	
//Läser in en double-värde från användaren och lagrar det i variabeln längd.
//Deklarerar en boolesk variabel switch1.
//Om längd är mindre än 1, sätter den switch1 till false.
//Om längd är större än eller lika med 1, sätter den switch1 till true.

	


	
	String mening = “Hej Du!”;
    int index = 0;
char[ ] teckenArray = new char[50]; 
int i = 0;
teckenArray[i] = mening.charAt(index);
while(index < mening.length() && mening.indexOf(“ “) != -1) {
i++;
index = mening.indexOf(" ");
mening = mening.substring(index + 1);
teckenArray[i] = mening.charAt(0);
}


//Vad finns i teckenArray efter att koden ovan körts?: 

//teckenArray[0] kommer att vara 'H', eftersom det är det första tecknet i strängen mening ("Hej Du!").
//teckenArray[1] kommer att vara 'D', eftersom koden i loopen letar efter mellanslag (' ') i mening. Den hittar det första mellanslaget efter 'Hej', och sedan ersätter den mening med "Du!" och sätter index till 0. Därför kommer teckenArray[1] att vara 'D'.
//teckenArray[2] kommer att vara 'u', eftersom det är det första tecknet i den nya versionen av mening ("Du!") efter att mellanslaget har tagits bort.
//teckenArray[3] kommer att vara '!', eftersom det är det sista tecknet i den nya versionen av mening.



if(array.length == 2) {
	int temp = array[0];
	array[0] = array[1];
	array[1] = temp;
}else { 
	System.out.println("array not valid");
}

//Vad krävs för att “array not valid” ska skrivas ut?:
//för att meddelandet "array not valid" ska skrivas ut, måste array ha en längd som inte är 2, det vill säga det kan vara en tom array (array.length == 0) eller ha fler än två element (array.length > 2) eller färre än två element (array.length < 2).



String mening = input.nextLine();
                while(mening.length() > 0 && mening.indexOf(".") != -1) {

	mening += mening.substring(0, mening.indexOf('.'))
                         +" "  +mening.substring(mening.indexOf('.')
                                                               +1, mening.length());
			}

//Vad gör koden ovan med den inmatade texten “mening”?
               //när while-loopen körs, fortsätter den att dela upp strängen mening genom att ersätta de första punkterna med mellanslag, tills det inte finns några fler punkter kvar i strängen. Slutresultatet kommer att vara en sträng där punkterna har ersatts med mellanslag, vilket i praktiken delar upp strängen i flera meningar. 

	}
			






