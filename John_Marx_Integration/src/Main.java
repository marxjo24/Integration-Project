import java.util.Scanner;

// John Marx
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String usersname = scan.nextLine();
		System.out.println("Hello " + usersname);
		System.out.println();

		System.out.println("Enter a interger");
		double num1 = scan.nextDouble(); // is a double just in case user enters decimal
		System.out.println((int) num1 + " Is Now A Double");
		System.out.println(num1);
		System.out.println();

		System.out.println("Enter A Double");
		double num2 = scan.nextDouble();
		System.out.println(num2 + " Is Now A Interger");
		System.out.println((int) num2);
		System.out.println();

		System.out.println("Enter another interger to be divided by the previous " + "number");
		double num4 = scan.nextDouble();
		System.out.println((int) num4 + " divided by " + (int) num2 + " is: " + (int) num4 / (int) num2);
		System.out.println();
		System.out.println("The decimal was removed due to it being an interger " + "division");
		System.out.println();

		System.out.println("Enter a sentence");
		scan.nextLine();
		String sentence1 = scan.nextLine();
		System.out.println(sentence1 + " is now upper cased: ");
		System.out.println(sentence1.toUpperCase());
		System.out.println();
		System.out.println(sentence1 + " is now lower cased: ");
		System.out.println(sentence1.toLowerCase());
		System.out.println();
		System.out.println("I removed the first 4 characters of the sentence using " + "substing: ");
		System.out.println(sentence1.substring(4));
		System.out.println();
		System.out.println("Enter a interger between 1 and 20");
		double num3 = scan.nextDouble();
		num3 = (int) num3; // If user enters a double then this changes it to a int

		if (num3 >= 1 && num3 <= 20) {
			int counter = 1;
			System.out.println("The number " + (int) num3 + " is a product of:");
			while (counter < 21) {
				if (num3 % (counter) == 0) {
					System.out.println("  ~" + counter);
				}
				++counter;
			}
		} else {
			System.out.println("That is not a number between 1 and 20");
		}
		System.out.println();

		System.out.println("Enter a grade you recieved on a test");
		scan.nextLine();
		String grade = scan.nextLine();
		// The switch gives the user an output based on the grade they recieved
		switch (grade) {
		case "A":
			System.out.println("Good Job");
			break;
		case "B":
			System.out.println("Your Above Average");
			break;
		case "C":
			System.out.println("Your Average");
			break;
		case "D":
			System.out.println("Your Below Average");
			break;
		case "F":
			System.out.println("Good Job! You failed");
			break;
		default:
			System.out.println("Enter a Valid Letter Grade");
			break;
		}
		// Uses the CalculateVolume class to get the volume from the values that the
		// user gives
		System.out.println();
		System.out.println("The program will now calculate volume using a seperate" + " class.");
		System.out.println();
		System.out.println("Enter the width for a box");
		CalculateVolume volume1 = new CalculateVolume();
		volume1.getWidth(scan.nextDouble()); // Gets the width
		System.out.println("Enter the width for the box");
		volume1.getHeight(scan.nextDouble()); // Gets the height
		System.out.println("Enter the length for the box");
		volume1.getLength(scan.nextDouble()); // Gets the length
		System.out.println();
		volume1.getVolume(); // Calculates the volume in separate class and
								// displays it

		System.out.println("The program will now emulate a bank");
		System.out.println("NOTE: the bank balance can not become negative");
		System.out.println("How much money do you want in this bank?");
		Bank fakeBank1 = new Bank(scan.nextDouble());
		System.out.println("What is the interest at the bank? Enter the interest as a decimal not a percent");
		Bank.setInterest(scan.nextDouble());
		System.out.println("It is time to make a withdraw. Enter an amount to withdraw");
		fakeBank1.makeWithdraw(scan.nextDouble());
		System.out.println("You can make a deposit now. Enter a number to deposit");
		fakeBank1.makeDeposit(scan.nextDouble());
		System.out.println("Now we will find the compound interest over time");
		System.out.println(
				"Enter the number of periods as a whole number, then enter the number of years as a whole number");
		System.out.println("The coumpound interest is: $" + fakeBank1.getInterestOvertime(fakeBank1.getBankBalance(),
				Bank.getInterest(), scan.nextInt(), scan.nextInt()));

		System.out.println("Enter 5 integers to be placed into an array");
		int s = 0;
		Integer[] newarray = new Integer[5];
		while (s < 5) {
			newarray[s] = scan.nextInt();
			s++;
		}
		System.out.println("The program will now find the smallest value in the array");
		int smallest = newarray[0];
		for (int i = 1; i < newarray.length; i++) {
			if (newarray[i] < smallest) {
				smallest = newarray[i];
			}
		}
		System.out.println("The smallest value is: " + smallest);

		System.out.println("The program will now find the sum of the array");
		int sum = 0;
		for (int i : newarray) {
			sum += i;
		}
		System.out.println("The sum is: " + sum);

		System.out.println();
		System.out.println("Enter value to be found in the array");
		int value = scan.nextInt();
		for (int w = 0; w < newarray.length; w++) {
			if (newarray[w] == value) {
				System.out.println("The value " + value + " is found at index " + w);
			}
		}

		System.out.println();
		System.out.println("Enter a string");
		StringBuilder experiment = new StringBuilder();
		scan.nextLine();
		experiment.append(scan.nextLine());
		System.out.println("Now enter a string to be entered into the old string using append");
		String insertSomeString = scan.nextLine();
		experiment.append(insertSomeString);
		System.out.println("The new string is:");
		System.out.println(experiment);
		System.out.println("Now enter the starting index for the delete method");
		int start = scan.nextInt();
		System.out.println("Now enter the ending index for the delete method");
		int ending = scan.nextInt();
		experiment.delete(start, ending);
		System.out.println("The new string is:");
		System.out.println(experiment);
		System.out.println("Now enter the starting postion for insert");
		int starting = scan.nextInt();
		System.out.println("Now enter string to be interted into the old string at the point " + starting);
		scan.nextLine();
		String someString = scan.nextLine();
		experiment.insert(starting, someString);
		System.out.println("The new string is:");
		System.out.println(experiment);
	}
}
