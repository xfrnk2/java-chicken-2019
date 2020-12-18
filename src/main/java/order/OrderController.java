package order;

import menu.MenuController;
import table.TableController;
import table.Table;

public class OrderController {
    public void run() {
        while (true) {
            try {
                TableController.showTables();
                Table table = TableController.selectTable();
                MenuController.showMenu();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
