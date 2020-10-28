package day1028.homework;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener, ActionListener{
	JButton bt_send;
	JPanel p_center, p_south;
	JTextArea area;
	JTextField field;
	JScrollPane scroll;
	ChatA a;
	ChatC c;	
	
	public ChatB(ChatA a, ChatC c) {
		bt_send = new JButton("send");
		p_south =new JPanel();
		area = new JTextArea();
		field = new JTextField(10);
		scroll = new JScrollPane(area);
		this.a = a;
		this.c = c;
		
		p_south.add(field);
		p_south.add(bt_send);
		
		add(p_south, BorderLayout.SOUTH);
		add(scroll);
		
		area.setForeground(Color.BLACK);
		area.setBackground(Color.CYAN);
		
		field.setBackground(Color.pink);
		field.setForeground(Color.BLACK);
		
		bt_send.addActionListener(this);
		
		field.addKeyListener(this);
		
		setBounds(500, 150, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		JButton btn = (JButton)obj;
		
		if(btn.equals(bt_send)) {
			send();
		}
		
	}
	
	public void send() {
		String msg = field.getText();
		area.append(msg+"\n");
		field.setText("");
		
		a.area.append(msg+"\n");
		a.field.setText("");
		
		c.area.append(msg+"\n");
		c.field.setText("");
		
	}
	
	public void open() {
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==10) {
			send();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
	}
}
