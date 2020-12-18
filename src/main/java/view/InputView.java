package view;

import main.MainCategory;
import view.validation.NotExistOption;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }

    public static int selectOption(List<MainCategory> optionList) {
        String option = scanner.nextLine();
        NotExistOption.validate(optionList, option);
        return Integer.parseInt(option);
    }
}
