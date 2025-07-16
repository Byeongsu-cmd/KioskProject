package org.example.Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //전체 메뉴판
        System.out.println(" SHAKE SHACK MENU ");
        System.out.println("1. ShackBurger " + " W 6.9 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
        System.out.println("2. SmokeShack " + " W 8.9 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
        System.out.println("3. CheeseBurger " + " W 6.9 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
        System.out.println("4. Hamburger " + " W 5.4 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
        System.out.println("0. 종료");

        while(true){
            System.out.println("원하시는 항목의 숫자를 입력해주세요.: ");
            int select = sc.nextInt();// 입력 값을 받습니다.

            //반복문 시작
            switch (select){
                case 1:
                    System.out.println("1. ShackBurger " + " W 6.9 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
                    break;
                    case 2:
                        System.out.println("2. SmokeShack " + " W 8.9 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
                        break;
                        case 3:
                            System.out.println("3. CheeseBurger " + " W 6.9 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
                            break;
                            case 4:
                                System.out.println("4. Hamburger " + " W 5.4 "+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ");
                                break;
                                case 0:
                                    System.out.println("프로그램을 종료합니다.");
                                    return; // 0을 입력 시 리턴 값을 주고 프로그램을 종료 시킵니다.
                                    default:
                                        System.out.println("오류: 올바른 메뉴를 선택해주세요."); // 메뉴에 없는 번호 입력 시 예외처리 합니다.
            }
        }
    }
}
