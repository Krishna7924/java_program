// package NestedLoopExercise;

public class NS_13 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5-i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}