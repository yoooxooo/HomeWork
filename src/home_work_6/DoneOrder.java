package home_work_6;

import home_work_6.ArrayLists.ArrayListForPizzas;
import home_work_6.api.IDoneOrder;
import home_work_6.api.IPizza;
import home_work_6.api.ITicket;
import java.util.List;

public class DoneOrder implements IDoneOrder {

    private final ITicket ticket;

    public List<IPizza> list = new ArrayListForPizzas<>();

    public DoneOrder(ITicket ticket) {
        this.ticket = ticket;
    }

    public ITicket getTicket() {
        return ticket;
    }

    public List<IPizza> getItems() {
        OrderStatus orderStatus = new OrderStatus(ticket);
        try {
            if (orderStatus.isDone()) {
                for (int i = 0; ticket.getOrder().getSelected().size() > i; ++i) {
                    for (int j = 0; ticket.getOrder().getSelected().get(i).getCount() > j; ++j) {
                        list.add(new Pizza(ticket.getOrder().getSelected().get(i).getRow().getInfo().getName(), ticket.getOrder().getSelected().get(i).getRow().getInfo().getSize()));
                    }
                }
            } else throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Ваш заказ еще не готов");
            return null;
        }
        return list;
    }
}
