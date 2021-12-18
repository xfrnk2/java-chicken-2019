package view;

import java.util.List;

import common.MainCategory;
import domain.Menu;
import domain.Table;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";
    private static final String MAIN_SCREEN = "## 메인화면";
    private static final String SELECT_MAIN_MENU_REQUEST = "## 원하는 기능을 선택하세요.";

    public void printTables(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printLine(BOTTOM_LINE, size);
    }

    public void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

	public void printMainMenus() {
		System.out.println(MAIN_SCREEN);
		for (MainCategory category : MainCategory.values()) {
			System.out.println(String.format("%s - %s", category.getCategory(), category.getDescription()));
		}
	}

	public void printSelectMainMenuRequest() {
		System.out.println(SELECT_MAIN_MENU_REQUEST);
	}
}
