import java.util.Scanner;

// John Marx
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String usersname = scan.next();
		System.out.println("Hello " + usersname);
		System.out.println("Enter a interger");
		int num1 = scan.nextInt();
		System.out.println((double)num1 + " Is Now A Double");
		System.out.println("Enter A Double");
		double num2 = scan.nextDouble();
		System.out.println((int)num2 + " Is Now A Double");
	}
	
}