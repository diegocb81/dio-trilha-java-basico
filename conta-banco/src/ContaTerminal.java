import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Por favor, digite o número da agência:");
            String numeroAgencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da conta:");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite o nome do titular da conta:");
            String nomeTitular = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da conta (use ponto como separador decimal):");
            double saldoConta = scanner.nextDouble();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", nomeTitular, numeroAgencia, numeroConta, saldoConta);

        } catch (InputMismatchException e) {
            System.out.println("Erro: formato de entrada inválido. Verifique se digitou números corretamente.");
        } finally {
            scanner.close();
        }
    }
}