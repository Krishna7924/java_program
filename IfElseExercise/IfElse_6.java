import java.util.Scanner;

public class IfElse_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num = sc.nextInt();
        if (num>0) {
            System.out.println("the value of n=1");
        }
        else if (num==0) {
            System.out.println("the value of n=0");
        }
        else if (num<0) {
            System.out.println("the value of n=-1");
        }
        sc.close();
    }
}