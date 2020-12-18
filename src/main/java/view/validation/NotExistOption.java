package view.validation;

import common.MainCategory;

import java.util.ArrayList;
import java.util.List;

public class NotExistOption {
    private static final String NOT_EXIST_OPTION = "[ERROR] 존재하지 않는 옵션입니다.";

    public static void validate(List<MainCategory> optionList, String option) {
        List<String> options = new ArrayList<>();
        for (MainCategory category : optionList) {
            options.add(category.getCategory());
        }

        if (!options.contains(option)) {
            throw new IllegalArgumentException(NOT_EXIST_OPTION);
        }
    }
}
