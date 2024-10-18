import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número natural inteiro par: ");
        int numero = scanner.nextInt();

        if (numero % 2 != 0) {
            System.out.println("O número digitado não é par.");
        } else {
            System.out.println("Os divisores de " + numero + " são:");
            int divisor = 1;

            while (divisor <= numero) {
                if (numero % divisor == 0) {
                    System.out.println(divisor); 
                }
                divisor++;
            }
        }

        scanner.close();
    }
}
