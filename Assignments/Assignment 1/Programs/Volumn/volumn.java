import java.util.Scanner;                                                       //Importing the Scanner class.
public class volumn 
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double userInputHeight = sc.nextDouble();   //Input for H
        System.out.println("Enter the width: ");    
        double userInputWidth = sc.nextDouble();    //Input for W
        System.out.println("Enter the depth: ");
        double userInputDepth = sc.nextDouble();    //Input for D
        sc.close();
        Compute obj = new Compute(userInputHeight, userInputWidth, userInputDepth); //Instantiating the compute class.
        System.out.printf("The volume of the box is %f \n",obj.volume());
        System.out.printf("The Surface area of the box is %f",obj.surfaceArea());
    }
}

class Compute{

    private double height;
    private double width;
    private double depth;
    private double volumn;
    
    //Initialising member variables using constructor.
    public Compute(double userInputHeight, double userInputWidth, double userInputDepth){  
        height = userInputHeight;
        width = userInputWidth;
        depth = userInputDepth;
    }

    //Method to compute Volume.
    public double volume(){                             
        volumn = height * width * depth;
        return volumn;
    }

    //Method to compute Surface Area.
    public double surfaceArea(){                       
        volumn = 2*((height*width) + (height * depth) + (width * depth));
        return volumn;
    }

}