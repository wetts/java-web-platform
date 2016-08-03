package com.wetts.game.tetris;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cell {

	private int row;
	
	private int col;
	
	private BufferedImage image;
	
	public static BufferedImage T;
	public static BufferedImage S;
	public static BufferedImage Z;
	public static BufferedImage J;
	public static BufferedImage L;
	public static BufferedImage O;
	public static BufferedImage I;
	
	static {
		try {
			T = ImageIO.read(Cell.class.getResource("T.png"));
			S = ImageIO.read(Cell.class.getResource("S.png"));
			Z = ImageIO.read(Cell.class.getResource("Z.png"));
			J = ImageIO.read(Cell.class.getResource("J.png"));
			L = ImageIO.read(Cell.class.getResource("L.png"));
			O = ImageIO.read(Cell.class.getResource("O.png"));
			I = ImageIO.read(Cell.class.getResource("I.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Cell(int row, int col, BufferedImage image) {
		this.row = row;
		this.col = col;
		this.image = image;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}
	
	public void moveLeft() {
		col--;
	}
	
	public void moveRight() {
		col++;
	}
	
	public void moveDown() {
		row++;
	}

	public void moveUp() {
		row--;
	}
}
