public class Florero extends Item {
    private int capacity;
    private String material;
    private String model;  // puede ser null si no se asigna

    public Florero(double value, String creator, int capacity, String material) {
        super(value, creator);
        this.capacity = capacity;
        this.material = material;
    }

    public double valorReal() {
        double valorActual = value;
        if (!Condicion)
            valorActual = value * 0.9;  // 10% de descuento (diferente al item genérico)
        return valorActual;
    }

    // Sobrescritura de toString (punto 4)
    public String toString() {
        return "Florero extends " + super.toString() +
               ", capacity=" + capacity + ", material=" + material +
               ", model=" + model + "]";
    }
}