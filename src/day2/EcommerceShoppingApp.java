package day2;

public class EcommerceShoppingApp {

    public static void main(String[] args) {

        // Women Fashion
        Menu womenFashion = new Menu();
        womenFashion.menuId = 1;
        womenFashion.menuName = "Women Fashion";
        womenFashion.parentMenuId = 0;
        womenFashion.isLeaf = false;
        womenFashion.slug = "women-fashion";

        // Men Fashion
        Menu menFashion = new Menu();
        menFashion.menuId = 2;
        menFashion.menuName = "Men Fashion";
        menFashion.parentMenuId = 0;
        menFashion.isLeaf = false;
        menFashion.slug = "men-fashion";

        // Women Fashion -> Women Clothing
        Menu womenClothing = new Menu();
        womenClothing.menuId = 3;
        womenClothing.menuName = "Women Clothing";
        womenClothing.parentMenuId = 1;
        womenClothing.isLeaf = false;
        womenClothing.slug = "women-clothing";

        // Men Fashion -> Men Clothing
        Menu menClothing = new Menu();
        menClothing.menuId = 4;
        menClothing.menuName = "Men Clothing";
        menClothing.parentMenuId = 2;
        menClothing.isLeaf = false;
        menClothing.slug = "men-clothing";

        // Women Fashion -> Women Clothing -> Saree
        Menu womenClothingSaree = new Menu();
        womenClothingSaree.menuId = 5;
        womenClothingSaree.menuName = "Saree";
        womenClothingSaree.parentMenuId = 3;
        womenClothingSaree.isLeaf = true;
        womenClothingSaree.slug = "women-clothing-saree";

        // Women Fashion -> Women Clothing -> Skirts
        Menu womenClothingSkirts = new Menu();
        womenClothingSkirts.menuId = 6;
        womenClothingSkirts.menuName = "Skirts";
        womenClothingSkirts.parentMenuId = 3;
        womenClothingSkirts.isLeaf = true;
        womenClothingSkirts.slug = "women-clothing-skirts";

        // Men Fashion -> Men Clothing -> T-Shirts
        Menu menClothingTShirts = new Menu();
        menClothingTShirts.menuId = 7;
        menClothingTShirts.menuName = "T-Shirts";
        menClothingTShirts.parentMenuId = 4;
        menClothingTShirts.isLeaf = true;
        menClothingTShirts.slug = "men-clothing-t-shirts";

        // Men Fashion -> Men Clothing -> Trousers
        Menu menClothingTrousers = new Menu();
        menClothingTrousers.menuId = 8;
        menClothingTrousers.menuName = "Trousers";
        menClothingTrousers.parentMenuId = 4;
        menClothingTrousers.isLeaf = true;
        menClothingTrousers.slug = "men-clothing-trousers";
    }
}
