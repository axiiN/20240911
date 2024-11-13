public class Trapez implements Alakzat {
    private double a;
    private double b;
    private double c;
    private double d;

    public Trapez(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    };

    public double calculateArea() {
        double areaPart1 = (a + c) / (4 * (a - c));
        double areaPart2 = (a + b - c + d) * (a - b - c + d) * (a + b - c - d) * (-a + b + c + d);
        return areaPart1 * Math.sqrt(areaPart2);
    }
}
