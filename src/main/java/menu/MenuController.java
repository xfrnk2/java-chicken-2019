package menu;

import table.Table;
import view.InputView;
import view.OutputView;

import java.util.List;

public class MenuController {
    public static void showMenu() {
        List<Menu> menus = MenuService.allMenus();
        OutputView.printMenus(menus);
    }

    public static Menu selectMenu() {
        int menuNumber = findMenuNumber();
        return MenuService.getMenu(menuNumber);
    }

    private static int findMenuNumber() {
        OutputView.selectMenu();
        List<Menu> menus = MenuService.allMenus();
        return InputView.selectMenuNumber(menus);
    }

    public static int menuAmount(Table table, Menu menu) {
        OutputView.amountMenu();
        if (table.canAdditionalOrder(menu)) {
            return InputView.amountMenu(table, menu);
        }
        return 0;
    }
}
