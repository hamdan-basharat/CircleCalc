package circlecalc;
import java.lang.Math;

public class CircleCalc {

    public static void main(String[] args) {
        
   CircleSphereHamdan length = new CircleSphereHamdan(); 
   length.calcCirc(); 
   length.calcArea();
   length.calcVolume();
   length.calcSA();
   length.calcVCylind();
   length.displayCircle();
   length.displaySphere();
   length.displayCylinder();
  }
}
class CircleSphereHamdan {
  double radius;
  CircleSphereHamdan() {radius = (Math.random() * 50 + 1);}
  double calcCirc;
  double calcArea;
  double calcVolume;
  double calcSA;
  double calcVCylind;
  public double calcCirc() {
    return(2 * Math.PI * radius);
  }
  public double calcArea() {
    return(Math.PI * radius *radius);
  }
  public double calcVolume() {
    return(4/3 * Math.PI * radius * radius * radius);
  }
  public double calcSA() {
    return(4 * Math.PI * radius * radius);
  }
  public double calcVCylind() {
    return(Math.PI * radius * radius * (radius*2));
  }
  public void displayCircle() {
    System.out.printf("A Circle with radius %.1f has circumference = %.1f units and area = %.1f squared units. \n", radius, calcCirc(), calcArea());
  }
  public void displaySphere() {
    System.out.printf("A Sphere with radius %.1f has volume = %.1f units cubed and surface area = %.1f squared units. \n", radius, calcVolume(), calcSA());
  }
  public void displayCylinder() {
    System.out.printf("The volume of a cylinder with radius %.1f and height %.1f is %.1f units cubed. \n", radius, radius*2, calcVCylind()); 
  }
}
