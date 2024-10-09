public class Aplicacion {

    public static void main(String[] args) {

        // Crea una matriz de Integer de 4 filas y 2 columnas
        int[][] matriz = new int[4][2];

        // Rellénala con números consecutivos comenzando por el 1
        int contador = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        // Muestra por pantalla la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Muestra por pantalla el contenido de la celda en la fila 1, columna 2
        System.out.println("\nContenido de la celda en la fila 1, columna 2: " + matriz[1][1]);
    }
}