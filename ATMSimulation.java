import java.util.*;
public class ATMSimulation
{
    int balance=10000;
    int choice;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        choice=sc.nextInt();
    }
    void CheckBalance()
    {
        System.out.println("Your balance is: "+balance);
    }
    void DepositMoney()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int amount=sc.nextInt();
        balance+=amount;
        System.out.println("Deposit successful");
        System.out.println("Current balance: "+balance);
}
void WithdrawMoney()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter withdrawal amount: ");
    int amount=sc.nextInt();
    if(amount>balance)
    {
        System.out.println("Insufficient balance");
        System.out.println("Withdrawal cancelled");
}
    else if(amount<=0)
        System.out.println("Invalid amount");
    else
    {
        balance-=amount;
        System.out.println("Withdrawal successful");
        System.out.println("Current balance: "+balance);
    }
}
    public static void main(String args[])
    {
        ATMSimulation atm=new ATMSimulation();
        while(true)
        {
            atm.input();
            switch(atm.choice)
            {
                case 1:
                    atm.CheckBalance();
                    break;
                case 2:
                    atm.DepositMoney();
                    break;
                case 3:
                    atm.WithdrawMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}