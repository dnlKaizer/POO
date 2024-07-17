public class Main {
    public static void main(String[] args) throws Exception {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Pig pig = new Pig();
        pig.start(j1, j2);

        int[] dados = new int[2];

        while (true) {
            dados = pig.jogar();
            if (dados != null) {
                if (dados[0] == 0) {
                    pig.proxRodada();
                } else {
                    imprimirDados(dados);
                }
                Thread.sleep(500);
            } else {

            }
        }
    }

    static void imprimirDados(int[] dados) {
        System.out.println("\nSeus dados na jogada:");
        System.out.println("Dado 1: " + dados[0]);
        System.out.println("Dado 2: " + dados[1]);
        System.out.println();
    }
}
