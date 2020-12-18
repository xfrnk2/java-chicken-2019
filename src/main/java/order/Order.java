package order;

import menu.Menu;

public class Order {
    private Menu menu;
    private int amount;

    public Order(Menu menu, int amount) {
        this.menu = menu;
        this.amount = amount;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getAmount() {
        return amount;
    }
}
