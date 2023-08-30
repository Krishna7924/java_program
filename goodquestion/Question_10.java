import java.util.Scanner;

public class Question_10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,result,evensum=0,oddsum=0,count=0,originalnum1;
        System.out.println("enter the number:\n");
        num = sc.nextInt();
        originalnum1=num;
        while (num >0)
        {
            count++;
            num/=10;
        }
        System.out.println("digit len: " +count);
        
        while (originalnum1 > 0)
        {
            result=originalnum1%10;
            if (result %2==0)
            {
                evensum+=result;
            }
            else
            {
                oddsum+=result;
            }
            originalnum1/=10;  
        }
        System.out.println("sum even: " +evensum);
        System.out.println("sum odd: " +oddsum);

        System.out.println("fibonnaci aeries are : " +oddsum+  "" +evensum);

        int term1,term2,term3=0;
        term1=evensum;
        term2=oddsum;
        
        for (int i = 0; i < count-2; i++)
        {
            term3=term1+term2;
            System.out.println("" +term3);
            term1=term2;
            term2=term3;
        }
        sc.close();
    }
}