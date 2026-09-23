import java.util.*;
class Sortedcheck
{
    int arr[];
    int n;
    boolean assending=true;
    boolean desending=true;
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
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
                assending=false;
            if(arr[i]<arr[i+1])
                desending=false;
        }
    }
    void display()
    {
        if(assending==true)
            System.out.println("Array is sorted in ascending order");
        else if(desending==true)
            System.out.println("Array is sorted in descending order");
        else
            System.out.println("Array is not sorted");
    }
    public static void main(String args[])
    {
        Sortedcheck obj=new Sortedcheck();
        obj.input();
        obj.calculate();
        obj.display();
    }
}