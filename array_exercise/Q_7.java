// package array_exercise;

import java.util.Scanner;

public class Q_7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 0, i = 0, largest1 = 0, largest2 = 0, temp = 0;
 
        System.out.print ("Enter the size of the array: ");
        n=sc.nextInt();
        int array[]=new int[n];
        
        for (i = 0; i < n; i++)
        {
            System.out.print ("arry["+i+"]= ");
            array[i]=sc.nextInt();
        }
    
        System.out.println();
    
        largest1 = array[0];
        largest2 = array[1];
    
        if (largest1 < largest2)
        {
            temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }
    
        for (int j = 2; j < n; j++)
        {
            if (array[j] > largest1)
            {
                largest2 = largest1;
                largest1 = array[j];
            }
            else if (array[j] > largest2 && array[j] != largest1)
            {
                largest2 = array[j];
            }
        }
    
        System.out.println("The FIRST LARGEST = "+largest1);
        System.out.print("THE SECOND LARGEST = "+largest2);
    
    }
}