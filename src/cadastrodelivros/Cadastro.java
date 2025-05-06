package cadastrodelivros;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        while (true) {
            System.out.println("Cadastro de Livros");
            System.out.println("1. Cadastrar livros");
            System.out.println("2. Exibir livros cadastrados");
            System.out.println("3. Sair");
            System.out.println("Escolha uma Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o titulo do livro: ");
                String titulo = scanner.nextLine();

                System.out.println("Digite o autor do livro: ");
                String autor = scanner.nextLine();

                System.out.println("Digite o ano de publicação: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                Livro livro = new Livro(titulo, autor, ano);
                livros.add(livro);

                System.out.println("Livro cadastrado com sucesso.\n");
            } else if (opcao == 2) {
                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado ainda.\n");
                } else {
                    System.out.println("\nLivros cadastrados:");
                    for (Livro livro : livros) {
                        livro.exibirInfo();
                        System.out.println();
                    }
                }
            } else if (opcao == 3){
                System.out.println("Saindo...");
                break;
            }else {
                System.out.println("Opção invalida! Tente novamente.\n");
            }
        }
        scanner.close();
    }
}




