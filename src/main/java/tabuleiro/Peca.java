package tabuleiro;

public class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
