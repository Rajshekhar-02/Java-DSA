import java.util.*;
public class StudentGradeCalculator
{
    String names[];
    int marks[][];
    int total[];
    float average[];
    char grade[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        names=new String[n];
        marks=new int[n][3];
        total=new int[n];
        average=new float[n];
        grade=new char[n];
        for(int i=0;i<n;i++)
        {
            if(i==0)
            System.out.print("Enter name of "+(i+1)+"st student: ");
            else if(i==1)
                System.out.print("Enter name of "+(i+1)+"nd student: ");
            else if(i==2)
                System.out.print("Enter name of "+(i+1)+"rd student: ");
            else
                System.out.print("Enter name of "+(i+1)+"th student: ");
            names[i]=sc.next();
            System.out.println("Enter marks of 3 subjects");
            for(int j=0;j<3;j++)
            {
                System.out.print((j+1)+": ");
                marks[i][j]=sc.nextInt();
            }
        }
    }
    void calculate()
    {
        for(int i=0;i<names.length;i++)
        {
            total[i]=marks[i][0]+marks[i][1]+marks[i][2];
            average[i]=total[i]/3.0f;
            if(average[i]>=90)
                grade[i]='A';
            else if(average[i]>=80)
                grade[i]='B';
            else if(average[i]>=70)
                grade[i]='C';
            else if(average[i]>=60)
                grade[i]='D';
            else
                grade[i]='F';
        }
    }

    void display()
    {
        for(int i=0;i<names.length;i++)
        {
            System.out.println("Name: " + names[i]);
            System.out.println("Total Marks: " + total[i]);
            System.out.println("Average Marks: " + average[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        StudentGradeCalculator obj=new StudentGradeCalculator();
        obj.input();
        obj.calculate();
        obj.display();
    }
}