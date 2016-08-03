package com.wetts.game.snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {

	private List<Cell> cells;
	
	private int direction;
	
	public Snake() {
		cells = new ArrayList<Cell>();
		cells.add(new Cell(0, (Window.MAX_COL >> 1) - 1));
		cells.add(new Cell(0, (Window.MAX_COL >> 1)));
		cells.add(new Cell(0, (Window.MAX_COL >> 1) + 1));
		direction = Window.SOUTH;
	}
	
	public List<Cell> getCells() {
		return cells;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public Cell creatHead(int direction) {
		this.direction = direction;
		Cell cell = cells.get(0);
		int row = cell.getRow();
		int col = cell.getCol();
		switch (direction) {
		case Window.NORTH:
			return new Cell(row - 1, col);
		case Window.SOUTH:
			return new Cell(row + 1, col);
		case Window.WEST:
			return new Cell(row, col - 1);
		case Window.EAST:
			return new Cell(row, col + 1);
		}
		return null;
	}
	
	public void move(Cell head,boolean isEat) {
		if (isEat) {
			cells.add(0, head);
		} else {
			cells.add(0, head);
			cells.remove(cells.size() - 1);
		}
	}
}
