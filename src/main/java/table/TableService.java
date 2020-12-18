package table;

import menu.Category;
import menu.Menu;
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
        int chickenTypeAmount = 0;
        int drinkTypeAmount = 0;
        for (Order order : orders) {
            Menu menu = order.getMenu();
            String category = menu.getCategory().getName();
            price += (order.getAmount() * menu.getPrice());
            if (category.equals(Category.CHICKEN.getName())) {
                chickenTypeAmount += order.getAmount();
            }
            if (category.equals(Category.BEVERAGE.getName())) {
                drinkTypeAmount += order.getAmount();
            }
        }
        price -= (chickenTypeAmount / DISCOUNT_CONDITION) * DISCOUNT_PRICE;
        price -= (drinkTypeAmount / DISCOUNT_CONDITION) * DISCOUNT_PRICE;
        return price;
    }
}
