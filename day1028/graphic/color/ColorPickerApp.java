package day1028.graphic.color;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPickerApp extends JFrame implements ActionListener{
	String[] p_names = {"p_red", "p_orange", "p_yellow", "p_green", "p_blue", "p_navy", "p_purple"};
	Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.BLACK, Color.GRAY};
	JPanel[] panels= new JPanel[colors.length];
	JButton[] buttons= new JButton[colors.length];
	JPanel p_north;
	MyPanel p;
	
	public ColorPickerApp() {
		p_north = new JPanel();
		p = new MyPanel(this);
		p.setBackground(Color.PINK);
		
		add(p);
		add(p_north, BorderLayout.NORTH);
		
		
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
			panels[i].setBackground(colors[i]);
			panels[i].setPreferredSize(new Dimension(80, 100));
			p_north.add(panels[i]);
			buttons[i] = new JButton(p_names[i]);
			panels[i].add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		
		p.setBackground(Color.blue);
		
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new ColorPickerApp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		p.repaint();
		
	}

}
