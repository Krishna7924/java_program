import java.util.Scanner;

public class Q_1 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int [][]arry =new int[3][3];
        System.out.println("enter the value: ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arry[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(""+arry[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}