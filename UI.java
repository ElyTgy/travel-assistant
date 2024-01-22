
//Other parts of the 7 part UI have been implemented throughout the program
public class UI
{
    /**
     * Summary: shows the title to the user
     * @param: None
     * @return: None
     */
    
    public static void showTitle()
    {
        String art = 
        "  ________                     .__           ___________                         .__   \n" +
        " /  _____/  ____   ____   ____ |  |   ____   \\__    ___/___________ ___  __ ____ |  |  \n" +
        "/   \\  ___ /  _ \\ /  _ \\ / ___\\|  | _/ __ \\    |    |  \\_  __ \\__  \\\\  \\/ // __ \\|  |  \n" +
        "\\    \\_\\  (  <_> |  <_> ) /_/  >  |_\\  ___/    |    |   |  | \\// __ \\\\   /\\  ___/|  |__\n" +
        " \\______  /\\____/ \\____/\\___  /|____/\\___  >   |____|   |__|  (____  /\\_/  \\___  >____/\n" +
        "        \\/             /_____/           \\/                        \\/          \\/      ";

        System.out.println(art);
                                                                                           
    }//END of showTitle
    
    
    
    
    
    /**
     * Summary: shows intro message to user
     * @param: None
     * @return: None
     */
    public static void showIntro()
    {
        System.out.println("Welcome to Google's new travel assistant!");
        System.out.println("With the help of this program, you will be able to explore various travel destinations and plan ahead your trip.");
        System.out.println("Let's get started by exploring different destinations.");
    }//END of showIntro
    
    
    
    
    
    /**
     * Summary: show goodbye message to user
     * @param: None
     * @return: None
     */
    public static void showBye()
    {
         System.out.println(" ____ ___  _ _____ _ ");
        System.out.println("/  __\\\\  \\///  __// \\");
        System.out.println("| | // \\  / |  \\  | |");
        System.out.println("| |_\\  / /  |  /_ \\_/");
        System.out.println("\\____//_/   \\____\\(_)");
    }//END of showBye
}//END of UI