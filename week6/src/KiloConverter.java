import javax.swing.*;

public class KiloConverter extends JFrame
{
    JPanel panel;
    JLabel message_label;
    JTextField kilo_text_field;
    JButton calc_button;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    // Create a constructor to initialize our objects!

    public KiloConverter()
    {
        setTitle("Kilometer Converter");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);

        setVisible(true);
    }

    public void buildPanel()
    {
        message_label = new JLabel("Enter a distance in kilometers.");
        kilo_text_field = new JTextField(10);
        calc_button = new JButton("Calculate!");

        panel = new JPanel();

        // Add the above three components onto the JPanel.

        panel.add(message_label);
        panel.add(kilo_text_field);
        panel.add(calc_button);
    }

    // Now we finally add our main method!

    public static void main(String[] args)
    {
        new KiloConverter();
    }
}
