import java.util.Scanner;

public class namta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        int counter=1;
        while(counter<=10){
            System.out.println(a+"X"+counter+"="+(a*counter));
            counter++;
        }
    }
}
