package home_work_6;

import home_work_6.api.IDoneOrder;
import home_work_6.api.IOrderStatus;
import home_work_6.api.ITicket;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pizzeria pizzeria = new Pizzeria();

        System.out.println(pizzeria.takeMenu());

        pizzeria.create(new Order("Маргарита 3", "Гавайская 2"));
        pizzeria.create(new Order("Маргарита 3", "Гавайская 2"));

        ITicket ticket = pizzeria.create(new Order("Маргарита 1", "Диабло 3", "Колбаски барбекю 2"));

        System.out.println(ticket);

        IOrderStatus checkPizza = pizzeria.check(ticket);

        System.out.println(checkPizza.isDone());
        System.out.println(checkPizza.getHistory());
        Thread.sleep(5000);
        System.out.println(checkPizza.getHistory());
        Thread.sleep(5000);
        System.out.println(checkPizza.getHistory());
        Thread.sleep(5000);
        IDoneOrder pack = pizzeria.pickup(ticket);
        System.out.println(pack.getItems());
        System.out.println(checkPizza.getHistory());
        System.out.println(checkPizza.isDone());
        Thread.sleep(5000);
        System.out.println(checkPizza.getHistory());
        System.out.println(checkPizza.isDone());
        pack = pizzeria.pickup(ticket);
        System.out.println(pack.getItems());

    }
}
