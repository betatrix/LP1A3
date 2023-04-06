//Exercício 3 - Collections

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> arrayListA = new ArrayList<>();
        List<String> arrayListB = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        Scanner entrada = new Scanner(System.in);

            try {
                for (int i = 0; i < 2; i++) {
                    System.out.print("Preencha a lista A: ");
                    String String = entrada.nextLine();
                    if (String.matches(".*\\d.*")) {
                        throw new Exception("Você não pode inserir números nesta lista. Tente novamente!");
                    }
                    arrayListA.add(String);
                }

                for (int i = 0; i < 2; i++) {
                    System.out.print("Preencha a lista B: ");
                    String String = entrada.nextLine();
                    if (String.matches(".*\\d.*")) {
                        throw new Exception("Você não pode inserir números nesta lista. Tente novamente!");
                    }
                    arrayListB.add(String);
                }

                for (int i = 0; i < 2; i++) {
                    System.out.print("Preencha a linked list: ");
                    String String = entrada.nextLine();
                    if (String.matches(".*\\d.*")) {
                        throw new Exception("Você não pode inserir números nesta lista. Tente novamente!");
                    }
                    linkedList.add(String);
                }

            } catch (Exception e) {
                System.out.print(e.getMessage());
                System.out.println(" ");
            }

        System.out.println("ArrayList A: " + arrayListA);
        System.out.println("ArrayList B: " + arrayListB);
        System.out.println("LinkedList: " + linkedList);

        // 1
        arrayListA.addAll(arrayListB);
        arrayListA.addAll(linkedList);

        // 2
        String elemento = arrayListB.get(1);
        boolean contemElemento = arrayListA.contains(elemento);
        System.out.println("A lista A contém o elemento " + elemento + "? " + contemElemento);

        // 3
        boolean contemTodosElementos = arrayListA.containsAll(linkedList);
        System.out.println("A lista A contém todos os elementos da linked list? " + contemTodosElementos);

        // 4
        boolean igual = arrayListA.equals(arrayListB);
        System.out.println("A lista A é igual a lista B? " + igual);

        // 5
        System.out.println("Elemento 2 da lista A: " + arrayListA.get(1));
        System.out.println("Elemento 2 da lista B: " + arrayListA.get(1));
        System.out.println("Elemento 2 da linked list " + linkedList.get(1));

        // 6
        linkedList.remove(0);

        // 7
        arrayListA.removeAll(linkedList);

        // 8
        int tamanhoListaA = arrayListA.size();
        System.out.println("Tamanho da lista A: " + tamanhoListaA);

        // 9
        linkedList.clear();

        // 10
        boolean linkedListEmpty = linkedList.isEmpty();
        System.out.println("A linked list está vazia? " + linkedListEmpty);

        // 11
        System.out.println("Elementos da lista A:");
        for (String value : arrayListA) {
            System.out.println(value);
        }
    }
}
