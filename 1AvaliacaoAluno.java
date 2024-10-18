import java.util.Scanner;

public class AvaliacaoAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        String resultado = avaliarAluno(nota1, nota2, nota3);
        System.out.println("Resultado: " + resultado);

        scanner.close(); 
    }

    public static String avaliarAluno(double nota1, double nota2, double nota3) {
        double mediaParcial = (nota1 + nota2 + nota3) / 3;

        if (mediaParcial >= 6.0 && nota1 >= 4.0 && nota2 >= 4.0 && nota3 >= 4.0) {
            return "Aprovado";
        } else if (mediaParcial >= 4.0 && mediaParcial < 6.0 && nota1 >= 4.0 && nota2 >= 4.0 && nota3 >= 4.0) {
            return "Prova de reposição";
        } else {
            return "Reprovado";
        }
    }
}
