import java.util.Scanner;

public class reverse {

	private static Scanner input = new Scanner(System.in);
	private static String word="";
	
	/*public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Please enter a word:");
		word=input.nextLine();
		System.out.println(reverseString(word));
	}*/

	public static String reverseString(String word) {
		int l=word.length();
		if (l<=1)
				return word;
		return reverseString(word.substring(1))+word.charAt(0);
	}

}
