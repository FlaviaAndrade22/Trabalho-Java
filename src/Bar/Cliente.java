package Bar;

public class Cliente {
    public char sexo;
    public int qtdCervejas;
    public int qtdRefrigerantes;
    public int qtdEspetinhos;

    // Construtor
    public Cliente(char sexo, int qtdCervejas, int qtdRefrigerantes, int qtdEspetinhos) {
        this.sexo = sexo;
        this.qtdCervejas = qtdCervejas;
        this.qtdRefrigerantes = qtdRefrigerantes;
        this.qtdEspetinhos = qtdEspetinhos;
    }

    // Getters
    public char getSexo() {
        return sexo;
    }

    public int getQtdCervejas() {
        return qtdCervejas;
    }

    public int getQtdRefrigerantes() {
        return qtdRefrigerantes;
    }

    public int getQtdEspetinhos() {
        return qtdEspetinhos;
    }
}
