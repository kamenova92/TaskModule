package domain.dtos;

import domain.Task;
import domain.TaskAssignee;
import domain.TaskNotificationSeries;

import java.time.LocalDateTime;
import java.util.List;

public class TaskDto {

    public String id;
    public String tittle;
    public String description;
    public LocalDateTime startDateTime;
    public LocalDateTime endDateTime;
    public TaskNotificationSeries taskNotificationSeries;
    public List<TaskAssignee> assigneeList;
    public boolean completed;


    public TaskDto(Task task) {
        this.id = task.getId();
        this.tittle = task.getTittle();
        this.description = task.getDescription();
        this.startDateTime = task.getStartDateTime();
        this.endDateTime = task.getEndDateTime();
        this.taskNotificationSeries = task.getTaskNotificationSeries();
        this.assigneeList = task.getAssigneeList();
        this.completed = task.isCompleted();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
