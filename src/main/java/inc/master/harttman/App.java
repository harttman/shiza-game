package inc.master.harttman;

import javax.swing.*;
import java.awt.*;

public class App 
{
    private static int count = 0; // count click
    public static void main( String[] args )
    {
        // basic classes
        JFrame frame = new JFrame("Minecraft");
        frame.setLayout(null);
        JButton hello = new JButton("Click"); // text for button
        JLabel label = new JLabel("Count 0"); // create label for user

        hello.setBounds(200, 50, 100, 50); // button position
        label.setBounds(20, 20, 100, 50);
        hello.addActionListener(e -> {
            count++; // if button clicked == count + 1
            hello.setText("Done.."); // if button clicked == new text
            label.setText("Count " + count); // showing progress
            System.out.println(count); // logging count in console
        });

        frame.getContentPane().setBackground(Color.blue); // set bg color
        frame.add(hello); // add button
        frame.add(label); // add label
        frame.setSize(800, 600); // size window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close window
        frame.setVisible(true); // visible window
    }
}
