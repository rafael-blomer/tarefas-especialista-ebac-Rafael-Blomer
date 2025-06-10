public class Main {

    public static void main(String[] args) throws Exception{
        chamandoMetodoPilha();
        chamandoMetodoFilaFIFO();
        chamandoMetodoListEncadeada();
        chamandoMetodoHashMap();
    }

    public static void chamandoMetodoPilha() throws Exception {
        Pilha p = new Pilha();
        System.out.println("===== PILHA =====\n");

        System.out.println(p.isEmpty());

        p.push(1);
        p.push(3);

        System.out.println(p.isEmpty());
        System.out.println(p.top());
        System.out.println(p.size());

        p.push(6);
        p.push(10);

        System.out.println(p.size());
        System.out.println(p.pop());
        System.out.println(p.top());
        System.out.println(p.size());

        System.out.println("\n==== FINAL PILHA ====\n");
    }

    public static void chamandoMetodoFilaFIFO() throws Exception {
        FilaFIFO f = new FilaFIFO();
        System.out.println("===== FILA FIFO =====\n");

        System.out.println(f.isEmpty());

        f.enqueue(5);
        f.enqueue(7);

        System.out.println(f.isEmpty());
        System.out.println(f.front());
        System.out.println(f.rear());
        System.out.println(f.size());

        f.enqueue(8);
        f.enqueue(10);

        System.out.println(f.size());

        f.dequeue();

        System.out.println(f.front());
        System.out.println(f.size());

        System.out.println("\n==== FINAL FILA FIFO ====\n");
    }

    public static void chamandoMetodoListEncadeada() {
        ListaEncadeada l = new ListaEncadeada();
        System.out.println("===== LISTA ENCADEADA =====\n");

        l.push(1);
        l.push(5);
        l.push(7);
        l.push(10);

        System.out.println(l.size());
        l.printList();

        l.insert(1, 3);
        l.insert(3, 4);
        l.printList();
        System.out.println(l.elementAt(2));
        l.remove(2);
        System.out.println(l.elementAt(2));
        l.printList();
        System.out.println(l.pop());
        l.printList();

        System.out.println("\n==== FINAL LISTA ENCADEADA ====\n");
    }

    public static void chamandoMetodoHashMap() {
        MapaHash m = new MapaHash();
        System.out.println("===== HASHMAP =====\n");

        m.put(1, 10);
        System.out.println(m.get(1));
        System.out.println(m.delete(1));
        m.put(1, 10);
        m.put(2, 20);
        m.put(3, 30);
        System.out.println(m.get(2));
        System.out.println(m.get(3));
        m.clear();

        System.out.println("\n==== FINAL HASHMAP ====\n");
    }

}