import java.util.Scanner;

public class surface_area_of_cylinder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,height,pi=3.14f,result;
        System.out.println("enter the radius and height");
        radius = sc.nextFloat();
        height = sc.nextFloat();

        result = (2*pi*radius*radius)+ (2*pi*radius*height);
        System.out.println("surface area of cylinder " + result);
        sc.close();
    }
}