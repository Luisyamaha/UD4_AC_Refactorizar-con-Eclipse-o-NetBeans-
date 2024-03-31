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
        System.out.println("Di�metro: " + 2 * rad);
        System.out.println("Color: " + color);
        double area1 = 2 * 3.1416 * rad * rad;
        double area = area1;
        System.out.println(area);
    }

    private String color;

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.rad;
        double radio2 = otro.getRad();
        if (considerarDecimales) {
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
