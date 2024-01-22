/**
 * Title: Class Manager
 * 
 * Program Summary: A travel assistant resembling a rudimentary version of Google Travel that provides the user with information about different travel destinations
 * 
 * Program Element List: Seperating functions based on their functionality in the Utility and UI classes, use of hashmaps for storing information, use of try-catch, use of getOrDefault on HashMaps for error correction, use of ForEach on the HashMap from the iterable interface, mutiple uses of lambda expressions, use of SwingUtilities to prevent errors in relation to setting up JFrame. use of Lists and Arrays
 *
 * @author Ellie Taghavi, Spencer Gray, and Ethan McLeod
 * @version January 21st, 2023
 */
public class Main
{
    /**
     * Summary: Starting point for the program
     * @param: [String[]] args: arguments from the command line
     * @return: None
     */
    public static void main(String[] args) {
        PhidgetAssn5 phidget = new PhidgetAssn5();
        phidget.start();
        TravelAssistant obj1 = new TravelAssistant();
        obj1.run();
    }//END of main (starting point)
}//END of Main





/*
 * NOTES: Instead of creating the GUI and main logic seperately and integrating them in MAIN like usual, it was easier to create an object of GUI in the TravelAssistant class and then just use it there
 * 
 * 
 * TEST CODE:
 *      import javax.swing.*;
        import java.awt.*;
        
        public class TravelAssistantGUI extends JFrame {
            private JLabel messageLabel;
            private JTextArea cityInfoArea;
        
            public TravelAssistantGUI() {
                initializeUI();
            }
        
            private void initializeUI() {
                setTitle("Travel Assistant");
                setSize(600, 400);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new BorderLayout());
        
                // Only a message label is initially visible
                messageLabel = new JLabel("Waiting for selection of a city", SwingConstants.CENTER);
                add(messageLabel, BorderLayout.CENTER);
        
                // City information area, initially not visible
                cityInfoArea = new JTextArea();
                cityInfoArea.setEditable(false);
                add(new JScrollPane(cityInfoArea), BorderLayout.SOUTH);
                cityInfoArea.setVisible(false);
            }
        
            // Method to update the GUI with city information
            public void displayCityInfo(String info) {
                messageLabel.setVisible(false);
                cityInfoArea.setText(info);
                cityInfoArea.setVisible(true);
            }
        
            // Method to reset the GUI
            public void resetGUI() {
                messageLabel.setVisible(true);
                cityInfoArea.setVisible(false);
                cityInfoArea.setText("");
            }
        
            // Getters for components (if needed for external access)
            public JLabel getMessageLabel() {
                return messageLabel;
            }
        
            public JTextArea getCityInfoArea() {
                return cityInfoArea;
            }
        }
 */