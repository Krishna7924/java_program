import java.util.Scanner;

public class IfElse_16 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        char num = sc.next().charAt(0);
        if ((num>=65 && num<=90) || (num>=97 && num<=122))
        {
            System.out.println("this is a alphabet character");
        }
        else if (num>=48 && num<=57)
        {
            System.out.println("this is a digit character");
        }
        else if ((num>=32 && num<=47) || (num>=58 && num<=64) || (num>=91 && num<=96) || (num>=123 && num<=126))
        {
            System.out.println("this is a special character");
        }
        sc.close();
    }
}