package org.example;

import org.example.Classes.Jogador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro do primeiro jogador:");
        Jogador jogador1 = new Jogador();
        jogador1.AtribuirValores(scanner);
        System.out.println();

        System.out.println("Cadastro do segundo jogador:");
        Jogador jogador2 = new Jogador();
        jogador2.AtribuirValores(scanner);
        System.out.println();

        jogador1.isGood();
        jogador2.isGood();

        System.out.println("\nInformações dos jogadores:");
        System.out.println(jogador1.ExibirValores());
        System.out.println();
        System.out.println(jogador2.ExibirValores());

        // Somando estatísticas dos jogadores
        Jogador estatisticasTotais = jogador1.somarEstatisticas(jogador2);
        System.out.println("\nEstatísticas somadas dos jogadores:");
        System.out.println(estatisticasTotais.ExibirValores());

        scanner.close();
    }
}
