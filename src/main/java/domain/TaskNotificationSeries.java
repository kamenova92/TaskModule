package domain;

import domain.enums.CalendarRepeatUnit;

import java.time.LocalDateTime;

public class TaskNotificationSeries {

    public String id;
    public LocalDateTime startDateTime;
    public LocalDateTime endDateTime;
    public LocalDateTime seriesEndDateTime;
    public CalendarRepeatUnit intervalUnit;

    private boolean allDay;
    private String tittle;
    private String description;

    public TaskNotificationSeries(String id,
                                  LocalDateTime startDateTime,
                                  LocalDateTime endDateTime,
                                  LocalDateTime seriesEndDateTime,
                                  CalendarRepeatUnit intervalUnit,
                                  String tittle
    ) {
        this.id = id;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.seriesEndDateTime = seriesEndDateTime;
        this.intervalUnit = intervalUnit;
        this.tittle = tittle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDateTime getSeriesEndDateTime() {
        return seriesEndDateTime;
    }

    public void setSeriesEndDateTime(LocalDateTime seriesEndDateTime) {
        this.seriesEndDateTime = seriesEndDateTime;
    }

    public CalendarRepeatUnit getIntervalUnit() {
        return intervalUnit;
    }

    public void setIntervalUnit(CalendarRepeatUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public void setAllDay(boolean allDay) {
        this.allDay = allDay;
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
}
