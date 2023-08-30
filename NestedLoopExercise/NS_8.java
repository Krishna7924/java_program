// package NestedLoopExercise;

public class NS_8 {

    public static void main(String[] args) {
        for (char i = 0; i < 5; i++) {
            for (char j = 65; j <= 65+i; j++) {
                System.out.print("" +j);
            }
            System.out.println();
        }
    }
}