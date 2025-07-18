package org.example.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        List<MenuItem> BurgerList = new ArrayList<MenuItem>();
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        BurgerList.add(new MenuItem("1. ShackBurger   | W", 6.9, "| 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        BurgerList.add(new MenuItem("2. SmokeShack    | W", 8.9, "| 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        BurgerList.add(new MenuItem("3. Cheeseburger  | W", 6.9, "| 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        BurgerList.add(new MenuItem("4. Hamburger     | W", 5.4, "| 비프패티를 기반으로 야채가 들어간 기본버거"));

        List<Menu> menuCategory = new ArrayList<>();
        //카테고리에 입력 된 값에 맞는 메뉴의 리스트를 담아줍니다.
        menuCategory.add(new Menu("1. Burger", BurgerList));
        menuCategory.add(new Menu("2. Drinks", BurgerList));
        menuCategory.add(new Menu("3. Desserts", BurgerList));
        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuCategory);
        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}