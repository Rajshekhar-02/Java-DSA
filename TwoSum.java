import java.util.*;
class TwoSum
{
    int arr[];
    int n;
    int sum;
    int f=0;
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the sum");
        sum=sc.nextInt();
    }
    void calculate()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
                break;
        }
    }
    void display()
    {
        if(f==1)
            System.out.println("The pair is found");
        else
            System.out.println("No pair found");
    }
    public static void main(String args[])
    {
        TwoSum obj=new TwoSum();
        obj.input();
        obj.calculate();
        obj.display();
    }
}