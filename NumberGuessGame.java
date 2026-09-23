import java.util.*;
class NumberGuessGame
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    double randompickednumber=Math.random()*100.0+1.0;
    int randomnumber=(int)(randompickednumber);
    System.out.println("Enter any number between 1 to 100");
    int counter=0;
    while(true)
    {
        int usernumber=sc.nextInt();
        if(usernumber>0&&usernumber<100)
        {
        if(usernumber>randomnumber)
        {
            System.out.println("Enter smaller number");
            counter++;
            continue;
        }
        else if(usernumber<randomnumber)
        {
            System.out.println("Enter larger number");
            counter++;
            continue;
        }
        else if(usernumber==randomnumber)
        {
            counter++;
            System.out.println("YOU WON");
            System.out.println("TOTAL ATTEMPT="+counter);
            break;
        }
    }
    else
        System.out.println("Enter valid number");
    }

    }
}