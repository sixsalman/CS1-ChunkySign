package SKhan_ChunkySign;

/**
 *  Author: Salman
 *
 *  This class gets width and height arguments from ChunkySign class into a
 *  particular method each time and it passes modified values from its parameters
 *  to the Line class's appropriate methods.
 */
public class CharDes {

    /**
     * Class appropriate methods of Line class to print 0
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desZero (int wdt, int ht) {
        Line.doMixHor(2,(wdt-4));
        Line.doLRVer((ht-4),wdt);
        Line.doMixHor(2,(wdt-4));
    }

    /**
     * Class appropriate methods of Line class to print 1
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des1 (int wdt, int ht) {
        Line.doMVer(ht,wdt);
    }

    /**
     * Class appropriate methods of Line class to print 2
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des2 (int wdt, int ht) {
        Line.doHor((wdt-2));
        Line.doRVer(((ht-6)/2),wdt);
        Line.doMixHor(2,(wdt-4));
        Line.doLVer(((ht-6)/2));
        Line.doHor(wdt);
    }

    /**
     * Class appropriate methods of Line class to print 3
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des3 (int wdt, int ht) {
        Line.doHor((wdt-2));
        Line.doRVer(((ht-6)/2),wdt);
        Line.doMixHor(((wdt-2)/2),((wdt-2)/2));
        Line.doRVer(((ht-6)/2),wdt);
        Line.doHor((wdt-2));
    }

    /**
     * Class appropriate methods of Line class to print 4
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des4 (int wdt, int ht) {
        Line.doLRVer(((ht-2)/2),wdt);
        Line.doHor(wdt);
        Line.doRVer(((ht-2)/2),wdt);
    }

    /**
     * Class appropriate methods of Line class to print 5
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des5 (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doLVer(((ht-6)/2));
        Line.doHor((wdt-2));
        Line.doRVer(((ht-6)/2),wdt);
        Line.doHor((wdt-2));
    }

    /**
     * Class appropriate methods of Line class to print 6
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des6 (int wdt, int ht) {
        Line.doLVer(((ht-4)/2));
        Line.doHor((wdt-2));
        Line.doLRVer(((ht-4)/2),wdt);
        Line.doMixHor(2,(wdt-4));
    }

    /**
     * Class appropriate methods of Line class to print 7
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des7 (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doRVer((ht-2),wdt);
    }

    /**
     * Class appropriate methods of Line class to print 8
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des8 (int wdt, int ht) {
        Line.doMixHor(2,(wdt-4));
        Line.doLRVer(((ht-6)/2),wdt);
        Line.doMixHor(2,(wdt-4));
        Line.doLRVer(((ht-6)/2),wdt);
        Line.doMixHor(2,(wdt-4));
    }

    /**
     * Class appropriate methods of Line class to print 9
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void des9 (int wdt, int ht) {
        Line.doMixHor(2,(wdt-4));
        Line.doLRVer(((ht-4)/2),wdt);
        Line.doMixHor(2,(wdt-2));
        Line.doRVer(((ht-4)/2),wdt);
    }

    /**
     * Class appropriate methods of Line class to print C
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desC (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doLVer((ht-4));
        Line.doHor(wdt);
    }

    /**
     * Class appropriate methods of Line class to print E
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desE (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doLVer(((ht-6)/2));
        Line.doHor((ht/2));
        Line.doLVer(((ht-6)/2));
        Line.doHor(wdt);
    }

    /**
     * Class appropriate methods of Line class to print F
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desF (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doLVer(((ht-4)/2));
        Line.doHor((ht/2));
        Line.doLVer(((ht-4)/2));
    }

    /**
     * Class appropriate methods of Line class to print H
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desH (int wdt, int ht) {
        Line.doLRVer(((ht-2)/2),wdt);
        Line.doHor(wdt);
        Line.doLRVer(((ht-2)/2),wdt);
    }

    /**
     * Class appropriate methods of Line class to print I
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desI (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doMVer((ht-4),wdt);
        Line.doHor(wdt);
    }

    /**
     * Class appropriate methods of Line class to print L
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desL (int wdt, int ht) {
        Line.doLVer((ht-2));
        Line.doHor(wdt);
    }

    /**
     * Class appropriate methods of Line class to print O
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desOh (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doLRVer((ht-4),wdt);
        Line.doHor(wdt);
    }

    /**
     * Class appropriate methods of Line class to print P
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desP (int wdt, int ht) {
        Line.doHor((wdt-2));
        Line.doLRVer(((ht-4)/2),wdt);
        Line.doHor((wdt-2));
        Line.doLVer(((ht-4)/2));
    }

    /**
     * Class appropriate methods of Line class to print S
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desS (int wdt, int ht) {
        Line.doMixHor(2,(wdt-2));
        Line.doLVer(((ht-6)/2));
        Line.doMixHor(2,(wdt-4));
        Line.doRVer(((ht-6)/2),wdt);
        Line.doHor((wdt-2));
    }

    /**
     * Class appropriate methods of Line class to print T
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desT (int wdt, int ht) {
        Line.doHor(wdt);
        Line.doMVer((ht-2),wdt);
    }

    /**
     * Class appropriate methods of Line class to print U
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desU (int wdt, int ht) {
        Line.doLRVer((ht-2),wdt);
        Line.doMixHor(2,(wdt-4));
    }

    /**
     * Class appropriate methods of Line class to print a space
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desSpace (int wdt, int ht) {
        for(int i = 1; i <= ht; i++) {
            for(int j = 1; j <= wdt; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    /**
     * Class appropriate methods of Line class to print a rectangle
     * @param wdt width obtained from user
     * @param ht height obtained from user
     */
    public static void desHash (int wdt, int ht) {
        for (int i = 1; i <= (ht/2); i++) {
            Line.doHor(wdt);
        }
    }

}
