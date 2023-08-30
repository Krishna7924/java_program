import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("enter the row: ");
        a=sc.nextInt();
        System.out.print("enter the column: ");
        b=sc.nextInt();
        int arry[][]=new int[a][b];
        System.out.println("enter the value: ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                arry[i][j]=sc.nextInt();;
            }
        }
        System.out.println();
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(""+arry[i][j]+"\t");
            }
            System.out.println();
        }
    }
}