package org.example.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menu =new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menu.add(new MenuItem("1. ShackBurger ", 6.9," 토마토, 양상추, 쉑소스가 토핑된 치즈버거 "));
        menu.add(new MenuItem("2. SmokeShack ",8.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거 "));
        menu.add(new MenuItem("3. CheeseBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("4. Hamburger ",5.4,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));

        Scanner sc = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력


        while(true){
            System.out.println(" SHAKE SHACK MENU ");
            for(int i=0;i<menu.size();i++){ //menu.size()는 배열의 길이, length()는 문자열의 길이 주의해서 사용
                menu.get(i).menuList();
            }
            System.out.println("0. 종료");


            // 숫자를 입력 받기
            System.out.println("원하시는 항목의 숫자를 입력해주세요.: ");
            int select = sc.nextInt();


            // 입력된 숫자에 따른 처리
            if (select==0){ // 프로그램을 종료
                System.out.println("주문을 종료합니다.");
                break;
            }
            else if(select>0&&select<menu.size()){// 제한 조건을 주지 않으면 else 조건이 작동하지 않는다. 그래서 배열의 길이를 제한으로 조건문 작성했음.
                int selectMenu=select-1; // 컴퓨터는 0부터 인식하기 때문에
                //선언한 메뉴리스트를 활용하여 입력한 숫자보다 1이 작은 공간에 저장되어 있는 값을 불러온다.
                System.out.print(menu.get(selectMenu).getNewName()); //선택한 메뉴 : 이름, 가격, 설명
                System.out.print(menu.get(selectMenu).getNewPrice());
                System.out.println(menu.get(selectMenu).getNewDescription());
            } else {
                System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
            }
        }
    }
}
