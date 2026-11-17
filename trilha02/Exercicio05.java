
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        int faltas = entrada.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 0 || media > 10 || faltas < 0) {
            System.out.println("Parâmetros inválidos");
        } else {
            System.out.printf("Média: %.1f.%n", media);

            if (faltas > 4) {
                System.out.println("Situação: Reprovado por Falta");
            } else if (media == 0) {
                System.out.println("Situação: Desistente");
            } else if (media >= 8) {
                System.out.println("Situação: Aprovado com sucesso");
            } else if (media >= 6) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Recuperação");
            }
        }

        entrada.close();
    }
}


