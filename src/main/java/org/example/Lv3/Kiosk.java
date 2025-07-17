package org.example.Lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 메뉴를 저장할 리스트 필드를 설정합니다.
    private List<MenuItem> menuItems;

    // 메인에서 전달받은 메뉴 리스트를 필드에 저장 (생성자)
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        while (true) {
            try {
                // 메뉴판 입니다.
                System.out.println("[ SHAKE SHACK MENU ]");
                for (int i = 0; i < menuItems.size(); i++) {
                    menuItems.get(i).menuItem();
                }
                System.out.println("0. 종료      | 종료");


                System.out.println("원하는 메뉴의 번호를 입력해주세요:");
                // 입력 값을 받기위한 Scanner 객체 생성을 합니다.
                Scanner sc = new Scanner(System.in);
                // 번호만 입력 값을 받습니다.
                int select = sc.nextInt();

                // 조건문입니다. 0이면 프로그램을 종료하고 그외의 숫자는 작동을하지만 만약 메뉴에 없는 번호나 숫자가 아닌 문자 등은 예외 처리를 했습니다.
                if (select == 0) {
                    System.out.println("프로그램을 종료 합니다.");
                    break;
                } else if (select > 0 && select <= menuItems.size()) {
                    int menuSelect = select - 1;
                    menuItems.get(menuSelect).menuItem();
                } else {
                    System.out.println("등록되지 않은 메뉴입니다. 다시 입력해주세요."); // 메뉴판에 없는 번호를 입력 시 출력합니다.
                }
            } catch (Exception e) {
                System.out.println("번호만 입력해주세요."); // 숫자가 아닌 입력 값을 입력 시 출력합니다.
            }
        }
    }
}