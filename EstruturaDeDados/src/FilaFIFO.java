public class FilaFIFO {

    private int[] fila = new int[10];
    private int numArray = -1;

    public void enqueue(int num) {
        if (fila.length== numArray + 1) {
            int[] novoArray = new int[fila.length * 2];
            System.arraycopy(fila, 0, novoArray, 0, fila.length);
            fila = novoArray;
        }
        fila[++numArray] = num;
    }

    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia");
        }

        for(int i = 0; i < numArray; i++) {
            fila[i] = fila[i + 1];
        }
        numArray--;
    }

    public int rear() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia");
        }
        return fila[numArray];
    }

    public int front () throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia");
        }
        return fila[0];
    }

    public int size() {
        return numArray + 1;
    }

    public boolean isEmpty() {
        return numArray == -1;
    }
}
