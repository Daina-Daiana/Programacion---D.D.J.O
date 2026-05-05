Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 5 inciso 3 del tercer apartado
Fecha: 2026-05-4
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Crea el item balon (hereda de Item).

public class Balon extends Item {
    private String sport;    // deporte (fútbol, baloncesto, etc.)
    private double diameter; // diámetro en cm
    private String brand;    // marca

    public Balon(double value, String creator, String sport, double diameter, String brand) {
        super(value, creator);
        this.sport = sport;
        this.diameter = diameter;
        this.brand = brand;
    }
}
