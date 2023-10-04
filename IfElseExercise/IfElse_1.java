import java.util.Scanner;

public class IfElse_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the value of num1");
        num1 = sc.nextInt();
        System.out.println("enter the value of num2");
        num2 = sc.nextInt();      
        if (num1==num2) {
            System.out.println("num1 and num2 are equal");
        }
        else{
            System.out.println("num1 and num2 are not equal");
        }
        sc.close();

    }
}