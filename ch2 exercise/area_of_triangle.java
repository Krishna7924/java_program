import java.util.Scanner;

public class area_of_triangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float base,height,result;

        System.out.println("enter the base and height");
        base = sc.nextFloat();
        height =sc.nextFloat();

        result=1.0f/2.0f*base*height;
        System.err.println("area of triangle " + result);
        sc.close();

    }
}