package Lampada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exemplo de criação da lâmpada com atributos personalizados
        Lampada lampada = new Lampada("Phillips", 100, "LED", "P5589L18", "Amarela", 25.00, "24 meses");

        System.out.println(">>> INÍCIO DO SOFTWARE DA LÂMPADA <<<");
        System.out.println("COR: " + lampada.getCor());
        System.out.println("MARCA: " + lampada.getMarca());
        System.out.println("MODELO: " + lampada.getModelo());
        System.out.println("WATTS: " + lampada.getVoltagem());
        System.out.println("TIPO: " + lampada.getTipo());
        System.out.println("GARANTIA: " + lampada.getGarantia());
        System.out.println("PREÇO - R$: " + lampada.getPreco());
        lampada.mostrarStatus();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("Ligar/Desligar lâmpada? 0 – Sair / 1 – Sim / 2 – Não: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lampada.mudarStatus();
                    lampada.mostrarStatus();
                    break;
                case 2:
                    lampada.mostrarStatus();
                    break;
                case 0:
                    System.out.println("*** Você encerrou o software. ***");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
