import java.util.*;
class Maxfindinarray{
    int arr[];
    int n;
    int max=-1;
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
        {
            if(arr[i]>max)
                max=arr[i];
        }
    }
    void display()
    {
        System.out.println("Largest element="+max);
}
    public static void main(String args[])
    {
        Maxfindinarray obj=new Maxfindinarray();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
