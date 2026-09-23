import java.util.*;
class Sumofarray
{
    int arr[];
    int n;
    int sum=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    void calculate()
    {
        for(int i=0;i<n;i++)
            sum+=arr[i];
    }
    void display()
    {
        System.out.println("The sum of array is "+sum);
    }
    public static void main(String args[])
    {
        Sumofarray obj=new Sumofarray();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
