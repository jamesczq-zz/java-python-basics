/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 * Tabulate 2's powers up to 2^n where n is user input
 **************************************************************************** */

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long power = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "\t" + power);
            power *= 2;
        }
    }
}
