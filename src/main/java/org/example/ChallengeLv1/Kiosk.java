package org.example.ChallengeLv1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private final List<Menu> menuList;

    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    private List<MenuItem> basket = new ArrayList<>();

    public void setBasket(List<MenuItem> basket) {
        this.basket = basket;
    }

    public void start() {

        while (true) {
            try {// 메뉴 카테고리 진입
                System.out.println("아래의 메뉴를 보시고 번호를 입력해주세요.");
                System.out.println("[ MAIN MENU ]");
                for (int i = 0; i < menuList.size(); i++) { // 메뉴 카테고리의 전체 리스트를 출력하기 위한 반복문 메서드
                    System.out.print(i + 1 + ". ");
                    menuList.get(i).printCategory();
                }
                System.out.println("0. 종료      | 종료");
                if (basket.size() != 0) {
                    System.out.println("[ ORDER MENU ]"); // 장바구니
                    System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                    System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                    int basketItem = sc.nextInt(); // 장바구니 주문 확인용 입력 값
                    if (basketItem == 4) {
                        System.out.println("아래와 같이 주문 하시겠습니까?");
                        System.out.println("[ Orders ]");
                        for (MenuItem menuItem : basket) {// 저장된 장바구니 리스트
                            menuItem.printMenuItem(); // 장바구니 리스트 출력 메서드
                        }
                        System.out.println("[ Total ]");
                        for (MenuItem menuItem : basket) {// 총 금액 연산해주는 메서드
                            System.out.print("W ");
                            menuItem.printPrice(); // 연산 메서드 구현 필요!!
                            break;
                        }
                        System.out.println("1. 주문      2. 메뉴판");
                        int order = sc.nextInt();
                        if (order == 1) {
                            System.out.println("주문이 완료되었습니다. 금액은 W ?? 입니다."); //최종 결제 메서드
                            setBasket(new ArrayList<>()); // 장바구니 비워주는 메서드
                        } else {
                            continue;
                        }
                    }
                    if (basketItem == 5) {
                        setBasket(new ArrayList<>());
                    }
                }
                int choice = sc.nextInt(); // 메뉴의 카테고리의 입력 값을 받는 메서드

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (choice > 0 && choice <= menuList.size()) {
                    while (true) {
                        try {// 메뉴아이템 진입
                            switch (choice) {
                                case 1:
                                    System.out.println("[ BURGER MENU ]");
                                    break;
                                case 2:
                                    System.out.println("[ DRINK MENU ]");
                                    break;
                                case 3:
                                    System.out.println("[ DESSERT MENU ]");
                                    break;
                            }
                            menuList.get(choice - 1).printMenuList(); // 입력받은 카테고리의 메뉴를 반복문으로 출력하는 메서드
                            System.out.println("0. 뒤로가기      | 뒤로가기");
                            System.out.println("원하는 음식의 번호를 입력해주세요. :");
                            int menuChoice = sc.nextInt(); //메뉴 아이템의 입력 값을 받는 메서드

                            if (menuChoice == 0) { // 메인으로 돌아가는 메서드
                                System.out.println("메인 메뉴로 돌아가겠습니다. ");
                                break;
                            }
                            List<MenuItem> menuItemList = menuList.get(choice - 1).getMenuItems();//메뉴 클래스에 있는 메뉴아이템 리스트를 불러오기 위한 객체 설정입니다.

                            if (menuChoice > 0 && menuChoice <= menuItemList.size()) {// 메뉴아이템의 리스트를 출력합니다.
                                System.out.print("선택한 메뉴 : ");
                                menuItemList.get(menuChoice - 1).printMenuItem();
                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인     2. 취소");
                                int basketNumber = sc.nextInt();

                                if (basketNumber == 1) {
                                    basket.add(menuItemList.get(menuChoice - 1));
                                    break;
                                }

                            } else {
                                System.out.println("없는 메뉴입니다. 다시 선택해주세요. ");
                            }

                        } catch (Exception e) {
                            System.out.println("올바른 번호를 입력해주세요. ");
                            sc.next();
                        }
                    }
                } else {
                    System.out.println("없는 메뉴입니다. 다시 선택해주세요. ");
                }
            } catch (Exception e) {
                System.out.println("올바른 번호를 입력해주세요. ");
                sc.next(); // 입력된 값을 지웁니다.
            }

        }
    }
}
