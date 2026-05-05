Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 3 inciso 1 del segundo apartado
Fecha: 2026-03-14
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Agrega el método apropiado para cambiar el estado del atributo \textit{Condición} en la clase Item.
public class Item {

    protected double value;
    protected boolean Condicion = true;
    private String creator;
    private int inventario;
    private String codigo;

    public Item(double value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public int getInventario() {
        return inventario;
    }

    public double valorReal() {
        double valorActual = value;
        if (!Condicion)
            valorActual = value * .8;
        return valorActual;
    }

    public void setCondicion() {
    this.Condicion = estado;
    }
}
