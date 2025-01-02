public class JavaRush_14 {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    long t = 109 + 15;
    int x = (int) (a * 2);
    short y = (short) (a / b);
    byte z = (byte) (a + b - c);

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        //напишите тут ваш код
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = (long) value;
    }
}