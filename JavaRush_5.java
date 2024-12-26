import java.util.Arrays;

/*
methods of Arrays
*/

public class JavaRush_5 {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //Write your code here
        //Arrays.copyOfRange() method
        int mid = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        result [0] = Arrays.copyOfRange(array, 0, mid);
        result [1] = Arrays.copyOfRange(array, mid, array.length);
        System.out.println(Arrays.deepToString(result));

        //Arrays.fill() method
        int mid2 = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, mid2, valueStart);
        Arrays.fill(array, mid2, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}

