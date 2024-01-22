import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;



public class GUI {
    //instance varaibles
    private JFrame frame;
    private JLabel label;

    
    
    /**
     * @Summary: contrsuctor for the GUI class
     * @params: None
     * @return: [GUI]
     */
    public GUI() {
        // Create the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(this::createAndShowGUI);
    }//END of constructor

    
    
    
    
    /**
     * @Summary: creates the JFrame
     * @params: None
     * @return:None
     */
    private void createAndShowGUI() {
        // Creating the Frame
        frame = new JFrame("Travel Assistant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        // Creating the label and setting initial text
        label = new JLabel("Waiting for city selection", JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.WHITE);

        // Adding the label to the Frame
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }//END of createAndShowGUI

    
    
    
    
    /**
     * @Summary: displays the text shown on the JFrame according to what is passed into it
     * @params: [String] text: The text to be displayed to the GUI
     * @return: None
     */
    public void updateDisplay(String text) {
        //invokeLate to prevent errors
        SwingUtilities.invokeLater(() -> {
            if (label != null) {
                label.setText(text);
            }
        });
    }//END of updateDisplay
}//END of GUI
