package domain;

import domain.enums.AssigneeType;
import domain.enums.CalendarRepeatUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


import static domain.enums.AssigneeType.DEPARTMENT;
import static domain.enums.CalendarRepeatUnit.MONTHS;
import static java.time.LocalDateTime.now;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TaskAssigneeTest {

    @InjectMocks TaskAssignee testee;

    private CalendarRepeatUnit calendarRepeatUnit  = MONTHS;
    private TaskNotificationSeries taskNotificationSeries = new TaskNotificationSeries("Id", now(), now().plusDays(1), now().plusMonths(1), calendarRepeatUnit, "Test Tittle");

    @Test
    public void test_setAssigneeType_shouldReturn_Department() {
        AssigneeType department = DEPARTMENT;
        testee.setAssigneeType(department);

        assertTrue(testee.getAssigneeType().equals(DEPARTMENT));
    }

    @Test
    public void test_setNotificationSeries_shouldReturn_endDateTime_isBefore_Now_plus1day() {
        testee.setTaskNotificationSeries(taskNotificationSeries);

        assertTrue(testee.getTaskNotificationSeries().endDateTime.isBefore(now().plusDays(1)));
    }

    @Test
    public void test_setNotificationSeries_shouldReturn_taskNotificationSeries() {
        testee.setTaskNotificationSeries(taskNotificationSeries);

        assertTrue(testee.getTaskNotificationSeries().endDateTime.isBefore(now().plusDays(1)));
    }
}
