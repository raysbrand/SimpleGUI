import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SimpleGUI {
     public static void main(String[] args) {
         // Create a new JFrame
         JFrame frame = new JFrame("Simple GUI Example");

         // Create a new button
         JButton button = new JButton("Click Me!");

         // Add an event handler for the button
         button.addActionListener(e -> {
             // Display a message when the button is clicked
             JOptionPane.showMessageDialog(frame, "Button Clicked!");
         });

         // Set the operation to close the window
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         // Add a button to the content window
         frame.getContentPane().add(button);

         // Set the window size and make it visible
         frame.setSize(300, 200);
         frame.setVisible(true);
     }
}
