public class TimeConversion {
    
    /**
     * Constructor
     */
    public TimeConversion() {

    }
   
 
  
    
  

    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    public void showDecaseconds(int numSeconds){
        double decaseconds = numSeconds * 10;
      System.out.println("A decasecond is 10 seconds");
      System.out.println(numSeconds + " is equal to "+ decaseconds +" decasecnds");
    }




   


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
     public void showJiffies(int numSeconds){
        double Jiffies = (numSeconds * 1000) * 10;
        System.out.println("A jiffy is 10 miliseconds!");
      System.out.println(numSeconds + " is equal to " + Jiffies +" Jiffies." );
       
     }

    



    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here

    public void showNewYorkMinutes(int numSeconds){
        double newYorkMin = numSeconds * .05;
        System.out.println("A New York minute is 1/20 seconds!");
      System.out.println(numSeconds + " is equal to " + newYorkMin +" Jiffies");
       
     }
    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here

    public void showNanoCenturies(int numSeconds){
        double nanoCentury = numSeconds * 3.156;
        System.out.println("A Nano Century a computing measurement coined from the expression -  never to let the user wait more than a few nanocenturies for a response!");
      System.out.println(numSeconds + " is equal to " + nanoCentury +" Jiffies" );
       
     }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here

    public void showScaramuccies(int numSeconds){
        double Scaramuccies = numSeconds * 950400;
        System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days!");
      System.out.println(numSeconds + " is equal to " + Scaramuccies +" Scaramuccis!" );
       
     }

}
//end class