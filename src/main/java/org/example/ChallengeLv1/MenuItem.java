package org.example.ChallengeLv1;

public class MenuItem {
    private final String menuItemName;
    private final Double menuItemPrice;
    private final String menuItemDescription;

    public MenuItem(String menuItemName, Double menuItemPrice, String menuItemDescription) {
        this.menuItemName = menuItemName;
        this.menuItemPrice = menuItemPrice;
        this.menuItemDescription = menuItemDescription;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public Double getMenuItemPrice() {
        return menuItemPrice;
    }

    public String getMenuItemDescription() {
        return menuItemDescription;
    }

    public void printMenuItem() {
        System.out.println(getMenuItemName() + " | W " + getMenuItemPrice() + " | " + getMenuItemDescription());
    }
}
