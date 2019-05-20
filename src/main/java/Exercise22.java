public class Exercise22 {
    public int numberDaysOfYearRemaining(String input) {
        int remainDays = 0;
        if (DateUtils.isDate(input) == false) {
            throw new RuntimeException("Invalid date");
        }
        int day = DateUtils.getDay(input);
        int month = DateUtils.getMonth(input);
        int year = DateUtils.getYear(input);
        int dayInYear = 0;
        for (int i = 1; i < month; i++) {
            dayInYear += DateUtils.getDayInMonth(i, year);
        }
        remainDays = DateUtils.getDayInYear(year) - dayInYear - day;
        return remainDays;
    }
}
