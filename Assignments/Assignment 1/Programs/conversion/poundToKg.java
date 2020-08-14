import java.util.Scanner;                                   //Importing the scanner class.
public class poundToKg 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double userInputWeight = sc.nextDouble();   //Input in pounds
        sc.close();
        if(userInputWeight < 0)
        {
            System.out.println("Error, negative value passed. Try again.");
        }
        else
        {
            Weight obj = new Weight(userInputWeight);
            System.out.printf("%f pound(s) is %f in kilogram(s)", userInputWeight, obj.conversion());
        }   
    }
}

class Weight
{
    private double weightInPound;                           //data member pound

    public Weight(double userInputWeight)
    {
        this.weightInPound = userInputWeight;
    }

    public double conversion(){                            //Method to convert weight from pounds to kilograms.
        double result = weightInPound/ 2.2046;
        return result; 
    }
}