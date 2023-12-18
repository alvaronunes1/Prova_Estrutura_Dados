package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("<1> Inserir");
            System.out.println("<2> Excluir");
            System.out.println("<3> Pré-ordem");
            System.out.println("<4> Sair");
            System.out.print("Escolha uma opção: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Opção 1 selecionada - Inserir");
                    int[] elements = {50, 13, 5, 17, 9, 8, 10, 12, 55, 70};
                    for (int element : elements) {
                        avlTree.root = avlTree.insert(avlTree.root, element);
                    }
                    avlTree.print(avlTree.root, "", true);
                    System.out.println();
                    break;



                case 2:
                    System.out.println("Opção 2 selecionada - Excluir");
                    System.out.print("Digite o valor a ser excluído: ");
                    int valueToDelete = scanner.nextInt();
                    scanner.nextLine();
                    avlTree.root = avlTree.deleteNode(avlTree.root, valueToDelete);
                    avlTree.print(avlTree.root, "", true);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Opção 3 selecionada - Pré-ordem");
                    avlTree.preOrder(avlTree.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Você fechou, até a proxima!!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (choice != 4);

        scanner.close();
    }
}
