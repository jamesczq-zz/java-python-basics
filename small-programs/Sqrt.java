/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 * Use Newton's method to get the positive square root of a positive real num
 * Algorithm: Newton's method
 * To find x* such that f(x*) = 0, do the following iteration
 * x_new <- x_old - f(x_old) / f'(x_old)
 * until convergence.
 * In the case of square-rooting, say want to find t such that
 * x^2 = C for user input C.
 * Let f(x) = x^2 - C, then f'(x) = 2*x
 * x_new <- x_old - (x_old^2 - C) / 2 / x_old = (C/x_old + x_old)/2
 **************************************************************************** */

public class Sqrt {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double EPS = 1e-15;
        double t = c / 2.0;
        while (Math.abs(t * t - c) > EPS * t * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println(t);
    }
}
