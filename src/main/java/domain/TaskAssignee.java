package domain;

import domain.enums.AssigneeType;

public class TaskAssignee {

    private String id;;
    private String name;
    private String phoneNumber;
    private AssigneeType assigneeType;
    private TaskNotificationSeries taskNotificationSeries;

    public TaskAssignee() {}

    public TaskAssignee(String id,
                        String name,
                        String phoneNumber,
                        AssigneeType assigneeType,
                        TaskNotificationSeries taskNotificationSeries
    ) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.assigneeType = assigneeType;
        this.taskNotificationSeries = taskNotificationSeries;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AssigneeType getAssigneeType() {
        return assigneeType;
    }

    public void setAssigneeType(AssigneeType assigneeType) {
        this.assigneeType = assigneeType;
    }

    public TaskNotificationSeries getTaskNotificationSeries() {
        return taskNotificationSeries;
    }

    public void setTaskNotificationSeries(TaskNotificationSeries taskNotificationSeries) {
        this.taskNotificationSeries = taskNotificationSeries;
    }
}
