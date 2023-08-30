import java.util.Scanner;

public class convert_miles_to_kilometer {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float miles,result;
        System.out.println("enter the miles");
        miles =sc.nextFloat();
        result = 1.609f*miles;
        System.out.println("miles to kilometer " + result);
        sc.close();
    }
}