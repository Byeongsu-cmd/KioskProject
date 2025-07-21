package org.example.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        List<MenuItem> burgerList = new ArrayList<MenuItem>();
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        burgerList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        List<MenuItem> drinkList = new ArrayList<>();

        drinkList.add(new MenuItem("Coke", 2.5, "콜라"));
        drinkList.add(new MenuItem("Sprite", 2.5, "사이다"));
        drinkList.add(new MenuItem("Milkshake", 4.0, "밀크쉐이크"));


        List<MenuItem> dessertList = new ArrayList<>();

        dessertList.add(new MenuItem("InjeolmiTime", 5.3, "솔티드 허니와 인절미가 포함된 아이스크림"));
        dessertList.add(new MenuItem("HakunaBanana", 5.3, "솔티드 캐러멜과 바나나가 포함된 아이스크림"));
        dessertList.add(new MenuItem("ShackAttack", 5.3, "진한 초콜릿과 초코릿 토핑이 포함된 아이스크림"));

        List<Menu> menuCategory = new ArrayList<>();
        //카테고리에 입력 된 값에 맞는 메뉴의 리스트를 담아줍니다.
        menuCategory.add(new Menu("Burger", burgerList));
        menuCategory.add(new Menu("Drinks", drinkList));
        menuCategory.add(new Menu("Desserts", dessertList));

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuCategory);
        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}