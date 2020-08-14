import java.util.*;
class circle
{
  private double radius;
  private double area;

  circle(double radius)
  {
    this.radius = radius;
  }

  public void getarea() //Calculate and Print Area
  {
    double area = 3.14 * radius * radius; //Formulae to calculate area
    System.out.print("Area of circle = " + area); //Printing to Console
  }

  public double printdiffarea(circle c)
  {
    if(this.area > c.area)
      return(this.area-c.area);
    else
      return(c.area - this.area);
  }
}

class areacircle
{
  public static void main(String args[])
  {
    double r1, r2;
    Scanner sc = new Scanner(System.in);

    //
    System.out.print("Enter the radius(r1): ");
    r1 = sc.nextDouble();
    System.out.print("Enter the radius(r2): ");
    r2 = sc.nextDouble();

    //Creating object(s)
    circle c1 = new circle(r1);
    circle c2 = new circle(r2);

    //Calculating Area
    c1.getarea();
    c2.getarea();

    //printdiffarea calculation
    double diffarea = c1.printdiffarea(c2);
    System.out.print("Area Difference = " + diffarea);
  }
}
