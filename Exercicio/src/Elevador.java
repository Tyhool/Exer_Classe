import java.util.Scanner;

public class Elevador {
    private int andarAtual = 0;
    private int andarTotal = 5;
    private int capacidadeMax = 10;
    private int pessoasPresente = 0;

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndarTotal() {
        return this.andarTotal;
    }

    public void setAndarTotal(int andarTotal) {
        this.andarTotal = andarTotal;
    }

    public int getCapacidadeMax() {
        return this.capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getPessoasPresente() {
        return this.pessoasPresente;
    }

    public void setPessoasPresente(int pessoasPresente) {
        this.pessoasPresente = pessoasPresente;
    }

    public Elevador() {
    }

    public Elevador(int andarTotal, int capacidadeMax) {
        this.andarTotal = andarTotal;
        this.capacidadeMax = capacidadeMax;
    }

    public void entrar() {
        int entra;
        Scanner input = new Scanner(System.in);
        if (pessoasPresente <= capacidadeMax) {
            System.out.println("Quantas pessoas vão entrar?");
            entra = input.nextInt();
            pessoasPresente = pessoasPresente + entra;
            System.out.println(" ");
            System.out.println("Total de pessoa: " + pessoasPresente);
            System.out.println("Andar atual: " + andarAtual);
            System.out.println(" ");
            if (pessoasPresente >= capacidadeMax) {
                System.out.println("Capacidade maxima atingida, redefenir a entrada das pessoas. ");
                pessoasPresente = pessoasPresente - entra;
                System.out.println("entrada inicial: " + pessoasPresente);
                System.out.println(" ");
            }
        } else {
            System.out.println("Atingiu a capacidade maxima, nao pode entrar");
            System.out.println(" ");
        }
    }

    public void sair() {
        int sai;
        Scanner input = new Scanner(System.in);
        if (pessoasPresente <= capacidadeMax || pessoasPresente < 0) {
            System.out.println("Quantas pessoas vão sair?");
            sai = input.nextInt();
            pessoasPresente = pessoasPresente - sai;
            System.out.println(" ");
            System.out.println("Total de pessoa: " + pessoasPresente);
            System.out.println("Andar atual: " + andarAtual);
            System.out.println(" ");
            if (pessoasPresente >= capacidadeMax || pessoasPresente < 0) {
                System.out.println("Esta vazio, redefenir a saida das pessoas. ");
                pessoasPresente = pessoasPresente + sai;
                System.out.println("saida inicial: " + pessoasPresente);
                System.out.println(" ");
            }
        } else {
            System.out.println("Esta vazio, nao pode sair");
            System.out.println(" ");
        }
    }

    public void subir() {
        int subir;
        Scanner input = new Scanner(System.in);
        if (andarAtual <= andarTotal) {
            System.out.println("Quantos andares vai subir?");
            subir = input.nextInt();
            andarAtual = andarAtual + subir;
            System.out.println(" ");
            System.out.println("Total de pessoa: " + pessoasPresente);
            System.out.println("Andar atual: " + andarAtual);
            System.out.println(" ");
            if (andarAtual > andarTotal) {
                System.out.println("Esta no topo, redefenir o andar ");
                andarAtual = andarAtual - subir;
                System.out.println("andar autal: " + andarAtual);
                System.out.println(" ");
            }
        } else {
            System.out.println("esta no topo, nao pode subir");
            System.out.println(" ");
        }
    }

    public void descer() {
        int desce;
        Scanner input = new Scanner(System.in);
        if (andarAtual <= andarTotal && andarAtual > 0) {
            System.out.println("Quantos andares vai descer?");
            desce = input.nextInt();
            andarAtual = andarAtual - desce;
            System.out.println(" ");
            System.out.println("Total de pessoa: " + pessoasPresente);
            System.out.println("Andar atual: " + andarAtual);
            System.out.println(" ");
            if (andarAtual < 0) {
                System.out.println("Esta no terreo, redefenir o andar ");
                andarAtual = andarAtual + desce;
                System.out.println("andar autal: " + andarAtual);
                System.out.println(" ");
            }
        } else {
            System.out.println("esta no terreo, nao pode descer");
            System.out.println(" ");
        }
    }

    public void mostrar() {
        int opcao;
        Scanner input = new Scanner(System.in);

        System.out.println("Escolher opcao");
        System.out.println("1 - entrada");
        System.out.println("2 - saida");
        System.out.println("3 - subir");
        System.out.println("4 - descer");
        System.out.println("5 - sair");
        opcao = input.nextInt();
        while (true) {
            if (opcao == 1) {
                entrar();
            }
            if (opcao == 2) {
                sair();
            }
            if (opcao == 3) {
                subir();
            }
            if (opcao == 4) {
                descer();
            }
            if (opcao == 5) {
                break;
            } else {
                System.out.println("Escolher opcao");
                System.out.println("1 - entrada");
                System.out.println("2 - saida");
                System.out.println("3 - subir");
                System.out.println("4 - descer");
                System.out.println("5 - sair");
            }
            opcao = input.nextInt();
        }
    }
}
