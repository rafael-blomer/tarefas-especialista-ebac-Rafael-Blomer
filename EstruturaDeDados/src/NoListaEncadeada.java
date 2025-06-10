public class NoListaEncadeada {
    private Integer valor;
    private NoListaEncadeada proximo;

    public NoListaEncadeada(Integer valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public NoListaEncadeada getProximo() {
        return proximo;
    }

    public void setProximo(NoListaEncadeada proximo) {
        this.proximo = proximo;
    }
}
