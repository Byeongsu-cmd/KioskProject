package org.example.Lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItemList = new ArrayList<>();

        // 리스트에 add라는 함수를 통해 메뉴를 등록합니다.
        menuItemList.add(new MenuItem("1. ShackBurger   | W", 6.9, "| 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("2. SmokeShack    | W", 8.9, "| 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("3. Cheeseburger  | W", 6.9, "| 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("4. Hamburger     | W", 5.4, "| 비프패티를 기반으로 야채가 들어간 기본버거"));


        // 키오스크의 리스트가 메인의 리스트를 참조합니다.
        Kiosk startKiosk = new Kiosk(menuItemList);
        // 입력과 출력은 키오스크에서 합니다.
        startKiosk.start();
    }
}