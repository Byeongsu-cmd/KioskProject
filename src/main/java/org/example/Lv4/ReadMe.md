    프로젝트 명 : 키오스크

설명
- 메뉴판을 본 후 원하는 카테고리의 번호를 입력 시 선택 카테고리의 메뉴 리스트를 보여준 후 그 메뉴 리스트에서 원하는 메뉴를 입력 시 그 음식의 정보가 출력 됩니다.

구조
- Main에서 입력 값을 받으면 MenuItemList로 음식 리스트의 입력 값 정보가 저장되고 Menu로 카테고리 리스트의 정보가 저장됩니다.
- Menu는 MenuItem의 상위 클래스로써 MenuItem의 정보를 포함하고 있습니다.
- start 함수가 실행 되면서 카테고리의 메뉴가 출력되며 Scanner가 입력 값을 받기위해 대기합니다. 유저가 입력 값을 입력 시 선택한 메뉴의 리스트가 출력 되며 그곳에서 다시 새로운 입력 값을 받기 위해 프로그램이 대기를 합니다.
- 메뉴 리스트에서 원하는 음식을 입력 시 그 음식의 정보가 출력되고 다시 메뉴 리스트가 출력되며 유저가 더 원하는 음식이 있다면 다시 입력 대기상태가 됩니다.
- 만약 원하는 음식이 없다면 0을 눌러 카테고리로 이동하여 다시 입력 값을 대기하고 카테고리에서도 원하는 상품이 없다면 0을 입력 받아 프로그램을 종료합니다.
- 카테고리와 메뉴 리스트에서 숫자 이외의 입력을 할 시 예외 처리로 문구가 출력되면서 다시 입력 할 수 있도록 각각의 초기 화면(카테고리는 카테고리, 메뉴 리스트는 메뉴 리스트가 초기 화면입니다.)이 다시 출력 됩니다.

느낀점
- 이번 객체 지향 설계를 활용하면서 아직 내가 이해하는 것이 부족하다고 생각합니다. 그래서 더 많은 연습과 다시 이해하기 위해 노력을 해야겠다고 생각했습니다.