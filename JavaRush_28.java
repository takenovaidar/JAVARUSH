import java.util.concurrent.TimeUnit;

/*
Таймер
*/

public class JavaRush_28 {
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        //напишите тут ваш код
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.MILLISECONDS.sleep(millis);
    }
}
