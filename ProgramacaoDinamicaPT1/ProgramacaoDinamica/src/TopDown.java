import java.util.Scanner;

public class TopDown {

    private static final int MAX_ELEMENTS = 100;
    private static final long[] listaFatorial= new long[MAX_ELEMENTS];

    public static long povoarLista(int n) {
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            listaFatorial[i] = -1;
        }
        return fatorial(n);
    }

    public static long fatorial(int n) {
        if (listaFatorial[n] != -1) {
            return listaFatorial[n];
        }

        if (n == 0 || n == 1) {
            listaFatorial[n] = 1;
        } else {
            listaFatorial[n] = n * fatorial(n - 1);
        }
        return listaFatorial[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(povoarLista(sc.nextInt()));
        sc.close();
    }
}