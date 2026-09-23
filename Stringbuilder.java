class Stringbuilder
{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Sunday");
        int x=sb.length()-1;
        for(int i=0;i<sb.length()/2;i++)
        {
            char First=sb.charAt(i);
            char Last=sb.charAt(x);
            sb.setCharAt(i,Last);
            sb.setCharAt(x,First);
            x--;
            

        }
        System.out.print(sb);
    }
}