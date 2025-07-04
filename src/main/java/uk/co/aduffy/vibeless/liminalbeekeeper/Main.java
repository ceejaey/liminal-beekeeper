package uk.co.aduffy.vibeless.liminalbeekeeper;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        // Always launch Swing applications on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Hello Beekeeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add a label
        JLabel label = new JLabel("Hello World!", JLabel.CENTER);
        frame.getContentPane().add(label);

        // Set frame size and make it visible
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // center on screen
        frame.setVisible(true);
    }
}
