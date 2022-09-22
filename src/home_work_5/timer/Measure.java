package home_work_5.timer;

public class Measure {

    public Long getTimeOfStart() {
        return timeOfStart;
    }

    public Long getTimeOfEnd() {
        return timeOfEnd;
    }

    public String getNameOfMeasure() {
        return nameOfMeasure;
    }

    private final Long timeOfStart;

    private final Long timeOfEnd;

    private final String nameOfMeasure;

    public Measure(Long timeOfStart, Long timeOfEnd, String nameOfMeasure) {
        this.timeOfStart = timeOfStart;
        this.timeOfEnd = timeOfEnd;
        this.nameOfMeasure = nameOfMeasure;
    }


}
