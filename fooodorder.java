//menu
public class Menu {
    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " - Rp " + price;
    }
}



//foodorder
import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<Menu> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        menuItems = new ArrayList<Menu>();
        totalPrice = 0.0;
        isPaid = false;
    }

    public void addMenuItem(Menu item) {
        menuItems.add(item);
    }

    public void removeMenuItem(Menu item) {
        menuItems.remove(item);
    }

    public void calculateTotal() {
        totalPrice = 0.0;
        for (Menu item : menuItems) {
            totalPrice += item.getPrice();
        }
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Pesanan:\n");
        for (Menu item : menuItems) {
            orderDetails.append(item.toString()).append("\n");
        }
        orderDetails.append("Total Harga: Rp ").append(totalPrice).append("\n");
        orderDetails.append("Status Pembayaran: ").append(isPaid ? "Sudah Dibayar" : "Belum Dibayar");
        return orderDetails.toString();
    }
}

//main
public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();

        Menu nasiGoreng = new Menu("Nasi Goreng", 20000);
        Menu ayamBakar = new Menu("Ayam Bakar", 25000);
        Menu esTeh = new Menu("Es Teh", 5000);

        order.addMenuItem(nasiGoreng);
        order.addMenuItem(ayamBakar);
        order.addMenuItem(esTeh);

        order.calculateTotal();

        System.out.println(order);

        order.markAsPaid();

        System.out.println(order);
    }
}
