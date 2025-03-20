package org.example;
import java.util.Scanner;

public class Jogador {

    String nome;
    int jogos;
    int gols;
    int assistencias;

    public void atribuiDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do jogador: ");
        this.nome = scanner.next();

        System.out.println("Informe a quantidade de jogos: ");
        this.jogos = scanner.nextInt();

        System.out.println("Informe a quantidade de gols feita: ");
        this.gols = scanner.nextInt();

        System.out.println("Informe a quantidade de assistências: ");
        this.assistencias = scanner.nextInt();
    }

    public void exibirDados() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Quantidade de jogos: " + jogos);
        System.out.println("Quantidade de gols: " + gols);
        System.out.println("Quantidade de assistências: " + assistencias);
    }


    public Jogador somaAtributos(Jogador outro) {
        Jogador resultado = new Jogador();
        resultado.nome = this.nome + " e " + outro.nome;
        resultado.jogos = this.jogos + outro.jogos;
        resultado.gols = this.gols + outro.gols;
        resultado.assistencias = this.assistencias + outro.assistencias;
        return resultado;
    }


    public void exibirSomaAtributos(Jogador outro) {
        Jogador soma = this.somaAtributos(outro);
        System.out.println("Jogadores: " + soma.nome);
        System.out.println("Soma dos jogos: " + soma.jogos);
        System.out.println("Soma dos gols: " + soma.gols);
        System.out.println("Soma das assistências: " + soma.assistencias);
    }

    public void eBom() {
        if (jogos > 5 && gols > 5 && assistencias > 5) {
            System.out.println("É um bom jogador");
        } else {
            System.out.println("É um mal jogador");
        }
    }
}
