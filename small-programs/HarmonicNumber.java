/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 * Harmonic Number H(n) = 1 + 1/2 + 1/3 + ... + 1/n
 * It is discrete analog of integral(1/x, dx, x from 1 to n)
 * For large n, H(n) ~ ln(n) + 0.57721
 **************************************************************************** */

public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        double diff = sum - Math.log(n);
        System.out.println("H(" + n + ") = " + sum);
        System.out.println("For n >> 1, H(n) - ln(n) is about 0.57721");
        System.out.println("Here H(" + n + ") - ln(" + n + ") = " + diff);
    }
}
