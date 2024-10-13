package Bar;

public class Bar {

    public static double calcularValorTotal(Cliente cliente) {

        double precoIngresso = (cliente.getSexo() == 'M' || cliente.getSexo() == 'm') ? 10.00 : 8.00;

        double consumo = (cliente.getQtdCervejas() * 5.00) +
                         (cliente.getQtdRefrigerantes() * 3.00) +
                         (cliente.getQtdEspetinhos() * 7.00);

        double couvert = (consumo > 30.00) ? 0.00 : 4.00;

        return precoIngresso + consumo + couvert;
    }

    public static void exibirRelatorio(Cliente cliente) {
        
        double precoIngresso = (cliente.getSexo() == 'M' || cliente.getSexo() == 'm') ? 10.00 : 8.00;

        double consumo = (cliente.getQtdCervejas() * 5.00) +
                         (cliente.getQtdRefrigerantes() * 3.00) +
                         (cliente.getQtdEspetinhos() * 7.00);

        double couvert = (consumo > 30.00) ? 0.00 : 4.00;

        double valorTotal = precoIngresso + consumo + couvert;

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", consumo);
        System.out.printf("Couvert = R$ %.2f\n", couvert);
        System.out.printf("Ingresso = R$ %.2f\n", precoIngresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);
    }
}