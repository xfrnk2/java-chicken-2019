import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import common.MainCategory;
import controller.OrderController;
import view.InputView;
import view.OutputView;

public class PosMachine {
	private static final InputView inputView = new InputView();
	private static final OutputView outputView = new OutputView();

	public void run() {
		while(true) {
			try {
				outputView.printMainMenus();
				outputView.printSelectMainMenuRequest();
				String option = askOptionChoice();

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private String askOptionChoice() {
		List<MainCategory> optionList = Arrays.asList(MainCategory.values());
		String option = inputView.selectMainMenu(optionList);
		return option;
	}
}
