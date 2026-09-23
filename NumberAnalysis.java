import java.util.*;
public class NumberAnalysis
{
    int numbers[];
    int sum;
    float average;
    int highest;
    int lowest;
    int enencount;
    int oddcount;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        numbers=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
    }
    void calculate()
    {
        sum=0;
        highest=numbers[0];
        lowest=numbers[0];
        enencount=0;
        oddcount=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum+=numbers[i];
            if(numbers[i]>highest)
                highest=numbers[i];
            if(numbers[i]<lowest)
                lowest=numbers[i];
            if(numbers[i]%2==0)
                enencount++;
            else
                oddcount++;
        }
        average=sum/(float)numbers.length;
    }
    void display()
    {
        System.out.println();
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Largest: "+highest);
        System.out.println("Smallest: "+lowest);
        System.out.println("Even numbers: "+enencount);
        System.out.println("Odd numbers: "+oddcount);
    }
    public static void main(String args[])
    {
        NumberAnalysis na=new NumberAnalysis();
        na.input();
        na.calculate();
        na.display();
    }
}