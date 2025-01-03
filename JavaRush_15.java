import java.util.Arrays;

public class JavaRush_15 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        //write your code here
        for(int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}