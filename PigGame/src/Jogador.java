public class Jogador {
    private boolean statusArriscando = false;
    private int pontos = 0;

    public int getPontos() {
        return pontos;
    }
    public void updatePontos(int pontos) {
        this.pontos += pontos;
    }
    public void restartPontos() {
        pontos = 0;
    }

    public boolean getStatusArriscando() {
        return statusArriscando;
    }
    public void updateStatusArriscando() {
        if (statusArriscando) {
            statusArriscando = false;
        } else {
            statusArriscando = true;
        }
    }
}
