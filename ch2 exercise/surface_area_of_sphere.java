import java.util.Scanner;

public class surface_area_of_sphere {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,pi=3.14f,result;
        System.out.println("enter the radius");
        radius = sc.nextFloat();

        result = 4*pi*radius*radius;
        System.out.println("surface area of sphere " + result);
        sc.close();
    }
}