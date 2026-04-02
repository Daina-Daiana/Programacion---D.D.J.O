/**
 *  Estructura del Programa que ordena con distintos algoritmos un arreglo de
 *  tipos int, obtiene su máximo y mínimo.
 *
 * Curso: Programación
 *
 * Temas: 3.1, a 3.3 \ 4.1 del Temario
 *        Construtctores, metodos de asignación, consulta, calculadores,
 *        misceláneos
 *
 *        Algoritmos de Ordenamientos,
 *              BubbleSort
 *              InsertionSort
 *              SelectionSort
 *        Máximo, Mínimo y Promedio.
 *
 *        Dado un diagrama UML generar la estructura
 *        del programa
 *
 * Referencias:
 *  - Alsuwaiyel (2022). Algorithms Design Techniques and Analysis. 2nd edition
 *    World Scientific.
 *      + Algorithm 1.4 selectionsort  pag 13
 *      + Algorithm 1.5 insertionsort  pag 14
 *      + Algorithm 1.19 bubblesort pag 70
 *
 * Software:
 *    java 25
 *    IntelliJ IDEA 2025.3.4
 *
 * @author Roberto Méndez Méndez / Deepseek
 * Editor: Daina Daiana Jimenez Olivera 
 * Fecha: 16/ Marzo/ 22
 * Editado: 01 Abril 2026
 */

public class Estructura_ManejoDatos {
    private int[] data;
    private int size;

    public Estructura_ManejoDatos() {
        this.data = new int[0];
        this.size = 0;
    }

    public Estructura_ManejoDatos(int[] arr) {
        this.data = arr.clone();
        this.size = arr.length;
    }

    public void setData(int[] arr) {
        this.data = arr.clone();
        this.size = arr.length;
    }

    public int[] getData() {
        return data.clone();
    }

    public void bubbleSort() {
        int i = 0;                        
        boolean sorted = false;
        while (i < data.length - 1 && !sorted) {
            sorted = true;
            for (int j = data.length - 1; j >= i + 1; j--) {
                if (data[j] < data[j-1]) {
                    int aux = data[j];
                    data[j] = data[j-1];
                    data[j-1] = aux;
                    sorted = false;
                }
            }
            i++;
        }
    }

    public void insertionSort() {
        int n = data.length;
        for (int i = 1; i < n; i++) {      
            int x = data[i];               
            int j = i - 1;                 
            while (j >= 0 && data[j] > x) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = x;
        }
    }

    public void selectionSort() {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int k = i;                     
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = data[i];
                data[i] = data[k];
                data[k] = temp;
            }
         }
    }

    public int max() {
        if (data.length == 0) throw new IllegalStateException("Arreglo vacío");
        int maximo = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maximo) maximo = data[i];
      }
      return maximo;
    }

    public int min() {
        if (data.length == 0) throw new IllegalStateException("Arreglo vacío");
        int minimo = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < minimo) minimo = data[i];
      }
      return minimo;
    }
    
    public double average() {
        // Calcular promedio
        return 0.0;
    }

    public void displayArray() {
        // Mostrar arreglo
    }

    public void sortAndDisplay(String method) {
        // Ordenar según método y mostrar
    }
}
