package home_work_5.timer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Timer {

    private long timeOfStart;

    private final List<Measure> list = new ArrayList<>();

    public void addMeasure(Long timeOfEnd, String nameOfMeasure) {
        list.add(new Measure(this.timeOfStart, timeOfEnd, nameOfMeasure));
    }

    public void startMeasure() {
        timeOfStart = System.currentTimeMillis();
    }

    public String getListOfMeasurements() {
        Iterator<Measure> iterator = list.iterator();
        StringBuilder str = new StringBuilder();
        while (iterator.hasNext()) {
            Measure buffer = iterator.next();
            str.append("Операция: ").append(buffer.getNameOfMeasure()).append(". ").append("Заняла").append(" - ").append(buffer.getTimeOfEnd() - buffer.getTimeOfStart());
            str.append(" мс\n");
        }
        return str.toString();
    }
}
