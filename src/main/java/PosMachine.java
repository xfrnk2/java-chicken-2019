import common.MainCategory;
import order.OrderController;
import payment.PaymentController;
import view.InputView;
import view.OutputView;

import java.util.Arrays;
import java.util.List;

public class PosMachine {
    public PosMachine() {
    }

    public void run() {
        while (true) {
            OutputView.printMainView();
            String option = askOptionChoice();

            if (option.equals(MainCategory.REGISTER.getCategory())) {
                OrderController orderController = new OrderController();
                orderController.run();
            }
            if (option.equals(MainCategory.PAY.getCategory())) {
                PaymentController paymentController = new PaymentController();
                paymentController.run();
            }
            if (option.equals(MainCategory.EXIT.getCategory())) {
                break;
            }
        }
    }

    private String askOptionChoice() {
        String option = "";
        try {
            OutputView.choiceOption();
            List<MainCategory> optionList = Arrays.asList(MainCategory.values());
            option = InputView.selectOption(optionList);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return option;
    }
}
