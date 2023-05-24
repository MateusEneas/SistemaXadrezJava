package aplicacao;

import xadrez.PartidaXadrez;

public class Program {

    public static void main(String[] args) {

        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printBoard(partidaXadrez.getPecas());
    }
}
