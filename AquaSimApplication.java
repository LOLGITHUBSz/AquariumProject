import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
     private static Random generator;
     public static void main(String args[])
    {
        System.out.println("This will be an aquarium simulation.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        generator = new Random();
        int randNUM;
        randNUM = generator.nextInt(10);
        randNUM  = generator.nextInt(10);

        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(600, 480); // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      CODE MISSING HERE!
        
        AquaFish Nemo = new AquaFish(aqua,getColor());
        aqua.add(Nemo);
        
        AquaFish Dory = new AquaFish(aqua,getColor());
        aqua.add(Dory);
        
        AquaFish LOL = new AquaFish(aqua,getColor());
        aqua.add(LOL);
     
    
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua,true);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.
       userInterface.println ("Close GUI display window to quit.");
        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
        
        
        for (int steps=0;steps<userInterface.getNumberOfSteps();steps++)
        {
        Nemo.moveForward();
        if(Nemo.atWall()){
           Nemo.changeDir();
        }
        Dory.moveForward();
        if(Dory.atWall()){
            Dory.changeDir();
        }
        LOL.moveForward();
        if(LOL.atWall()){
            LOL.changeDir();
           }
        userInterface.showAquarium();
    }
       // WRAP UP.

       // Remind user how to quit application.
        
        
    }//end main
       public static Color getColor()
    {
       int randNum = generator.nextInt(10);
     if (randNum==0)
          return Color.RED;
          else if (randNum==1)
          return Color.BLUE;
          else if (randNum==2)
          return Color.GREEN;
           else if (randNum==3)
          return Color.ORANGE;
           else if (randNum==4)
          return Color.YELLOW;
           else if (randNum==5)
          return Color.MAGENTA;
          else if (randNum==6)
          return Color.YELLOW;
          else if (randNum==7)
          return Color.YELLOW;
          else if (randNum==8)
          return Color.BLACK;
          else if (randNum==9)
          return Color.WHITE;
          else
          return Color.PINK;
    }
}//end class
