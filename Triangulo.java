public class Triangulo {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea(){
        return (altura+base)/2.0;
    }
}
