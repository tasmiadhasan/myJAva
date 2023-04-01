import java.util.Scanner;

public class booleaneven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a =sc.nextInt();
        boolean boleven=a%2==0;
        if(boleven){
            System.out.println(a+" is even "+boleven);}
        boolean bolnot=a%2!=0;
        if(bolnot){
            System.out.println(a+" is not even "+bolnot);}

    }
}
