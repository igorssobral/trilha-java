import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        List<Conta> contas = new ArrayList<>();


        Banco banco = new Banco();
        banco.setNome("Banco Uniao");

/////////////// Criando contas
        Cliente cliente1 = new Cliente();

        cliente1.setNome("jooao");
        cliente1.setIdade(25);
        cliente1.setTelefone("2222222");
        Conta conta1 = new ContaPoupanca(cliente1);
        conta1.depositar(500);
        contas.add(conta1);


        Cliente cliente2 = new Cliente();

        cliente2.setNome("david");
        cliente2.setIdade(22);
        cliente2.setTelefone("555555555");
        Conta conta2 = new ContaCorrente(cliente2);
        conta2.depositar(400);
        conta2.sacar(500);
        contas.add(conta2);
///////////////////////////////////////////////////

        banco.setContas(contas);
///////////////////////////////////////////////
        System.out.println("--------------Antes da Transferência--------------");
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();


        ////// transferência
        conta2.transferir(500,conta1);

        System.out.println("--------------Depois da Transferência--------------");
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        banco.imprimirContas();

    }
}

