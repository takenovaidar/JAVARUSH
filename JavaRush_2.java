import java.util.Scanner;

/*
Creating a two-dimensional array
*/

public class JavaRush_2 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //write your code here
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            int a = console.nextInt();
            multiArray[i] = new int[a];
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
