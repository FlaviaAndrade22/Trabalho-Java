import java.util.Scanner;

public class JogoDaVelha {

    private static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogoAtivo = true;

        System.out.print("Digite o nome do Jogador 1 (X): ");
        String jogador1 = scanner.nextLine();
        System.out.print("Digite o nome do Jogador 2 (O): ");
        String jogador2 = scanner.nextLine();

        System.out.println("\nBem-vindos ao Jogo da Velha!");
        
        while (jogoAtivo) {
            exibirTabuleiro();
            System.out.println("\n" + (jogadorAtual == 'X' ? jogador1 : jogador2) + 
                               " (" + jogadorAtual + "), é sua vez!");
            System.out.print("Insira a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Insira a coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (coordenadaValida(linha, coluna)) {
                tabuleiro[linha][coluna] = jogadorAtual;
                if (verificarVencedor()) {
                    exibirTabuleiro();
                    System.out.println("\nParabéns! " + (jogadorAtual == 'X' ? jogador1 : jogador2) + 
                                       " venceu!");
                    jogoAtivo = false;
                } else if (tabuleiroCheio()) {
                    exibirTabuleiro();
                    System.out.println("\nO jogo terminou em empate!");
                    jogoAtivo = false;
                } else {
                    trocarJogador();
                }
            } else {
                System.out.println("Coordenada inválida! Tente novamente.");
            }
        }
        
        scanner.close();
    }

    private static void exibirTabuleiro() {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---+---+---");
        }
    }

    private static boolean coordenadaValida(int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ';
    }

    private static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    private static boolean verificarVencedor() {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) ||
                (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
               (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual);
    }

    private static boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}