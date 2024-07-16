public class TestaParDeDados {
    public static void main(String[] args) throws Exception {
        ParDeDados parDeDados = new ParDeDados();
        int n = 300;
        int quantidade = contarNumeroN(parDeDados, n, 6);
        System.out.println(quantidade);
    }

    static int[] rolar(ParDeDados parDeDados) {
        int[] dados = new int[2];
        parDeDados.rolar();
        dados[0] = parDeDados.getDado1();
        dados[1] = parDeDados.getDado2();
        return dados;
    }

    static int verificarNumeroDados(int[] dados, int num) {
        int quantidade = 0;
        for (int i : dados) {
            if (i == num) {
                quantidade++;
            }
        }
        return quantidade;
    }

    static int contarNumeroN(ParDeDados parDeDados, int nJogadas, int n) {
        int quantidade = 0;
        for (int i = 0; i < nJogadas; i++) {
            quantidade += verificarNumeroDados(rolar(parDeDados), n);
        }
        return quantidade;
    }
}
