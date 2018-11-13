package nouAndCro;

public class MainNouAndCro {
	
	public static boolean PlayerTurn = true;
	public static boolean PlayerOne = false;
	public static boolean PlayerTwo = false;
	
	public static NouAndCro GUI = new NouAndCro();
	
	public static void main(String args[]) {}
	
	public static void toWin() {
		if(GUI.button1.getText().equals("X")) {
			if(GUI.button4.getText().equals("X")) {
				if(GUI.button7.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button1.getText().equals("X")) {
			if(GUI.button5.getText().equals("X")) {
				if(GUI.button9.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button1.getText().equals("X")) {
			if(GUI.button2.getText().equals("X")) {
				if(GUI.button3.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button2.getText().equals("X")) {
			if(GUI.button5.getText().equals("X")) {
				if(GUI.button8.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button3.getText().equals("X")) {
			if(GUI.button5.getText().equals("X")) {
				if(GUI.button7.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button3.getText().equals("X")) {
			if(GUI.button6.getText().equals("X")) {
				if(GUI.button9.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button4.getText().equals("X")) {
			if(GUI.button5.getText().equals("X")) {
				if(GUI.button6.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button7.getText().equals("X")) {
			if(GUI.button8.getText().equals("X")) {
				if(GUI.button9.getText().equals("X")) {
					PlayerOne = true;
					PlayerTwo = false;
					System.out.println("PlayerOne Won!");
				}
			}
		}
		if(GUI.button1.getText().equals("O")) {
			if(GUI.button4.getText().equals("O")) {
				if(GUI.button7.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(GUI.button1.getText().equals("O")) {
			if(GUI.button5.getText().equals("O")) {
				if(GUI.button9.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(GUI.button1.getText().equals("O")) {
			if(GUI.button2.getText().equals("O")) {
				if(GUI.button3.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(GUI.button2.getText().equals("O")) {
			if(GUI.button5.getText().equals("O")) {
				if(GUI.button8.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(GUI.button3.getText().equals("O")) {
			if(GUI.button5.getText().equals("O")) {
				if(GUI.button7.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(GUI.button3.getText().equals("O")) {
			if(GUI.button6.getText().equals("O")) {
				if(GUI.button9.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(GUI.button4.getText().equals("O")) {
			if(GUI.button5.getText().equals("O")) {
				if(GUI.button6.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(GUI.button7.getText().equals("O")) {
			if(GUI.button8.getText().equals("O")) {
				if(GUI.button9.getText().equals("O")) {
					PlayerOne = false;
					PlayerTwo = true;
					System.out.println("PlayerTwo Won!");
				}
			}
		}
		if(PlayerOne == true || PlayerTwo == true) {
			GUI.frame.setVisible(false);
			System.exit(0);
		}
	}
}