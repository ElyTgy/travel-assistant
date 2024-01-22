import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;



public class GUI {
    //instance varaibles
    private JFrame frame;
    private JTextArea textArea;
    private JPanel panel;

    
    
    
    
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
        frame.getContentPane().setBackground(Color.WHITE); // Set the background color of the frame

        // Creating the panel to hold the text area
        panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Use GridBagLayout for better control
        panel.setBackground(Color.WHITE); // Set the panel background to match the frame
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        // Creating the text area and setting initial text
        textArea = new JTextArea("Waiting for city selection on console", 5, 20);
        textArea.setEditable(false); // Make it non-editable
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap lines at word boundaries
        textArea.setBackground(Color.WHITE); // Set the background to match the frame and panel
        textArea.setForeground(Color.BLACK); // Set text color
        textArea.setBorder(null); // Remove border

        // Center align text horizontally
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add text area to panel with constraints
        panel.add(textArea, gbc);

        // Adding the panel to the frame
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }//END of createAndShowGUI

    
    
    
    
    /**
     * @Summary: displays the text shown on the JFrame according to what is passed into it
     * @params: [String] text: The text to be displayed to the GUI
     * @return: None
     */
    public void updateDisplay(String text) {
        SwingUtilities.invokeLater(() -> {
            if (textArea != null) {
                textArea.setText(text);
                // Center the text horizontally
                textArea.setCaretPosition(0); // Reset caret position to the top
            }
        });
    }//END of updateDisplay
}//END of GUI
