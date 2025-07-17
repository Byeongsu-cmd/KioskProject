package org.example.Lv3;

public class MenuItem {
    // 필드
    private String menuName;
    private Double menuPrice;
    private String menuDescription;

    // 생성자
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

    // 출력 값 기본 틀 입니다.
    public void menuItem() {
        System.out.println(menuName + " W " + menuPrice + " " + menuDescription);
    }
}