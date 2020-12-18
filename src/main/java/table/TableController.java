package table;

import menu.Menu;
import view.InputView;
import view.OutputView;

import java.util.List;

public class TableController {
    public static void showTables() {
        List<Table> tables = TableService.allTables();
        OutputView.printTables(tables);
    }

    public static Table selectTable() {
        int tableNumber = findTableNumber();
        return TableService.getTable(tableNumber);
    }

    public static int findTableNumber() {
        OutputView.selectTable();
        List<Table> tables = TableService.allTables();
        return InputView.selectTableNumber(tables);
    }

    public static void order(Table table, Menu menu, int amount) {
        table.addOrder(menu, amount);
    }
}
