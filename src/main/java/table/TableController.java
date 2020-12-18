package table;

import common.PaymentMethod;
import menu.Menu;
import order.Order;
import view.InputView;
import view.OutputView;

import java.util.Arrays;
import java.util.List;

public class TableController {
    private static final double CASH_DISCOUNT = 0.95;

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

    public static void showOrder(List<Order> orders) {
        OutputView.showOrder(orders);
    }

    public static void pay(Table table, List<Order> order) {
        OutputView.pay(table);
        OutputView.selectPaymentMethod();
        List<PaymentMethod> methodList = Arrays.asList(PaymentMethod.values());
        String method = InputView.selectPaymentMethod(methodList);
        int totalPrice = TableService.calculatePrice(order);

        if (method.equals(PaymentMethod.CASH.getValue())) {
            totalPrice *= CASH_DISCOUNT;
        }
        OutputView.printTotalPrice(totalPrice);
    }
}
