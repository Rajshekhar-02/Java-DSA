import java.util.*;
class YearConversion
{
    int numdays;
    int years,months,days;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        numdays=sc.nextInt();
    }
    void conversion()
    {
        years=numdays/365;
        months=(numdays%365)/30;
        days=(numdays%365)%30;
    }
    void display()
    {
        System.out.println("Number of years: "+years);
        System.out.println("Number of months: "+months);
        System.out.println("Number of days: "+days);
    }
public static void main(String args[])
    {
        YearConversion yc=new YearConversion();
        yc.input();
        yc.conversion();
        yc.display();
    }
    
}