public class Exercise21 {
    public int numberOfDaysRemainIMonth(String input) {
        int remainDays = 0;
        if (DateUtils.isDate(input) == false) {
            throw new RuntimeException("Invalid date");
        } else {
            int day = DateUtils.getDay(input);
            int month = DateUtils.getMonth(input);
            int year = DateUtils.getYear(input);
            int daysOfMonth = DateUtils.getDayInMonth(month, year);
            remainDays = daysOfMonth - day;
        }
        return remainDays;
    }
}
