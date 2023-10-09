package flödesschema;

import java.util.Scanner;

public class Flödesschema {

	public static void main(String[] args) {

		//Scanner
		Scanner input=new Scanner (System.in);
		//Fråga
		System.out.println("Skriv in siffra");
		//Random tal
		int Rtal = (int)(Math.random()*10);

		boolean run = true;

		while(run) {
			int Intal = input.nextInt();
			//Rätt eller fel

			if(Intal == Rtal) {
				System.out.println("Grattis");
				run = false;
			}
			if(Rtal > Intal) {
				System.out.println("Gissa högre");
			}

			if(Rtal < Intal) {
				System.out.println("Gissa lägre");
			}







		}
	}
}
