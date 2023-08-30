import java.util.Scanner;

public class Q_2 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arry1[][]=new int[3][3],arry2[][]=new int[3][3],arry3[][]=new int[3][3];
        System.out.print("enter the arry1:\n");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arry1[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the arry2:\n");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arry2[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n");
        System.out.print("arry3=\n");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arry3[i][j]=arry1[i][j]+arry2[i][j];
            
                System.out.print(""+arry3[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}