package SKhan_ChunkySign;

/**
 *  Author: Salman
 *
 *  This class gets modified width and/or height arguments from CharDes class into a
 *  particular method each time and using them, combinations of 'XX' are printed on screen
 *  accordingly.
 */
public class Line {

    /**
     * Prints a horizontal line
     * @param wdt width obtained from CharDes class
     */
    public static void doHor (int wdt) {
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= wdt; j++){
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }

    /**
     * Prints a horizontal line starting after the no. of spaces in spc parameter
     * @param spc no. of initial spaces obtained from CharDes class
     * @param wdt width obtained from CharDes class
     */
    public static void doMixHor (int spc, int wdt) {
        for (int i = 1; i <= 2; i++){
            for(int j = 1; j <= spc; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= wdt; k++){
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }

    /**
     * Prints a vertical line on left side
     * @param ht height obtained from CharDes class
     */
    public static void doLVer (int ht) {
        for (int i = 1; i <= ht; i++){
            System.out.print("XX\n");
        }
    }

    /**
     * Prints a vertical line on right side
     * @param ht height obtained from CharDes class
     * @param wdt width obtained from CharDes class (same as the width entered by user)
     */
    public static void doRVer (int ht, int wdt) {
        for (int i = 1; i <= ht; i++){
            for (int j = 1; j <= (wdt-2); j++){
                System.out.print(" ");
            }
            System.out.print("XX\n");
        }
    }

    /**
     * Prints vertical lines on both sides
     * @param ht height obtained from CharDes class
     * @param wdt width obtained from CharDes class (same as the width entered by user)
     */
    public static void doLRVer (int ht, int wdt) {
        for (int i = 1; i <= ht; i++){
            System.out.print("XX");
            for (int j = 1; j <= (wdt-4); j++){
                System.out.print(" ");
            }
            System.out.print("XX\n");
        }
    }

    /**
     * Prints a vertical line in centre
     * @param ht height obtained from CharDes class
     * @param wdt width obtained from CharDes class (same as the width entered by user)
     */
    public static void doMVer (int ht, int wdt) {
        for (int i = 1; i <= ht; i++){
            for (int j = 1; j <= ((wdt-2)/2); j++){
                System.out.print(" ");
            }
            System.out.print("XX\n");
        }
    }

}
