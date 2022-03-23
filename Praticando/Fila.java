import java.util.ArrayList;

public class Fila {
    static ArrayList<Animal> animais = new ArrayList<>();

    static void push(String x, int y) {
        animais.add(new Animal(x, y));
    }

    static void pop() {
        System.out.println("\n" + animais.get(0) + "será retirado da fila.");
        animais.remove(0);
    }

    static void List() {
        for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));
        }
    }

    public static void main(String[] args) {
        push("Tob", 48);
        push("Lulu", 24);
        push("Bob", 6);

        System.out.println("");
        pop();
        pop();

        push("Lili", 12);

        System.out.println("");
        List();
    }
}
