package menu;

import java.util.List;

public class MenuService {
    public static List<Menu> allMenus() {
        return MenuRepository.menus();
    }

    public static Menu getMenu(int menuNumber) {
        return MenuRepository.findByNumber(menuNumber);
    }
}
