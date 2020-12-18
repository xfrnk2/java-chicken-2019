package main;

public enum MainCategory {
    REGISTER("1", "주문등록"),
    PAY("2", "결제하기"),
    EXIT("3", "프로그램 종료");

    private String category;
    private String description;

    MainCategory(String category, String description) {
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
