    프로젝트 명 : 키오스크

설명
- 메뉴판을 본 후 원하는 메뉴를 선택시 선택 메뉴 표시해줍니다.
  0을 입력 시 프로그램을 종료하고 메뉴 이외의 숫자를 입력 시 예외처리 설정 값 출력 후 다시 입력 값을 받습니다.

구조
- Main에서 입력 값을 받으면 MenuItemList로 입력 값 정보가 저장되고 Kiosk의 List는 그 값을 참조하여 같은 List를 입력 받습니다.
- Main에서 Kiosk 객체를 생성하고, 그 객체의 start() 메서드를 호출해서, 메뉴 출력과 사용자 입력을 처리하는 로직을 실행합니다.
- While로 프로그램이 반복되게 하였고 try-catch와 if-else를 활용하여 예외 처리를 하였습니다.

느낀점
- 키오스크 클래스를 하나 더 추가하면서 구조에 대해 고민을 많이 한 단계이고 start 함수를 사용함으로써 각 클래스의 역할을 더 세부적으로 나눌 수 있었습니다.