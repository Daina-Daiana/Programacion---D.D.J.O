Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 3 inciso 2 del segundo apartado
Fecha: 2026-03-14
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Programar el problema planteado en la actividad 3 
en el inciso 2 del segundo apartado

e = 2.718281828459045
años = int(input("Años de inversión: "))
capital = e
for n in range(1, años + 1):
    capital = capital * n - 1
    print(f"Año {n}: {capital:.10f}")
