package SKhan_ChunkySign;

//import java.util.Scanner; // imports util package's Scanner class

/**
 *  Author: Salman
 *
 *  This program takes a phrase as input and prints digits, spaces and
 *  compatible letters from it. In place of incompatible letters, a rectangle
 *  is printed.
 *
 *  Input passed to main method as 'args' argument through Run/Debug configurations (IntelliJ)
 *  Default input: "-w -19 -m 1234567890 ceFhiLopSTuw -h 12"
 *
 *  This class obtains and validates data before passing it to CharDes class
 */
public class ChunkySign {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     @param args is used to take input from user
     */
    public static void main (String[] args) {
        String input = getMessage(args); //gets input from user
        int width = getWidth(args); //gets width from user
        int height = getHeight(args); //gets height from user
        System.out.print("\n");

        //passes characters taken as input to appropriate method of CharDes class
        for (int i = 0; i < input.length(); i++){
            switch (input.charAt(i)){
                case '0':
                    CharDes.desZero(width, height);
                    break;
                case '1':
                    CharDes.des1(width, height);
                    break;
                case '2':
                    CharDes.des2(width, height);
                    break;
                case '3':
                    CharDes.des3(width, height);
                    break;
                case '4':
                    CharDes.des4(width, height);
                    break;
                case '5':
                    CharDes.des5(width, height);
                    break;
                case '6':
                    CharDes.des6(width, height);
                    break;
                case '7':
                    CharDes.des7(width, height);
                    break;
                case '8':
                    CharDes.des8(width, height);
                    break;
                case '9':
                    CharDes.des9(width, height);
                    break;
                case 'C':
                    CharDes.desC(width, height);
                    break;
                case 'E':
                    CharDes.desE(width, height);
                    break;
                case 'F':
                    CharDes.desF(width, height);
                    break;
                case 'H':
                    CharDes.desH(width, height);
                    break;
                case 'I':
                    CharDes.desI(width, height);
                    break;
                case 'L':
                    CharDes.desL(width, height);
                    break;
                case 'O':
                    CharDes.desOh(width, height);
                    break;
                case 'P':
                    CharDes.desP(width, height);
                    break;
                case 'S':
                    CharDes.desS(width, height);
                    break;
                case 'T':
                    CharDes.desT(width, height);
                    break;
                case 'U':
                    CharDes.desU(width, height);
                    break;
                case ' ':
                    CharDes.desSpace(width, height);
                    break;
                default:
                    CharDes.desHash(width, height);
            }
            System.out.print("\n");
        }

    }


    /**
     * getMessage gets input from user as command-line arguments
     * @return the input obtained from user
     */
    private static String getMessage(String[] args) {
        //Scanner kbd = new Scanner(System.in);
        //System.out.print("Enter Message: "); //asks for message
        String msg;
        if(args[0].equals("-m")){
            msg = args[1];
            int i = 2;
            while(!(args[i].equals("-w") || args[i].equals("-h"))){
                msg = msg + " " + args[i];
                i++;
            }
            return msg.toUpperCase();
        } else if (args[2].equals("-m")){
            msg = args[3];
            int i = 4;
            while(!(args[i].equals("-w") || args[i].equals("-h"))){
                msg = msg + " " + args[i];
                i++;
            }
            return msg.toUpperCase();
        } else if (args[4].equals("-m")){
            msg = args[5];
            int i = 6;
            while(i < args.length){
                msg = msg + " " + args[i];
                i++;
            }
            return msg.toUpperCase();
        } else {
            System.out.println("Message cannot be traced\n" +
                    "'0123456789 CEFHILOPSTUW' has been assigned to message");
            return "0123456789 CEFHILOPSTUW";
        }
    }

    /**
     * getWidth gets width from user as command-line arguments
     * @return the width obtained from user
     */
    private static int getWidth(String[] args){
        //Scanner kbd1 = new Scanner(System.in);
        //System.out.print("Enter width: "); //asks for width
        //int wdt = kbd1.nextInt();
        // validates width
        int wdt = -2147483648;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-w")) {
                wdt = Integer.parseInt(args[(i + 1)]);
            }
        }
        if (wdt == -2147483648){
            System.out.println("Width cannot be traced\nWidth has been set to 10");
            wdt = 10;
        }
        if (wdt < 8 || wdt > 18) {
            System.out.println("Invalid Width Entered\nWidth has been set to 10");
            wdt = 10;
        }
        if (wdt % 2 != 0) {
            System.out.println("Invalid Width Entered\nWidth has been set to " + (wdt + 1));
            wdt += 1;
        }
        return wdt;
    }

    /**
     * getHeight gets height from user as command-line arguments
     * @return the height obtained from user
     */
    private static int getHeight(String[] args){
        //Scanner kbd = new Scanner(System.in);
        //System.out.print("Enter height: "); //asks for height
        //int ht = kbd.nextInt();
        //validates height
        int ht = -2147483648;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-h")) {
                ht = Integer.parseInt(args[(i + 1)]);
            }
        }
        if (ht == -2147483648){
            System.out.println("Height cannot be traced\nWidth has been set to 10");
            ht = 10;
        }
        if (ht < 10 || ht > 20) {
            System.out.println("Invalid Height Entered\nHeight has been set to 10");
            ht = 10;
        }
        if (ht % 2 != 0) {
            System.out.println("Invalid Height Entered\nHeight has been set to " + (ht + 1));
            ht += 1;
        }
        return ht;
    }




}
