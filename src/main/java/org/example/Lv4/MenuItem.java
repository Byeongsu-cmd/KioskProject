package org.example.Lv4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String menuName;
    private Double menuPrice;
    private String menuDescription;

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

    // 게터를 활용하여 출력 값을 설정하였습니다.
    public void printMenuItem() {
        System.out.println(getMenuName() + " | W " + getMenuPrice() + " | " + getMenuDescription());
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }
    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public void resetMenu() {
        menuName = " ";
        menuPrice = 0.0;
        menuDescription = " ";
    }
}
