package home_work_6;

import home_work_6.ArrayLists.ArrayListForOrderStatus;
import home_work_6.api.IOrderStatus;
import home_work_6.api.IStage;
import home_work_6.api.ITicket;

import java.time.LocalTime;
import java.util.List;

public class OrderStatus implements IOrderStatus {

    private final ITicket ticket;

    private boolean done;


    public OrderStatus(ITicket ticket) {
        this.ticket = ticket;
        if (LocalTime.now().minusSeconds(20).isAfter(ticket.getCreateAt().toLocalTime())) {
            done = true;
        }
    }

    public ITicket getTicket() {
        return ticket;
    }

    public List<IStage> getHistory() {
        List<IStage> list = new ArrayListForOrderStatus<>();
        list.add(new Stage("Заказ принят", ticket.getCreateAt().toLocalTime()));
        if (LocalTime.now().minusSeconds(5).isAfter(ticket.getCreateAt().toLocalTime())) {
            list.add(new Stage("Заказ обрабатывается", ticket.getCreateAt().toLocalTime().plusSeconds(5)));
        }
        if (LocalTime.now().minusSeconds(10).isAfter(ticket.getCreateAt().toLocalTime())) {
            list.add(new Stage("Заказ готовится", ticket.getCreateAt().toLocalTime().plusSeconds(10)));
        }
        if (LocalTime.now().minusSeconds(15).isAfter(ticket.getCreateAt().toLocalTime())) {
            list.add(new Stage("Заказ упаковывается", ticket.getCreateAt().toLocalTime().plusSeconds(15)));
        }
        if (LocalTime.now().minusSeconds(20).isAfter(ticket.getCreateAt().toLocalTime())) {
            list.add(new Stage("Заказ готов", ticket.getCreateAt().toLocalTime().plusSeconds(20)));
            done = true;
        }
        return list;
    }

    public boolean isDone() {
        return done;
    }
}
