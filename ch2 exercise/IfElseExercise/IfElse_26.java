import java.util.Scanner;

public class IfElse_26 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,sub,add,mul;
        System.out.println("enter the 2 values:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        add=num1+num2;
        System.out.println("adding = " + add);
        if (num1>num2)
        {
            sub=num1-num2;
            System.out.println("subtraction = " + sub);
        }
        else if (num2>num1)
        {
            sub=num2-num1;
            System.out.println("subtraction = " + sub);
        }
        mul=num1*num2;
        System.out.println("multiplication = " + mul);
        sc.close();
    }
}