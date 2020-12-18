package view.validation;

public class NotNumber {
    private static final String NOT_NUMBER = "[ERROR] 숫자를 입력해야합니다.";

    public static void validate(String tableNumber) {
        for (int i = 0; i < tableNumber.length(); i++) {
            char digit = tableNumber.charAt(i);

            if (!Character.isDigit(digit)) {
                throw new IllegalArgumentException(NOT_NUMBER);
            }
        }
    }
}
