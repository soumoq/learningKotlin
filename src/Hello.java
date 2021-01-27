import java.util.*;
public class Hello {
    private String name;
    public static void main(String[] args) {
        String string = new String("Soumo");
        System.out.println(string);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
