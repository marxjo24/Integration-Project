
public class CalculateVolume {
  
  private double width;  
  private double height;
  private double length;
  private double volume;
  
  public void getWidth(double wid) {
    width = wid;
  }
  public void getHeight(double hei) {
    height = hei;
  }
  public void getLength(double leng) {
    length = leng;
  }
  public void getVolume() {
    volume = width*height*length;
    System.out.println("The volume is " + volume);
  }
 
}
