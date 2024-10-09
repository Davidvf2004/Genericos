import java.util.EmptyStackException;

public class PilaArray<T> {
    private T[] array;
    private int tope;

    public PilaArray(int capacidad) {
        array = (T[]) new Object[capacidad];
        tope = -1;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public void apilar(T elemento) {
        if (tope == array.length - 1) {
            throw new StackOverflowError("La pila está llena");
        }
        tope++;
        array[tope] = elemento;
    }

    public T desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        T elemento = array[tope];
        tope--;
        return elemento;
    }

    public T cima() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return array[tope];
    }


    public int tamano() {
        return tope + 1;
    }
}