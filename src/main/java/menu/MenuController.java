package menu;

import table.Table;
import view.InputView;
import view.OutputView;

import java.util.List;

public class MenuController {
    private static final String ALREADY_MAXIMUM_AMOUNT = "[ERROR] 최대 수량은 99개입니다.";

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
        if (!table.canAdditionalOrder(menu)) {
            throw new IllegalArgumentException(ALREADY_MAXIMUM_AMOUNT);
        }
        return InputView.amountMenu(table, menu);
    }
}
