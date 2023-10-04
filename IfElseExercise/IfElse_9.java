import java.util.Scanner;

public class IfElse_9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y; 
        System.out.println("enter the value of x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        if (x>0 && y>0)
        {
            System.out.println("The coordinate point lies " +x+","+y+ " in the First quadrant");
        }
        else if (x<0 && y>0)
        {
            System.out.println("The coordinate point lies " +x+","+y+ " in the second quadrant");
        }
        else if (x<0 && y<0)
        {
            System.out.println("The coordinate point lies " +x+","+y+ " in the third quadrant");
        }
        else if (x>0 && y<0)
        {
            System.out.println("The coordinate point lies " +x+","+y+ " in the fourth quadrant");
        }
        sc.close();
    }
}  