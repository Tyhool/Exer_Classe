import java.util.Scanner;

public class Conta {
    int cpf;
    int numeroBanco;
    double saldo = 1500.00;

    public void receberDados() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserir o numero do Banco:");
        numeroBanco = input.nextInt();
        System.out.println("Inserir o seu cpf:");
        cpf = input.nextInt();
    }

    public void bonificacao10() {
        saldo = saldo + (saldo * 0.1);
        System.out.println("A bonificaçao é de 10%");
        System.out.println("A bonificaçao é: " + saldo + " R$");

    }

    public void bonificacao5() {
        saldo = saldo + (saldo * 0.05);
        System.out.println("A bonificaçao é de 5%");
        System.out.println("A bonificaçao é: " + saldo + " R$");

    }

    public void saque() {
        double saque;
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto quer tirar:");
        saque = input.nextDouble();
        saldo = saldo - saque;
        System.out.println("o salto atual é: " + saldo + " R$");

    }

    public void deposito() {
        double deposito;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Quanto quer colocar:");
//        deposito = input.nextDouble();
//        saldo = saldo + deposito;
        System.out.println("o salto atual é: " + saldo + " R$");
    }

    public void atributos() {
        System.out.println(" ");
        System.out.println("Bem-vindo, qual operação vai querer fazer");
        System.out.println("1 - saldo");
        System.out.println("2 - bonificação");
        System.out.println("3 - deposito");
        System.out.println("4 - saque");
        System.out.println("5 - sair");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        while (true) {
            if (numero == 1) {
                System.out.println("O seu saldo é de: " + saldo + "R$");
            }

            if (numero == 2) {
                System.out.println("Você é cliente especial? 1 - sim | 2 - não ");
                int clienteEspecial = input.nextInt();
                if (clienteEspecial == 1) {
                    bonificacao10();
                }
                if (clienteEspecial == 2) {
                    bonificacao5();
                }
                if (clienteEspecial != 1 && clienteEspecial != 2) {
                    System.out.println("Não foi possivel efetuar, tente de novo. ");
                } else {
                    System.out.println(" ");
                }
            }

            if (numero == 3) {
                deposito();
            }

            if (numero == 4) {
                saque();
            }
            if (numero == 5) {
                System.out.println("Obrigado pela preferencia.");
                break;
            } else {
                System.out.println(" ");
                System.out.println("Bem-vindo, qual operação vai querer fazer");
                System.out.println("1 - saldo");
                System.out.println("2 - bonificação");
                System.out.println("3 - deposito");
                System.out.println("4 - saque");
                System.out.println("5 - sair");
                System.out.println(" ");
            }
            numero = input.nextInt();

        }

    }

    public void transferir(){
        
    }

    public void conta() {
        receberDados();
        atributos();
    }
}
