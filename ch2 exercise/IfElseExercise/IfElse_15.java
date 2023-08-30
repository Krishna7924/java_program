import java.util.Scanner;

public class IfElse_15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angle1,angle2,angle3,sum;
        System.out.println("enter the value of angles");
        angle1 = sc.nextInt();
        angle2 = sc.nextInt();
        angle3 = sc.nextInt();
        sum=angle1+angle2+angle3;
        if (sum==180)
        {
            System.out.println("the triangle is valid");
        }
        else
        {
            System.out.println("the triangle is not valid");
        }
        sc.close();
    }
}