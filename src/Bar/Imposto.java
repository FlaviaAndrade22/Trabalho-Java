import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double rendaAnualSalario = scanner.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double rendaAnualServico = scanner.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double rendaAnualCapital = scanner.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        double salarioMensal = rendaAnualSalario / 12;
        double impostoSalario = 0.0;
        if (salarioMensal >= 3000 && salarioMensal < 5000) {
            impostoSalario = rendaAnualSalario * 0.10;
        } else if (salarioMensal >= 5000) {
            impostoSalario = rendaAnualSalario * 0.20;
        }

        double impostoServico = rendaAnualServico * 0.15;

        double impostoCapital = rendaAnualCapital * 0.20;

        double impostoBrutoTotal = impostoSalario + impostoServico + impostoCapital;

        double maximoDedutivel = impostoBrutoTotal * 0.30;
        double gastosDedutiveis = Math.min(gastosMedicos + gastosEducacionais, maximoDedutivel);

        double impostoDevido = impostoBrutoTotal - gastosDedutiveis;

        System.out.println("\n### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);

        System.out.println("\n* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);

        System.out.println("\n* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
        System.out.printf("Abatimento: %.2f\n", gastosDedutiveis);
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);

        scanner.close();
    }
}
