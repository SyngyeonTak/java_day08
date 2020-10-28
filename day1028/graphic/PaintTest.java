package day1028.graphic;
/*
 * 우리 주도하에 그림을 그리자
	컴포넌트 중, 개발자가 주도해서 그림을 그릴 수 있는 컴포넌트
	Canvas(AWT), JPanel(텅 비어있는 컴포넌트)
 * */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintTest extends JFrame{
	MyCanvas can; //도화지를 표현한 컴포넌트
	
	public PaintTest() {
		can = new MyCanvas();
		can.setBackground(Color.YELLOW);
		//캔버스에 그림을 그리려면, 캔버스가 스스로 그리는 메서드인 paint() 메서드를
		//재정의 해야한다.
		add(can); //캔버스를 프레임에 부착!!!
		
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//현재 클래스인 PaintTest가 JFrame의 메서드를 오버라이딩 하면
	//실행 시 자식이 재정의한 메서드를 우선 순위로 호출해준다..(구현력은 자식 클래스에...)
	
	/*
	 	public void paint(Graphics g) { System.out.println("저 지금 직접 그려요..."); }
	 */
	
	public static void main(String[] args) {
		new PaintTest();
	}
}
