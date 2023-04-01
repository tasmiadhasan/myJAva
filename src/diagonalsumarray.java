import java.util.Scanner;

public class diagonalsumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]num=new int[3][3];
        int sumdia=0;
        int sumup=0;
        int sumlw=0;
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                System.out.printf("num[%d][%d]=",row,col);
                num[row][col]=sc.nextInt();
            }
        }
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row==col){
                    sumdia=sumdia+num[row][col];
                }
            }

        }
        System.out.println(sumdia);
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row<col){
                    sumup=sumup+num[row][col];
                }
            }

        }
        System.out.println(sumup);
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row>col){
                    sumlw=sumlw+num[row][col];
                }
            }

        }
        System.out.println(sumlw);




    }
}
