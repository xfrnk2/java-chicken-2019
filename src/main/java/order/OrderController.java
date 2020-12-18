package order;

import menu.Menu;
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
                Menu menu = MenuController.selectMenu();
                int amount = MenuController.menuAmount();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
