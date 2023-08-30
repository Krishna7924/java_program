import java.util.Scanner;

public class Q_4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,column;
        System.out.print("enter the row: ");
        row=sc.nextInt();
        System.out.print("enter the column: ");
        column=sc.nextInt();
        int arry[][]=new int[row][column],count=0;
        System.out.print("enter the value:\n");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arry[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if (arry[i][j]%2==0)
                {
                    count++;
                }
            }
        }
        System.out.print("even elements are in arry: "+count);
        sc.close();
    }
}