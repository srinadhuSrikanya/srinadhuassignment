import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) throws UnsupportedOperationExcepion {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		if(den==0) {
			throw new UnsupportedOperationExcepion(); 
		}
		int c=num/den;
		System.out.println(c);

	}

}


