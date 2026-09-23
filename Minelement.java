import java.util.*;
public class Minelement
{
    int arr[];
    int n;
    int min=-1;
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
        min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=min)
                min=arr[i];
        }
    }
    void display()
    {
        System.out.println("Smallest element="+min);
    }
    public static void main(String args[])
    {
        Minelement obj=new Minelement();
        obj.input();
        obj.calculate();
        obj.display();
    }
    
}
    
