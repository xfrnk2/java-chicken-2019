package table;

import menu.Menu;
import menu.MenuService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableMenu {
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
}
