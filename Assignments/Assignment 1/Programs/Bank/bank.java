import java.util.Scanner;                   //Importing the Scanner class.
public class bank 
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: "); //Taking user Input.
        String userInputName = sc.nextLine();
        System.out.println("Enter Account number: ");
        long userInputAccountNumber = sc.nextLong();
        System.out.println("Enter Account Type (s-> savings or c-> current): ");
        char userInputAccountType = sc.next().charAt(0);
        Account obj = new Account(userInputName,userInputAccountNumber,userInputAccountType);
        do{
            System.out.println("Enter number preceeding to the option you wish to choose:\n 1. Deposit Money.\n 2. Withdraw Money.\n 3. Display Amount.\n 4. View Monthly Interest Rate.\n 5. View your monthly Interest.");
            int choice = sc.nextInt();
            switch(choice){
                case 1:                                                         //If user wishes to make a deposit.
                    System.out.print("Enter amount you want to deposit: ");
                    int userInputAmount = sc.nextInt();
                    obj.depositAmount(userInputAmount);
                    break;
                case 2:                                                         //If user wishes to make a withdraw.
                    System.out.println("Enter amount you want to withdraw: ");
                    double userInputWithdrawAmount = sc.nextInt();
                    obj.withdrawAmount(userInputWithdrawAmount);
                    break;
                case 3:                                                         //If user wishes to display his/her balance.
                    obj.display();
                    break;
                case 4:                                                         //If user wishes to view the current monthly interest rate.
                    System.out.println(obj.get_Monthly_InterestRate());
                    break;
                case 5:                                                         //If user wishes to check his/her monthly interest.
                    System.out.println(obj.get_Monthly_Interest());
                    break;
                default:                                                        //For selection of wrong option.
                    System.out.println("Please enter a valid choice.");
            }
            System.out.println("Do you wish to continue? (y-> yes or n-> no) ");
            char repeater = sc.next().charAt(0);
            if(repeater == 'n'){
                break;
            }else if(repeater != 'y'){
                System.out.println("Please enter a valid choice.");
                continue;
            }
        }while(true);
        sc.close();                                                              //Closing the scanner class.
}

}

class Account{

    private String HolderName;
    private long AccountNumber;
    private char AccountType;
    private double BalanceAmount;
    private double AnnualInterestRate;
    
    public Account(){
        AnnualInterestRate = 4.5/100;           //Default Annual Interest Rate in percentage.
    }
    public Account(String userInputName, long userInputAccountNumber, char userInputAccountType){
        this.HolderName = userInputName;
        this.AccountNumber = userInputAccountNumber;
        this.AccountType = userInputAccountType;
    }

    public void depositAmount(int amount){      //Method to deposit money.
        BalanceAmount += amount;
    }

    public void withdrawAmount(double userInputWithdrawAmount){     //method to withdraw money.
        double temp = BalanceAmount - userInputWithdrawAmount;
        if (userInputWithdrawAmount > BalanceAmount){
            System.out.println("Sorry Insufficient funds in your account");
        }else if(temp < 50){
            System.out.println("Sorry you need to have atleast Rs 50 in your account.");
        }else{
            BalanceAmount -= userInputWithdrawAmount;
        }
    }

    public void display(){                      //method to display the account balance along with name.
        System.out.println(HolderName);
        System.out.println(BalanceAmount);
    }

    public double get_Monthly_InterestRate(){   //Method to get the monthly interest rate.
        return (AnnualInterestRate)/12;
    }

    public double get_Monthly_Interest(){       //Method to get the monthly interest on balance.
        return BalanceAmount * get_Monthly_InterestRate();
    }
}