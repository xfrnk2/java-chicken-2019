package table;

import menu.Menu;
import order.Order;

import java.util.List;

public class Table {
    private final int number;
    private TableMenu tableMenu;

    public Table(final int number) {
        this.number = number;
        this.tableMenu = new TableMenu();
    }

    public int getNumber() {
        return number;
    }

    public boolean isSame(int number) {
        return this.number == number;
    }

    public boolean canAdditionalOrder(Menu menu) {
        return tableMenu.canOrder(menu);
    }

    public List<Order> getOrder() {
        return tableMenu.getOrder();
    }

    public void addOrder(Menu menu, int amount) {
        tableMenu.add(menu, amount);
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
