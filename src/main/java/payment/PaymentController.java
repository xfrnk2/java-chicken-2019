package payment;

import order.Order;
import table.Table;
import table.TableController;

import java.util.List;

public class PaymentController {
    public void run() {
        while (true) {
            try {
                Table table = TableController.selectTable();
                List<Order> order = table.getOrder();
                TableController.showOrder(order);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
