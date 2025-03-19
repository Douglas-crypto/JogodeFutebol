package org.example.Classes;

import java.util.Scanner;

public class Jogador {
    private static final Scanner scanner = new Scanner(System.in); 
    private String nome;
    private int jogos;
    private int gols;
    private int assistencias;

    public void atribuirValores() { 
        System.out.print("Informe o nome do jogador: ");
        this.nome = scanner.nextLine();

        System.out.print("Informe a quantidade de jogos jogados: ");
        this.jogos = scanner.nextInt();

        System.out.print("Informe a quantidade de gols feitos: ");
        this.gols = scanner.nextInt();

        System.out.print("Informe a quantidade de assistências: ");
        this.assistencias = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
    }

    public String exibirValores() {
        return "Nome: " + nome + "\n" +
               "Jogos: " + jogos + "\n" +
               "Gols: " + gols + "\n" +
               "Assistências: " + assistencias;
    }

    public Jogador somarEstatisticas(Jogador outro) {
        Jogador resultado = new Jogador();
        resultado.nome = this.nome + " e " + outro.nome;
        resultado.jogos = this.jogos + outro.jogos;
        resultado.gols = this.gols + outro.gols;
        resultado.assistencias = this.assistencias + outro.assistencias;
        return resultado;
    }

    public boolean isGood() {
        boolean bomJogador = jogos > 5 && gols > 5 && assistencias > 5;
        System.out.println(nome + (bomJogador ? " é um bom jogador" : " é um jogador mediano"));
        return bomJogador;
    }
}
