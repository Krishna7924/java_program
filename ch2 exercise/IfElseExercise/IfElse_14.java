import java.util.Scanner;

public class IfElse_14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1,side2,side3;
        System.out.println("enter the side1,side2,side3:\n");
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();
        if (side1==side2 && side2==side3 && side3==side1)
        {
            System.out.println("this is an equilateral triangle");
        }
        else if ((side1==side2 && side2!=side3 && side3!=side1) || (side1!=side2 && side2==side3 && side3!=side1) || (side1!=side2 && side2!=side3 && side3==side1))
        {
            System.out.println("tihs is an isoceles triangle");
        }
        else if (side1!=side2 && side2!=side3 && side3!=side1)
        {
            System.out.println("this is an scalene triangle");
        }
        sc.close();
    }
}