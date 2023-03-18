import java.util.Scanner;

public class Empregados {
    private String nome;
    private String sobrenome;
    private float salario;

    public Empregados() {
    }

    public Empregados(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void salarioAnual() {
        if (salario <= 0) {
            salario = 0;
        } else if (salario > 0) {
            salario = salario * 12;
        }
        System.out.println("salario da pessoa " + getNome() + " é: " + salario);
    }

    public void fornecerAumento() {
        float aumento;
        aumento = salario + (salario * 0.1f);
        System.out.println("O aumento do salario de 10% foi para: " + aumento);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", sobrenome='" + getSobrenome() + "'" +
                ", salario='" + getSalario() + "'" +
                "}";
    }

    public void mostraEmpregados() {
        Empregados empregados = new Empregados(nome, sobrenome, salario);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa");
        nome = input.nextLine();
        System.out.println("Digite o sobrenome da pessoa");
        sobrenome = input.nextLine();
        System.out.println("Digite o salario da pessoa");
        salario = input.nextFloat();
    }
}
