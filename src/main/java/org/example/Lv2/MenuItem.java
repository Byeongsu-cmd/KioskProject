package org.example.Lv2;




public class MenuItem {
    private String newName;
    private Double newPrice;
    private String newDescription;

    //생성장 생성
    public MenuItem(String newName, Double newPrice, String newDescription){
        this.newName = newName;
        this.newPrice = newPrice;
        this.newDescription = newDescription;
    }

    // getter를 사용하여 정보를 리스트에 안전하게 저장
    public String getNewName() {
        return newName;
    }

    public Double getNewPrice() {
        return newPrice;
    }
    public String getNewDescription() {
        return newDescription;
    }

    //출력 값 틀
    public void menuList() {
        System.out.println(newName+" W"+newPrice+" "+newDescription);
    }

}

