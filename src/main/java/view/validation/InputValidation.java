package view.validation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import common.MainCategory;

public class InputValidation {
	private static final String ERROR = "[ERROR] ";
	private static final String INVALID_MAIN_MENU_OPTION = ERROR + "존재하지 않는 명령입니다.";
	private static final List<String> MAIN_MENU_METHODS = Arrays.stream(MainCategory.values())
		.map(MainCategory::getCategory)
		.collect(
			Collectors.toList());


	public void validateMainMenuOption(String option) {
		if (!MAIN_MENU_METHODS.contains(option)){
			throw new IllegalArgumentException(INVALID_MAIN_MENU_OPTION);
		}
	}
}
