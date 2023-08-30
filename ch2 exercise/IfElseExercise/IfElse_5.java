import java.util.Scanner;

public class IfElse_5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter the age ");
        age = sc.nextInt();
        if (age>=18) {
            System.out.println("aap vote dene ke yogyye hai");
        }
        else if(age<18 && age>=0)
        {
            System.out.println("aap vote dene ke yogyye nhi hai");
        }
        sc.close();
    }
}