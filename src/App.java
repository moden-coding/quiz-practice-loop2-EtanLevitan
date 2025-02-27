/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. Keep track of the highest and lowest test score. When the user enters '-1', print out
 *  the highest and lowest scores with an appropriate message i.e. "The high score was ...."
 */


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int high = 0;
        int low = 1000000000;
        while (num != -1 && num < 105) {
            num = Integer.valueOf(scanner.nextLine());
            if (num > high) {
                high = num;
            }else if (num == -1) {
                break;
            }
            if (num < low) {
                low = num;
            }            }
            System.out.println("The high score was: " + high);
            System.out.println("The lowest score was: " + low);
        }
    }

