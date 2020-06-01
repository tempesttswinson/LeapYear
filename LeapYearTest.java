import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test(expected = RuntimeException.class)

    public void whenMoreThanFourNumbersAreUsedThenAnExceptionIsThrown() {
        LeapYear.isLeapYear("12345");
    }

    @Test
    public void yearShouldBeDivisbleByFourIfNotExceptionIsThrown() {
        Assert.assertEquals(true, LeapYear.isLeapYear("1996"));
        Assert.assertEquals(false, LeapYear.isLeapYear("2001"));

    }
}