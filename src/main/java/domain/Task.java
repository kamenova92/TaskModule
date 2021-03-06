package domain;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.nonNull;


public class Task {

    public String id;
    public String tittle;
    public String description;
    public LocalDateTime startDateTime;
    public LocalDateTime endDateTime;
    public TaskNotificationSeries taskNotificationSeries;
    public List<TaskAssignee> assigneeList;
    public boolean completed;

    public Task(String id,
                String tittle,
                LocalDateTime startDateTime,
                LocalDateTime endDateTime,
                TaskNotificationSeries taskNotificationSeries,
                List<TaskAssignee> assigneeList
    ) {
        this.id = id;
        this.tittle = tittle;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.taskNotificationSeries = taskNotificationSeries;
        this.assigneeList = assigneeList;
    }

    public String getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public TaskNotificationSeries getTaskNotificationSeries() {
        return taskNotificationSeries;
    }

    public void setTaskNotificationSeries(TaskNotificationSeries taskNotificationSeries) {
        this.taskNotificationSeries = taskNotificationSeries;
    }

    public List<TaskAssignee> getAssigneeList() {
        return assigneeList;
    }

    public void setAssigneeList(List<TaskAssignee> assigneeList) {
        this.assigneeList = assigneeList;
    }

    public List<TaskAssignee> addTaskAssignee(TaskAssignee taskAssignee) {
        List<TaskAssignee> taskAssigneeLis = new ArrayList<>();
        if (nonNull(taskAssignee)){
            taskAssigneeLis.add(taskAssignee);
        }
        return taskAssigneeLis;
    }

    public void completeTask(Task task) {
        if(!task.isCompleted()) {
            this.setCompleted(true);
        }
        throw new IllegalStateException("Can not complete already completedTask");
    }

    public void removeTaskAssignee(TaskAssignee taskAssignee) {
        this.assigneeList.remove(taskAssignee);
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
