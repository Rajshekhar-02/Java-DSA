import java.util.*;
public class StudentSearchSystem
{
    String names[];
    int marks[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        names=new String[n];
        marks=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter name of student "+(i+1)+": ");
            names[i]=sc.next();
            System.out.print("Enter marks of student "+(i+1)+": ");
            marks[i]=sc.nextInt();
        }
    }
    void search()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of student to search: ");
        String name=sc.next();
        boolean found=false;
        for(int i=0;i<names.length;i++)
        {
            if(names[i].equals(name))
            {
                System.out.println("Student found.");
                System.out.println("Name: "+names[i]);
                System.out.println("Marks of "+name+": "+marks[i]);
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("Student not found.");
    }
    public static void main(String args[])
    {
        StudentSearchSystem sss=new StudentSearchSystem();
        sss.input();
        sss.search();
    }
}