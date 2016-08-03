package com.wetts.game.snake;

import java.util.Random;

public class Food {

	private Cell cell;
	
	private Food(int row, int col) {
		cell = new Cell(row, col);
	}
	
	public Cell getCell() {
		return cell;
	}
	
	public static Food randomFood() {
		Random random = new Random();
		int row = random.nextInt(Window.MAX_ROW);
		int col = random.nextInt(Window.MAX_COL);
		return new Food(row, col);
	}
}
