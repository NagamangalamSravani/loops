import java.util.*;
class Tailing
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        String str=" ";
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
        char c;
        for(int i=0;i<=str.length()-1;i++)
        {
            c=str.charAt(i);
            switch(c)
            {
                case '0' : System.out.println("zero");
                            break;
                case '1' : System.out.println("one");
                            break;
                case '2' : System.out.println("two");
                            break;

            }
        }
    }
}
