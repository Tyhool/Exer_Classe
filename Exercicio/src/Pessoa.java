import java.util.Scanner;

public class Pessoa {

    String nome;
    int nascimento;
    double peso;
    double altura;

    public void IMC() {
        Scanner input = new Scanner(System.in);
        double IMC;
        int idade;
        int litros = 35;
        double porDia;

        System.out.println("Informe a altura");
        altura = input.nextDouble();
        System.out.println("Informe o peso");
        peso = input.nextDouble();
        System.out.println("Informe o ano de nascimento");
        nascimento = input.nextInt();

        IMC = (peso) / (altura * altura);
        idade = 2023 - nascimento;

        porDia = (litros * peso) / 1000;

        System.out.println("O IMC é " + IMC);
        System.out.println("A idade é " + idade);
        System.out.println("quantos litros de agua tem que beber por dia: " + porDia);
    }

    public void Mostra() {
        IMC();
    }

}
