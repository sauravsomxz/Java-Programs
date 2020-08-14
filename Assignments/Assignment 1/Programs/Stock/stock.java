import java.util.Scanner;

public class stock 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking user Inputs.
        System.out.println("Enter symbol of stock: ");
        String userInputSymbol = sc.nextLine();
        System.out.println("Enter name of Company: ");
        String userInputNameOfCompany = sc.nextLine();
        System.out.println("Enter Previous Closing price: ");
        double userInputClosingPrice = sc.nextDouble();
        System.out.println("Enter Current Price: ");
        double userInputCurrentPrice = sc.nextDouble();
        sc.close();
        Stock obj = new Stock(userInputSymbol, userInputNameOfCompany, userInputClosingPrice, userInputCurrentPrice);
        System.out.println(obj.getChangePercent());  
    } 
}

// Stock class begins here. 
class Stock{
    private String symbol;
    private String nameOfCompany;
    private double previousClosingPrice;
    private double currentPrice;


    //Constructor to initialise values to data members.

    public Stock(String userInputSymbol, String userInputNameOfCompany, double userInputClosingPrice, double userInputCurrentPrice){
        this.symbol = userInputSymbol;
        this.nameOfCompany = userInputNameOfCompany;
        this.previousClosingPrice = userInputClosingPrice;
        this.currentPrice = userInputCurrentPrice;
    }

    //Method to get the percentage change in stock price of previous and current year.
    public double getChangePercent(){
        double result = ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
        return result;
    }
}