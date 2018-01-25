import java.util.Scanner;

// John Marx
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World");
		//sysout Ctrl+Space
		System.out.println("Enter x1");
		int x1 = scan.nextInt();
		System.out.println("Enter Rate");
		double rate = scan.nextDouble();
		System.out.println("What is your name");
		String username = scan.nextLine();
		System.out.println(username);
		
		
		Dog spot = new Dog();
		spot.size = 30;
		spot.breed = "German Shepherd";
		System.out.println(spot.breed);
		Dog spuds = new Dog();
		spuds.size= 40;
		
	}

}


class Dog{
	double size;
	String breed;
}