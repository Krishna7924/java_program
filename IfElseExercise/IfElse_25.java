import java.util.Scanner;

public class IfElse_25 {

    public static void main(String[] args) {
        
        System.out.println("1.find area of triangle");
        System.out.println("2.find area of square");
        System.out.println("3.find area of circle");
        System.out.println("4.find area of cylinder");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur choice:");
        int choice=sc.nextInt();

        if (choice==1) 
        {
            double b,h,result;
            System.out.println("Enter base :");
            b=sc.nextDouble();
            System.out.println("Enter height :");
            h=sc.nextDouble();
            result=(1.0/2.0)*b*h;
            System.out.println("Area of triange is "+result);
        }
        else if(choice==2)
        {
            int side;
            System.out.println("enter side");
            side=sc.nextInt();
            System.out.println("Area of square :"+side*side);
        }
        else if(choice==3)
        {
            int radius;
            float pi=3.14f;
            System.out.println("enter the radius");
            radius=sc.nextInt();
            System.out.println("area of circle: " +pi*radius);
        }
        else if(choice==4)
        {
            int radius,height;
            System.out.println("enter the radius and height");
            radius=sc.nextInt();
            height=sc.nextInt(); 
            System.out.println("area of cylinder: " +((2*radius*radius)+(2*radius*height)));
        }
        else 
        {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}