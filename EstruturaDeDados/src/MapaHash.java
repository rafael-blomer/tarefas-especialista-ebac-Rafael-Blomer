import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MapaHash {

    private static final int TAMANHO_MAPA = 10;
    private LinkedList<Entrada>[] mapa;

    public MapaHash() {
        mapa = new LinkedList[TAMANHO_MAPA];
        for (int i = 0; i < TAMANHO_MAPA; i++) {
            mapa[i] = new LinkedList<>();
        }
    }

    private int funcaoHash(int chave) {
        return Math.abs(chave) % TAMANHO_MAPA;
    }

    public void put(int chave, int valor) {
        int indice = funcaoHash(chave);
        LinkedList<Entrada> bucket = mapa[indice];

        for (Entrada entrada : bucket) {
            if (entrada.chave == chave) {
                entrada.valor = valor;
                return;
            }
        }

        bucket.add(new Entrada(chave, valor));
    }

    public int get(int chave) {
        int indice = funcaoHash(chave);
        LinkedList<Entrada> bucket = mapa[indice];

        for (Entrada entrada : bucket) {
            if (entrada.chave == chave) {
                return entrada.valor;
            }
        }

        throw new NoSuchElementException("A chave " + chave + " não foi encontrada no mapa.");
    }

    public int delete(int chave) {
        int indice = funcaoHash(chave);
        LinkedList<Entrada> bucket = mapa[indice];
        Entrada entradaParaRemover = null;

        for (Entrada entrada : bucket) {
            if (entrada.chave == chave) {
                entradaParaRemover = entrada;
                break;
            }
        }

        if (entradaParaRemover != null) {
            bucket.remove(entradaParaRemover);
            return entradaParaRemover.valor;
        } else {
            throw new NoSuchElementException("A chave " + chave + " para deleção não foi encontrada.");
        }
    }


    public void clear() {
        for (int i = 0; i < TAMANHO_MAPA; i++) {
            mapa[i].clear();
        }
    }

}