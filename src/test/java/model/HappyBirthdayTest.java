package model;

import com.masglobalconsulting.model.TimeHappyBirthday;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyBirthdayTest {
    @Test
    void canCalculateTimePastBirthday(){
        TimeHappyBirthday timeHappyBirthday = new TimeHappyBirthday();
        Assertions.assertNotNull(timeHappyBirthday);
        Assertions.assertTrue(timeHappyBirthday.timePastBirthday(2023, 1, 13));

        Assertions.assertNotNull(timeHappyBirthday);
        Assertions.assertTrue(timeHappyBirthday.timeLeftBrithday(2023, 8, 15));
    }

}
