Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 5 inciso 2 del tercer apartado
Fecha: 2026-05-4
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Crea el item silla (hereda de Item).

public class Silla extends Item {
    private int legs;        // número de patas
    private String material; // material de la silla
    private boolean hasBack; // si tiene respaldo

    public Silla(double value, String creator, int legs, String material, boolean hasBack) {
        super(value, creator);
        this.legs = legs;
        this.material = material;
        this.hasBack = hasBack;
    }

    // Getters y setters (opcionales)

    @Override
    public double valorReal() {
        double valorActual = value;
        if (!Condicion)
            valorActual = value * 0.85; // ejemplo: 15% de descuento si está en mal estado
        return valorActual;
    }
}
