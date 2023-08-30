import java.util.Scanner;

public class convert_fahrenheit_to_celsius {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float fahrenheit,result;
        System.out.println("enter the fahrenheit");
        fahrenheit = sc.nextFloat();

        result=(fahrenheit - 32) * 5.0f/9.0f;
        System.out.println("fahrenheit to celsius" + result);
        sc.close();
    }
}