
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("%s, seu IMC é de %.4f%n", nome, imc);

        entrada.close();
    }
}
