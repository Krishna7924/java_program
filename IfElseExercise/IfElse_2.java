import java.util.*;
public class IfElse_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num =sc.nextInt();
        if (num%2==0) {
            System.out.println( num + " is an even integer");
        }
        else
        {
            System.out.println(num + " is an odd integer");
        }
        sc.close();
    }
}