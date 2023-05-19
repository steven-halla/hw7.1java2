// Steven Halla
// HW 7.1
// CS 142

/*******************************************************************
 * Fibonacci: calculates sum of a series for m(x) double uses recursion

 * @author Steven Halla
 * @version 1.0
 * @since 19 may 2023
 **/
public class SumSeries {

    /*******************************************************************
     * main: for loop for our iterations, in this case 10

     * @param args String[]
     * @author Steven Halla
     * @version 1.0
     * @since 19 may 2023
     **/
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("m(%d) = %.2f\n", i, computeSeries(i));
        }
    }

    /*******************************************************************
     * computeSeries: calcualtes and calls computeSeries
     * @param i int
     * @return sum of our computeSeries
     * @author Steven Halla
     * @version 1.0
     * @since 19 may 2023
     **/
    public static double computeSeries(int i) {
        if (i == 1) {
            return 1;
        } else {
            return 1.0 / i + computeSeries(i - 1);
        }
    }
}
