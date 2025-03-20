package org.example;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        System.out.println("Informe os dados do Jogador 1:");
        jogador1.atribuiDados();

        System.out.println("Informe os dados do Jogador 2:");
        jogador2.atribuiDados();

        System.out.println("\nInformações do Jogador 1:");
        jogador1.exibirResultados();

        System.out.println("\nInformações do Jogador 2:");
        jogador2.exibirResultados();

        System.out.println("\nSoma dos atributos dos jogadores:");
        jogador1.exibirSomaAtributos(jogador2);

        System.out.println("\nAvaliação do Jogador 1:");
        jogador1.eBom();

        System.out.println("\nAvaliação do Jogador 2:");
        jogador2.eBom();
    }
}
