package view.validation;

import common.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class NotExistPaymentMethod {
    private static final String NOT_EXIST_PAYMENT_METHOD = "[ERROR] 존재하지 않는 지불 방법입니다.";

    public static void validate(List<PaymentMethod> methodList, String method) {
        List<String> options = new ArrayList<>();
        for (PaymentMethod paymentMethod : methodList) {
            options.add(paymentMethod.getValue());
        }

        if (!options.contains(method)) {
            throw new IllegalArgumentException(NOT_EXIST_PAYMENT_METHOD);
        }
    }
}
