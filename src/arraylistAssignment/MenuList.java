package arraylistAssignment;

import java.util.ArrayList;

public class MenuList {

    public static void main(String[] args) {

        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu(1, "Women Fashion", 0, false, "women-fashion"));
        menuList.add(new Menu(2, "Men Fashion", 0, false, "men-fashion"));
        menuList.add(new Menu(3, "Clothing", 1, false, "women-fashion"));
        menuList.add(new Menu(4, "Clothing", 2, false, "men-fashion"));
        menuList.add(new Menu(5, "Saree", 3, true, "women-clothing-saree"));
        menuList.add(new Menu(6, "T-Shirts", 4, true, "men-clothing-t-shirts"));

        // Printing all the menu in the menuList
        for (Menu menu : menuList) {
            System.out.println(menu);
        }

        // Update menu in menuList
        menuList.set(4, new Menu(5, "Skirts", 3, true, "women-clothing-skirts"));

        System.out.println("\n");
        System.out.println("Printing all the menu after update operation:");
        for (Menu menu : menuList) {
            System.out.println(menu);
        }

        // Delete menu from menuList
        menuList.remove(new Menu(6, "T-Shirts", 4, true, "men-clothing-t-shirts"));
        menuList.remove(4);

        System.out.println("\n");
        System.out.println("Printing all the menu after delete operation:");
        for (Menu menu : menuList) {
            System.out.println(menu);
        }
    }
}