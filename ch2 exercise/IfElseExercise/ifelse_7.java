import java.util.Scanner;

public class ifelse_7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num = sc.nextInt();
        if (num>160)    
        {
            System.out.println("the person height is long");
        }
        else if (num<160 && num>130)
        {
            System.out.println("the person height is medium");
        }
        else if (num<130)
        {
            System.out.println("the person height is small");
        }
        sc.close();

    }
}