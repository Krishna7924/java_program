import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,mul;
        System.out.println("enter the no. :");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            mul=num*i;
            System.out.println("" +num+ "x " +i+ "= " +mul);
        }
        sc.close();
    }
}