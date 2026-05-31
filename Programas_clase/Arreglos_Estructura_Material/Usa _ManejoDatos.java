/**
 *  Programa que implementa instancias de la clase
 *                Estructura_ManejoDatos
 *  para probar los diversos métodos.
 *
 * Curso: Programación
 *
 * Temas: 3.1 y 4.1 del Temario
 *
 * Software:
 *    java 25
 *    IntelliJ IDEA 2025.3.4
 *
 * @author Roberto Méndez Méndez
 * Editor: Daina Daiana Jimenez Olivera 
 * Fecha: 01 Abril 2026
 */

import java.util.Scanner;

public class Usa_ManejoDatos {

    void main() {
        Scanner sc = new Scanner(System.in);
        Estructura_Manejodatos gestor = new Estructura_Manejodatos();
        int opcion = 0;

        while (opcion != 6) {
            mostrarMenu();
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                gestor = cargarArreglo(sc);
            } else if (opcion == 2) {
                if (gestor.getData().length == 0) {
                    System.out.println("El arreglo está vacío. No se puede obtener el mínimo.");
                } else {
                    System.out.println("Mínimo: " + gestor.min());
                }
            } else if (opcion == 3) {
                if (gestor.getData().length == 0) {
                    System.out.println("El arreglo está vacío. No se puede obtener el máximo.");
                } else {
                    System.out.println("Máximo: " + gestor.max());
                }
            } else if (opcion == 4) {
                System.out.printf("Promedio: %.2f%n", gestor.average());
                if (gestor.getData().length == 0) {
                    System.out.println("(El arreglo está vacío)");
                }
            } else if (opcion == 5) {
                ordenarConMenu(sc, gestor);
            } else if (opcion == 6) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    private void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Ingresar nuevo arreglo");
        System.out.println("2. Mostrar valor mínimo");
        System.out.println("3. Mostrar valor máximo");
        System.out.println("4. Mostrar promedio");
        System.out.println("5. Ordenar y mostrar (con selección de método)");
        System.out.println("6. Salir");
    }

    private Estructura_Manejodatos cargarArreglo(Scanner sc) {
        System.out.print("Tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Estructura_Manejodatos e = new Estructura_Manejodatos(arr);
        System.out.print("Arreglo cargado: ");
        e.displayArray();
        return e;
    }

    private void ordenarConMenu(Scanner sc, Estructura_Manejodatos e) {
        System.out.println("\n--- MÉTODOS DE ORDENAMIENTO ---");
        System.out.println("1. BubbleSort");
        System.out.println("2. SelectionSort");
        System.out.println("3. InsertionSort");
        System.out.print("Seleccione (1-3): ");
        int met = sc.nextInt();

        String metodo;
        if (met == 1) {
            metodo = "bubble";
        } else if (met == 2) {
            metodo = "selection";
        } else if (met == 3) {
            metodo = "insertion";
        } else {
            System.out.println("Opción inválida. Se usará BubbleSort.");
            metodo = "bubble";
        }

        if (e.getData().length == 0) {
            System.out.println("El arreglo está vacío, no se puede ordenar.");
        } else {
            e.sortAndDisplay(metodo);
        }
    }
}
