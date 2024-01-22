import java.lang.Thread;
import com.phidget22.*;
import java.util.Scanner; 
import java.io.IOException;



public class PhidgetAssn5 extends Thread {
    /**
     * Summary: Constructor
     * @param: None
     * @return: [PhidgetAssn5]
     */
    public PhidgetAssn5(){
        //None
    }//END of constructor
    
    
    
    
    
    /**
     * Summary: run method that allows this method to run in the background
     * @param: None
     * @return: None
     */
    @Override public void run() {
        try {
            //Creates object for button and LED
            DigitalInput redButton = new DigitalInput();
            DigitalOutput redLED = new DigitalOutput();
    
            //Tells your program where to find the device
            redButton.setHubPort(0);
            redButton.setIsHubPortDevice(true);
            redLED.setHubPort(1);
            redLED.setIsHubPortDevice(true);
    
            //Establishes connection between the object and the Phidget. Timeout value of 1000 to give the program 1 second to locate the Phidget. If the Phidget can't be found, an exception will be thrown.
            redButton.open(1000);
            redLED.open(1000);
    
           
            while(true){
                if( redButton.getState()){
                    redLED.setState(true);
                }
                else {
                    redLED.setState(false);
                }
            }//End of While loop
                
     
        }
        catch (Exception E){
            System.out.println("Error. Make sure the phidgets are plugged in.");
        }//END of try-catch
        
    }//End of run
}//End of PhidgetAssn5