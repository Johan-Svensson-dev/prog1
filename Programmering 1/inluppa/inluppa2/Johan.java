package inluppa2;

public class Johan {

	public static void main(String[] args) {
		int storlek = 50;
		System.out.println(fill(storlek));
		System.out.print(counter);

	}
	
	public static char[] fill(int storlek) {
		char[] chararray = new char [storlek];
		
		for(int i=0; i < chararray.length; i++) {
			chararray[i] = (char) ((int) ((Math.random() * (122 - 97)) +97));
		}
		
		return chararray;
		
	}
	
	public static int counter(char[] chararray) {
		int count = 0;
		for(int i : chararray) {
			if(i== 'a') {
				count++;
			}
		}
	}
	

}
