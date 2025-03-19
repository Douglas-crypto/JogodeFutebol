package org.example.Classes;

import java.util.Scanner;

public class Jogador {
    String nome;
    int jogos;
    int gols;
    int assistencias;

    public void AtribuirValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do jogador: ");
        this.nome = scanner.nextLine();

        System.out.println("Informe a quantidade de jogos jogados: ");
        this.jogos = scanner.nextInt();

        System.out.println("Informe a quantidade de gols feitas: ");
        this.gols = scanner.nextInt();

        System.out.println("Informe a quantidade de assistências: ");
        this.assistencias = scanner.nextInt();
        scanner.nextLine(); 
    }

    public String ExibirValores() {
        return "Nome do jogador ou dos jogadores: " + nome + "\n" +
                "Quantidade de jogos jogados: " + jogos + "\n" +
                "Quantidade de gols: " + gols + "\n" +
                "Quantidade de assistências: " + assistencias;
    }

    public Jogador somarEstatisticas(Jogador outro) {
        Jogador resultado = new Jogador();
        resultado.nome = this.nome + " e " + outro.nome;
        resultado.jogos = this.jogos + outro.jogos;
        resultado.gols = this.gols + outro.gols;
        resultado.assistencias = this.assistencias + outro.assistencias;
        return resultado;
    }

    public Boolean isGood(Jogador jogador) {
        if (jogador.jogos > 5 && jogador.gols > 5 && jogador.assistencias > 5) {
            System.out.println("É um bom jogador");
            return true;
        } else {
            System.out.println("É um jogador ruim");
            return false;
        }
    }
}
