import java.util.*;
class SecondLargestElement
{
    int arr[];
    int n;
    int max;
    int secondmax;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        max=arr[0];
        secondmax=arr[0];
    }
    void calculate()
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>secondmax && arr[i]<max)
                secondmax=arr[i];
        }
    }
    void display()
    {
        System.out.println("Second largest element="+secondmax);
    }
    public static void main(String args[])
    {
        SecondLargestElement obj=new SecondLargestElement();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
