import java.util.Scanner;
public class github1 {




        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter an even number for the number lines in the figure: ");
            int nLines = input.nextInt();

            do {
                System.out.print("#");
                for (int i = 0; i < nLines*2; i++)
                    System.out.print("=");
                System.out.println("#");

			/*
			 * =================================================================
			 * ========================
			 */

                for (int i = 1; i <= (nLines / 2); i++) {
                    System.out.print("|");
                    for (int j = (nLines / 2); j > i; j--) {
                        System.out.print("  ");
                    }
                    System.out.print("<>");

                    for (int k = 1; k < i; k++) {
                        System.out.print("....");
                    }

                    System.out.print("<>");

                    for(int a=(nLines / 2); a>i; a--){
                        System.out.print("  ");
                    }
                    System.out.print("|");

                    System.out.println();

                    // ---------------------

                }

                for (int x = 1; x <= (nLines / 2); x++) {

                    System.out.print("|");
                    for (int y = 1; y < x; y++) {
                        System.out.print("  ");
                    }

                    System.out.print("<>");

                    for (int z = x; z < (nLines/2); z++) {
                        System.out.print("....");
                    }

                    System.out.print("<>");

                    for(int b=1; b<x; b++){
                        System.out.print("  ");
                    }
                    System.out.print("|");
                    System.out.println();

                }
			/*
			 * =================================================================
			 * =============
			 */

                // this for loop and the two print statements print the last line of
                // the figure
                System.out.print("#");
                for (int i = 0; i < nLines*2; i++)
                    System.out.print("=");
                System.out.println("#");

                // get the number of lines in the figure from the user
                System.out.println("Please enter an even number for the number lines in the figure: ");
                nLines = input.nextInt();

            } while (nLines != -1); // when the user enter input -1, exit the
            // do/while loop

            System.out.println("Thank you very much for using this program. See you later!");
        }

    }

