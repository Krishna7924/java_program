import java.util.Scanner;

public class volume_of_cylinder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi=3.14f,radius,height,result;
        System.out.println("enter the radius and height");
        radius = sc.nextFloat();
        height = sc.nextFloat();

        result = pi*radius*radius*height;
        System.out.println("volume of cylinder " + result);
        sc.close();
    }
}