package home_work_6.api;

import java.util.List;

/**
 * Заказ сформированный покупателем
 */
public interface IOrder {

    /**
     * Список выбранного для заказа
     * @return список выбранного
     */
    List<ISelectedItem> getSelected();
}
