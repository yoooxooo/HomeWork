package home_work_6;

import home_work_6.api.IStage;

import java.time.LocalTime;

public class Stage implements IStage {

    public Stage(String description, LocalTime time) {
        this.description = description;
        this.time = time;
    }

    public String toString() {
        String seconds;
        if (time.getSecond() < 10) {
            seconds = "0" + time.getSecond();
        } else {
            seconds = "" + time.getSecond();
        }
        return description + " - " + time.getHour() + ":" + time.getMinute() + ":" + seconds;
    }

    private final String description;

    private final LocalTime time;

    public String getDescription() {
        return description;
    }

    public LocalTime getTime() {
        return time;
    }
}
