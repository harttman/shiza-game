package inc.master.harttman;

import javax.swing.*;
import java.awt.*;

public class App {
    private static int count = 0; // default value
    public static void main(String[] args) {
        JFrame window = new JFrame("Clicker | Shiza Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);

        JPanel mainPanel = new JPanel(new CardLayout());
        JPanel workPanel = new JPanel();
        JLabel labelCount = new JLabel("Count " + count, SwingConstants.CENTER);
        JButton clickButton = new JButton("Click for make more cash.");
        workPanel.setLayout(new BorderLayout());

        clickButton.addActionListener(e -> {
            count++;
            labelCount.setText("Count: " + count);
        });

        workPanel.add(labelCount, BorderLayout.CENTER);
        workPanel.add(clickButton, BorderLayout.SOUTH);


    }
}
