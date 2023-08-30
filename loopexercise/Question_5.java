import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,cube;
        System.out.println("enter the number:");
        num =sc.nextInt();
        for (int i = 1; i <= num; i++)
        {
            cube=i*i*i;
            System.out.println("Number is : " +i+ " and cube of the " +i+ " is " +cube);
        }
        sc.close();
    }
}