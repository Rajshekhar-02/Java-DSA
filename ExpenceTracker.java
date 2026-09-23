import java.util.*;
public class ExpenceTracker
{
    int total;
    double average;
    int highest;
    int lowest;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of expenses: ");
        int n=sc.nextInt();
        int expenses[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter expense "+(i+1)+": ");
            expenses[i]=sc.nextInt();
        }
        total=0;
        highest=expenses[0];
        lowest=expenses[0];
        for(int i=0;i<n;i++)
        {
            total+=expenses[i];
            if(expenses[i]>highest)
                highest=expenses[i];
            if(expenses[i]<lowest)
                lowest=expenses[i];
        }
        average=(double)total/n;
    }
    void display()
    {
        System.out.println();
        System.out.println("Total expenses: "+total);
        System.out.println("Average expense: "+average);
        System.out.println("Highest expense: "+highest);
        System.out.println("Lowest expense: "+lowest);
    }
    public static void main(String args[])
    {
        ExpenceTracker et=new ExpenceTracker();
        et.input();
        et.display();
    }
}