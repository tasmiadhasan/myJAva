import java.util.Scanner;

public class booleanpractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        System.out.print("Enter another number:");
        int b=sc.nextInt();
        boolean greaterthana =a>b;

        if(greaterthana){
            System.out.println(a +" is greater than "+b);
            System.out.println("First one is greater "+greaterthana);
        }
        boolean greaterthanb=a<b;
        if(greaterthanb)
        {
            System.out.println(b+" is greater than "+a);
            System.out.println("second one is greater "+greaterthanb);
        }
    }
}
