package ingredientadjuster;

import java.util.Scanner;

/**
 *
 * @author Brian Albert
 */
public class IngredientAdjuster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaring Variables
        final double SUGAR = 32;
        final double BUTTER = 48;
        final double FLOUR = 17.45;
        int cookiesNeeded;
        double sugarNeeded;
        double butterNeeded;
        double flourNeeded;
        Scanner input = new Scanner(System.in);

        //Getting Data
        System.out.print("How many cookies do you need? ");
        cookiesNeeded = input.nextInt();

        //Calculations
        sugarNeeded = cookiesNeeded / SUGAR;
        butterNeeded = cookiesNeeded / BUTTER;
        flourNeeded = cookiesNeeded / FLOUR;

        //Outputing Data
        System.out.printf("\nTo make " + cookiesNeeded
                + " cookies using this recipe you will need:");
        System.out.printf("\nSugar\t%9.2f Cups", sugarNeeded);
        System.out.printf("\nButter\t%9.2f Cups", butterNeeded);
        System.out.printf("\nFlour\t%9.2f Cups\n", flourNeeded);
    }

}
