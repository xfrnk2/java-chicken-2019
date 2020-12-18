package menu;

import java.util.List;

public class MenuService {
    public static List<Menu> allMenus() {
        return MenuRepository.menus();
    }
}
