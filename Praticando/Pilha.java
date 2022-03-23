import java.util.ArrayList;

public class Pilha {
    static ArrayList<Animal> animais = new ArrayList<>();

    static void push(String x, int y) {
        animais.add(new Animal(x, y));
    }

    static void pop() {
        System.out.println("\n" + animais.get(animais.size() - 1) + "será retirado da pilha.");
        animais.remove(animais.size() - 1);
    }

    static void List() {
        for (int i = animais.size() - 1; i >= 0; i--) {
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
