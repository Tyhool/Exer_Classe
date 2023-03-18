import java.util.Scanner;

public class Invoice {
    private String[] id = { "1", "2", "3", "4", "5", "6" };
    private String[] item = { "sal", "pimenta", "oleo", "tempero", "alho", "açucar" };
    private float[] preco = { 3.5f, 10.0f, -4.1f, 5.0f, -10.0f, 9.4f };
    private int[] quantidade = { 2, 5, 1, -5, 9, -1 };
    private String vendido;

    public Invoice() {
    }

    public Invoice(String[] id, String[] item, float[] preco, int[] quantidade, String vendido) {
        this.id = id;
        this.item = item;
        this.preco = preco;
        this.quantidade = quantidade;
        this.vendido = vendido;
    }

    public String[] getId() {
        return this.id;
    }

    public void setId(String[] id) {
        this.id = id;
    }

    public String[] getItem() {
        return this.item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }

    public float[] getPreco() {
        return this.preco;
    }

    public void setPreco(float[] preco) {
        this.preco = preco;
    }

    public int[] getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int[] quantidade) {
        this.quantidade = quantidade;
    }

    public String getVendido() {
        return this.vendido;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
    }

    public void quantidadeItem() {
        for (int i = 0; i < 5; i++) {
            if (quantidade[i] < 0) {
                quantidade[i] = 0;
            }
        }
    }

    public void precoItem() {
        for (int i = 0; i < 5; i++) {
            if (preco[i] < 0.0f) {
                preco[i] = 0.0f;
            }
        }

    }

    public void fatura() {
        float faturaTotal = 0.0f;
        quantidadeItem();
        precoItem();
        System.out.println("Qual item voce deseja:");
        System.out.println("1 - sal");
        System.out.println("2 - pimenta");
        System.out.println("3 - oleo");
        System.out.println("4 - tempero");
        System.out.println("5 - alho");
        System.out.println("6 - acucar");
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                faturaTotal = quantidade[0] * preco[0];
                System.out.println(("O id é: " + id[0] + "; O item é: " + item[0] + "; com valor de: " + preco[0]
                        + "; tem no estoque:" + quantidade[0]));
                System.out.println("O valor total é: " + faturaTotal);
                break;
            case 2:
                faturaTotal = quantidade[1] * preco[1];
                System.out.println(("O id é: " + id[1] + "; O item é: " + item[1] + "; com valor de: " + preco[1]
                        + "; tem no estoque:" + quantidade[1]));
                System.out.println("O valor total é: " + faturaTotal);
                break;
            case 3:
                faturaTotal = quantidade[2] * preco[2];
                System.out.println(("O id é: " + id[2] + "; O item é: " + item[2] + "; com valor de: " + preco[2]
                        + "; tem no estoque:" + quantidade[2]));
                System.out.println("O valor total é: " + faturaTotal);
                break;
            case 4:
                faturaTotal = quantidade[3] * preco[3];
                System.out.println(("O id é: " + id[3] + "; O item é: " + item[3] + "; com valor de: " + preco[3]
                        + "; tem no estoque:" + quantidade[3]));
                System.out.println("O valor total é: " + faturaTotal);
                break;
            case 5:
                faturaTotal = quantidade[4] * preco[4];
                System.out.println(("O id é: " + id[4] + "; O item é: " + item[4] + "; com valor de: " + preco[4]
                        + "; tem no estoque:" + quantidade[4]));
                System.out.println("O valor total é: " + faturaTotal);
                break;
            case 6:
                faturaTotal = quantidade[5] * preco[5];
                System.out.println(("O id é: " + id[5] + "; O item é: " + item[5] + "; com valor de: " + preco[5]
                        + "; tem no estoque:" + quantidade[5]));
                System.out.println("O valor total é: " + faturaTotal);
                break;

        }

    }
}
