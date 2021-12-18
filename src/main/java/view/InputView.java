package view;

import java.util.Arrays;
import java.util.Scanner;

import common.MainCategory;
import view.validation.InputValidation;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
	private InputValidation inputValidation = new InputValidation();

	public String selectMainMenu() {
		String option = scanner.next().trim();
		inputValidation.validateMainMenuOption(option);
		return option;
	}

    public int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }
}
