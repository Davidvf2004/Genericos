public class Matriz<T> {
    private T[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = (T[][]) new Object[filas][columnas];
    }

    public void set(int fila, int columna, T elemento) {
        this.matriz[fila][columna] = elemento;
    }

    public T get(int fila, int columna) {
        return this.matriz[fila][columna];
    }

    public int columnas() {
        return this.columnas;
    }

    public int filas() {
        return this.filas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matriz: \n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sb.append(matriz[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}