package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static java.time.LocalDateTime.now;
import static java.util.Collections.singletonList;

@Service
public class TaskService {

    private final Task task;
    private final TaskAssignee taskAssignee;

    @Autowired
    public TaskService(Task task,
                       TaskAssignee taskAssignee
    ) {
        this.task = task;
        this.taskAssignee = taskAssignee;
    }

    public Task createTask(Task task, TaskAssignee assignee) {
        task.setTittle("New task");
        task.setDescription("Description");
        task.setStartDateTime(now());
        task.setAssigneeList(singletonList(assignee));
        return task;
    }
}
