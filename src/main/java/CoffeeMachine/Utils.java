package CoffeeMachine;

import java.util.concurrent.TimeUnit;

public class Utils {
    public static void timer (int time) {
        System.out.println("☆ﾟ･Кофе готовится･ﾟ☆\n");
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
