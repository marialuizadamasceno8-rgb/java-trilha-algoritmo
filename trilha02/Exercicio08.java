
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor1 = entrada.nextDouble();
        double valor2 = entrada.nextDouble();
        entrada.nextLine();

        String operacao = entrada.nextLine();

        double resultado = 0;
        String simbolo = "";

        switch (operacao.toLowerCase()) {
            case "1":
            case "soma":
                resultado = valor1 + valor2;
                simbolo = "+";
                break;

            case "2":
            case "subtração":
            case "subtracao":
                resultado = valor1 - valor2;
                simbolo = "-";
                break;

            case "3":
            case "multiplicação":
            case "multiplicacao":
                resultado = valor1 * valor2;
                simbolo = "*";
                break;

            case "4":
            case "divisão":
            case "divisao":
                if (valor2 == 0) {
                    System.out.println("Operação não suportada");
                    entrada.close();
                    return;
                }
                resultado = valor1 / valor2;
                simbolo = "/";
                break;

            case "5":
            case "resto":
                if (valor2 == 0) {
                    System.out.println("Operação não suportada");
                    entrada.close();
                    return;
                }
                resultado = valor1 % valor2;
                simbolo = "mod";
                break;

            case "6":
            case "potência":
            case "potencia":
                resultado = Math.pow(valor1, valor2);
                simbolo = "^";
                break;

            default:
                System.out.println("Operação não suportada");
                entrada.close();
                return;
        }

        System.out.printf("%.1f %s %.1f = %.1f%n",
                valor1, simbolo, valor2, resultado);

        entrada.close();
    }
}
