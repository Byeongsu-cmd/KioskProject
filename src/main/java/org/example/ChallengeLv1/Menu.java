package org.example.ChallengeLv1;

import java.util.List;

public class Menu {
    private final String category;
    private final List<MenuItem> menuItems;

    public Menu(String category,List<MenuItem> menuItems){
        this.category = category;
        this.menuItems = menuItems;
    }

    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void printCategory(){
        System.out.println(getCategory());
    }

    public void printMenuList(){
        for(int i=0;i<menuItems.size();i++){
            System.out.print(i+1+".");
            menuItems.get(i).printMenuItem();
        }
    }
}
