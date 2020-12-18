package view.validation;

import menu.Menu;
import table.Table;

import java.util.ArrayList;
import java.util.List;

public class NotExistMenu {
    private static final String NOT_EXIST_TABLE = "[ERROR] 존재하지 않는 메뉴입니다.";

    public static void validate(List<Menu> menus, int number) {
        List<Integer> numbers = new ArrayList<>();
        for (Menu menu : menus) {
            numbers.add(menu.getNumber());
        }

        if (!numbers.contains(number)) {
            throw new IllegalArgumentException(NOT_EXIST_TABLE);
        }
    }
}
