package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ett heltal");
		
		try {
			int tal = input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("fuck you");
			
		}
	}

}
