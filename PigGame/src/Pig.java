public class Pig {
    private ParDeDados parDeDados = new ParDeDados();
    private Jogador j1 = new Jogador();
    private Jogador j2 = new Jogador();
    private Jogador atual = j1;
    private int pontosRodada = 0;

    public int getPontosRodada() {
        return pontosRodada;
    }

    private void proxRodada() {
        if (atual == j1) {
            atual = j2;
        } else {
            atual = j1;
        }
        pontosRodada = 0;
    }

    private boolean hasOne(int[] dados) {
        for (int i : dados) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public int[] jogar() {
        if (pontosRodada >= 20) {
            atual.updatePontos(pontosRodada);
            proxRodada();
            int[] num = {0,0};
            return num;
        }

        parDeDados.rolar();
        int[] dados = parDeDados.getDados();
        if (!hasOne(dados)) {
            for (int i : dados) {
                pontosRodada += i;
            }
            return dados;
        }
        return null;
    }
}
