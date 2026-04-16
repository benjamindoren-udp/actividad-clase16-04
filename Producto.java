public class Producto {
    int id;
    double precio;

        public Producto(int id, double precio){
            this.id = id;
            this.precio = precio;
        }

        public void insertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int valorActual = arr[i];
                int j = i - 1;
                // Desplazar elementos mayores hacia la derecha
                while (j >= 0 && arr[j] > valorActual) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = valorActual;
            }
        }

        public int busquedaBinaria(int[] arr, int buscado) {
            int inicio = 0, fin = arr.length - 1;
            while (inicio <= fin) {
                int medio = inicio + (fin - inicio) / 2;
                if (arr[medio] == buscado) return medio; // Encontrado
                if (arr[medio] < buscado) inicio = medio + 1;
                else fin = medio - 1;
            }
            return -1; // No encontrado
        }
}

public static void main(String[] args) {
    Producto[] lista  = {
        new Producto(50, 500),
        new Producto(40, 400),
        new Producto(10, 150),
        new Producto(20, 250),
    };

    insertionSort(lista);
    busquedaBinaria(lista, 40);

}
