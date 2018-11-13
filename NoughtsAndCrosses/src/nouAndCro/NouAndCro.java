package nouAndCro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NouAndCro {
	
	public JFrame frame;
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	public JButton button6;
	public JButton button7;
	public JButton button8;
	public JButton button9;
	
	public static void main(String args[]) {
		new NouAndCro();
	}

	public NouAndCro() {
		frame = new JFrame("Noughts and Crosses");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		
		button1 = new JButton("");
		panel.add(button1);
		button2 = new JButton("");
		panel.add(button2);
		button3 = new JButton("");
		panel.add(button3);
		button4 = new JButton("");
		panel.add(button4);
		button5 = new JButton("");
		panel.add(button5);
		button6 = new JButton("");
		panel.add(button6);
		button7 = new JButton("");
		panel.add(button7);
		button8 = new JButton("");
		panel.add(button8);
		button9 = new JButton("");
		panel.add(button9);
		
		frame.add(panel);
		frame.setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button1.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button1.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button1.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button2.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button2.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button2.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button3.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button3.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button3.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button4.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button4.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button4.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button5.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button5.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button5.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button6.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button6.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button6.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button7.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button7.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button7.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button8.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button8.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button8.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
		
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button9.getText().equals("")) {
					if(MainNouAndCro.PlayerTurn == true) {
						button9.setText("X");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = false;
					} else {
						button9.setText("O");
						MainNouAndCro.toWin();
						MainNouAndCro.PlayerTurn = true;
					}
				}
			}
		});
	}
}
