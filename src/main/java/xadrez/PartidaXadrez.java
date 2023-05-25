package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez() {
        tabuleiro = new Tabuleiro(8,8);
        partidaInicial();
    }

    public PecaXadrez[][] getPecas() {
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

    private void novaPeca(char coluna, int linha, PecaXadrez peca) {
        tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
    }

    private void partidaInicial() {
        novaPeca('c', 1, new Torre(tabuleiro, Color.BRANCO));
        novaPeca('c', 2, new Torre(tabuleiro, Color.BRANCO));
        novaPeca('d', 2, new Torre(tabuleiro, Color.BRANCO));
        novaPeca('e', 2, new Torre(tabuleiro, Color.BRANCO));
        novaPeca('e', 1, new Torre(tabuleiro, Color.BRANCO));
        novaPeca('d', 1, new Rei(tabuleiro, Color.BRANCO));

        novaPeca('c', 7, new Torre(tabuleiro, Color.PRETO));
        novaPeca('c', 8, new Torre(tabuleiro, Color.PRETO));
        novaPeca('d', 7, new Torre(tabuleiro, Color.PRETO));
        novaPeca('e', 7, new Torre(tabuleiro, Color.PRETO));
        novaPeca('e', 8, new Torre(tabuleiro, Color.PRETO));
        novaPeca('d', 8, new Rei(tabuleiro, Color.PRETO));
    }
}
