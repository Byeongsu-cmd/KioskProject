package org.example.Lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 메뉴의 리스트 필드 생성
    private final List<Menu> menuCategory;

    // 메뉴 리스트 생성자 생성
    public Kiosk(List<Menu> menuCategory) {
        this.menuCategory = menuCategory;
    }

    public void start() {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);
        // 반복문 시작
        while (true) {

            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            //메인 리스트 반복문으로 출력
            for (int i = 0; i < menuCategory.size(); i++) {
                menuCategory.get(i).printCategory();
            }
            System.out.println("0. 종료      | 종료");

            // 숫자 입력 받기
            System.out.println("원하시는 메뉴의 번호를 입력해주세요. :");
            try {
                int selectCategory = sc.nextInt();

                // 카테고리에서 0을 입력 시 프로그램을 종료시킵니다.
                if (selectCategory == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
                else if (0 < selectCategory && selectCategory <= menuCategory.size()) {

                    while (true) {
                        System.out.println("[ BURGERS MENU ]");
                        // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
                        menuCategory.get(selectCategory - 1).printMenu();
                        System.out.println("0. 뒤로가기");

                        // 숫자 입력 받기
                        System.out.println("원하시는 햄버거의 번호를 입력해주세요. :");
                        try {
                            int selectBurger = sc.nextInt();
                            // 버거 메뉴 리스트에서 0을 입력시 메인으로 돌아갑니다.
                            if (selectBurger == 0) {
                                System.out.println("메인으로 돌아갑니다. ");
                                break;
                            }
                            // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
                            // get(0)은 카테고리 버거의 리스트를 가르키는 것입니다.
                            List<MenuItem> burgers = menuCategory.get(0).menuItems();
                            if (0 < selectBurger && selectBurger <= burgers.size()) {
                                selectBurger = selectBurger - 1; // 리스트는 0부터 저장하기 때문에
                                burgers.get(selectBurger).printMenuItem(); // 선택한 버거 정보 출력
                            } else { //버거 메뉴 번호 예외 처리
                                System.out.println("올바른 메뉴의 번호를 입력 해주세요. : ");
                            }
                        } catch (Exception e) {
                            System.out.println("번호만 입력해주세요.");
                            sc.next(); // 메인으로만 돌아감...
                        }
                    }
                } else {
                    System.out.println("오류: 올바른 번호를 입력해주세요. ");
                }
            } catch (Exception e) {
                System.out.println("번호만 입력해주세요.");
                sc.next(); // 메인으로만 돌아감...
            }
        }
    }
}