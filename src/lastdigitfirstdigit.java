import java.util.Scanner;

public class lastdigitfirstdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        int last=a%10;
        System.out.println("The last digit is:"+last);
        while(a>=10){
            a/=10;
        }
        int first=a;
        System.out.println("The first digit is:"+a);
    }
}
