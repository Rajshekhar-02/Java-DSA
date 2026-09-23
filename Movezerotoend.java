import java.util.*;
class Movezerotoend
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
        int zero0=0;
        int x=0;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x=arr[i];
            if(x!=0)
                temp[x]=arr[i];
            else
                zero0++;
        }
        for(;x<n;x++)
            temp[x]=0;
    }
    void display()
    {
        System.out.println("The array after moving zeroes to end is");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        Movezerotoend obj=new Movezerotoend();
        obj.input();
        obj.calculate();
        obj.display();
    }
    
}