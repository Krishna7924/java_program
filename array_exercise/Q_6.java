// package array_exercise;

import java.util.Scanner;

public class Q_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the size of the arry: ");
        n=sc.nextInt();
        int arry1[]=new int[n];
        int arry2[]=new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("arry1["+i+"]= ");
            arry1[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print("arry2["+i+"]= ");
            arry2[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            if (arry1[i]==arry2[i])
            {
                System.out.print("common elemnts are "+arry1[i]);
            }
        }
        sc.close();
    }
}