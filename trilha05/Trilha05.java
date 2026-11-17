package trilha05;


import java.util.Scanner;

public class Trilha05 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = menuPrincipal();

            switch (opcao) {
                case 1:
                    acaiteria();
                    break;
                case 2:
                    pilotoKart();
                    break;
                case 3:
                    metaPessoal();
                    break;
                case 4:
                    calculadora();
                    break;
                case 5:
                    mensalidadeUniversidade();
                    break;
                case 6:
                    ingressosCinema();
                    break;
                case 7:
                    caixaMercado();
                    break;
                case 8:
                    sistemaBancario();
                    break;
                case 9:
                    controleEstoque();
                    break;
                case 10:
                    analiseFaturamento();
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

    // MENU PRINCIPAL
    public static int menuPrincipal() {
        System.out.println("\n===== TRILHA 05 - FUNÇÕES =====");
        System.out.println("1 - Açaiteria");
        System.out.println("2 - Piloto Kart");
        System.out.println("3 - Meta Pessoal");
        System.out.println("4 - Calculadora com Menu");
        System.out.println("5 - Mensalidade Universidade");
        System.out.println("6 - Ingressos para o Cinema");
        System.out.println("7 - Caixa Mercado");
        System.out.println("8 - Sistema Bancário");
        System.out.println("9 - Controle de Estoque");
        System.out.println("10 - Análise Mensal de Faturamento");
        System.out.println("0 - Sair");
        System.out.print("Escolha um exercício: ");

        return entrada.nextInt();
    }

    // 1 - AÇAITERIA

    public static void acaiteria() {
        double[] dados = coletarAcai();
        double total = calcularAcai(dados);
        exibirAcai(dados, total);
    }

    public static double[] coletarAcai() {
        double[] dados = new double[4];

        dados[0] = entrada.nextDouble();
        dados[1] = entrada.nextDouble();
        dados[2] = entrada.nextDouble();
        dados[3] = entrada.nextDouble();

        return dados;
    }

    public static double calcularAcai(double[] dados) {
        double total = dados[0] * 13.50
                + dados[1] * 15.00
                + dados[2] * 17.50;

        return total - (total * dados[3] / 100);
    }

    public static void exibirAcai(double[] dados, double total) {
        System.out.println("Seu pedido foi registrado.");
        System.out.println("- Açaí P: " + (int) dados[0]);
        System.out.println("- Açaí M: " + (int) dados[1]);
        System.out.println("- Açaí G: " + (int) dados[2]);
        System.out.println();
        System.out.println("Desconto de " + formatar(dados[3]) + "% aplicado.");
        System.out.printf("Total R$ %.2f%n", total);
    }

    // 2 - PILOTO KART

    public static void pilotoKart() {
        double[] dados = coletarKart();
        double[] resultado = calcularKart(dados);
        exibirKart(resultado);
    }

    public static double[] coletarKart() {
        double[] dados = new double[3];

        dados[0] = entrada.nextDouble();
        dados[1] = entrada.nextDouble();
        dados[2] = entrada.nextDouble();

        return dados;
    }

    public static double[] calcularKart(double[] dados) {
        double distancia = (dados[0] * dados[1]) / 1000;
        double tempo = (dados[1] * dados[2]) / 60;

        return new double[]{distancia, tempo};
    }

    public static void exibirKart(double[] resultado) {
        System.out.println("Análise Preditiva Concluída");
        System.out.println("--");
        System.out.printf("Distância total a ser percorrida: %.2f km.%n",
                resultado[0]);
        System.out.printf("Previsão de conclusão: %.1f minutos.%n",
                resultado[1]);
    }

    // 3 - META PESSOAL

    public static void metaPessoal() {
        entrada.nextLine();

        String[] descricao = coletarMeta();
        double[] resultado = calcularMeta(descricao);
        exibirMeta(descricao, resultado);
    }

    public static String[] coletarMeta() {
        String[] dados = new String[1];

        dados[0] = entrada.nextLine();

        return dados;
    }

    public static double[] calcularMeta(String[] descricao) {
        double valorMeta = entrada.nextDouble();
        double salario = entrada.nextDouble();
        double despesas = entrada.nextDouble();

        double saldo = salario - despesas;
        double reserva = saldo * 0.30;
        double disponivel = saldo - reserva;

        double prazo = disponivel > 0
                ? valorMeta / disponivel : 0;

        return new double[]{
            valorMeta, salario, despesas,
            saldo, reserva, disponivel, prazo
        };
    }

    public static void exibirMeta(String[] descricao, double[] dados) {
        System.out.printf("Meta: %s (R$ %.2f)%n",
                descricao[0], dados[0]);

        System.out.printf("Salário: R$ %.2f - Despesas: R$ %.2f%n",
                dados[1], dados[2]);

        System.out.printf("Saldo após despesas: R$ %.2f%n", dados[3]);
        System.out.printf("Reserva fixa (30%%): R$ %.2f%n", dados[4]);

        System.out.printf("Valor disponível para a meta: %.2f por mês%n",
                dados[5]);

        if (dados[5] > 0) {
            System.out.printf("Prazo estimado para atingir a meta: %.2f meses%n",
                    dados[6]);
        } else {
            System.out.println("Não há valor disponível para a meta.");
        }
    }

    // 4 - CALCULADORA COM MENU

    public static void calculadora() {
        double[] valores = coletarCalculadora();
        String operacao = coletarOperacao();

        double resultado = calcularOperacao(valores, operacao);

        exibirCalculadora(valores, operacao, resultado);
    }

    public static double[] coletarCalculadora() {
        double[] valores = new double[2];

        valores[0] = entrada.nextDouble();
        valores[1] = entrada.nextDouble();

        return valores;
    }

    public static String coletarOperacao() {
        entrada.nextLine();
        return entrada.nextLine();
    }

    public static double calcularOperacao(double[] valores, String operacao) {
        double n1 = valores[0];
        double n2 = valores[1];

        switch (operacao.toLowerCase()) {
            case "1":
            case "soma":
                return n1 + n2;

            case "2":
            case "subtração":
            case "subtracao":
                return n1 - n2;

            case "3":
            case "multiplicação":
            case "multiplicacao":
                return n1 * n2;

            case "4":
            case "divisão":
            case "divisao":
                return n2 != 0 ? n1 / n2 : Double.NaN;

            case "5":
            case "resto":
                return n2 != 0 ? n1 % n2 : Double.NaN;

            case "6":
            case "potência":
            case "potencia":
                return Math.pow(n1, n2);

            default:
                return Double.NaN;
        }
    }

    public static void exibirCalculadora(
            double[] valores, String operacao, double resultado) {

        String simbolo;

        switch (operacao.toLowerCase()) {
            case "1":
            case "soma":
                simbolo = "+";
                break;

            case "2":
            case "subtração":
            case "subtracao":
                simbolo = "-";
                break;

            case "3":
            case "multiplicação":
            case "multiplicacao":
                simbolo = "*";
                break;

            case "4":
            case "divisão":
            case "divisao":
                simbolo = "/";
                break;

            case "5":
            case "resto":
                simbolo = "mod";
                break;

            case "6":
            case "potência":
            case "potencia":
                simbolo = "^";
                break;

            default:
                System.out.println("Operação não suportada");
                return;
        }

        if (Double.isNaN(resultado)) {
            System.out.println("Operação não suportada");
            return;
        }

        System.out.printf("%.1f %s %.1f = %.1f%n",
                valores[0], simbolo, valores[1], resultado);
    }

    // 5 - MENSALIDADE UNIVERSIDADE

    public static void mensalidadeUniversidade() {
        String curso = coletarCurso();
        double[] dados = coletarMensalidade();

        double valor = calcularMensalidade(curso, dados);

        exibirMensalidade(valor);
    }

    public static String coletarCurso() {
        entrada.nextLine();
        return entrada.nextLine();
    }

    public static double[] coletarMensalidade() {
        double[] dados = new double[1];

        dados[0] = entrada.nextLine().equalsIgnoreCase("Sim") ? 1 : 0;

        double desconto = entrada.nextDouble();

        return new double[]{dados[0], desconto};
    }

    public static double calcularMensalidade(String curso, double[] dados) {
        double valor;

        switch (curso.toUpperCase()) {
            case "SI":
                valor = 900;
                break;
            case "ADS":
                valor = 750;
                break;
            case "CS":
                valor = 1150;
                break;
            case "EC":
                valor = 1300;
                break;
            case "ES":
                valor = 950;
                break;
            default:
                return -1;
        }

        if (dados[0] == 1) {
            return 0;
        }

        return valor - (valor * dados[1] / 100);
    }

    public static void exibirMensalidade(double valor) {
        if (valor == -1) {
            System.out.println("Curso não encontrado");
        } else {
            System.out.println("Valor da mensalidade:");
            System.out.printf("R$ %.2f%n", valor);
        }
    }

    // 6 - INGRESSOS PARA O CINEMA

    public static void ingressosCinema() {
        double[] dados = coletarIngressos();
        double total = calcularIngressos(dados);
        exibirIngressos(total);
    }

    public static double[] coletarIngressos() {
        double[] dados = new double[2];

        dados[0] = entrada.nextDouble();
        dados[1] = entrada.nextDouble();

        entrada.nextLine();

        String dia = entrada.nextLine();
        String nacional = entrada.nextLine();

        double diaQuarta = dia.equalsIgnoreCase("Quarta-feira") ? 1 : 0;
        double filmeNacional = nacional.equalsIgnoreCase("Sim") ? 1 : 0;

        return new double[]{
            dados[0], dados[1], diaQuarta, filmeNacional
        };
    }

    public static double calcularIngressos(double[] dados) {
        int inteiras = (int) dados[0];
        int meias = (int) dados[1];

        if (dados[3] == 1) {
            return (inteiras + meias) * 5.00;
        }

        if (dados[2] == 1) {
            return (inteiras + meias) * 14.50;
        }

        return (inteiras * 28.50) + (meias * 14.25);
    }

    public static void exibirIngressos(double total) {
        System.out.println("Total à pagar:");
        System.out.printf("R$ %.2f%n", total);
    }

    // 7 - CAIXA MERCADO

    public static void caixaMercado() {
        double total = coletarCompras();
        int parcelas = coletarParcelas();

        double valorParcela = calcularParcela(total, parcelas);

        exibirCompra(total, parcelas, valorParcela);
    }

    public static double coletarCompras() {
        double total = 0;

        while (true) {
            double valor = entrada.nextDouble();

            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                System.out.println("Valor inválido: " + formatar(valor));
            } else {
                total += valor;
            }
        }

        return total;
    }

    public static int coletarParcelas() {
        return entrada.nextInt();
    }

    public static double calcularParcela(double total, int parcelas) {
        if (parcelas <= 1) {
            return total;
        }

        return total / parcelas;
    }

    public static void exibirCompra(
            double total, int parcelas, double valorParcela) {

        if (parcelas <= 1) {
            System.out.printf("Pagamento à vista: R$ %.0f%n", total);
        } else {
            System.out.printf("Total da compra: R$ %.0f%n", total);
            System.out.printf("Parcelado em %dx de R$ %.2f%n",
                    parcelas, valorParcela);
        }
    }

    // 8 - SISTEMA BANCÁRIO

    public static void sistemaBancario() {
        double saldo = 0;
        int opcao;

        do {
            opcao = coletarOpcaoBanco();

            saldo = processarBanco(opcao, saldo);

        } while (opcao != 0);
    }

    public static int coletarOpcaoBanco() {
        System.out.println("\nMenu de Opções");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Realizar Depósito");
        System.out.println("3. Realizar Saque");
        System.out.println("0. Sair");

        return entrada.nextInt();
    }

    public static double processarBanco(int opcao, double saldo) {
        switch (opcao) {
            case 1:
                exibirSaldo(saldo);
                break;

            case 2:
                saldo = depositar(saldo);
                break;

            case 3:
                saldo = sacar(saldo);
                break;

            case 0:
                break;

            default:
                System.out.println("Opção inválida");
        }

        return saldo;
    }

    public static double depositar(double saldo) {
        double valor = entrada.nextDouble();

        if (valor < 0) {
            System.out.println("Valor inválido");
        } else {
            saldo += valor;
            exibirSaldo(saldo);
        }

        return saldo;
    }

    public static double sacar(double saldo) {
        double valor = entrada.nextDouble();

        if (valor < 0) {
            System.out.println("Valor inválido");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            exibirSaldo(saldo);
        }

        return saldo;
    }

    public static void exibirSaldo(double saldo) {
        System.out.println("Saldo atual: R$ " + formatar(saldo));
    }

    // 9 - CONTROLE DE ESTOQUE

    public static void controleEstoque() {
        String[] produtos = new String[1000];
        int[] estoque = new int[1000];

        int quantidade = 0;
        int opcao;

        do {
            opcao = menuEstoque();

            switch (opcao) {
                case 1:
                    quantidade = adicionarProduto(produtos, estoque, quantidade);
                    break;

                case 2:
                    atualizarEstoque(produtos, estoque, quantidade, true);
                    break;

                case 3:
                    atualizarEstoque(produtos, estoque, quantidade, false);
                    break;

                case 4:
                    exibirEstoque(produtos, estoque, quantidade);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }

    public static int menuEstoque() {
        System.out.println("\nMenu de Opções");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Realizar entrada no estoque");
        System.out.println("3. Realizar saída no estoque");
        System.out.println("4. Listar estoque");
        System.out.println("0. Sair");

        return entrada.nextInt();
    }

    public static int adicionarProduto(
            String[] produtos, int[] estoque, int quantidade) {

        if (quantidade >= 1000) {
            System.out.println("Limite de produtos atingido!");
            return quantidade;
        }

        entrada.nextLine();

        produtos[quantidade] = entrada.nextLine();
        estoque[quantidade] = entrada.nextInt();

        System.out.println("Produto adicionado com sucesso!");

        return quantidade + 1;
    }

    public static void atualizarEstoque(
            String[] produtos, int[] estoque, int quantidade, boolean entradaEstoque) {

        if (quantidade == 0) {
            System.out.println("Não existem produtos cadastrados.");
            return;
        }

        int produto = entrada.nextInt();
        int unidades = entrada.nextInt();

        if (produto < 1 || produto > quantidade || unidades <= 0) {
            System.out.println("Dados inválidos");
            return;
        }

        int indice = produto - 1;

        if (entradaEstoque) {
            estoque[indice] += unidades;
            System.out.println("Entrada realizada com sucesso!");
        } else {
            if (unidades > estoque[indice]) {
                System.out.println("Quantidade insuficiente em estoque");
            } else {
                estoque[indice] -= unidades;
                System.out.println("Saída realizada com sucesso!");
            }
        }
    }

    public static void exibirEstoque(
            String[] produtos, int[] estoque, int quantidade) {

        if (quantidade == 0) {
            System.out.println("Não existem produtos cadastrados.");
            return;
        }

        System.out.println("Estoque atual:");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Produto " + (i + 1) + ": "
                    + produtos[i] + " - " + estoque[i] + " unidades");
        }
    }

    // 10 - ANÁLISE MENSAL DE FATURAMENTO

    public static void analiseFaturamento() {
        double[] valores = coletarFaturamento();
        String situacao = calcularFaturamento(valores);
        exibirFaturamento(valores, situacao);
    }

    public static double[] coletarFaturamento() {
        int quantidade = entrada.nextInt();

        double[] faturamento = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            faturamento[i] = entrada.nextDouble();
        }

        return faturamento;
    }

    public static String calcularFaturamento(double[] faturamento) {
        boolean crescimento = true;
        boolean queda = true;
        boolean constante = true;

        for (int i = 1; i < faturamento.length; i++) {

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

        if (constante) {
            return "Constante";
        } else if (crescimento) {
            return "Crescimento";
        } else if (queda) {
            return "Queda";
        } else {
            return "Sem padrão";
        }
    }

    public static void exibirFaturamento(
            double[] faturamento, String situacao) {

        System.out.println(">> Análise de Faturamento <<");

        System.out.print("Faturamento informado: ");

        for (int i = 0; i < faturamento.length; i++) {
            System.out.print(formatar(faturamento[i]));

            if (i < faturamento.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Situação: " + situacao);
    }

    // FORMATAÇÃO DE NÚMEROS

    public static String formatar(double valor) {
        if (valor == (long) valor) {
            return String.format("%.0f", valor);
        }

        return String.format("%.2f", valor);
    }
}
