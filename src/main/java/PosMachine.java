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
				String option = inputView.selectMainMenu();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
