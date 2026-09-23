import java.util.*;
public class EmployeeSalaryCalculator
{
    String names[];
    int salaries[];
    int HRA[];
    int DA[];
    int GrossSalary[];
    String Searchemployee;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        names=new String[n];
        salaries=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter name "+(i+1)+": ");
            names[i]=sc.next();
            System.out.print("Enter basic salary "+(i+1)+": ");
            salaries[i]=sc.nextInt();
        }
    }
    void calculate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Employee: ");
        Searchemployee=sc.next();
        for(int i=0;i<names.length;i++)
        {
            String name=names[i];
            if(name.equals(Searchemployee))
            {
                HRA[i]=(salaries[i]*10)/100;
                DA[i]=(salaries[i]*5)/100;
                GrossSalary[i]=salaries[i]+HRA[i]+DA[i];
                System.out.println("Gross Salary of "+Searchemployee+" is: "+GrossSalary[i]);
            }

        }
    }
        void display()
        {
            System.out.println("Basic Salary: "+salaries[0]);
            System.out.println("HRA: "+HRA[0]);
            System.out.println("DA: "+DA[0]);
            System.out.println("Gross Salary: "+GrossSalary[0]);
        }
    }
    public static void main(String args[])
    {
        EmployeeSalaryCalculator esc=new EmployeeSalaryCalculator();
        esc.input();
        esc.calculate();
        esc.display();
    }
}