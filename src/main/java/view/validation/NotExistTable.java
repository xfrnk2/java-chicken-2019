package view.validation;

import table.Table;

import java.util.ArrayList;
import java.util.List;

public class NotExistTable {
    private static final String NOT_EXIST_TABLE = "[ERROR] 존재하지 않는 테이블입니다.";

    public static void validate(List<Table> tables, int tableNumber) {
        List<Integer> numbers = new ArrayList<>();
        for (Table table : tables) {
            numbers.add(table.getNumber());
        }

        if (!numbers.contains(tableNumber)) {
            throw new IllegalArgumentException(NOT_EXIST_TABLE);
        }
    }
}
