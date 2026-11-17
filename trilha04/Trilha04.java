package trilha04;


import java.util.Scanner;

public class Trilha04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== TRILHA 04 - VETORES =====");
            System.out.println("1 - Análise de Desempenho de uma Turma");
            System.out.println("2 - Análise Mensal de Faturamento");
            System.out.println("3 - Doações");
            System.out.println("4 - FarmaZoom");
            System.out.println("5 - Jogo da Forca");
            System.out.println("6 - Projeto Fitness");
            System.out.println("7 - Histórico de Transações");
            System.out.println("8 - Controle de Estoque");
            System.out.println("9 - Controle de Tarefas");
            System.out.println("10 - Troca de Figurinhas");
            System.out.println("0 - Sair");
            System.out.print("Escolha um exercício: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    analiseTurma(entrada);
                    break;
                case 2:
                    analiseFaturamento(entrada);
                    break;
                case 3:
                    doacoes(entrada);
                    break;
                case 4:
                    farmaZoom(entrada);
                    break;
                case 5:
                    jogoForca(entrada);
                    break;
                case 6:
                    projetoFitness(entrada);
                    break;
                case 7:
                    historicoTransacoes(entrada);
                    break;
                case 8:
                    controleEstoque(entrada);
                    break;
                case 9:
                    controleTarefas(entrada);
                    break;
                case 10:
                    trocaFigurinhas(entrada);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        entrada.close();
    }

    // 1 - Análise de Desempenho de uma Turma
    public static void analiseTurma(Scanner entrada) {
        int quantidade = entrada.nextInt();

        if (quantidade <= 0) {
            return;
        }

        double[] notas = new double[quantidade];

        double soma = 0;
        double maior = 0;
        double menor = 10;

        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < quantidade; i++) {
            notas[i] = entrada.nextDouble();

            soma += notas[i];

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            if (notas[i] >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / quantidade;

        System.out.println(">> Resultado da Turma <<");

        System.out.print("Notas informadas: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(formatar(notas[i]));

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Média da turma: " + formatar(media));
        System.out.println("Maior nota: " + formatar(maior));
        System.out.println("Menor nota: " + formatar(menor));
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        if (reprovados == 0) {
            System.out.println("Situação geral: Todos os alunos foram aprovados");
        } else {
            System.out.println("Situação geral: Nem todos os alunos foram aprovados");
        }
    }

    // 2 - Análise Mensal de Faturamento
    public static void analiseFaturamento(Scanner entrada) {
        int quantidade = entrada.nextInt();

        if (quantidade <= 0) {
            return;
        }

        double[] faturamento = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            faturamento[i] = entrada.nextDouble();
        }

        boolean crescimento = true;
        boolean queda = true;
        boolean constante = true;

        for (int i = 1; i < quantidade; i++) {

            if (faturamento[i] < faturamento[i - 1]) {
                crescimento = false;
            }

            if (faturamento[i] > faturamento[i - 1]) {
                queda = false;
            }

            if (faturamento[i] != faturamento[i - 1]) {
                constante = false;
            }
        }

        System.out.println(">> Análise de Faturamento <<");

        System.out.print("Faturamento informado: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(formatar(faturamento[i]));

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        if (constante) {
            System.out.println("Situação: Constante");
        } else if (crescimento) {
            System.out.println("Situação: Crescimento");
        } else if (queda) {
            System.out.println("Situação: Queda");
        } else {
            System.out.println("Situação: Sem padrão");
        }
    }

    // 3 - Doações
    public static void doacoes(Scanner entrada) {
        entrada.nextLine();

        String projeto = entrada.nextLine();

        int quantidade = entrada.nextInt();
        double meta = entrada.nextDouble();

        if (quantidade <= 0) {
            return;
        }

        double[] doacoes = new double[quantidade];

        double total = 0;
        double maior = 0;

        for (int i = 0; i < quantidade; i++) {
            doacoes[i] = entrada.nextDouble();

            total += doacoes[i];

            if (doacoes[i] > maior) {
                maior = doacoes[i];
            }
        }

        System.out.println(">> Resumo das Doações <<");
        System.out.println("Projeto: " + projeto);

        System.out.print("Doações recebidas: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(formatar(doacoes[i]));

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Total arrecadado: " + formatar(total));
        System.out.println("Maior doação: " + formatar(maior));

        if (total >= meta) {
            System.out.println("Situação: Meta atingida");
        } else {
            System.out.println("Situação: Meta não atingida");
        }
    }

    // 4 - FarmaZoom
    public static void farmaZoom(Scanner entrada) {
        int quantidade = entrada.nextInt();

        if (quantidade <= 0) {
            return;
        }

        double[] farmaciaA = new double[quantidade];
        double[] farmaciaB = new double[quantidade];

        double totalA = 0;
        double totalB = 0;

        int maisBaratosA = 0;
        int maisBaratosB = 0;
        int mesmoPreco = 0;

        for (int i = 0; i < quantidade; i++) {
            farmaciaA[i] = entrada.nextDouble();
            totalA += farmaciaA[i];
        }

        for (int i = 0; i < quantidade; i++) {
            farmaciaB[i] = entrada.nextDouble();
            totalB += farmaciaB[i];
        }

        for (int i = 0; i < quantidade; i++) {
            if (farmaciaA[i] < farmaciaB[i]) {
                maisBaratosA++;
            } else if (farmaciaB[i] < farmaciaA[i]) {
                maisBaratosB++;
            } else {
                mesmoPreco++;
            }
        }

        System.out.println("FARMAZOOM");

        System.out.print("Farmácia A: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(formatar(farmaciaA[i]));

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.print("Farmácia B: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(formatar(farmaciaB[i]));

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nProdutos mais Baratos");
        System.out.println("Na Farmácia A: " + maisBaratosA);
        System.out.println("Na Farmácia B: " + maisBaratosB);
        System.out.println("Mesmo preço: " + mesmoPreco);

        System.out.println("Total");
        System.out.println("Farmácia A: R$ " + formatar(totalA));
        System.out.println("Farmácia B: R$ " + formatar(totalB));

        System.out.println("Melhor opção");

        if (totalA < totalB) {
            System.out.println("Farmácia A");
        } else if (totalB < totalA) {
            System.out.println("Farmácia B");
        } else {
            System.out.println("Empate");
        }
    }

    // 5 - Jogo da Forca
    public static void jogoForca(Scanner entrada) {
        entrada.nextLine();

        String palavra = entrada.nextLine().toUpperCase();

        char[] secreta = palavra.toCharArray();
        char[] descoberta = new char[secreta.length];

        for (int i = 0; i < descoberta.length; i++) {
            descoberta[i] = '_';
        }

        int erros = 0;

        while (erros < 7 && !palavraCompleta(descoberta)) {

            char letra = entrada.nextLine().toUpperCase().charAt(0);

            boolean encontrou = false;

            for (int i = 0; i < secreta.length; i++) {
                if (secreta[i] == letra) {
                    descoberta[i] = letra;
                    encontrou = true;
                }
            }

            if (!encontrou) {
                erros++;
            }

            System.out.print("Forca: ");

            for (int i = 0; i < descoberta.length; i++) {
                System.out.print(descoberta[i] + " ");
            }

            System.out.println();
            System.out.println("Erros: " + erros);
        }

        if (palavraCompleta(descoberta)) {
            System.out.println("Parabéns! Você descobriu a palavra.");
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }
    }

    public static boolean palavraCompleta(char[] palavra) {
        for (int i = 0; i < palavra.length; i++) {
            if (palavra[i] == '_') {
                return false;
            }
        }

        return true;
    }

    // 6 - Projeto Fitness
    public static void projetoFitness(Scanner entrada) {
        int quantidade = entrada.nextInt();

        if (quantidade <= 0) {
            return;
        }

        double[] pesos = new double[quantidade];

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        int diaMaior = 0;
        int diaMenor = 0;

        for (int i = 0; i < quantidade; i++) {
            pesos[i] = entrada.nextDouble();

            if (pesos[i] > maior) {
                maior = pesos[i];
                diaMaior = i + 1;
            }

            if (pesos[i] < menor) {
                menor = pesos[i];
                diaMenor = i + 1;
            }
        }

        System.out.print("Pesos informados: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(formatar(pesos[i]));

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("Maior peso: " + formatar(maior)
                + " kg (Dia " + diaMaior + ")");

        System.out.println("Menor peso: " + formatar(menor)
                + " kg (Dia " + diaMenor + ")");

        System.out.println("Gráfico de evolução:");

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Dia " + (i + 1) + " | ");

            int barras = (int) (pesos[i] / 5);

            for (int j = 0; j < barras; j++) {
                System.out.print("█");
            }

            System.out.println(" " + formatar(pesos[i]));
        }
    }

    // 7 - Histórico de Transações
    public static void historicoTransacoes(Scanner entrada) {
        double[] transacoes = new double[1000];

        int quantidade = 0;

        while (quantidade < 1000) {
            double valor = entrada.nextDouble();

            if (valor == -1) {
                break;
            }

            if (valor == 0) {
                if (quantidade > 0) {
                    quantidade--;
                }
            } else {
                transacoes[quantidade] = valor;
                quantidade++;
            }
        }

        double saldo = 0;

        for (int i = 0; i < quantidade; i++) {
            saldo += transacoes[i];
        }

        System.out.println("Saldo final: " + formatar(saldo));
    }

    // 8 - Controle de Estoque
    public static void controleEstoque(Scanner entrada) {
        String[] produtos = new String[1000];
        int[] quantidades = new int[1000];

        int totalProdutos = 0;
        int opcao;

        do {
            System.out.println("\nMenu de Opções");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Realizar entrada no estoque");
            System.out.println("3. Realizar saída no estoque");
            System.out.println("4. Listar estoque");
            System.out.println("0. Sair");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    if (totalProdutos >= 1000) {
                        System.out.println("Limite de produtos atingido!");
                        break;
                    }

                    entrada.nextLine();

                    produtos[totalProdutos] = entrada.nextLine();
                    quantidades[totalProdutos] = entrada.nextInt();

                    totalProdutos++;

                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    if (totalProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados.");
                        break;
                    }

                    int produtoEntrada = entrada.nextInt();
                    int quantidadeEntrada = entrada.nextInt();

                    if (produtoEntrada < 1 || produtoEntrada > totalProdutos
                            || quantidadeEntrada <= 0) {
                        System.out.println("Dados inválidos");
                        break;
                    }

                    quantidades[produtoEntrada - 1] += quantidadeEntrada;

                    System.out.println("Entrada realizada com sucesso!");
                    break;

                case 3:
                    if (totalProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados.");
                        break;
                    }

                    int produtoSaida = entrada.nextInt();
                    int quantidadeSaida = entrada.nextInt();

                    if (produtoSaida < 1 || produtoSaida > totalProdutos
                            || quantidadeSaida <= 0) {
                        System.out.println("Dados inválidos");
                        break;
                    }

                    if (quantidadeSaida > quantidades[produtoSaida - 1]) {
                        System.out.println("Quantidade insuficiente no estoque");
                    } else {
                        quantidades[produtoSaida - 1] -= quantidadeSaida;

                        System.out.println("Saída realizada com sucesso!");
                    }
                    break;

                case 4:
                    if (totalProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados.");
                        break;
                    }

                    System.out.println("Estoque atual:");

                    for (int i = 0; i < totalProdutos; i++) {
                        System.out.println("Produto " + (i + 1) + ": "
                                + produtos[i] + " - "
                                + quantidades[i] + " unidades");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }

    // 9 - Controle de Tarefas
    public static void controleTarefas(Scanner entrada) {
        String[] tarefas = new String[1000];
        boolean[] concluidas = new boolean[1000];

        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\nMenu de Opções");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar concluída");
            System.out.println("4. Exibir pendentes");
            System.out.println("0. Sair");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    if (quantidade >= 1000) {
                        System.out.println("Limite de tarefas atingido!");
                        break;
                    }

                    entrada.nextLine();

                    tarefas[quantidade] = entrada.nextLine();
                    concluidas[quantidade] = false;

                    quantidade++;

                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Não existem tarefas cadastradas.");
                        break;
                    }

                    System.out.println("Lista de tarefas:");

                    for (int i = 0; i < quantidade; i++) {
                        String status = concluidas[i] ? "[X]" : "[ ]";

                        System.out.println((i + 1) + " - "
                                + status + " " + tarefas[i]);
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Não existem tarefas cadastradas.");
                        break;
                    }

                    int numero = entrada.nextInt();

                    if (numero < 1 || numero > quantidade) {
                        System.out.println("Tarefa inválida");
                    } else {
                        concluidas[numero - 1] = true;

                        System.out.println("Tarefa " + numero
                                + " marcada como concluída.");
                    }
                    break;

                case 4:
                    if (quantidade == 0) {
                        System.out.println("Não existem tarefas cadastradas.");
                        break;
                    }

                    System.out.println("Tarefas pendentes:");

                    boolean possuiPendente = false;

                    for (int i = 0; i < quantidade; i++) {
                        if (!concluidas[i]) {
                            System.out.println((i + 1) + " - [ ] "
                                    + tarefas[i]);

                            possuiPendente = true;
                        }
                    }

                    if (!possuiPendente) {
                        System.out.println("Nenhuma tarefa pendente.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }

    // 10 - Troca de Figurinhas
    public static void trocaFigurinhas(Scanner entrada) {
        int quantidadeA = entrada.nextInt();

        int[] jogadorA = new int[quantidadeA];

        for (int i = 0; i < quantidadeA; i++) {
            jogadorA[i] = entrada.nextInt();
        }

        int quantidadeB = entrada.nextInt();

        int[] jogadorB = new int[quantidadeB];

        for (int i = 0; i < quantidadeB; i++) {
            jogadorB[i] = entrada.nextInt();
        }

        System.out.print("Figurinhas em comum: ");

        boolean primeira = true;

        for (int i = 0; i < quantidadeA; i++) {
            if (contem(jogadorB, jogadorB.length, jogadorA[i])
                    && !contem(jogadorA, i, jogadorA[i])) {

                if (!primeira) {
                    System.out.print(", ");
                }

                System.out.print(jogadorA[i]);
                primeira = false;
            }
        }

        if (primeira) {
            System.out.print("Nenhuma");
        }

        System.out.println();

        System.out.print("Apenas jogador A: ");

        primeira = true;

        int exclusivasA = 0;

        for (int i = 0; i < quantidadeA; i++) {
            if (!contem(jogadorB, jogadorB.length, jogadorA[i])
                    && !contem(jogadorA, i, jogadorA[i])) {

                if (!primeira) {
                    System.out.print(", ");
                }

                System.out.print(jogadorA[i]);
                primeira = false;
                exclusivasA++;
            }
        }

        if (primeira) {
            System.out.print("Nenhuma");
        }

        System.out.println();

        System.out.print("Apenas jogador B: ");

        primeira = true;

        int exclusivasB = 0;

        for (int i = 0; i < quantidadeB; i++) {
            if (!contem(jogadorA, jogadorA.length, jogadorB[i])
                    && !contem(jogadorB, i, jogadorB[i])) {

                if (!primeira) {
                    System.out.print(", ");
                }

                System.out.print(jogadorB[i]);
                primeira = false;
                exclusivasB++;
            }
        }

        if (primeira) {
            System.out.print("Nenhuma");
        }

        System.out.println();

        int trocas = Math.min(exclusivasA, exclusivasB);

        System.out.println("Quantidade de trocas possíveis: " + trocas);
    }

    // Verifica se um valor existe no vetor
    public static boolean contem(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }

        return false;
    }

    // Formatação de números
    public static String formatar(double valor) {
        if (valor == (long) valor) {
            return String.format("%.0f", valor);
        }

        return String.format("%.2f", valor);
    }
}

