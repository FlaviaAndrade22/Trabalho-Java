package Atletas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de atletas: ");
        int qtdAtletas = scanner.nextInt();
        scanner.nextLine();


        Atleta[] atletas = new Atleta[qtdAtletas];

        for (int i = 0; i < qtdAtletas; i++){

            System.out.println("Digite os dados do atleta numero " + (i + 1) + ":");
            
            
            System.out.print("Nome: ");
            String nome = scanner.next();


            char sexo;
            do {
                System.out.print("Sexo (F/M): ");
                sexo = scanner.next().charAt(0);
                if (sexo != 'M' && sexo != 'F'){
                    System.out.println("Valor invalido! Digite F ou M.");
                }
            }
            while (sexo != 'M' && sexo != 'F');


            float altura;
            do {
                System.out.print("Altura: ");
                altura = scanner.nextFloat();
                if (altura <= 0){
                    System.out.println("Valor invalido! Digite um valor positivo.");
                }
            }
            while (altura <= 0);

            float peso;
            do {
                System.out.print("Peso: ");
                peso = scanner.nextFloat();
                if (peso < 0){
                    System.out.println("Valor invalido! Digite um valor positivo.");
                }
            }
            while (peso < 0);

            atletas[i] = new Atleta(nome, sexo, altura, peso);
        }


        System.out.println("\n::: Relatório :::");
        System.out.printf("Peso médio dos atletas: %.2f\n", Relatorio.pesoMedio(atletas));
        System.out.printf("altura média dos homens: %.2f\n", Relatorio.calAlturaMediaHomens(atletas));
        System.out.println("Atleta mais alto: " + Relatorio.encAtletaMaisAlto(atletas));
        System.out.printf("Porcentagem de homens: %.1f%%\n", Relatorio.calPorcentagemHomen(atletas));

        float alturaMediaMulher = Relatorio.calAlturaMediaMulher(atletas);
        if (alturaMediaMulher != -1){
            System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulher);
            System.out.printf("Porcentagem de mulheres: %.1f%%\n", Relatorio.calPorcentagemMulheres(atletas));
        }
        
        scanner.close();
    }

}
