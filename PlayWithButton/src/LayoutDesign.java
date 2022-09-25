import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutDesign {
    public static void main(String[] args) {
        int initialValue = 0;
        JFrame frame = new JFrame();

        JLabel label = new JLabel(String.valueOf(initialValue));
        label.setBounds(230, 30, 100, 40);

        JButton addingButton = new JButton("increment");
        addingButton.setBounds(30, 100, 100, 40);
        addingButton.setFocusable(false);
        addingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addingButton.equals(true)) {
                    label.setText("increament button clicked.");
                }
            }
        });
        JButton minusButton = new JButton("decreament");
        minusButton.setBounds(140, 100, 120, 40);
        minusButton.setFocusable(false);
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (minusButton.equals(true)) {
                    label.setText("decreament button clicked.");
                }
            }
        });

        JButton reset = new JButton("reset");
        reset.setBounds(270, 100, 150, 40);
        reset.setFocusable(false);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (reset.equals(true)) {
                    label.setText("reset button clicked.");
                }
            }
        });

        frame.add(label);
        frame.add(addingButton);
        frame.add(minusButton);
        frame.add(reset);


        frame.setSize(460, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
