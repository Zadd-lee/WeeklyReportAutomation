package comm;

import java.time.LocalDate;

public class DateOfToday {
    public int year;
    public int month;
    public int day;
    private int week;


    public DateOfToday(LocalDate date) {

        setDate(date);
        if (week != 1) {
            date = date.minusDays(week - 1);
        }
        date = date.minusWeeks(1);
        setDate(date);


    }
    private void setDate(LocalDate date) {
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        week = date.getDayOfWeek().getValue();
    }

}
