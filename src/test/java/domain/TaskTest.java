package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static domain.enums.AssigneeType.RESIDENT;
import static domain.enums.CalendarRepeatUnit.DAYS;
import static java.time.LocalDateTime.now;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)
class TaskTest {


    private TaskNotificationSeries notificationSeries = new TaskNotificationSeries("id", now(), now().plusDays(1), now().plusMonths(1), DAYS, "Test");
    private TaskAssignee taskAssignee = new TaskAssignee("123", "Test Name", "2678348", RESIDENT, notificationSeries);

    @InjectMocks private Task testee = new Task("ID", "Test", now(), now().plusDays(1), notificationSeries, singletonList(taskAssignee));

    @Test
    public void test_setTittle_shouldReturn_newNewTittle() {
        testee.setTittle("New Title");

        assertTrue(testee.getTittle().equals("New Title"));
    }

    @Test
    public void test_setDescription_shouldReturn_newDescription() {
        testee.setDescription("New Description");

        assertTrue(testee.getDescription().equals("New Description"));
    }

    @Test
    public void test_setStartDate_shouldReturn_NewDate() {
        testee.setStartDateTime(now().minusHours(2));

        assertTrue(testee.getStartDateTime().isBefore(now().minusHours(2)));
    }

    @Test
    public void test_setAssignee_shouldRerurn_sameAssignee() {
        List<TaskAssignee> taskAssigneesToRetun = new ArrayList<>();
        taskAssigneesToRetun.add(taskAssignee);

        assertEquals(testee.getAssigneeList(), taskAssigneesToRetun);
    }

    @Test
    public void test_setTaskAssignee_shouldContains_newAssignee() {
        TaskAssignee newAssignee = new TaskAssignee("ID2", "New Name", "123", RESIDENT, notificationSeries);
        List<TaskAssignee> taskAssignees = new ArrayList<>();
        taskAssignees.add(newAssignee);

        testee.setAssigneeList(taskAssignees);

        assertTrue(testee.getAssigneeList().contains(newAssignee));
    }

    @Test
    public void test_addNewTaskAssignee_shouldContains_newAssignee() {
        TaskAssignee newAssignee = new TaskAssignee("ID2", "New Name", "123", RESIDENT, notificationSeries);

        List<TaskAssignee> newTaskList = testee.addTaskAssignee(newAssignee);
        assertTrue(newTaskList.contains(newAssignee));
    }

}