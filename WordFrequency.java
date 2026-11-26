import java.util.*;
class WordFrequency{
    String str;
    String temp;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        str=sc.nextLine();
    }
    void frequency()
    {
        int c=0;
        for(char ch='a',chh='A';ch<='z'&&chh<='Z';ch++,chh++)
        {
            for(int i=0;i<str.length();i++)
            {
                char a=str.charAt(i);
                if(a==ch||a==chh)
                {
                    c++;
                }
            }
                if(c>0)
                {
                    System.out.println(ch+" "+c);
                }
            c=0;
    }
}
public static void main(String args[])
{
    WordFrequency obj=new WordFrequency();
    obj.input();
    obj.frequency();
}
}