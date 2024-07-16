import java.util.Random;

public class ParDeDados {
    private int dado1;
    private int dado2;

    public int getDado1() {
        return dado1;
    }
    public int getDado2() {
        return dado2;
    }
    public int[] getDados() {
        int[] dados = new int[2];
        dados[0] = dado1;
        dados[1] = dado2;
        return dados;
    }

    public void rolar() {
        Random random = new Random();
        this.dado1 = random.nextInt(1, 7);
        this.dado2 = random.nextInt(1, 7);
    }
}