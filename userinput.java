import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the byte value");
        byte b=sc.nextByte();
        System.out.println("enter the short value");
        short s=sc.nextShort();
        System.out.println("enter the int value");
        int i=sc.nextInt();
        System.out.println("enter the long value");
        long l=sc.nextLong();
        System.out.println("enter the float value");
        float f=sc.nextFloat();
        System.out.println("enter the boolean value");
        boolean b2=sc.nextBoolean();
        System.out.println("enter the double value");
        double d=sc.nextDouble();

        System.out.println("byte" +b);
        System.out.println("short" +s);
        System.out.println("int" +i);
        System.out.println("long" +l);
        System.out.println("float" +f);
        System.out.println("boolean" +b2);
        System.out.println("double" +d);

    }
}