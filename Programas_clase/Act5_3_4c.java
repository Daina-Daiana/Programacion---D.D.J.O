public class Silla extends Item {
    private int legs;          // número de patas
    private String material;   // material de la silla
    private boolean hasBack;   // tiene respaldo o no

    public Silla(double value, String creator, int legs, String material, boolean hasBack) {
        super(value, creator);
        this.legs = legs;
        this.material = material;
        this.hasBack = hasBack;
    }

    public double valorReal() {
        double valorActual = value;
        if (!Condicion)
            valorActual = value * 0.85;  // 15% de descuento
        return valorActual;
    }

    public String toString() {
        return "Silla extends " + super.toString() +
               ", legs=" + legs + ", material=" + material +
               ", hasBack=" + hasBack + "]";
    }
}