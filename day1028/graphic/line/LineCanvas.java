package day1028.graphic.line;

import java.awt.Canvas;
import java.awt.Graphics;

public class LineCanvas extends Canvas{
	LineMaker lineMaker;
	int x1, y1, x2, y2;
	
	public LineCanvas(LineMaker lineMaker) {
		this.lineMaker = lineMaker;
	}
	@Override
	public void paint(Graphics g) {
		x1 =Integer.parseInt(lineMaker.fields[0].getText());
		y1 =Integer.parseInt(lineMaker.fields[1].getText());
		x2 =Integer.parseInt(lineMaker.fields[2].getText());
		y2 =Integer.parseInt(lineMaker.fields[3].getText());

		g.drawLine(x1, y1, x2, y2);
	}
}
