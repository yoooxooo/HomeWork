package home_work_6;

import home_work_6.api.IOrder;
import home_work_6.api.ITicket;

import java.time.LocalDateTime;

public class Ticket implements ITicket {

    public Ticket(String number, IOrder order) {
        this.number = number;
        this.order = order;
        this.createAt = LocalDateTime.now();
    }

    private final String number;

    private final LocalDateTime createAt;

    private final IOrder order;

    public String getNumber() {
        return number;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public IOrder getOrder() {
        return order;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Ваш заказ номер: ").append(getNumber()).append("\n");
        str.append("Заказ был оформлен в ").append(createAt.getHour()).append(":").append(createAt.getMinute()).append("\n");
        str.append(order);
        return str.toString();
    }
}
