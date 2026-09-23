import java.util.*;
class SimpleCalculator
{
    double sum;
    double calculate(double x,char y)
{
    if(y=='+')
        return sum+x;
    if(y=='-')
        return sum-x;
    if(y=='*')
        return sum*x;
    if(y=='/')
        return sum/x;
    else{
        System.out.println("Invalid operator");
    return sum;}
}
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("For result enter =");
        System.out.println("Enter number");
        double n=sc.nextDouble();
        sum=n;
        while(true)
        {
            System.out.println("Enter operator");
            char ch=sc.next().charAt(0);
            if(ch=='='){
                System.out.println("Result="+sum);
            break;}
            else
            {
            System.out.println("Enter number");
            double x=sc.nextDouble();
            double z=calculate(x,ch);
            sum=z;
            }
    }

    }
    public static void main(String ar[])
    {
        SimpleCalculator obj=new SimpleCalculator();
        obj.input();
    }
}