package home_work_6.api;

import java.time.LocalDateTime;

/**
 * Квиток выдаваемый к заказу
 */
public interface ITicket {

    /**
     * Уникальный номер заказа
     * @return
     */
    String getNumber();

    /**
     * Когда заказ получен
     * @return
     */
    LocalDateTime getCreateAt();

    /**
     * Заказ для которого выдали квиток
     * @return
     */
    IOrder getOrder();
}
