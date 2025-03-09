public class Clock {
    int hour = 0;
    int minute = 0;

    public void minuteToHour() {
        for (; ; ) {
            minute++;
            System.out.print(minute + " ");
            if (minute >= 59) {
                minute = 0;
                hour++;
                if (hour > 23) {
                    hour = 0;
                }
                System.out.println(hour + " 小时:");
            }
        }
    }
}
