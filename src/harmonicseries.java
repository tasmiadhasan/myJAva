import java.util.Scanner;

public class harmonicseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last number:");
        double a=sc.nextInt();
        double sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+(1.0/i);
        }
        System.out.printf("The total sum is:%.2f",sum);
    }
}
