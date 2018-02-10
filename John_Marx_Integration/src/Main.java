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
    System.out.println(num1 + " Is Now A Double");
    System.out.println((double)num1);
    
    System.out.println("Enter A Double");
    double num2 = scan.nextDouble();
    System.out.println(num2 + " Is Now A Interger");
    System.out.println((int)num2);
    
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
    //The switch gives the user an output based on the grade they recieved
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
    //Uses the CalculateVolume class to get the volume from the values that the
    //user gives
    System.out.println("The program will now calculate volume using a seperate"
        + " class.");
    System.out.println("Enter the width for a box");
    CalculateVolume volume1 = new CalculateVolume();
    volume1.getWidth(scan.nextDouble());  //Gets the width
    System.out.println("Enter the width for the box");
    volume1.getHeight(scan.nextDouble());  //Gets the height
    System.out.println("Enter the lenght for the box");
    volume1.getLength(scan.nextDouble());  //Gets the length
    volume1.getVolume();  //Calculates the volume in separate class and 
                          //displays it
    }
  }

