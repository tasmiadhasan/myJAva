import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int x;
        System.out.print("Enter the number:");
        Scanner input = new Scanner(System.in);
        x= input.nextInt();
        int sum= x+4;
        System.out.println("Your sum is :"+sum);


    }
}