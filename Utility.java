import java.util.*;
import java.util.stream.Collectors;



public class Utility
{
    /**
     * Summary: get a number from the user that meets certain conditions
     * @params: 
     *          prompt[String]: Prompt to be printed to the user that asks for their input
     *          lengthErrorMessage[String]: Error to be printed when the number is too long (more than 10 digits)
     *          formatErrorMessage[String]: Error to be printed when the input is not an integer     
     * @reutrn: [int] the loop will keep running and asking for input until a valid number is entered
     */
    public static int getNumber(String prompt, String lengthErrorMessage, String formatErrorMessage)
    {
        //Variable declarations 
        boolean runLoop = true;
        int number = 0;
        String input;
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print(prompt);
        
        //ask for user input until a valid number is entered
        while (runLoop){
            try{
                input = inputScanner.nextLine();
                if (input.length() >= 18){throw new ArithmeticException();}
                number = Integer.parseInt(input);
            }catch(ArithmeticException arithmeticException){
                System.out.print(lengthErrorMessage);
                continue;
            }catch(NumberFormatException numberFormatException){
                System.out.print(formatErrorMessage);
                continue;
            }
            runLoop = false;
        }//END of while loop
        
        inputScanner.close();
        return number;
    }//END of getNumber
    
    
    
    
    
    /**
     * Summary: get a number that is a percentage from the user
     * @params: prompt[String]: Prompt to be printed to the user that asks for their input
     * @reutrn: [int] the loop will keep running and asking for input until a valid percentage is entered
     */
    public static int getPercentage(String prompt)
    {
        //Variable declarations 
        boolean runLoop = true;
        int number = 0;
        String input;
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print(prompt);
        
        //ask for user input until a valid number is entered
        while (runLoop){
            try{
                input = inputScanner.nextLine();
                number = Integer.parseInt(input);
                if(number < 0 || number > 100)
                {
                    System.out.print("Please enter a percentage between 0 and 100: ");
                    continue;
                }
            }catch(NumberFormatException numberFormatException){
                System.out.print("Please enter an integer (round up the percetange if it is has decimals): ");
                continue;
            }
            runLoop = false;
        }//END of while loop
        
        inputScanner.close();
        return number;
    }//END of getPercentage
    
    
    
    
    
    /**
     * @Summary: get a valid string from the user
     * @params: 
     *          prompt[String]: the prompt to be printed to the screen that asks user for input          
     *          lengthErrorMessage[String]: Error messege to let user know the string they entered is too long
     * @return:None
     */
    public static String getString(String prompt, String lengthErrorMessage)
    {
        //Variable declarations
        String input = "";
        Boolean runLoop = true;
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print(prompt);
        
        
        while (runLoop){
            try{
                input = inputScanner.nextLine();
                if (input.length() >= 18){throw new ArithmeticException();}
            }catch(ArithmeticException arithmeticException){
                System.out.print(lengthErrorMessage);
                continue;
            }
            runLoop = false;
        }//END of while loop     
        
        
        inputScanner.close();
        return input;
    }//END of getString
    
    
    
    
    
    /**
     * Summary: Pauses the program for 1 seconds and then clears the screen
     * @param: None
     * @return: None
     */
    public static void pauseAndClearScreen() {
        try {
            Thread.sleep(1000);
            clearScreen();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }//END of try-catch
    }//END of pauseAndClearScreen

    
    
    
    
    /**
     * Summary: Clears the screen
     * @param: None
     * @return: None
     */
    public static void clearScreen() {
        System.out.flush();
        System.out.print("\f");
    }//END of clearScreen
    
    
    
    
    
    /**
     * @Summary: a wrapper function for printing a blank line
     * @params: None
     * @return:None
     */
    public static void printSpace()
    {
        System.out.println("");
    }//END of printSpace
    
    
    
    
    
    /**
     * @Summary: For capitalizing a string
     * @params: [String] str: the string to be capitalized
     * @return: [String]: the capitalized version of the string
     */
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }//END of if statement
    
        return Arrays.stream(str.split("\\s+"))
                     .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                     .collect(Collectors.joining(" "));
    }//END of capitalize
}
