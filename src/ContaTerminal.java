import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da conta.");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência.");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");

        System.out.println("Olá, "+nomeCliente+ ", obrigado por criar uma conta em nosso banco!\nSua agência é "+agencia+", conta "+ numero + " e saldo de R$ "+saldo+ " já está disponivel para saque.");
        
        scanner.close();
    }
}
