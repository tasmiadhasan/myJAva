import java.util.Scanner;
public class array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double[]number=new double[5];
        double sum=0;
        System.out.println("Enter five number:");
         for(int i=0;i<number.length;i++)
         {
             number[i]=sc.nextDouble();
         }
        for(int i=0;i< number.length;i++)
        {
            sum=sum+number[i];
        }
        System.out.println(sum);
    }
}
