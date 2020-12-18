package common;

public enum PaymentMethod {
    CARD("1", "신용 카드"),
    CASH("2", "현금");

    private String value;
    private String description;

    PaymentMethod(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
