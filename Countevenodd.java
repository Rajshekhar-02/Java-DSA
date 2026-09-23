import java.util.*;
class Countevenodd
{
    int arr[];
    int n;
    int even=0;
    int odd=0;
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
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
    }
    void display()
    {
        System.out.println("The number of even numbers are "+even);
        System.out.println("The number of odd numbers are "+odd);
    }
    public static void main(String args[])
    {
        Countevenodd obj=new Countevenodd();
        obj.input();
        obj.calculate();
        obj.display();
    }
}