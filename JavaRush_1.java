public class JavaRush_1 {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for(int row = 0; row < MULTIPLICATION_TABLE.length; row++) {
            for(int col = 0; col < MULTIPLICATION_TABLE.length; col++) {
                MULTIPLICATION_TABLE[row][col]=(row+1) * (col+1);
            }
        }
        for(int row = 0; row < MULTIPLICATION_TABLE.length; row++) {
            for(int col = 0; col < MULTIPLICATION_TABLE.length; col++) {
                System.out.print(MULTIPLICATION_TABLE[row][col]+" ");
            }
            System.out.println(" ");
        }
    }
}
