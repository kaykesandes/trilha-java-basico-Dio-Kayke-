import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Porfavor, digite o numero da Agência: ");
        int agencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        scanner.close();

        String msg = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
            titular, agencia, numero, saldo
        
        );
        System.out.println(msg);
    }

}