import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PessoaConst {
    private String nome;
    private String cpf;
    private int anoNascimento;
    private float altura;

    public PessoaConst(String nome, String cpf, int anoNascimento, float altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return int return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * @return float return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIdade() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int ano = calendar.get(Calendar.YEAR);
        return ano - anoNascimento;

    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", cpf='" + getCpf() + "'" +
                ", anoNascimento='" + getAnoNascimento() + "'" +
                ", altura='" + getAltura() + "'" +
                "}";
    }

}
