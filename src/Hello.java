import java.util.*;

public class Hello {
    private String name;

    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Hp", 3000));
        Shop.INSTANCE.setLaptop(laptops);
        Shop.INSTANCE.show(laptops.get(0));

    }
}

class Z {
    Z() {
        System.out.println("Default");
    }

    Z(int i) {
        System.out.println("int");
    }

    Z(String i) {
        this();
        System.out.println("String");
    }
}
