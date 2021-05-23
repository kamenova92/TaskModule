package domain;

import java.time.LocalDateTime;

public class TaskNotification {
    private String id;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String tittle;
    private TaskAssignee taskAssignee;

    public TaskNotification(String id,
                            LocalDateTime startDateTime,
                            LocalDateTime endtDateTime,
                            String tittle,
                            TaskAssignee taskAssignee
    ) {
        this.id = id;
        this.startDateTime = startDateTime;
        this.endDateTime = endtDateTime;
        this.tittle = tittle;
        this.taskAssignee = taskAssignee;
    }

    public String getId() {
        return id;
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

    public void setEndtDateTime(LocalDateTime endtDateTime) {
        this.endDateTime = endtDateTime;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public TaskAssignee getTaskAssignee() {
        return taskAssignee;
    }

    public void setTaskAssignee(TaskAssignee taskAssignee) {
        this.taskAssignee = taskAssignee;
    }
}
