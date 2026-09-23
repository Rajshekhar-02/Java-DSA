import java.util.*;
class LinearSearch
{
    int arr[];
    int n;
    int search;
    int flag=0;
    int ii=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to be searched");
        search=sc.nextInt();
}
void calculate()
{
    flag=0;
    for(;ii<n;ii++)
    {
        if(arr[ii]==search)
        {
            flag=1;
            break;
        }
    }
}
void display()
{
    if(flag==1)
        System.out.println("Element found at index "+ii);
    else
        System.out.println("Element not found");
}
public static void main(String args[])
{
    LinearSearch obj=new LinearSearch();
    obj.input();
    obj.calculate();
    obj.display();
}
}