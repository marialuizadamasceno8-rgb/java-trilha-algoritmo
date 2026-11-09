
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%nO(A) estudante %s ficou com média %.1f%n",
                nome, media);

        entrada.close();
    }
}

