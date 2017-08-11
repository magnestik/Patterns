import java.util.ArrayList;

class PancakeHouseMenu {
    private ArrayList menuItems;

    PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    private void addItem(String name, String description, boolean vegetarians, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarians,price);
        menuItems.add(menuItem);
    }

    ArrayList getMenuItems() {
        return menuItems;
    }

//    other menu methods here
}
