package figuras;

public class Circunferencia {

    public double getRad()  {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
    private double rad;

    public Circunferencia(double radio) {
        this.rad = radio;
    }

    public void imprimir() {
        color = "rojo";
        double d = 2 * rad;
        System.out.println("Di�metro: " + d);
        System.out.println("Color: " + color);
        double area = calcularArea();
        System.out.println(area);
    }

    public double calcularArea() {
        double area = 2 * PI * rad * rad;
        return area;
    }
    private static final double PI = 3.1416;
    private String color;

    public boolean esIgual(Circunferencia otro, boolean conDecimales) {
        double radio1 = this.rad;
        double radio2 = otro.getRad();
        if (conDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
