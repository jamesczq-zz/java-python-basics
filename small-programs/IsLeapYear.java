/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 * A leap year is (1) divisible by 4 but not 100 or (2) divisible by 400
 **************************************************************************** */

public class IsLeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLeap;
        isLeap = (year % 4 == 0) && (year % 100 != 0);
        isLeap = isLeap || (year % 400 == 0);
        System.out.println(isLeap);
    }
}
