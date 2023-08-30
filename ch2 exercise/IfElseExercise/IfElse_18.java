import java.util.Scanner;

public class IfElse_18 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cp,sp, cal; 

        System.out.println("Input Cost Price: ");  
        cp = sc.nextInt();
        System.out.println("Input Selling Price: ");  
        sp = sc.nextInt();
        
        if(sp>cp) 
        {  
            cal = sp-cp;  
            System.out.println("\nYou can booked your profit amount : " + cal);  
        }  
        else if(cp>sp) 
        {  
            cal = cp-sp;  
            System.out.println("\nYou got a loss of amount : " + cal);  
        }  
        else  
        {  
            System.out.println("\nna profir hua na loss hua.");  
        }  
        sc.close();
    }
}