import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "{" +
                " dia='" + getDia() + "'" +
                ", mes='" + getMes() + "'" +
                ", ano='" + getAno() + "'" +
                "}";
    }

    public void calendario() {
        String diaString;
        String mesString;
        String anoString;
        String data;

        Scanner input = new Scanner(System.in);
        System.out.println("Inserir o dia:");
        dia = input.nextInt();

        System.out.println("Inserir o mes:");
        mes = input.nextInt();

        System.out.println("Inserir o ano:");
        ano = input.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 && ((mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)
                || (mes == 2 && (dia <= 29 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) || dia <= 28))) {
            data = "DATA VÁLIDA";
        } else {
            data = "DATA INVÁLIDA";
        }
        diaString = Integer.toString(dia);
        mesString = Integer.toString(mes);
        anoString = Integer.toString(ano);
        System.out.println("A data é: " + diaString + "/" + mesString + "/" + anoString + " é uma " + data);
        System.out.println("");
    }

    public void checar() {
        Data data_1 = new Data();
        data_1.calendario();
        Data data_2 = new Data();
        data_2.calendario();

        if (data_1.getDia() == data_2.getDia() && data_1.getMes() == data_2.getMes()
                && data_1.getAno() == data_2.getAno()) {
            System.out.println(data_1.getDia() + "/" + data_1.getMes() + "/" + data_1.getAno());
            System.out.println(data_2.getDia() + "/" + data_2.getMes() + "/" + data_2.getAno());
            System.out.println("As duas datas são iguais");
        } else {
            System.out.println(data_1.getDia() + "/" + data_1.getMes() + "/" + data_1.getAno());
            System.out.println(data_2.getDia() + "/" + data_2.getMes() + "/" + data_2.getAno());
            System.out.println("As duas datas são diferentes");
        }
    }
}
