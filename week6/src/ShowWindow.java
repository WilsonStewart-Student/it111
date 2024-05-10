import javax.swing.*;
import java.awt.*;

public class ShowWindow
{
    public static void main (String[] args)
    {
        // Declare our variables...
        // and make them constants!

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        // Create a window object.
        // Anything that has you create something using the keyword "new" is an object.

        JFrame window = new JFrame();
        window.setTitle("My Simple Window");

        // Set the size of our window.

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Make it so the window can be closed and the program can be exited.

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window.
        // Displaying the window is a boolean!

        window.setVisible(true);
    }
}
