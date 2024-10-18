import java.util.Scanner;

public class VerificaSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SENHA_CORRETA = 1234; 

        int senha; 

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt(); 

            if (senha != SENHA_CORRETA) {
                System.out.println("ACESSO NEGADO"); 
            }

        } while (senha != SENHA_CORRETA); 

        System.out.println("ACESSO PERMITIDO"); 

        scanner.close(); 
    }
}
