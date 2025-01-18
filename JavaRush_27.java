/*
Counter
*/
public class JavaRush_27 {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 2) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 3) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 4) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 5) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 6) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 7) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 8) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 9) {
                System.out.println(i);
                Thread.sleep(1, 300_000);
            } if (i == 10) {
                System.out.println(i);
            }
        }
    }
}