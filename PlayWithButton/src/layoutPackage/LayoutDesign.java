package layoutPackage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutDesign {

    public static void main(String[] args) {
    	
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setBounds(230, 30, 100, 40);
        
        
        JButton addingButton = new JButton("Increment");
        addingButton.setBounds(30, 100, 100, 40);
        addingButton.setFocusable(false);
              

        JButton minusButton = new JButton("Decrement");
        minusButton.setBounds(140, 100, 120, 40);
        minusButton.setFocusable(false);
        
      
        JButton reset = new JButton("Reset");
        reset.setBounds(270, 100, 150, 40);
        reset.setFocusable(false);
        
        
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
