package table;

import java.util.List;

public class TableService {
    public static List<Table> allTables() {
        return TableRepository.tables();
    }

    public static Table getTable(int tableNumber) {
        return TableRepository.findByNumber(tableNumber);
    }
}
