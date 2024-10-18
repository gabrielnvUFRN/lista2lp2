import java.util.Scanner;

public class VerificaAnoBissexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = verificarAnoBissexto(ano);

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close(); 
    }

    public static boolean verificarAnoBissexto(int ano) {
        if (ano % 400 == 0) {
            return true; 
        } else if (ano % 100 == 0) {
            return false; 
        } else if (ano % 4 == 0) {
            return true; 
        } else {
            return false; 
        }
    }
}
