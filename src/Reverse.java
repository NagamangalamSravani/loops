import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n =sc.nextInt();
        int rev=0;
        while(n>0)
        {
          int r=n%10;
          rev=rev*10+r;
          n=n/10;
        }
       System.out.println("reverse" + rev);
    }
}
