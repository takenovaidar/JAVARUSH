import java.util.Arrays;

/*
methods of Arrays
*/

public class JavaRush_4 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //write you code here
        //binarySearch method
        boolean found = Arrays.stream(array).anyMatch(e -> e == element);
        if(found) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //sort method
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
