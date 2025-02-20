import clock.BRClock;
import clock.Clock;
import clock.USClock;

public class Main {
    public static void main(String[] args) {
        Clock clock = new BRClock();
        clock.setSecond(0);
        clock.setMinute(0);
        clock.setHour(13);

        System.out.println(clock.getTime());
        System.out.println(new USClock().convert(clock).getTime());
    }
}