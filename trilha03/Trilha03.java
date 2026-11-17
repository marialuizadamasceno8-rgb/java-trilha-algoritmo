package trilha03;

import java.util.Scanner;

public class Trilha03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== TRILHA 03 - MODELO ITERATIVO =====");
            System.out.println("1 - Tabuada");
            System.out.println("2 - Calculadora");
            System.out.println("3 - Controle de Temperatura");
            System.out.println("4 - Caixa Mercado");
            System.out.println("5 - Desafio da Soletração");
            System.out.println("6 - Sistema Bancário");
            System.out.println("7 - Fatorial");
            System.out.println("8 - Fibonacci");
            System.out.println("9 - Desenhar Retângulo");
            System.out.println("10 - Desenhar Triângulo");
            System.out.println("0 - Sair");
            System.out.print("Escolha um exercício: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    tabuada(entrada);
                    break;
                case 2:
                    calculadora(entrada);
                    break;
                case 3:
                    controleTemperatura(entrada);
                    break;
                case 4:
                    caixaMercado(entrada);
                    break;
                case 5:
                    desafioSoletracao(entrada);
                    break;
                case 6:
                    sistemaBancario(entrada);
                    break;
                case 7:
                    fatorial(entrada);
                    break;
                case 8:
                    fibonacci(entrada);
                    break;
                case 9:
                    desenharRetangulo(entrada);
                    break;
                case 10:
                    desenharTriangulo(entrada);
                    break;
                case 0:
                    System.out.println("Fim.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        entrada.close();
    }

    // 1 - Tabuada
    public static void tabuada(Scanner entrada) {
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // 2 - Calculadora
    public static void calculadora(Scanner entrada) {
        int opcao;

        do {
            System.out.println("\nMenu de Opções");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");

            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                double n1 = entrada.nextDouble();
                double n2 = entrada.nextDouble();
                double resultado = 0;
                String operador = "";

                switch (opcao) {
                    case 1:
                        resultado = n1 + n2;
                        operador = "+";
                        break;
                    case 2:
                        resultado = n1 - n2;
                        operador = "-";
                        break;
                    case 3:
                        resultado = n1 * n2;
                        operador = "*";
                        break;
                    case 4:
                        if (n2 == 0) {
                            System.out.println("Divisão por zero não permitida");
                            continue;
                        }
                        resultado = n1 / n2;
                        operador = "/";
                        break;
                }

                System.out.println("Resultado: " + formatar(n1) + " "
                        + operador + " " + formatar(n2) + " = "
                        + formatar(resultado));

            } else if (opcao != 0) {
                System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        System.out.println("Fim.");
    }

    // 3 - Controle de Temperatura
    public static void controleTemperatura(Scanner entrada) {
        double temperatura;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        boolean possuiTemperatura = false;

        while (true) {
            temperatura = entrada.nextDouble();

            if (temperatura == 0) {
                break;
            }

            if (temperatura < -50 || temperatura > 60) {
                System.out.println("Temperatura inválida");
                continue;
            }

            if (temperatura > maior) {
                maior = temperatura;
            }

            if (temperatura < menor) {
                menor = temperatura;
            }

            possuiTemperatura = true;
        }

        if (possuiTemperatura) {
            System.out.println("Maior temperatura: " + formatar(maior));
            System.out.println("Menor temperatura: " + formatar(menor));
        }
    }

    // 4 - Caixa Mercado
    public static void caixaMercado(Scanner entrada) {
        double valor;
        double total = 0;

        while (true) {
            valor = entrada.nextDouble();

            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                System.out.println("Valor inválido: " + formatar(valor));
            } else {
                total += valor;
            }
        }

        int parcelas = entrada.nextInt();

        if (parcelas <= 1) {
            System.out.println("Pagamento à vista: R$ " + formatar(total));
        } else {
            System.out.println("Total da compra: R$ " + formatar(total));
            System.out.printf("Parcelado em %dx de R$ %.2f%n",
                    parcelas, total / parcelas);
        }
    }

    // 5 - Desafio da Soletração
    public static void desafioSoletracao(Scanner entrada) {
        entrada.nextLine();

        String palavraOriginal = entrada.nextLine();
        String palavraSoletrada = "";

        while (true) {
            String letra = entrada.nextLine();

            if (letra.equals("0")) {
                break;
            }

            palavraSoletrada += letra;
        }

        System.out.println("Palavra original: " + palavraOriginal);
        System.out.println("Palavra soletrada: " + palavraSoletrada);
    }

    // 6 - Sistema Bancário
    public static void sistemaBancario(Scanner entrada) {
        double saldo = 0;
        int opcao;

        do {
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + formatar(saldo));
                    break;

                case 2:
                    double deposito = entrada.nextDouble();

                    if (deposito < 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldo += deposito;
                        System.out.println("Saldo atual: R$ " + formatar(saldo));
                    }
                    break;

                case 3:
                    double saque = entrada.nextDouble();

                    if (saque < 0) {
                        System.out.println("Valor inválido");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual: R$ " + formatar(saldo));
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }

    // 7 - Fatorial
    public static void fatorial(Scanner entrada) {
        int numero = entrada.nextInt();

        if (numero <= 0) {
            System.out.println("Parâmetro inválido.");
            return;
        }

        long fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
    }

    // 8 - Fibonacci
    public static void fibonacci(Scanner entrada) {
        int posicao = entrada.nextInt();

        if (posicao <= 0) {
            System.out.println("Parâmetro inválido.");
            return;
        }

        long anterior = 1;
        long atual = 1;

        for (int i = 2; i < posicao; i++) {
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println("O valor na posição " + (posicao - 1)
                + " da sequência de Fibonacci é " + atual);
    }

    // 9 - Desenhar Retângulo
    public static void desenharRetangulo(Scanner entrada) {
        int base = entrada.nextInt();
        int altura = entrada.nextInt();

        if (base <= 0 || altura <= 0) {
            System.out.println("Retângulo inválido");
            return;
        }

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 10 - Desenhar Triângulo
    public static void desenharTriangulo(Scanner entrada) {
        int altura = entrada.nextInt();

        if (altura <= 0) {
            System.out.println("Triângulo inválido");
            return;
        }

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Formatação de números
    public static String formatar(double valor) {
        if (valor == (long) valor) {
            return String.format("%.0f", valor);
        }

        return String.format("%.2f", valor);
    }
}
