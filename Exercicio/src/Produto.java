public class Produto {

    public String[] codigo = { "1", "3", "6", "7", "10", "12", "15", "19", "20", "21", "27", "30" };
    public float[] peso = { 3.5f, 2.9f, 3f, 3f, 3.1f, 15f, 21f, 2.5f, 12.6f, 10.f, 30f, 1f };
    public float[] valor = { 51f, 12.5f, 61f, 11.2f, 62f, 2.56f, 77.12f, 63f, 12f, 83.1f, 18f, 34f };

    public void ProdutoValor() {
        int quantidade = 0;
        for (int i = 0; i <= 11; i++) {
            if (peso[i] > 10 && valor[i] < 50) {
                quantidade++;
            }
        }
        System.out.println("total de produtos com peso maior que 10 e custa menos de 50 reais: " + quantidade);
        System.out.println("");

    }

    public void Media() {
        float media = 0;
        for (int i = 0; i <= 11; i++) {
            media = media + peso[i];
        }
        media = media / 12;
        System.out.println("A media dos pesos é: " + media);
        System.out.println("");
    }

    public void ProdutoLeve() {
        float menor = peso[0];
        for (int i = 0; i <= 11; i++) {
            if (peso[i] < menor)
                menor = peso[i];
        }
        for (int i = 0; i <= 11; i++) {
            if (peso[i] == menor) {
                System.out.println("O codigo do produto é: " + codigo[i]);
                System.out.println("O mais leve produto é:" + peso[i]);
                System.out.println("O produto custa: " + valor[i]);
                System.out.println("");
            }
        }
    }

    public void ProdutoCaro() {
        float maior = valor[0];
        for (int i = 0; i <= 11; i++) {
            if (valor[i] > maior)
                maior = valor[i];
        }
        for (int i = 0; i <= 11; i++) {
            if (valor[i] == maior) {
                System.out.println("O codigo do produto é: " + codigo[i]);
                System.out.println("O peso do produto é:" + peso[i]);
                System.out.println("O produto mais caro é: " + valor[i]);
                System.out.println("");
            }
        }
    }

    public void MediaPeso() {
        float media = 0;
        int quantidade = 0;
        for (int i = 0; i <= 11; i++) {
            if (peso[i] > 10) {
                media = media + peso[i];
                quantidade++;
            }
        }

        media = media / quantidade;
        System.out.println("A media dos produtos maiores que 10 é: " + media);
        System.out.println("");
    }

    public void MostrarInformacoes() {
        ProdutoValor();
        Media();
        ProdutoLeve();
        ProdutoCaro();
        MediaPeso();

    }
}
