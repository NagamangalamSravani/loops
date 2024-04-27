import java.util.*;
class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        //System.out.println(rev);
        if(rev==m)
        {
System.out.println("palindrome");
        }
        else
        {
System.out.print("not prime");
        }
    }
}
