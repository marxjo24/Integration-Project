import java.util.Locale;
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
    System.out.println((double) num1 + " Is Now A Double");
    System.out.println("Enter A Double");
    double num2 = scan.nextDouble();
    System.out.println((int) num2 + " Is Now A Interger");
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
    System.out.println("Enter a grade you recieved on a test");
    scan.nextLine();
    String grade = scan.nextLine();
    switch (grade) {
      case "A":
        System.out.println("Good Job");
        break;
      case "B":
        System.out.println("Get better");
        break;
      case "C":
        System.out.println("Your average");
        break;
      case "D":
        System.out.println("Your below average");
        break;
      case "F":
        System.out.println("Good Job! You failed");
        break;
      default:
        System.out.println("Enter a letter grade");
        break;
      }
    }
  }

