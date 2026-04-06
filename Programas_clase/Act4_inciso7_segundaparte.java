Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 4 inciso 7 del segundo apartado
Fecha: 2026-04-06
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Modifica el código de para que almacene los valores calculados en un arreglo

import java.util.Scanner;

public class SecuenciaNumerica {
    public static void main(String[] args) {
        long g = 347L;
        long b = 37L;
        long a = 2L;
        long tmp;
        int indice = 30;
        
        long[] valores = new long[indice + 1];
        
        for (int i = 4; i <= indice; i++) {
            tmp = g;
            g = g * 111L - b * 1130L + a * 3000L;
            a = b;
            b = tmp;
            
            valores[i] = g;
        }
        
        Scanner scanner = new Scanner(System.in);
        int indiceConsulta;
        System.out.print("Ingrese el índice que desea ver (entre 4 y " + indice + "): ");
        indiceConsulta = scanner.nextInt();
        
        while (indiceConsulta < 4 || indiceConsulta > indice) {
            System.out.println("Índice fuera de rango. Intente nuevamente.");
            System.out.print("Ingrese el índice que desea ver (entre 4 y " + indice + "): ");
            indiceConsulta = scanner.nextInt();
        }
        
        long numerador = valores[indiceConsulta];
        System.out.println("Valor del numerador en el índice " + indiceConsulta + ": " + numerador);
        
        scanner.close();
    }
}
