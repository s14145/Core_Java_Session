package arraylistAssignment;

import java.util.Objects;

public class Menu {

   private long menuId;
   private String menuName;
   private long parentMenuId;
   private boolean isLeaf;
   private String slug;

    public Menu() {
    }

    public Menu(long menuId, String menuName, long parentMenuId, boolean isLeaf, String slug) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentMenuId = parentMenuId;
        this.isLeaf = isLeaf;
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuId == menu.menuId && parentMenuId == menu.parentMenuId && isLeaf == menu.isLeaf && Objects.equals(menuName, menu.menuName) && Objects.equals(slug, menu.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, menuName, parentMenuId, isLeaf, slug);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", parentMenuId=" + parentMenuId +
                ", isLeaf=" + isLeaf +
                ", slug='" + slug + '\'' +
                '}';
    }
}