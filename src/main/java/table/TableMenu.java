package table;

import menu.Menu;
import menu.MenuService;
import order.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableMenu {
    private static final String EXCEED_MAXIMUM_AMOUNT = "[ERROR] 최대 수량은 99개입니다.";
    private static final int MAXIMUM_AMOUNT = 99;
    private static final int MINIMUM_AMOUNT = 1;

    private Map<Menu, Integer> menuAmount;

    public TableMenu() {
        this.menuAmount = new HashMap<>();
        List<Menu> menus = MenuService.allMenus();
        for (Menu menu : menus) {
            this.menuAmount.put(menu, 0);
        }
    }

    public boolean canOrder(Menu menu) {
        return menuAmount.get(menu) < MAXIMUM_AMOUNT;
    }

    public void add(Menu menu, int amount) {
        int currentAmount = menuAmount.get(menu);
        int newAmount = currentAmount + amount;
        if (newAmount > MAXIMUM_AMOUNT) {
            throw new IllegalArgumentException(EXCEED_MAXIMUM_AMOUNT);
        }
        menuAmount.replace(menu, currentAmount + amount);
    }

    public List<Order> getOrder() {
        List<Order> orders = new ArrayList<>();
        for (Menu menu : menuAmount.keySet()) {
            if (menuAmount.get(menu) >= MINIMUM_AMOUNT) {
                Order order = new Order(menu, menuAmount.get(menu));
                orders.add(order);
            }
        }
        return orders;
    }
}
