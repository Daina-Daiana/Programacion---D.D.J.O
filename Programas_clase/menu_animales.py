import sys
import os

# Añadir el directorio raíz al path para poder importar los paquetes
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from animales.perro import Perro
from animales.gato import Gato
from animales.pajaro import Pajaro

def mostrar_menu(animales):
    print("\n=== MENÚ DE ANIMALES ===")
    for i, animal in enumerate(animales, start=1):
        print(f"{i}. {animal.__class__.__name__}")
    print("0. Salir")

def obtener_opcion(animales):
    while True:
        try:
            opcion = int(input("\nSeleccione un animal (0 para salir): "))
            if opcion == 0:
                return None
            if 1 <= opcion <= len(animales):
                return opcion - 1  # convertir a índice de lista
            else:
                print(f"Opción inválida. Elija entre 1 y {len(animales)} o 0 para salir.")
        except ValueError:
            print("Entrada no válida. Ingrese un número.")

def main():
    # Crear una lista con instancias de todos los animales
    animales = [Perro(), Gato(), Pajaro()]

    while True:
        mostrar_menu(animales)
        indice = obtener_opcion(animales)
        if indice is None:
            print("¡Hasta luego!")
            break

        animal_seleccionado = animales[indice]
        print("\n" + "="*40)
        print(animal_seleccionado)  # Se usa implícitamente el método __str__
        print("="*40)

if __name__ == "__main__":
    main()
