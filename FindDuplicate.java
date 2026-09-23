import java.util.*;
class FindDuplicate
{
    int arr[];
    int n;
    int dup[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    }
    void calculate()
    {
        for(int i=0;i<n;i++)
        {
            int z=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    ++z;
                    dup[i]=z;
                }
                else
                    dup[i]=z;
            }
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                {
                    if(dup[i]>1&&dup[j]>1)
                    {
                        if(arr[i]!=arr[j])
                            System.out.println("Duplicate element="+arr[i]);
                    }
                }
        }
    }
    public static void main(String args[])
    {
        FindDuplicate obj=new FindDuplicate();
        obj.input();
        obj.calculate();
        obj.display();
    }
}