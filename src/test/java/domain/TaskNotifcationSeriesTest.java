package domain;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static domain.enums.CalendarRepeatUnit.DAYS;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class TaskNotifcationSeriesTest {

    @InjectMocks TaskNotificationSeries testee;

    @Test
    public void test_notificationSeries_shouldReturn() {
        testee.setIntervalUnit(DAYS);
        assertEquals(testee.getIntervalUnit(), DAYS);
    }

}
