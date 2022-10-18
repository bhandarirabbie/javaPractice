package buttonUpDown;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

//import java.awt.Color;
//import java.awt.Dimension;

public class PlayWithButton {

	public static void main(String[] args) {
		 var wrapper = new Object() {int initialNumber = 0; };
	        JFrame frame = new JFrame();
	        JLabel label = new JLabel(Integer.toString(wrapper.initialNumber));
//	        label.setPreferredSize(new Dimension(400,300));
	        label.setFont(new Font("Arial", Font.BOLD, 35));
//	        label.setBackground(new Color(100,20,70));
	        label.setBounds(230, 30, 100, 40);
	        
	        JButton addingButton = new JButton("Increment");
	        addingButton.setBounds(30, 100, 100, 40);
	        addingButton.setFocusable(false);
	        addingButton.addActionListener(e -> {
	        	wrapper.initialNumber++;
	        	label.setText(Integer.toString(wrapper.initialNumber));
	        	
	        });
	              
	        JButton minusButton = new JButton("Decrement");
	        minusButton.setBounds(140, 100, 120, 40);
	        minusButton.setFocusable(false);
	        minusButton.addActionListener(e -> {
	        	wrapper.initialNumber--;
	        	label.setText(Integer.toString(wrapper.initialNumber));
	        });
	        
	        JButton reset = new JButton("Reset");
	        reset.setBounds(270, 100, 150, 40);
	        reset.setFocusable(false);
	        reset.addActionListener(e -> {
	        	wrapper.initialNumber =0;
	        	label.setText(Integer.toString(wrapper.initialNumber));
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
