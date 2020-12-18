package menu;

import view.OutputView;

import java.util.List;

public class MenuController {
    public static void showMenu() {
        List<Menu> menus = MenuService.allMenus();
        OutputView.printMenus(menus);
    }
}
