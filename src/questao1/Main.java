package questao1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Criar uma instância da pilha
        ArrayStack<String> pilhaNomes = new ArrayStack<>();

        // Carregar nomes do arquivo nomes.txt na pilha
        carregarNomesNaPilha(pilhaNomes);

        // Exibir a pilha
        System.out.println("Nomes na pilha:");
        exibirPilha(pilhaNomes);

        // Desempilhar e inserir na lista encadeada
        LinkedList<String> listaNomes = desempilharParaLista(pilhaNomes);

        // Exibir a lista encadeada
        System.out.println("\nNomes na lista encadeada:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }

    private static void carregarNomesNaPilha(ArrayStack<String> pilha) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Usuario\\12116455\\IdeaProjects\\AvEspecial\\nomes.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Adicionar cada nome na pilha
                pilha.push(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FullStackException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exibirPilha(ArrayStack<String> pilha) {
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }

    private static LinkedList<String> desempilharParaLista(ArrayStack<String> pilha) {
        LinkedList<String> lista = new LinkedList<>();
        while (!pilha.isEmpty()) {
            lista.addFirst(pilha.pop());
        }
        return lista;
    }
}
