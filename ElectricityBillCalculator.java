import java.util.*;
public class ElectricityBillCalculator
{
    int units;
    int bill;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        units=sc.nextInt();
    }
    void calculate()
    {
        if(units<=100)
            bill=units*5;
        else if(units<=200)
            bill=100*5+(units-100)*7;
        else if(units<=300)
            bill=100*5+100*7+(units-200)*10;
        else
            bill=100*5+100*7+100*10+(units-300)*12;
    }
    void display()
    {
        System.out.println("Total Electricity Bill: "+bill);
    }
    public static void main(String args[])
    {
        ElectricityBillCalculator ebc=new ElectricityBillCalculator();
        ebc.input();
        ebc.calculate();
        ebc.display();
    }
}

