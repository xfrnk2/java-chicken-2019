package table;

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
}
