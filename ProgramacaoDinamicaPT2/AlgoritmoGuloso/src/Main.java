public class Main {
    public static void main(String[] args) {
        int quantia = 8;
        int[] moedasDisponiveis = {1, 2, 5};
        ordenarArray(moedasDisponiveis);
        contarMoedas(quantia, moedasDisponiveis);
    }

    private static void ordenarArray(int[] moedasDisponiveis) {
        for(int i = 0; i < moedasDisponiveis.length - 1; i++) {
            for (int j = 0; j < moedasDisponiveis.length - 1 - i; j++) {
                if (moedasDisponiveis[j] < moedasDisponiveis[j + 1]) {
                    int temp = moedasDisponiveis[j];
                    moedasDisponiveis[j] = moedasDisponiveis[1 + j];
                    moedasDisponiveis[j + 1] = temp;
                }
            }
        }
    }

    private static void contarMoedas(int quantia, int[] moedasDisponiveis) {
        int i = 0;
        int quantiaParcial = 0;
        int moedasUsadas = 0;
        while (i < moedasDisponiveis.length) {
            if (quantiaParcial + moedasDisponiveis[i] <= quantia) {
                quantiaParcial += moedasDisponiveis[i];
                moedasUsadas++;
                continue;
            }
            i++;
        }
        System.out.println("Total de moedas usadas = " + moedasUsadas);
    }
}