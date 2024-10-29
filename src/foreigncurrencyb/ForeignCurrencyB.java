/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. 
 */
package foreigncurrencyb;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Donna
 */
public class ForeignCurrencyB {
    static double vRate, vQty, vAmt, vTot, grandTot;
    static Scanner sc = new Scanner(System.in);
    static NumberFormat f = NumberFormat.getCurrencyInstance();
    static String choice = "";
    static String [] vCur = {"", "EUR", "GBP", "JPY", "CAD", "RUB"};
    static String [] vPhrase = {"",
                                "Euros    ", 
                                "Pounds   ", 
                                "Yen      ", 
                                "Canadian ", 
                                "Rubles   "};
    
    public static void main(String[] args) {

        System.out.println("Welcome to the Currency Calculator!\n");
        getRates();
        doValuation();
        System.out.println("\nThe total value of the proposed currency purchases was: " + f.format(grandTot) );
        System.out.println();
        System.out.println("\nThanks for using the currency calculator!\n");
}
//getRates

    public static void getRates() {
        System.out.println("\nPlease enter the currency rate per US $ of the following currencies:\n");
        for (int i = 1; i <= 5; i++) //set index to 1, loop 5 times, increment AFTER
                {
          // ??? needed???  System.out.print(vCur + ": ");
            double vRate = getDoublePositive (sc, vCur[i] + ": ");
        } //end of for
        return;
} //end of getRates
    
    public static double getDouble(Scanner sc, String prompt)
    {
        double d = 0.0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
}
    
    public static double getDoublePositive(Scanner sc, String prompt)
    {    
        double d = 0.0);
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, prompt);
            if (d <= 0){
                System.out.println(
                    "Error! Illegal " +vCur + " rate; please enter positive value: "); }
             else
                isValid = true;
        }//end of while
        return d;
    }//end of getDoublePositive

    public static void doValuation() {
        int choice =1;
        double qty, val;


        while (choice >=1 &&  choice <=5 ) //calc values
        {
            // get the input from the user
    do {
                System.out.println();
                System.out.println("\nSelect Currency 1=" + vCur[1], +
                        ", 2=", vCur[2] + ", 3=" + vCur[3] +
                        ", 4=" + vCur[4] + ", 5=" + vCur[5] + 
                        ", 9=New Rates, 0=Quit: \n");
                
                    choice = sc.nextInt();
                    
            switch (choice)
            {   
                case 0:
                case 1:
                case 2:    
                case 3:
                case 4:
                case 5:
                //    vRate = vRate[choice];
                //    vPhrase = vPhrase[choice]
                    System.out.print("How many " + vPhrase[choice] + "? ");
                    qty = sc.nextDouble();
                    vAmt = qty * vRate[choice];
                    vTot = vTot + val;
                    System.out.println("\n" + qty + " " + vPhrase [choice] + " = " + f.format(val));
                case 9:
                    getRates();
                default:
                    System.out.println("\nPlease enter values 0, 1, 2, 3, 4, 5 or 9\n");
            } //end switch
       }//end do 
      
        while (choice != 0);

        if (vAmt > 0) {
            System.out.println("\nthe total value of proposed currency purchases: " + f.format(tval));
            }
        } //end of doValuation
}//end of class
