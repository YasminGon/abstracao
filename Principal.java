public class Principal {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();

        circulo.setRaio(10);
        System.out.println(circulo.calcularArea());

        triangulo.setAltura(5);
        System.out.println(triangulo.calcularArea());

        triangulo.setBase(3);
        System.out.println(triangulo.calcularArea());

        quadrado.setLado(7);
        System.out.println(quadrado.calcularArea());


    }
}
