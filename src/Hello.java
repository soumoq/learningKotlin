import java.util.*;

public class Hello {
    private String name;

    public static void main(String[] args) {
        Z z = new Z("5");
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
