import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scnr = new Scanner(System.in);
    double initMass;   // Initial mass of a substance
    double growthRate; // Annual growth rate
    double yearsGrow;  // Years of growth
    double finalMass;  // Final mass after those years

    System.out.print("Enter initial mass: ");
    initMass = scnr.nextDouble();

    System.out.print("Enter growth rate (Ex: 0.05 is 5%/year): ");
    growthRate = scnr.nextDouble();

    System.out.print("Enter years of growth: ");
    yearsGrow = scnr.nextDouble();

    finalMass = initMass * Math.pow(1.0 + growthRate, yearsGrow);
    // Ex: Rate of 0.05 yields initMass * 1.05^yearsGrow
   
    System.out.print(" Final mass after " + yearsGrow);
    System.out.println(" years is: " + finalMass);

    
    
  }
}



   // Scanner scnr = new Scanner(System.in);

    // final double INCOME_TAX = 109;
    // final double PER_HOUR_RATE = 25.0; 
    // double hoursPerWeek;
    // double weeklyPayCheck;  

    // System.out.print("Enter hours you work per work: ");
    // hoursPerWeek = scnr.nextDouble();

    // weeklyPayCheck = (PER_HOUR_RATE * hoursPerWeek) - INCOME_TAX;

    // System.out.print("Your weekly take home pay check is: $" + weeklyPayCheck + ".");



    // int shipWeightPounds;
    // int shipCostCents = 0;
    // final int FLAT_FEE_CENTS = 75;

    // int CENTS_PER_POUND = 25; 
    // shipWeightPounds = scnr.nextInt();
      
    // shipCostCents = FLAT_FEE_CENTS + (CENTS_PER_POUND * shipWeightPounds);
      

    // System.out.println("Weight(lb): " + shipWeightPounds);
    // System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
    // System.out.println("Cents per pound: " + CENTS_PER_POUND);
    // System.out.println("Shipping cost(cents): " + shipCostCents);




    //Scanner scnr = new Scanner(System.in);
    //   final double SPEED_OF_SOUND   = 761.207; // Miles/hour (sea level)
    //   final double SECONDS_PER_HOUR = 3600.0;  // Secs/hour
    //   double secondsBetween;
    //   double timeInHours;
    //   double distInMiles;

    //   System.out.println("Enter seconds between");
    //   System.out.print("lightning strike and thunder: ");
    //   secondsBetween = scnr.nextDouble();

    //   timeInHours = secondsBetween / SECONDS_PER_HOUR;
    //   distInMiles = SPEED_OF_SOUND * timeInHours;

    //   System.out.println("Lightning strike was approximately");
    //   System.out.println(distInMiles + " miles away.");














// Scanner scnr = new Scanner(System.in);
    // double avogadrosNumber = 6.0e23; // Approximation of atoms per mole
    // double gramsPerMoleGold = 196.9665; 
    // double gramsGold; 
    // double atomsGold; 

    // System.out.print("Enter grams of gold; ");
    // gramsGold = scnr.nextDouble();

    // atomsGold = gramsGold / gramsPerMoleGold * avogadrosNumber;

    // System.out.print(gramsGold + " grams of gold contains ");
    // System.out.println(atomsGold + " atoms");