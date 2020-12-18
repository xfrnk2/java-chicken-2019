package table;

import order.Order;

import java.util.List;

public class TableService {
    private static final int DISCOUNT_CONDITION = 10;
    private static final int DISCOUNT_PRICE = 10000;

    public static List<Table> allTables() {
        return TableRepository.tables();
    }

    public static Table getTable(int tableNumber) {
        return TableRepository.findByNumber(tableNumber);
    }

    public static int calculatePrice(List<Order> orders) {
        int price = 0;
        for (Order order : orders) {
            price += (order.getAmount() * order.getMenu().getPrice());
            price -= (order.getAmount() / DISCOUNT_CONDITION) * DISCOUNT_PRICE;
        }
        return price;
    }
}
