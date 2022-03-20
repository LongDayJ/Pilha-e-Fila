import java.util.ArrayList;
import java.util.Scanner;

/*
NÃO SEI OQUE ACONTECEU, MAS TEM DAR RUN 2 VEZES PARA FUNCIONAR!
Autor: Juarez José da Silva Júnior
Instituição: Unifacol
*/

public class Pilha {
    static ArrayList<String> pilha = new ArrayList<String>();

    // Checagem de pilha vazia
    public static boolean vazio() {
        if (pilha.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Adicionar um item na pilha
    public static void push(String x) {
        pilha.add(x);
    }

    // Retirada de item da pilha
    public static void pop() {
        if (vazio() == true) {
            System.out.println("Error 404 - Não se pode retirar um item de uma Pilha Vazia");
        } else {
            System.out.println("O elemento " + pilha.get(pilha.size() - 1) + " será retirado");
            pilha.remove(pilha.size() - 1);
        }
    }

    // Pega o item do topo da pilha mas não apaga
    public static void stackpop() {
        if (vazio() == true) {
            System.out.println("Error 404 - Não se pode mostrar o topo com uma Pilha Vazia");
        } else {
            System.out.println("O elemento do topo é: " + pilha.get(pilha.size() - 1));
        }
    }

    // Limpa a Pilha inteira
    public static void clear() {
        if (vazio() == true) {
            System.out.println("Error 404 - Não se pode apagar uma Pilha Vazia");
        } else {
            System.out.println("A Pilha foi limpa.");
            pilha.clear();
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner numm = new Scanner(System.in);
            System.out.println("""
                    =-=-=-=-=-=-=-=-=-=
                    [1] Checagem se está vazio
                    [2] Adiciona um elemento a pilha
                    [3] Remove o item do Topo da pilha
                    [4] Mostra o item no Topo da pilha
                    [5] Limpa a pilha
                    [6] Mostra a pilha
                    [0] Encerra o Programa
                    =-=-=-=-=-=-=-=-=-=
                    """);
            int num = numm.nextInt();

            if (num == 1) {
                if (vazio() == true) {
                    System.out.println("A Pilha está Vazia");
                } else {
                    System.out.println("A Pilha não está Vazia");
                }
            }
            if (num == 2) {
                Scanner bob = new Scanner(System.in);
                System.out.println("Digite o elemento que você quer adicionar na pilha\n> ");
                String bobb = bob.next();
                push(bobb);

            }
            if (num == 3) {
                pop();

            }
            if (num == 4) {
                stackpop();

            }
            if (num == 5) {
                clear();
            }
            if (num == 6) {
                System.out.println("O último elemento é o do topo");
                System.out.println(pilha);
            }
            if (num == 0) {
                break;
            } else {
                break;
            }
        }

    }
}