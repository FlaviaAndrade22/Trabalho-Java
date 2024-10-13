package Bar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de informações do cliente
        System.out.print("Sexo (F ou M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int qtdCervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int qtdEspetinhos = scanner.nextInt();

        // Criação do objeto Cliente
        Cliente cliente = new Cliente(sexo, qtdCervejas, qtdRefrigerantes, qtdEspetinhos);

        // Exibição do relatório de pagamento
        Bar.exibirRelatorio(cliente);

        scanner.close();
    }
}