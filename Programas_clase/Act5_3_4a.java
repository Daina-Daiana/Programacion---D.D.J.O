public class Item {

    protected double value;
    protected boolean Condicion = true;  // true = buen estado, false = mal estado
    private String creator;
    private int inventario;
    private String codigo;

    public Item(double value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    // Getters y setters existentes
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

    // Método agregado para cambiar el estado de Condicion (punto 1)
    public void setCondicion(boolean estado) {
        this.Condicion = estado;
    }

    // Método original valorReal
    public double valorReal() {
        double valorActual = value;
        if (!Condicion)
            valorActual = value * 0.8;  // 20% de descuento si está en mal estado
        return valorActual;
    }

    // Sobrescritura de toString para mostrar información de Item (punto 4)
    public String toString() {
        return "Item [value=" + value + ", creator=" + creator +
               ", inventario=" + inventario + ", codigo=" + codigo +
               ", Condicion=" + Condicion + "]";
    }
}