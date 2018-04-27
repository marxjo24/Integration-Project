//John Marx
/** This contains the code to simulate a restaurant's people.
 * @author John Marx
 *
 */

public class Restaurant {
  String name;
  static int numberOfCustomers = 0;     //Static is when the variable is the same for all objects
                                        //It is used here so the program can provide a counter for
  Restaurant(String name) {             //the number of customers 
    this.name = name;
  }

  String getName() {
    return name;
  }
  //The returName method is an example of polymorphism 
  //Every sub-class of the Restaurant class has the method getName
  //When used in the main class, it will return the objects name
  
  static String returnName(Restaurant rest) {
    return rest.getName();
  }
  
  static int returnNumberOfCustomers() {
    return numberOfCustomers;
  }
//Inheritance is a relationship between the Base/Parent/Super 
//and the Derived/Child/Sub. In this class the parent is the Restaurant class
//The Customer class is also a parent to the SoccerMom class
}
class Customer extends Restaurant {
  double money;

  Customer(String name, double money) {
    super(name);
    this.money = money;
    numberOfCustomers ++;
  }

  String speak() {
    return "The food is good";
  }
  
  @Override //Overriding is having the same method names 
  //in a base and in a derived class
  String getName() {
    return name;
  }
}


class Employee extends Restaurant {
  private double salery;


  Employee(String name, double salery) {
    super(name);
    this.salery = salery;

  }

  void setSalery(double sal) {
    salery = sal;
  }
  
  @Override 
  String getName() {
    return name;
  }
}


class SoccerMom extends Customer {
  private int numberOfComplaints;

  SoccerMom(String name, double money) {
    super(name, money);
    numberOfCustomers ++;

  }

  int getNumberOfComplaints() {
    return numberOfComplaints;
  }

  @Override //Overriding is having the same method names 
  //in a base and in a derived class
  String speak() {
    numberOfComplaints++;
    return "Can I speak to the manager";
  }
  
  String getName() {
    return name;
  }
}


