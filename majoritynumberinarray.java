import java.util.*;
class majoritynumberinarray
{
    int n;
    int a[];
    int major=-1;
    int cc=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }
    void calculate()
    {
        for(int i=0;i<n;i++)
        {
            int count=0;
            int x=a[i];
            for(int j=0;j<n;j++)
            {
                if(a[j]==x)
                    count++;
            }
            if(count>cc)
            {
                cc=count;
                major=x;
            }
        }
    }
    void display()
    {
        System.out.println("The majority element is "+major);
    }
    public static void main(String args[])
    {
        majoritynumberinarray obj=new majoritynumberinarray();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
