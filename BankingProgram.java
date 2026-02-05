import java.util.Scanner;
public class BankingProgram{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance=0.0;
        boolean isRunning = true;

        while (isRunning) { 
          System.out.println("***************");
          System.out.println("BANKING PROGRAM");
          System.out.println("***************");
          System.out.println("1. Show Balance");
          System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
          System.out.println("4. Exit");
          System.out.println("***************");
          System.out.print("Enter your choice (1-4): ");
          int userInput = sc.nextInt();
          switch(userInput){
            case 1 -> showBalance(balance);
            case 2 -> balance+=deposit();
            case 3 -> balance-=withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid input");
          }
        }
        if(!isRunning){
            System.out.println("Thank you for using our service!");
        } 
    }
    public static void showBalance(double bal){
        System.out.printf("Balance: $%.2f\n",bal);
    }
    public static double deposit(){
        System.out.print("Enter an amount: ");
        double amount = sc.nextDouble();
        if(amount<0){
            System.out.println("Value cannot be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
    public static double withdraw(double bal){
        System.out.print("Enter an amount: ");
        double amount = sc.nextDouble();
        if(amount<0){
            System.out.println("Value cannot be negative");
            return 0;
        }
        else{
         if(amount>bal){
            System.out.println("Insufficient balance you got there brokie");
            return 0;
          }
         else{
            return amount;
          }
        }
    }
}