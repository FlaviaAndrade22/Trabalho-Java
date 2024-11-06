package Atletas;

public class Relatorio {

    public static float pesoMedio(Atleta[] atletas){
        float somaPeso = 0;
        for (int i = 0; i < atletas.length; i++){
            somaPeso += atletas[i].getPeso();
        }
        return somaPeso / atletas.length;
    }

    public static float calPorcentagemHomen(Atleta[] atletas) {
        int qtdHomens = 0;
        for (int i = 0; i < atletas.length; i++){
            if (atletas[i].getSexo() == 'M'){
                qtdHomens++;
            }
        } 
        return ((float) qtdHomens / atletas.length) * 100;
    }

    public static float calPorcentagemMulheres(Atleta[] atletas) {
        int qtdMulheres = 0;
        for (int i = 0; i < atletas.length; i++){
            if (atletas[i].getSexo() == 'F'){
                qtdMulheres++;
            }
        } 
        return ((float) qtdMulheres / atletas.length) * 100;
    }


    public static String encAtletaMaisAlto(Atleta[] atletas){
        Atleta maisAlto = atletas[0];
        for (int i = 1; i < atletas.length; i++){
            if (atletas[i].getAltura() > maisAlto.getAltura()){
                maisAlto = atletas[i];
            }
        }
        return maisAlto.getNome();

    }

    public static float calAlturaMediaHomens(Atleta[] atletas){
        int qtdHomens = 0;
        int somaAltura = 0;

        for (int i = 0; i < atletas.length; i++){
            if (atletas[i].getSexo() == 'M'){
                somaAltura += atletas[i].getAltura();
                qtdHomens++;
            }
        }

        return somaAltura / qtdHomens;
    }

    public static float calAlturaMediaMulher(Atleta[] atletas){
        int qtdMulheres = 0;
        int somaAltura = 0;

        for (int i = 0; i < atletas.length; i++){
            if (atletas[i].getSexo() == 'F'){
                somaAltura += atletas[i].getAltura();
                qtdMulheres++;
            }
        }
        if (qtdMulheres == 0){
            System.out.println("Não há mulheres cadastradas.");
            return -1;
        }

        return somaAltura / qtdMulheres;
    }

}
