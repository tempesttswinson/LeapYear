public class LeapYear {

    public static boolean isLeapYear(String year) {
        boolean leapYr = false;
        int yearInt = Integer.parseInt(year);
        if (year.length() > 4) {
            throw new RuntimeException("Year can not be longer than 4 digits!");
        } else {
            if (yearInt % 4 == 0) {
                leapYr = true;
            }
        }
        return leapYr;
    }
}