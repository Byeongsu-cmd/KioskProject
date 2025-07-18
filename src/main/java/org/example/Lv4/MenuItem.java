package org.example.Lv4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private final String menuName;
    private final Double menuPrice;
    private final String menuDescription;

    public MenuItem(String menuName, Double menuPrice, String menuDescription) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
    }

    public String getMenuName() {
        return menuName;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void printMenuItem() {
        System.out.println(menuName + " W " + menuPrice + " " + menuDescription);
    }
}
