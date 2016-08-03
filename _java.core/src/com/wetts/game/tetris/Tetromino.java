package com.wetts.game.tetris;

import java.util.Random;

public abstract class Tetromino {

	protected Cell[] cells;

	protected State[] states;

	private int index = 10000;

	protected class State {
		int row0, col0, row1, col1, row2, col2, row3, col3;

		public State(int row0, int col0, int row1, int col1, int row2,
				int col2, int row3, int col3) {
			this.row0 = row0;
			this.col0 = col0;
			this.row1 = row1;
			this.col1 = col1;
			this.row2 = row2;
			this.col2 = col2;
			this.row3 = row3;
			this.col3 = col3;
		}
	}

	public Tetromino() {
		cells = new Cell[4];
	}

	public void moveLeft() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].moveLeft();
		}
	}

	public void moveRight() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].moveRight();
		}
	}

	public void moveDown() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].moveDown();
		}
	}

	public void moveUp() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].moveUp();
		}
	}

	public void rotateRight() {
		index++;
		int n = index % states.length;
		State s = states[n];
		Cell o = cells[0];
		int row = o.getRow();
		int col = o.getCol();
		cells[1].setRow(row + s.row1);
		cells[1].setCol(col + s.col1);
		cells[2].setRow(row + s.row2);
		cells[2].setCol(col + s.col2);
		cells[3].setRow(row + s.row3);
		cells[3].setCol(col + s.col3);
	}

	public void rotateLeft() {
		index--;
		int n = index % states.length;
		State s = states[n];
		Cell o = cells[0];
		int row = o.getRow();
		int col = o.getCol();
		cells[1].setRow(row + s.row1);
		cells[1].setCol(col + s.col1);
		cells[2].setRow(row + s.row2);
		cells[2].setCol(col + s.col2);
		cells[3].setRow(row + s.row3);
		cells[3].setCol(col + s.col3);
	}

	public static Tetromino randomOne() {
		Tetromino[] all = new Tetromino[] { new T(), new S(), new O(), new L(),
				new I(), new I(), new Z() };
		Random random = new Random();
		int type = random.nextInt(7);
		return all[type];
	}

}

class T extends Tetromino {

	public T() {
		cells[0] = new Cell(0, 4, Cell.T);
		cells[1] = new Cell(0, 3, Cell.T);
		cells[2] = new Cell(0, 5, Cell.T);
		cells[3] = new Cell(1, 4, Cell.T);
		states = new State[4];
		states[0] = new State(0, 0, 0, -1, 0, 1, 1, 0);
		states[1] = new State(0, 0, -1, 0, 1, 0, 0, -1);
		states[2] = new State(0, 0, 0, 1, 0, -1, -1, 0);
		states[3] = new State(0, 0, 1, 0, -1, 0, 0, 1);
	}
}

class S extends Tetromino {

	public S() {
		cells[0] = new Cell(0, 4, Cell.S);
		cells[1] = new Cell(0, 5, Cell.S);
		cells[2] = new Cell(1, 3, Cell.S);
		cells[3] = new Cell(1, 4, Cell.S);
		states = new State[2];
		states[0] = new State(0, 0, 0, 1, 1, -1, 1, 0);
		states[1] = new State(0, 0, -1, 0, 0, 1, 1, 1);
	}
}

class O extends Tetromino {

	public O() {
		cells[0] = new Cell(0, 4, Cell.O);
		cells[1] = new Cell(0, 5, Cell.O);
		cells[2] = new Cell(1, 4, Cell.O);
		cells[3] = new Cell(1, 5, Cell.O);
		states = new State[2];
		states[0] = new State(0, 0, 0, 1, 1, 0, 1, 1);
		states[1] = new State(0, 0, 0, 1, 1, 0, 1, 1);
	}
}

class L extends Tetromino {

	public L() {
		cells[0] = new Cell(0, 4, Cell.L);
		cells[1] = new Cell(0, 3, Cell.L);
		cells[2] = new Cell(0, 5, Cell.L);
		cells[3] = new Cell(1, 3, Cell.L);
		states = new State[4];
		states[0] = new State(0, 0, 0, -1, 0, 1, 1, -1);
		states[1] = new State(0, 0, -1, 0, 1, 0, -1, -1);
		states[2] = new State(0, 0, 0, 1, 0, -1, -1, 1);
		states[3] = new State(0, 0, 1, 0, -1, 0, 1, 1);
	}
}

class I extends Tetromino {

	public I() {
		cells[0] = new Cell(0, 4, Cell.I);
		cells[1] = new Cell(0, 3, Cell.I);
		cells[2] = new Cell(0, 5, Cell.I);
		cells[3] = new Cell(0, 6, Cell.I);
		states = new State[2];
		states[0] = new State(0, 0, 0, -1, 0, 1, 0, 2);
		states[1] = new State(0, 0, -1, 0, 1, 0, 2, 0);
	}
}

class J extends Tetromino {

	public J() {
		cells[0] = new Cell(0, 4, Cell.J);
		cells[1] = new Cell(0, 3, Cell.J);
		cells[2] = new Cell(0, 5, Cell.J);
		cells[3] = new Cell(1, 5, Cell.J);
		states = new State[4];
		states[0] = new State(0, 0, 0, -1, 0, 1, 1, 1);
		states[1] = new State(0, 0, -1, 0, 1, 0, 1, -1);
		states[2] = new State(0, 0, 0, 1, 0, -1, -1, -1);
		states[3] = new State(0, 0, 1, 0, -1, 0, -1, 1);
	}
}

class Z extends Tetromino {

	public Z() {
		cells[0] = new Cell(1, 4, Cell.Z);
		cells[1] = new Cell(0, 3, Cell.Z);
		cells[2] = new Cell(0, 4, Cell.Z);
		cells[3] = new Cell(1, 5, Cell.Z);
		states = new State[2];
		states[0] = new State(0, 0, -1, -1, -1, 0, 0, 1);
		states[1] = new State(0, 0, -1, 1, 0, 1, 1, 0);
	}
}
