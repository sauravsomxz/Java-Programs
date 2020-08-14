public class Fan 
{
    public static void main(String [] args)
    {
    FAN obj1 = new FAN(FAN.FAST, true, 10, "Yellow");          //Instantiating first instance of FAN class.
    FAN obj2 = new FAN(FAN.MEDIUM, false, 5, "Blue");         //Instantiating second instance of FAN class.
    System.out.println(obj1.toString());                     //Printing first instance values.
    System.out.println(obj2.toString());                    //Printing second instance values.
    }
}

class FAN
{
    public static final int SLOW = 1, MEDIUM =  2, FAST = 3;      //Speed constants.
    private int speed;
    private boolean on;
    private double radius;
    private String colour;
    public FAN(){                                           //Default constructor.
        speed = SLOW;
        on = false;
        radius = 5;
        colour = "blue";
    }
    public FAN(int userInputSpeed, boolean userInputOn, double userInputRadius, String userInputColour){    //Parameterised constructor to initialise value.
        this.speed = userInputSpeed;
        this.on = userInputOn;
        this.radius = userInputRadius;
        this.colour = userInputColour;
    }
    public String toString(){                           //To string method to return string statements.
        if (on == true)
        {
            return "The fan's speed is "+speed+" it's colour is "+colour+" and radius is "+radius;
        }
        else
        {
            return "The fan is off, it's colour is "+colour+" and it's radius is "+radius;
        }
    }

}