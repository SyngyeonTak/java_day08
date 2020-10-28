package day1028.graphic.album;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhotoAlbum extends JFrame implements ActionListener{
	AlbumPanel p;//paint메서드를 재정의하려면, 클래스로 정의해야 한다..
	
	JPanel p_south; //버튼 2개를 얹힐 패널 
	JButton bt_prev, bt_next; //이전, 다음 버튼 
	
	public PhotoAlbum() {
		//생성 
		p = new AlbumPanel();
		p.setBackground(Color.YELLOW);
		p_south = new JPanel();
		bt_prev = new JButton("이전 사진");
		bt_next = new JButton("다음 사진");
		
		//조립
		add(p);//중앙에 앨범패널 넣기 
		p_south.add(bt_prev);//패널에 이전 버튼 넣기
		p_south.add(bt_next);//패널에 다음 버튼 넣기
		add(p_south, BorderLayout.SOUTH);//남쪽에 버튼패널 넣기
		
		bt_next.addActionListener(this);
		bt_prev.addActionListener(this);
		setSize(500,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==bt_next) {
			if(p.index < 9) {
				p.index++;
			}
		}else if(obj == bt_prev) {
			if(p.index > 0) {
				p.index--;
			}

		}
		p.repaint();
	}
	
	public static void main(String[] args) {
		new PhotoAlbum();
	}
}
