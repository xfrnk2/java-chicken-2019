package order;

import table.TableController;
import table.Table;

public class OrderController {
    public void run() {
        while (true) {
            try {
                TableController.showTables();
                Table table = TableController.selectTable();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
