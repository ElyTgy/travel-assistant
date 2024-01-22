
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;

public class GUI {

    private JFrame frame;
    private JLabel label;

    public GUI() {
        // Create the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(this::createAndShowGUI);
    }

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
    }

    // Method to update the text displayed in the GUI
    public void updateDisplay(String text) {
        SwingUtilities.invokeLater(() -> {
            if (label != null) {
                label.setText(text);
            }
    });
}
}
