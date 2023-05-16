public class Quadrado {
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea(){
        return lado*lado;
    }
}
