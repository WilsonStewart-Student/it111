import javax.swing.*;

public class SimpleWindow extends JFrame
{
    // Because we extended a class, we are not going to have a main method in this file.
    // What we will have is a Constructor, a special method that displays our attributes.

    public SimpleWindow()
    {
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Second Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        // We can set all of these things... But this file can't be run!
    }
}
