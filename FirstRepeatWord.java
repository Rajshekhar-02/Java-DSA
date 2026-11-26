import java.util.*; 
class FirstRepeatWord{
    String str;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        str=sc.nextLine();
    }
    char calculate(String s){
        char c=' ';
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c=s.charAt(i);
                    return s.charAt(i);
                }
                if(c!=' ')
                    break;
            }
        }
    return c;
    }
    void display()
    {
        char ch=calculate(str);
        if(ch>0)
        {
            System.out.println("First Repeated Character is: "+ch);
        }
        else
        {
            System.out.println("No Repeated Character");
        }
    }
    public static void main(String args[])
    {
        FirstRepeatWord obj=new FirstRepeatWord();
        obj.input();
        obj.display();
    }
}
    

