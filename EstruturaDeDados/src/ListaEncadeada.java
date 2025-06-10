public class ListaEncadeada {

    private NoListaEncadeada cabeca = null;

    public void push(Integer valor) {
        NoListaEncadeada novo = new NoListaEncadeada(valor);

        if (cabeca == null)
            cabeca = novo;
        else {
            NoListaEncadeada atual = cabeca;
            while (atual.getProximo() != null)
                atual = atual.getProximo();
            atual.setProximo(novo);
        }
    }

    public int pop() {
        if (cabeca == null) {
            throw new RuntimeException("Lista vazia");
        }
        int valor;
        if (cabeca.getProximo() == null) {
            valor = cabeca.getValor();
            cabeca = null;
            return valor;
        }
        NoListaEncadeada utilNo = cabeca;
        while (utilNo.getProximo().getProximo() != null) {
            utilNo = utilNo.getProximo();
        }
        valor = utilNo.getProximo().getValor();
        utilNo.setProximo(null);
        return valor;
    }

    public void insert(int index, Integer valor) {
        NoListaEncadeada novoNo = new NoListaEncadeada(valor);

        if (index == 0) {
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
            return;
        }

        NoListaEncadeada util = cabeca;
        for (int i = 0; i < index - 1; i++) {
            if (util == null) {
                throw new IndexOutOfBoundsException("Índice fora do limite");
            }
            util = util.getProximo();
        }

        if (util == null) {
            throw new IndexOutOfBoundsException("Índice fora do limite");
        }

        novoNo.setProximo(util.getProximo());
        util.setProximo(novoNo);
    }

    public void remove(int index) {
        if (cabeca == null) {
            throw new IndexOutOfBoundsException("Lista vazia");
        }

        if (index == 0) {
            cabeca = cabeca.getProximo();
            return;
        }

        NoListaEncadeada util = cabeca;
        for (int i = 0; i < index - 1; i++) {
            if (util == null || util.getProximo() == null) {
                throw new IndexOutOfBoundsException("Índice fora do limite");
            }
            util = util.getProximo();
        }

        if (util.getProximo() == null) {
            throw new IndexOutOfBoundsException("Índice fora do limite");
        }

        util.setProximo(util.getProximo().getProximo());
    }

    public Integer elementAt(int index) {
        if (cabeca == null) {
            throw new IndexOutOfBoundsException("Lista vazia");
        }

        if (index == 0) {
            return cabeca.getValor();
        }

        NoListaEncadeada util = cabeca;
        for (int i = 0; i < index; i++) {
            if (util == null || util.getProximo() == null) {
                throw new IndexOutOfBoundsException("Índice fora do limite");
            }
            util = util.getProximo();
        }
        return util.getValor();
    }

    public int size() {
        NoListaEncadeada util = cabeca;
        int cont = 0;
        while (util != null){
            cont++;
            util = util.getProximo();
        }
        return cont;
    }

    public void printList() {
        NoListaEncadeada util = cabeca;
        while (util != null){
            System.out.print(util.getValor());
            util = util.getProximo();
            System.out.print(" -> ");
        }
        System.out.println("null");
    }

}
