import java.util.Scanner;

public class IfElse_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num = sc.nextInt();
        if (num>0) {
            System.out.println(num + " is a positive number");
        }
        else if(num<0)
        {
            System.out.println(num + " is a negative number");
        }
        else
        {
            System.out.println(num + " is a zero");
        }
        sc.close();
    }
}