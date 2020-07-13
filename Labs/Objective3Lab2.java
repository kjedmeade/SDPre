public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1sq= Math.pow(10, 2);
    double side2sq= Math.pow(8, 2);
    double rtformula= side1sq + side2sq;
    double hypotenuse = Math.sqrt(rtformula);
    System.out.println("The hypotenuse of a triangle with sides 10.0 and 8.0 is " + hypotenuse);

  }
}
