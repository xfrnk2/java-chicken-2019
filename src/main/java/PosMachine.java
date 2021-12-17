import view.InputView;
import view.OutputView;

public class PosMachine {
	private static final InputView inputView = new InputView();
	private static final OutputView outputView = new OutputView();

	public void run() {
		outputView.printMainMenus();
	}
}
