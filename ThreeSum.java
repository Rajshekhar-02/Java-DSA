import java.util.*;

class ThreeSum
{
    int arr[];
    int n;
    int sum;
    int f=0;
    int a,b,c;

    void input()
    {
        Scanner sc=new Scanner(System.in);

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
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                    {
                        f=1;
                        a=arr[i];
                        b=arr[j];
                        c=arr[k];
                        break;
                    }
                }

                if(f==1)
                    break;
            }

            if(f==1)
                break;
        }
    }

    void display()
    {
        if(f==1)
            System.out.println("The triplet is "+a+" "+b+" "+c);
        else
            System.out.println("No triplet found");
    }

    public static void main(String args[])
    {
        ThreeSum obj=new ThreeSum();
        obj.input();
        obj.calculate();
        obj.display();
    }
}