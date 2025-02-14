package in.kgcoding.exception;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HappyNewYear {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Happy New Year 2025");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("");
        label.setFont(new Font("Helvetica", Font.BOLD, 24));
        label.setForeground(Color.BLUE);
        frame.add(label);

        JButton button = new JButton("Celebrate!");
        button.addActionListener(new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label.setText("Happy New Year 2025!" + "!".repeat(count % 5));
                        count++;
                        if (count > 10) {
                            ((Timer) e.getSource()).stop();
                            JOptionPane.showMessageDialog(frame, "Wishing you a joyful and prosperous New Year 2025!");
                            JOptionPane.showMessageDialog(frame, "\"Happy New Year, my friend! This year, I promise to cherish you more, " +
                                    "love you deeper, and make every moment we share unforgettable. " +
                                    "Here’s to another beautiful year together!\"");
                            JOptionPane.showMessageDialog(frame, """
                                    "Happy New Year, my dear friend!"As we begin another year, I want to express how important you are to me.
                                     Your love and support continue to be my guiding light, and I eagerly await the opportunity to create even more amazing moments together.
                                     \
                                     May this year bring us even closer together, full with joy, laughter, and unending love. Here's to a great year ahead. GREETINGS!!!!!
                                    \s""");
                        }
                    }
                });
                timer.start();
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HappyNewYear::createAndShowGUI);
    }
}