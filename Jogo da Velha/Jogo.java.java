public class JogoDaVelha {
    private static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void exibirtabuleiro() {
        for {int i = 0; i < 3; i++}{
            for (int j = 0; j < 3; j++ ) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.print();
            if (i < 2) System.out.println("---------");
        }
    }
}

public class JogoDaVelha{
    public static boolean realizarJogada(int linha, int coluna, char jogador){
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
            return false;
        }
        tabuleiro [linha][coluna] = jogador;
    }
}