package day1028.graphic.color;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	Color c;
	ColorPickerApp colorPickerApp;
	int index =0;
	public MyPanel(ColorPickerApp colorPickerApp) {
		this.colorPickerApp = colorPickerApp;
	}
	
	public void paint(Graphics g) {
		c = colorPickerApp.colors[index];
		g.setColor(c);
		g.fillRect(0, 0, 700, 600);
	}
}
