import java.util.Arrays;

public class ListaOrdenada<E extends Comparable<E>> {
    private E[] array;
    private int size;

    public ListaOrdenada() {
        this.array = (E[]) new Comparable[10]; // tamaño inicial
        this.size = 0;
    }

    public void add(E o) {
        if (size == array.length) {
            // Redimensionar el array si está lleno
            array = Arrays.copyOf(array, array.length * 2);
        }

        // Buscar la posición correcta para insertar el elemento
        int i = 0;
        while (i < size && array[i].compareTo(o) < 0) {
            i++;
        }

        // Desplazar los elementos hacia la derecha
        System.arraycopy(array, i, array, i + 1, size - i);

        // Insertar el nuevo elemento
        array[i] = o;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(E o) {
        for (int i = 0; i < size; i++) {
            if (array[i].compareTo(o) == 0) {
                // Desplazar los elementos hacia la izquierda
                System.arraycopy(array, i + 1, array, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (array[i].compareTo(o) == 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}