package home_work_6;

import home_work_6.api.*;

public class Pizzeria implements IPizzeria {

    private final IMenu menu;

    private int number = 0;

    public Pizzeria() {
        menu = new Menu();
    }

    public IMenu takeMenu() {
        return menu;
    }

    public ITicket create(IOrder order) {
        String ticketNumber;
        StringBuilder str = new StringBuilder();
        if(number < 999) {
            ++number;
            if(number < 100) {
                str.append("0");
            }
            if (number < 10) {
                str.append("0");
            }
            str.append(number);
            ticketNumber = str.toString();
        } else {
            number = 0;
            ticketNumber = "001";
        }
        return new Ticket(ticketNumber,order);
    }

    public IOrderStatus check(ITicket ticket) {
        return new OrderStatus(ticket);
    }

    public IDoneOrder pickup(ITicket ticket) {
        return new DoneOrder(ticket);
    }
}
