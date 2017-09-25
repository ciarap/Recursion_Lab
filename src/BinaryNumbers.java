import java.util.Scanner;

public class BinaryNumbers {

	private static Scanner input = new Scanner(System.in);
	private static int dec=0;
	
	/*public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Please enter a decimal:");
		dec=input.nextInt();
		convert(dec);

	}*/

	public static void convert(int dec){
		if (dec>0)
			convert(dec/2);
		System.out.print(dec%2);
	}
}
