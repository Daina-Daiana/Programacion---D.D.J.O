Autor: Daina Daiana Jimenez Olivera
Autor: Héctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Act.3 incuso 6 del primer problema
Fecha: 2026-03-17
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Programa que calcula el Interés Compuesto

Modelo empleado:
         M = P x (1 + r/n) ^ (n*t)

    Variables:
        P -> Capital Inicial
        r -> Tasa de interés anual
        n -> Número de capitalizaciones por año
        t -> Número de años
"""

print("\n---- CALCULADORA DE INTERÉS COMPUESTO ----")

#Entrada/Input de datos
capital = float(input("Introduzca su capital inicial: $"))
tasa_anual = float(input("Introduzca su tasa de interés anual (%): "))
capitalizaciones = int(input("Introduzca sus capitalizaciones por año (1 = anual, 12 = mensual): "))
años = int(input("Introduzca sus años de inversión: "))

while True:
    try:
        años = int(input("Introduzca sus años de inversión: "))
        
        if años > 0:
            break
        else:
            print("El valor debe ser positivo.")
            
    except ValueError:
        print("Debes introducir un número entero.")

# Salida/Output de datos
print("\n=== RESULTADOS ===")
print("Capital Inicial:", capital)
print("Tasa Anual:", tasa_anual)
print("Periodo:" + str(años) + " años")
print("Capitalizaciones por año:", capitalizaciones)
print("Monto Final:", monto_final)
print("Interés Ganado:", monto_final-capital)
