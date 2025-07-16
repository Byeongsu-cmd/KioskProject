    프로젝트 명 : 키오스크

설명
- 메뉴판을 본 후 원하는 메뉴를 선택시 선택 메뉴 표시해줍니다.
  0을 입력 시 프로그램을 종료하고 메뉴 이외의 숫자를 입력 시 예외처리 설정 값 출력 후 다시 입력 값을 받습니다.

구조
- Main에선 입력 값을 받아 출력 합니다.
- MenuItem에선 Main에서 입력한 값을 저장,관리 합니다.

느낀점
- 다음부터는 add 함수를 사용하여 리스트에 추가하는 방법을 활용하는 습관을 길러야할 것 같고 반복문에 정확한 조건을 입력해야 한다는 것을 느꼈습니다.
- menu.get(selectMenu).menuList(); 이것을 작성하면 System.out.print(menu.get(selectMenu).getNewName());
  System.out.print(menu.get(selectMenu).getNewPrice());
  System.out.println(menu.get(selectMenu).getNewDescription());을 한줄로 만들 수 있습니다.
- menu.get(selectMenu).menuList(); 해석하자면 메뉴라는 리스트를 통해 게터() 셀렉트메뉴라는 변수(스캐너로 입력받은 숫자-1)로 메뉴리스트를 참조 즉, 메뉴아이템이라는 저장소에 있는 출력 값 틀을 바탕으로 출력합니다. 
