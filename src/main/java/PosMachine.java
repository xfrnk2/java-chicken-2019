import main.MainCategory;
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
            int option = askOptionChoice();

            if (option == Integer.parseInt(MainCategory.EXIT.getCategory())) {
                break;
            }
        }
    }

    private int askOptionChoice() {
        int option = 0;
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
