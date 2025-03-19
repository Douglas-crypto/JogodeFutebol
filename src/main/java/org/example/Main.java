package org.example;

import org.example.Classes.Jogador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro do primeiro jogador:");
        Jogador jogador1 = new Jogador();
        jogador1.AtribuirValores();
        System.out.println();

        Jogador jogador2 = new Jogador();
        jogador2.AtribuirValores();
        jogador2.isGood(jogador2);

        System.out.println();

        System.out.println(jogador1.ExibirValores());

        System.out.println();

        System.out.println(jogador2.ExibirValores());

        Jogador estatisticasTotais = jogador1.somarEstatisticas(jogador2);
        System.out.println("\nEstatísticas somadas dos jogadores:");
        System.out.println(estatisticasTotais.ExibirValores());

        scanner.close();
    }
}
