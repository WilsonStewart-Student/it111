import javax.swing.*;
import java.awt.*;

public class ShowWindowHomework
{
    public static void main (String[] args)
    {
        // Set variables for window base WIDTH and HEIGHT:
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 500;

        // Create new window:
        JFrame window = new JFrame();

        // Give window attributes:

        // Set the window's title:
        window.setTitle("A Simple Window");
        // Set the window's size:
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // Set the window's layout to null (required for setBounds to work):
        window.setLayout(null);
        // Set the window's opening location:
        // window.setLocation(600, 300);
        // The above works, but I like this way I found online to truly center it!
        window.setLocationRelativeTo(null);
        // Set the window's background color:
        window.getContentPane().setBackground(Color.red);
        // Set the window's default close operation (make it stop when the user hits 'x'):
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and give attributes to the things we will add to the window:
        JLabel label_01 = new JLabel("My first big label!");
        label_01.setBounds(0,100,200,25);
        label_01.setFont(new Font("Lucida Grande", Font.PLAIN, 18));

        JTextField textfield_01 = new JTextField(1);
        textfield_01.setBounds(0,130,200,25);

        JLabel label_02 = new JLabel("My second big label!");
        label_02.setBounds(0,160,200,25);
        label_02.setFont(new Font("Lucida Grande", Font.BOLD, 14));

        JTextField textfield_02 = new JTextField(1);
        textfield_02.setBounds(0,190,200,25);

        // Add all those things to our window!
        window.add(label_01);
        window.add(textfield_01);
        window.add(label_02);
        window.add(textfield_02);

        // And display it!
        window.setVisible(true);
    }
}

