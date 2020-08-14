import java.util.Scanner;                               //Importing the scanner class.
public class interest
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);            //Creating instance of Scanner class.
        System.out.println("Enter principle amount: ");
        double userInputPrinciple = sc.nextDouble();    // Taking Input for P
        System.out.println("Enter rate of Interest: ");
        double userInputRate = sc.nextDouble();         // Taking Input for R
        System.out.println("Enter Time Period: ");
        double userInputTime = sc.nextDouble();         // Taking Input for T
        sc.close();
        Calculate obj = new Calculate(userInputPrinciple, userInputRate, userInputTime );   //Instansiating the Calculate class.
        System.out.println("The Simple Interest is: "+ obj.simpleInterest());
    }
}

class Calculate{

    private double principle;       
    private double rate;
    private double time;

    public Calculate(double userInputPrinciple, double userInputRate, double userInputTime){    //Creating parameterized constructor to initialize member variables.
        principle = userInputPrinciple;
        rate = userInputRate;
        time = userInputTime;
    }

    public double simpleInterest(){                     //Method to calcuate the Simple Interest.
        double result = (principle * rate * time)/100;
        return result;
    }
}