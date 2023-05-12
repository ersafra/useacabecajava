package UseACabecaJava;
public class testecharge {
    private final double rx, ry;
    private final double q;

    public testecharge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q = q0;
    }

    public double potencialAt(double x, double y) {
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return q + " at " + "(" + rx + "," + ry + ")";
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        testecharge c1 = new testecharge(0.51, 0.63, 21.3);
        testecharge c2 = new testecharge(0.13, 0.94, 81.9);
        double v1 = c1.potencialAt(x, y);
        double v2 = c2.potencialAt(x, y);
        System.out.printf("%.2e\n", (v1 + v2));
    }
}
