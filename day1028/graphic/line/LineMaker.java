package day1028.graphic.line;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LineMaker extends JFrame implements ActionListener{
	JLabel[] labels = new JLabel[4];
	String[] label_names= {"x1", "y1", "x2", "y2"};
	JTextField[] fields = new JTextField[4];
	JButton bt;
	JPanel p_north;
	LineCanvas can;
	
	public LineMaker() { 
		p_north = new JPanel();
		for(int i =0; i<labels.length; i++) {
			labels[i] = new JLabel(label_names[i]);
		}
		
		for (int i = 0; i < fields.length; i++) {
			fields[i] = new JTextField("0", 5);
			
		}

		for (int i = 0; i < labels.length; i++) {
			p_north.add(labels[i]);
			p_north.add(fields[i]);
		}
		can = new LineCanvas(this);
		bt = new JButton("draw");
		p_north.add(bt);
		
		add(p_north, BorderLayout.NORTH);
		add(can);
		
		p_north.setBackground(Color.YELLOW);
		can.setBackground(Color.PINK);
		bt.addActionListener(this);
		
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		can.repaint();
			
		
	}

	public static void main(String[] args) {
		new LineMaker();
	}

	
}
