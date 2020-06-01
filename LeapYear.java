public class LeapYear {

    public static boolean isLeapYear(String year) {
        boolean leapYr = false;// default value
        int yearInt = Integer.parseInt(year);// converts from String to Integer
        // Checks the length to make sure only 4 "digits" were entered
        if (year.length() > 4) {
            throw new RuntimeException("Year can not be longer than 4 digits!");
        } else {
            // Checks to see if yearInt is divisible by 4. By running method isDivisbileBy4
            // if so it returns true
            if (isDivisibleBy4(yearInt) && !isDivisibleBy100(yearInt)) {
                leapYr = true;
            } // checks that yearInt is both divisbile by 100 and 400 in order for it be a
              // leap year
              // uses correspoding methods to chek divisibilty
              // if so returns true
            else if (isDivisibleBy100(yearInt) && isDivisibleBy400(yearInt)) {
                leapYr = true;
            } // if neither the year is divisible by 4 or divisbile by both 100 & 400 then it
              // is not a leap year
              // so it is false
            else {
                leapYr = false;
            }
        }
        return leapYr;
    }

    // checks to see if parameter yearInt is divisble by 4
    private static boolean isDivisibleBy4(int yearInt) {
        return yearInt % 4 == 0;
    }

    // checks to see if parameter yearInt is divisble by 100
    private static boolean isDivisibleBy100(int yearInt) {
        return yearInt % 100 == 0;
    }

    // checks to see if parameter yearInt is divisble by 400
    private static boolean isDivisibleBy400(int yearInt) {
        return yearInt % 400 == 0;
    }
}