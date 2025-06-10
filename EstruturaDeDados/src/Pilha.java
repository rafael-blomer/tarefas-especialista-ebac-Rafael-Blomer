public class Pilha {

    private int numArray = -1;
    private int[] pilha = new int[10];

    public void push(int numero) {
        if (pilha.length== numArray + 1) {
            int[] novoArray = new int[pilha.length * 2];
            System.arraycopy(pilha, 0, novoArray, 0, pilha.length);
            pilha = novoArray;
        }
        pilha[++numArray] = numero;
    }

    public int size() {
        return numArray + 1;
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha vazia");
        }
        return pilha[numArray];
    }

    public boolean isEmpty() {
        return numArray == -1;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Pilha vazia");
        }
        return pilha[numArray--];
    }
}
