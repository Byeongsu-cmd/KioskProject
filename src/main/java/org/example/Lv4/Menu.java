package org.example.Lv4;

import java.util.List;

public class Menu {
    // MenuItem 클래스를 List로 관리
    private final String category;
    private final List<MenuItem> menuItems;

    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    public String category() {
        return category;
    }

    public List<MenuItem> menuItems() {
        return menuItems;
    }

    // List를 리턴하는 함수
    public void printCategory() {
        System.out.println(category);
    }

    // 메뉴 전체리스트 출력
    public void printMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.print(i+1+".");
            menuItems.get(i).printMenuItem();
        }
    }
}
