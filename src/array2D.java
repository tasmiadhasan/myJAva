import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        System.out.print("Enter Row and Column:");
        for (int row = 0; row < 2; row++)
        {
            for(int col=0;col<3;col++)
            {
                A[row][col]=sc.nextInt();
            }

        }
       for(int row=0;row<2;row++){
           for(int col=0;col<3;col++){
               System.out.print(" "+A[row][col]);
           }
           System.out.println();
       }
    }
}
