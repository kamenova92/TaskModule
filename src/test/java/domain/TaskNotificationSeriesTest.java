package domain;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static domain.enums.CalendarRepeatUnit.DAYS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)
public class TaskNotificationSeriesTest {

    @InjectMocks TaskNotificationSeries testee;

    @Test
    public void test_notificationSeries_shouldReturn() {
        testee.setIntervalUnit(DAYS);
        assertEquals(testee.getIntervalUnit(), DAYS);
    }

    @Test
    public void test_setAllDay_shouldReturn_true(){
        testee.setAllDay(true);
        assertTrue(testee.isAllDay());
    }

}
