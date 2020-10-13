import java.util.Arrays;

public class Lagrange {

    private static  double[]xi;
    private static double[]yi;

    public static double[] getXi() {
        return xi;
    }

    public static double[] getYi() {
        return yi;
    }

    public static void setX(double[] xi) {
        Lagrange.xi = xi;
    }

    public static  void setY(double[] yi) {
        Lagrange.yi = yi;
    }

    public static double LagrangePolynomial(double[] xi,double[] yi,double x) {
        double t;
        double y = 0;

        for (int i = 0; i < xi.length; i++) {
            t = 1;
            for (int k = 0; k < xi.length; k++) {
                if (i != k)
                    t *= ((x - xi[k]) / (xi[i] - xi[k]));
            }
            y += t * yi[i];
        }
        return y;
    }

    public static void main(String[] args)
    {
        double  y;
        setX(new double[]{-1,0,1,2});
        setY(new double[]{0,1,2,9});
        y = LagrangePolynomial(getXi(),getYi(),3);
        System.out.println("y = " + y);
    }
}
