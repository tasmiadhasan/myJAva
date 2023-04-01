import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 0 to 1000:");
        int num=sc.nextInt();
        int first=num%10;
        int remaining=num/10;
        int second=remaining%10;
        remaining=remaining/10;
        int third=remaining%10;
        remaining=remaining/10;
        int fourth=remaining%10;
        int sum= first+second+third+fourth;
        System.out.println("Sum of all digits is:"+sum);

    }
}