import java.util.Scanner;

/**
 * Q_6
 */
public class Q_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arry[][]=new int[3][3],count=0;
        System.out.println("enter the value:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arry[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (arry[i][j]!=0)
                {
                    count++;
                }
                
            }
        }
        System.out.print("non zero elements are in arry: "+count);
        sc.close();
    }
}