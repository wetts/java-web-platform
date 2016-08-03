package com.wetts.game.snake;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake");
		Window window = new Window();
		frame.add(window);
		frame.setSize((Window.MAX_COL + 2) * Cell.CELL_SIZE, (Window.MAX_ROW + 3 ) * Cell.CELL_SIZE);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		window.action();
	}
}
