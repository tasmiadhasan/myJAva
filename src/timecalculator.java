import java.util.Scanner;

public class timecalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a time in second:");
        int a= sc.nextInt();
        int h=a/60;
        int s=a%60;
        int m=h%60;
        h=h/60;
        System.out.println(h+" : "+m+" : "+s);
    }
}
