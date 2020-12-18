package menu;

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

    public static int menuAmount() {
        OutputView.amountMenu();
        return InputView.amountMenu();
    }
}
