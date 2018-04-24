// John Marx
/** This contains the code to calculate a volume of a box
 * @author Marxj
 *
 */
public class CalculateVolume {

  private double width;
  private double height;
  private double length;
  private double volume;

  public void getWidth(double wid) { // This is a header
    width = wid;
  }

  public void getHeight(double hei) { // The parameter is hei
    height = hei;
  }

  public void getLength(double leng) {
    length = leng;
  }

  public void getVolume() {
    volume = width * height * length;
    System.out.println("The volume is " + volume); // System.out.println is the call
    // ("The volume is " + volume) is the argument
  }

}
