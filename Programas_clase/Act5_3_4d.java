public class Balon extends Item {
    private String sport;      // deporte (fútbol, baloncesto, etc.)
    private double diameter;   // diámetro en cm
    private String brand;      // marca

    public Balon(double value, String creator, String sport, double diameter, String brand) {
        super(value, creator);
        this.sport = sport;
        this.diameter = diameter;
        this.brand = brand;
    }

    public double valorReal() {
        double valorActual = value;
        if (!Condicion)
            valorActual = value * 0.7;  // 30% de descuento
        return valorActual;
    }

    public String toString() {
        return "Balon extends " + super.toString() +
               ", sport=" + sport + ", diameter=" + diameter +
               ", brand=" + brand + "]";
    }
}