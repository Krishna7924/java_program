import java.util.Scanner;

public class IfElse_20 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" enter the day number :");
        char grade = sc.next().charAt(0);
        
        if (grade=='E')
        {
            System.out.println("excellent");
        }
        else if (grade=='V')
        {
            System.out.println("Very Good");
        }
        else if (grade=='G')
        {
            System.out.println("good");
        }
        else if (grade=='A')
        {
            System.out.println("average");
        }
        else if (grade=='f')
        {
            System.out.println("fail");
        }
        sc.close();
    }
}