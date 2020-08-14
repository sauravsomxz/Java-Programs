import java.util.*;
import java.lang.Math;
class point
{
  double x,y;
  point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  public double getdistance()
  {
    double originpointdistance = Math.pow((x*x*+y*y),0.5);
      return originpointdistance;
  }

}
