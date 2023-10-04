import java.util.Scanner;

public class IfElse_8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("enter the three number");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num1>num2 && num1>num3)
        {
            System.out.println(num1 + " is the greatest among there");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2 + " is the greatest among there");
        }
        else if (num3>num1 && num3>num2)
        {
            System.out.println(num3 + " is the gratest among there");
        }
        sc.close();
    }
}