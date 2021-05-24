package domain;

import domain.dtos.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskAssignee taskAssignee;

    @Autowired
    public TaskService(TaskAssignee taskAssignee) {
        this.taskAssignee = taskAssignee;
    }


    public Task createTask(TaskDto taskDto) {
        Task task = new Task(taskDto.getId(),
                            taskDto.getTittle(),
                            taskDto.getStartDateTime(),
                            taskDto.getEndDateTime(),
                            taskDto.getTaskNotificationSeries(),
                            taskDto.getAssigneeList()
        );
        return task;
    }
}
