import java.util.*;
class ReverseArray
{
    int arr[];
    int n;
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
        int temp[]=new int[n];
        int nn=n;
        for(int i=0;i<n;i++)
        {
            temp[nn-1]=arr[i];
            nn--;
        }
        arr=temp;
    }
    void display()
    {
        System.out.println("The reversed array is");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        ReverseArray obj=new ReverseArray();
        obj.input();
        obj.calculate();
        obj.display();
    }
}