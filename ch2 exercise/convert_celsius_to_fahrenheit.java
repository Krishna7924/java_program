import java.util.Scanner;

public class convert_celsius_to_fahrenheit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float celsius,result;
        System.out.println("enter the celsius");
        celsius = sc.nextFloat();
        result = (celsius*9.f/5.0f)+32;

        System.out.println("convert celsius to fahrenheit " + result);
        sc.close();
    }
}