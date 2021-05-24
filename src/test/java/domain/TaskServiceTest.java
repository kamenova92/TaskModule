package domain;
import domain.dtos.TaskDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {
    @InjectMocks TaskService testee;

   @Mock private TaskDto taskDto;

    @Test
    public void test_createTask_shouldReturn_newTask() {
      Task newTask = testee.createTask(taskDto);

        assert newTask != null;
    }
}