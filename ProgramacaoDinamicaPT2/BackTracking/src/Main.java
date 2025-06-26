import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        int n = 2;
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(numeros, n, 0, new ArrayList<>(), resultado);

        for (List<Integer> subarray : resultado) {
            System.out.println(subarray);
        }
    }

    private static void backtrack(int[] numeros, int n, int start, List<Integer> atual, List<List<Integer>> resultado) {
        if (atual.size() == n) {
            resultado.add(new ArrayList<>(atual));
            return;
        }

        for (int i = start; i < numeros.length; i++) {
            atual.add(numeros[i]);
            backtrack(numeros, n, i + 1, atual, resultado);
            atual.remove(atual.size() - 1);
        }
    }
}
