import java.util.Scanner;

public class TipoDeCaractere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0); 

        String resultado = verificarTipoDeCaractere(caractere);
        System.out.println("O caractere '" + caractere + "' é: " + resultado);

        scanner.close(); 
    }

    public static String verificarTipoDeCaractere(char caractere) {
        if (Character.isDigit(caractere)) {
            return "um número";
        }

        caractere = Character.toLowerCase(caractere);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            return "uma vogal";
        }

        if (Character.isLetter(caractere)) {
            return "uma consoante";
        }

        return "um símbolo";
    }
}
