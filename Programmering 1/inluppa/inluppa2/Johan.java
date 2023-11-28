package inluppa2;

public class Johan {

	public static void main(String[] args) {
		int storlek = 8;

	}
	
	public static char[] fill(int storlek) {
		char[] chararray = new char [storlek];
		
		for(int i=0; i < chararray.length; i++) {
			chararray[i] = (char) ((int) ((Math.random() * (122 - 97)) +97));
		}
		
	}

}
