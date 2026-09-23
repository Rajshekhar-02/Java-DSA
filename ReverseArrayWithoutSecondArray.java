import java.util.*;
class ReverseArrayWithoutSecondArray
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
        int end=n-1;
        for(int i=0;i<n/2;i++)
        {
            int x=arr[i];
            arr[i]=arr[end];
            arr[end]=x;
            end--;
        }
    }
    void display()
    {
        System.out.println("Reversed Array=");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
}
public static void main(String[] args) {
    ReverseArrayWithoutSecondArray obj=new ReverseArrayWithoutSecondArray();
    obj.input();
    obj.calculate();
    obj.display();
}
}