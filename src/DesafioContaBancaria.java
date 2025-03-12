import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
//        Dados Iniciais do cliente
//        Nome, tipo de conta , saldo inicial:
        String nome = "Richard Freitas";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcaoTransacion = 0;
        System.out.println("""
                *******************************
                Dados Iniciais do cliente:
                """);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
        System.out.println("""
                *******************************
                
                """);
       String menu = """
                Operanções :
                
                1 - Saldo da Conta
                2 - Depositar o valor
                3 - Traferir o valor
                4 - Sair
                
                """;
       Scanner opcao = new Scanner(System.in);
//        operações
        while (opcaoTransacion != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            opcaoTransacion = opcao.nextInt();

//        1 - consulta saldos
            if (opcaoTransacion == 1){
                System.out.println("Seu saldo é de : R$" + saldo);
            }
            else if (opcaoTransacion == 2){
                System.out.println("Digite o valor que deseja Depositar: ");
                double saldoReceber = opcao.nextInt();
                saldoReceber += saldo;
                System.out.println("Seu saldo agora é de : R$" + saldoReceber);

            } else if (opcaoTransacion == 3) {
                System.out.println("Digite o valor que deseja tranferir: ");
                double valorTranferir = opcao.nextInt();
                if (valorTranferir > saldo){
                    System.out.println("Não há saldo para realizar trasnferência");
                }else {
                    saldo -= valorTranferir;
                    System.out.println("Seu saldo agora é de : R$" + saldo);
                }
            } else if(opcaoTransacion != 4){
                System.out.println("Opção invalida");
            }
        }

    }
}
