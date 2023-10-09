package uppg1;

import java.util.Scanner;

public class Johan {

	public static void main(String[] args) {
		
		//Scanner och fråga
		Scanner input = new Scanner(System.in);
		
		//bank
		int bank = 0;
		
		//val variabel
		char val;		

		//tärning 1
		int dice1; 
		
		//tärning 2
		int dice2;
		
		//bofitta
		boolean run = true;
		
		//do-while sats

		do {
			int vinst = 0;
			
			//Fråga
			System.out.println("Hur mycket satsar du");
			
			//variabel som lagrar input
			int belopp = input.nextInt();
			
			//Random tal i variabeln dice1 o 2 (1-6)
			dice1 = (int)(Math.random()*6) +1;
			dice2 = (int)(Math.random()*6) +1;
		
			
			System.out.println("Tärning 1: " + dice1);
			System.out.println("Tärning 2: " + dice2);
			if(dice1 == 6 && dice2 == 1 || dice1 == 1 && dice2 == 6) {
				vinst = 3 * belopp;
				System.out.println("Dubbelvinst " + belopp);
			}
			else if(dice1 == dice2) {
				vinst = belopp;
				System.out.println("Par " +belopp);
				
			}
			else if(dice1 + dice2 ==7) {
				vinst = 2 * belopp;
				System.out.println("Vinst " +belopp);
		
			}
			else {
				System.out.println("Förlust");
			}		
			
			bank +=vinst;
			
			System.out.println("Du har nu " + bank);
			
			System.out.println("Spela igen? (y/n)");

			val = input.next().charAt(0);
			if(val == 'n') {
				run = false;
				System.out.println("Du tog ut: " +bank);
				

			}
			
			
				
			
		} while (run);
			
		
		
		}
		
		


	}


