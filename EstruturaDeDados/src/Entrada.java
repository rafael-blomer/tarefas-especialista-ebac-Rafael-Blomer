public class Entrada {
    int chave;
    int valor;

    Entrada(int chave, int valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" + chave + "=" + valor + "}";
    }
}