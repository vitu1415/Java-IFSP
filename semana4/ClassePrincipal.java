package semana4;

import semana4.pacoteA.Contato;

import java.util.Scanner;

public class ClassePrincipal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int seguir = 1;
        while(seguir != 2){
            System.out.println("\n\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar nova pessoa");
            System.out.println("2 - sair do programa");
            System.out.print("Opcao: ");
            seguir = scanner.nextInt();
            scanner.nextLine();
            switch (seguir) {
                case 1:
                    System.out.print("\ndigite seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite sua idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite seu CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite seu e-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite seu telefone: ");
                    String telefone  = scanner.nextLine();
                    System.out.print("Digite o nome da rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Digite o numero: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o complemento: ");
                    String complemento = scanner.nextLine();
                    System.out.print("Digite o bairro: ");
                    String bairo = scanner.nextLine();
                    System.out.print("Digite a cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Digite estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("Digite o CEP: ");
                    int cep = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("É uma casa (true/false): ");
                    Boolean casa = scanner.nextBoolean();

                    Endereco endereco = new Endereco(rua, cidade, numero, cep, casa, complemento, bairo, estado);
                    Contato contato = new Contato(email, telefone);
                    Pessoa pessoa = new Pessoa(nome, idade, cpf, contato, endereco);

                    System.out.println("\nCadastro realizado com sucesso!");
                    System.out.print(pessoa.apresentar());
                case 2:
                    System.out.print("Sistema encerrado. Até logo");
                default:
                    System.out.println("Digite um valor do menu :)");
            }
        }

        scanner.close();
    }
}
