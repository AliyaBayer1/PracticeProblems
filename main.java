package culminatingAssignment;

import java.awt.GridLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main implements ActionListener{

	public main() {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Click Me");
		button.addActionListener(this);
		
		
		
		JLabel label = new JLabel("Number of clicks: 0");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Out GUI");
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new main();

	}

}
