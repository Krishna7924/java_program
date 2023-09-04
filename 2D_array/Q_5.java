import java.util.Scanner;

/**
 * Q_5
 */
public class Q_5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,column;
        System.out.print("enter the row: ");
        row=sc.nextInt();
        System.out.print("enter the column: ");
        column=sc.nextInt();
        int arry1[][]=new int[row][column];
        int arry2[][]=new int[row][column];
        int arry3[][]=new int[row][column];
        System.out.println("enter the arry1:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arry1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the arry2:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arry2[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("arry3=");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arry3[i][j]=arry1[i][j]-arry2[i][j];
            
                System.out.print(""+arry3[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}