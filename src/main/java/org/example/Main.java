package org.example;

import org.example.Classes.Jogador;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cadastro do primeiro jogador:");
        Jogador jogador1 = new Jogador();
        jogador1.atribuirValores();
        System.out.println();

        System.out.println("Cadastro do segundo jogador:");
        Jogador jogador2 = new Jogador();
        jogador2.atribuirValores();
        System.out.println();

        jogador1.isGood();
        jogador2.isGood();

        System.out.println("\nInformações dos jogadores:");
        System.out.println(jogador1.exibirValores());
        System.out.println();
        System.out.println(jogador2.exibirValores());

        // Somando estatísticas dos jogadores
        Jogador estatisticasTotais = jogador1.somarEstatisticas(jogador2);
        System.out.println("\nEstatísticas somadas dos jogadores:");
        System.out.println(estatisticasTotais.exibirValores());
    }
}
