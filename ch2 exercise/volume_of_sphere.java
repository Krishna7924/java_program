import java.util.Scanner;

public class volume_of_sphere {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,pi=3.14f,result;
        System.out.println("enter the radius ");
        radius = sc.nextFloat();
        
        result=4.0f/3.0f*pi*radius*radius*radius;

        System.out.println("the volume of sphere " +result);
        sc.close();

    }
}