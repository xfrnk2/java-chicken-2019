package view;

import common.MainCategory;
import menu.Menu;
import table.Table;
import view.validation.NotExistMenu;
import view.validation.NotExistOption;
import view.validation.NotExistTable;
import view.validation.NotNumber;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }

    public static String selectOption(List<MainCategory> optionList) {
        String option = scanner.nextLine();
        NotExistOption.validate(optionList, option);
        return option;
    }

    public static int selectTableNumber(List<Table> tables) {
        String tableNumber = scanner.nextLine();
        NotNumber.validate(tableNumber);
        int number = Integer.parseInt(tableNumber);
        NotExistTable.validate(tables, number);
        return number;
    }

    public static int selectMenuNumber(List<Menu> menus) {
        String menuNumber = scanner.nextLine();
        NotNumber.validate(menuNumber);
        int number = Integer.parseInt(menuNumber);
        NotExistMenu.validate(menus, number);
        return number;
    }

    public static int amountMenu() {
        return scanner.nextInt();
    }
}
