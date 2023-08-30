import java.util.Scanner;

public class surface_of_cube {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,result;
        System.out.println("enter the radius");
        radius = sc.nextFloat();

        result = 6*radius*radius;
        
        System.out.println("surface of cube " + result);
        sc.close();
    }
}