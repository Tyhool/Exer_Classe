import java.util.Scanner;
import java.math.*;

public class Ponto2D {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public int getX1() {
        return this.x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return this.x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return this.y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return this.y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void igual() {
        if (x1 == y1 && y1 == y2) {
            System.out.println("A distancia é zero");
        } else {
            System.out.println("Estao distande um do outro");
        }
    }

    public void calculoEuclidiana() {

        double distancia;
        Scanner input = new Scanner(System.in);
        System.out.println(" os ponto A");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println(" os ponto B");
        x2 = input.nextInt();
        y2 = input.nextInt();

        igual();
        System.out.println("");
        distancia = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        distancia = Math.sqrt(distancia);
        System.out.println("A distancia dos dois pontos é: " + distancia);
    }
}
