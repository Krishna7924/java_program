import java.util.Scanner;

/**
 * IfElse_17
 */
public class IfElse_17 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
    
        if (ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'||ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'  )
        {
            System.out.println("the alphabet is vowels");
        }
        else
        {
            System.out.println("the alphabet is Consonant ");
        }
        sc.close();
    }
}