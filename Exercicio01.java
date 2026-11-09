
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = entrada.nextLine();

        System.out.print("Digite seu semestre: ");
        int semestre = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite seu hobby favorito: ");
        String hobby = entrada.nextLine();

        System.out.println();

        System.out.println("Prazer, eu sou o(a) " + nome + "!");
        System.out.println("Atualmente estou no " + semestre
                + "º semestre de " + curso
                + " e meu hobby favorito é " + hobby + ".");

        entrada.close();
    }
}
