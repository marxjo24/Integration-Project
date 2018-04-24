public class Restaurant {
  String name;

  Restaurant(String name) {
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
}
//Inheritance is a relationship between the Base/Parent/Super 
//and the Derived/Child/Sub. In this class the parent is the Restaurant class
//The Customer class is also a parent to the SoccerMom class

class Customer extends Restaurant {
  double money;

  Customer(String name, double money) {
    super(name);
    this.money = money;
  }

  void speak() {
    System.out.println("The food is good");
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

  }

  int getNumberOfComplaints() {
    return numberOfComplaints;
  }

  @Override //Overriding is having the same method names 
  //in a base and in a derived class
  void speak() {
    System.out.println("Can I speak to the manager");
    numberOfComplaints++;
  }
  
  String getName() {
    return name;
  }
  
  

}
