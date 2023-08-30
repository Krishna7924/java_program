import java.util.Scanner;

public class useradd {

    public static void main(String[] args) {
        int num1,num2,result;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num1");
        num1=sc.nextInt();
        System.out.println("enter the value of num1");
        num2=sc.nextInt();
        result=num1+num2;
        System.out.println("the result is " +result);
        sc.close();
    }
}
