import java.util.LinkedList;

public class Pila<T> {

    private LinkedList<T> pila;

    public Pila() {
        pila = new LinkedList<>();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public T extraer() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.removeFirst();
    }

    public T primero() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.getFirst();
    }

    public void anadir(T elemento) {
        pila.addFirst(elemento);
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}