
import java.util.*;
class Armstrong
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }

        System.out.println(sum);

        if(sum==m)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}