import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
            sum=sum*i;
        }
        System.out.print("Your sum is:"+sum);

    }
}
