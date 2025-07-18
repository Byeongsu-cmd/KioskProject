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

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
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

    // 카테고리 리스트 출력
    public void printMenuCategory() {
        System.out.println(category);
    }


    // 버거 메뉴 전체리스트 출력
    public void printMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            menuItems.get(i).printMenuItem();
        }
    }
    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
