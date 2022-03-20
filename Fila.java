import java.util.ArrayList;
import java.util.Scanner;

public class Fila {
    static ArrayList<String> fila = new ArrayList<>();

    public static boolean vazio() {
        if (fila.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void push(String x) {
        fila.add(x);
    }

    public static void pop() {
        if (vazio() == true) {
            System.out.println("Error 404 - Não se pode retirar um item de uma Fila Vazia");
        } else {
            System.out.println("O elemento " + fila.get(0) + " será retirado");
            fila.remove(0);
        }
    }

    public static void stackpop() {
        if (vazio() == true) {
            System.out.println("Error 404 - Não é possível mostrar começo de uma Fila Vazia");

        } else {
            System.out.println("O elemento " + fila.get(0) + " é o começo da fila");
        }
    }

    public static void clear() {
        if (vazio() == true) {
            System.out.println("Error 404 - Não se pode apagar uma Fila Vazia");
        } else {
            System.out.println("A Fila foi limpa");
            fila.clear();
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner numb = new Scanner(System.in);
            System.out.println("""
                    =-=-=-=-=-=-=-=-=-=
                    [1] Checagem se está vazio
                    [2] Adiciona um elemento a Fila
                    [3] Remove o item do começo da Fila
                    [4] Mostra o item no começo da Fila
                    [5] Limpa a Fila
                    [6] Mostra a Fila
                    [0] Encerra o Programa
                    =-=-=-=-=-=-=-=-=-=
                    """);
            int numa = numb.nextInt();

            if (numa == 1) {
                if (vazio() == true) {
                    System.out.println("A Fila está Vazia");
                } else {
                    System.out.println("A Fila tem Pessoas");
                }

            }
            if (numa == 2) {
                Scanner filab = new Scanner(System.in);
                System.out.println("Digite oque você quer adicionar a Fila\n> ");
                String filaa = filab.next();
                push(filaa);
            }
            if (numa == 3) {
                pop();

            }
            if (numa == 4) {
                stackpop();

            }
            if (numa == 5) {
                clear();

            }
            if (numa == 6) {
                System.out.println(fila);

            }
            if (numa == 0) {
                break;
            } else {
                break;
            }
        }
    }
}
