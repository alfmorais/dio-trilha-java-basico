import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.print("Por favor, digite o número da Agência: ");
        conta.setAgencia(scanner.next());

        System.out.print("Por favor, digite o nome do Cliente: ");
        scanner.nextLine();
        conta.setNomeCliente(scanner.nextLine());

        System.out.print("Por favor, digite o saldo: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println(conta);
        scanner.close();
    }
}