import java.util.Scanner;

public class Question_7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 8; j++)
            {
                num=i*j;
                System.out.println("" +j+ " x "+i+ "= " +num);
            }
            System.out.println();
        }
        sc.close();
    }
}