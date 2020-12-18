package table;

import menu.Menu;
import menu.MenuService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableMenu {
    private static final String EXCEED_MAXIMUM_AMOUNT = "[ERROR] 최대 수량은 99개입니다.";
    private static final int MAXIMUM_AMOUNT = 99;

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
}
