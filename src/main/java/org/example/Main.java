package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando dois jogadores
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        // Atribuindo dados aos jogadores
        System.out.println("Informe os dados do Jogador 1:");
        jogador1.atribuiDados();

        System.out.println("Informe os dados do Jogador 2:");
        jogador2.atribuiDados();

        // Exibindo os dados dos jogadores
        System.out.println("\nInformações do Jogador 1:");
        jogador1.exibirDados();

        System.out.println("\nInformações do Jogador 2:");
        jogador2.exibirDados();

        // Calculando as somas dos atributos
        int[] somas = jogador1.somaAtributos(jogador2);

        // Exibindo as somas dos atributos
        System.out.println("\nSoma dos atributos dos jogadores:");
        System.out.println("Jogadores: " + jogador1.nome + " e " + jogador2.nome);
        jogador1.exibirSomaAtributos(somas);

        // Verificando se o Jogador 1 é bom
        System.out.println("\nAvaliação do Jogador 1:");
        boolean jogador1Bom = jogador1.eBom(); // Exibe a mensagem e armazena o resultado

        // Verificando se o Jogador 2 é bom
        System.out.println("\nAvaliação do Jogador 2:");
        boolean jogador2Bom = jogador2.eBom(); // Exibe a mensagem e armazena o resultado

        // Exemplo de uso do retorno booleano
        if (jogador1Bom && jogador2Bom) {
            System.out.println("\nAmbos os jogadores são bons!");
        } else if (jogador1Bom || jogador2Bom) {
            System.out.println("\nApenas um dos jogadores é bom.");
        } else {
            System.out.println("\nNenhum dos jogadores é bom.");
        }
    }
}
