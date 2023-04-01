import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fibonacci series limit:");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int fibo;
        System.out.print(first+" "+second);
        for(int i=3;i<=n;i++)
        {
            fibo=first+second;
            first=second;
            second=fibo;
            System.out.print(" "+fibo+" ");
        }
    }
}
