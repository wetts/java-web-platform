package com.wetts.game.tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Tetris extends JPanel {

	private Cell[][] wall;

	private int state;
	
	private int score;
	
	private int lines;
	
	private int level;
	
	private int index;
	
	private int speed;
	
	private Timer timer;
	
	private int interval = 10; // 定时器间隔时间

	private static final int CELL_SIZE = 26;
	private static final int MAX_ROW = 20;
	private static final int MAX_COL = 10;
	private static final int PRINT_NOW = 0;
	private static final int PRINT_NEXT = 1;
	private static final int RUNNING = 0;
	private static final int PAUSE = 1;
	private static final int GAME_OVER = 2;
	private static final int[] SCORE_TABLE = new int[]{0, 1, 10, 100, 500}; 

	private Tetromino tetromino;
	private Tetromino nextOne;

	private static BufferedImage background;
	private static BufferedImage pause;
	private static BufferedImage gameOver;

	static {
		try {
			background = ImageIO.read(Tetris.class.getResource("TETRIS.png"));
			pause = ImageIO.read(Tetris.class.getResource("pause.png"));
			gameOver = ImageIO.read(Tetris.class.getResource("game-over.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 重写paint方法
	 */
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
		g.translate(15, 15);
		paintWall(g);
		paintTetromino(tetromino, g, Tetris.PRINT_NOW);
		paintTetromino(nextOne, g, Tetris.PRINT_NEXT);
		paintScore(g);
		paintState(g);
	}

	private void paintScore(Graphics g) {
		int x = 292;
		int y = 160;
		Font f = new Font(Font.SERIF, Font.BOLD, 30);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("SCORE:" + score, x + 3, y + 3);
		y += 56;
		g.drawString("LINES:" + lines, x + 3, y + 3);
		y += 56;
		g.drawString("LEVEL:" + level, x + 3, y + 3);
		x = 292;
		y = 160;
		int c = 0x667799;
		g.setColor(new Color(c));
		g.drawString("SCORE:" + score, x, y);
		y += 56;
		g.drawString("LINES:" + lines, x, y);
		y += 56;
		g.drawString("LEVEL:" + level, x, y);
	}

	private void paintState(Graphics g) {
		switch (state) {
		case GAME_OVER:
			g.drawImage(gameOver, -15, -15, null);
			break;
		case PAUSE:
			g.drawImage(pause, -15, -15, null);
			break;
		}
	}

	private void paintWall(Graphics g) {
		for (int row = 0; row < wall.length; row++) {
			for (int col = 0; col < wall[row].length; col++) {
				int x = col * CELL_SIZE;
				int y = row * CELL_SIZE;
				if (wall[row][col] == null) {
					g.drawRect(x, y, CELL_SIZE, CELL_SIZE);
				} else {
					g.drawImage(wall[row][col].getImage(), x, y, null);
				}
			}
		}
	}

	/**
	 * 
	 * @param tetromino
	 * @param g
	 * @param type
	 *            type==1 绘制在map里面， type==2 绘制在下一个出现的方框中
	 */
	private void paintTetromino(Tetromino tetromino, Graphics g, int type) {
		Cell[] cells = tetromino.cells;
		int[] typeX = new int[] { 0, 10 };
		int[] typeY = new int[] { 0, 1 };
		for (int i = 0; i < cells.length; i++) {
			int x = (cells[i].getCol() + typeX[type]) * CELL_SIZE;
			int y = (cells[i].getRow() + typeY[type]) * CELL_SIZE;
			g.drawImage(cells[i].getImage(), x, y, null);
		}
	}
	
	private void init() {
		wall = new Cell[MAX_ROW][MAX_COL];
		tetromino = Tetromino.randomOne();
		nextOne = Tetromino.randomOne();
		state = Tetris.RUNNING;
		score = 0;
		lines = 0;
		level = 1;
	}

	public void action() {
		init();
		
		timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				index++;
				level = lines / 100 + 1;
				speed = 41 - level;
				speed = speed <= 0 ? 1 : speed;
				if (index % speed == 0) {
					if (state == Tetris.RUNNING) {
						softDropAction();
					}
				}
				if (index == 200000000) {
					index = 0;
				}
				repaint();
			}
		};
		
		timer.schedule(task, 0, interval);
		
		KeyAdapter ka = new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				switch (state) {
				case Tetris.RUNNING:
					processRunning(key);
					break;
				case Tetris.PAUSE:
					processPause(key);
					break;
				case Tetris.GAME_OVER:
					processGameOver(key);
					break;
				}
				repaint();
			}
		};
		this.addKeyListener(ka);
		this.requestFocus();
		this.setFocusable(true);
		
	}

	private void processGameOver(int key) {
		switch (key) {
		case KeyEvent.VK_S:
			init();
			break;
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		}
	}

	private void processPause(int key) {
		switch (key) {
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		case KeyEvent.VK_C:
			state = Tetris.RUNNING;
			break;
		}
	}

	private void processRunning(int key) {
		switch (key) {
		case KeyEvent.VK_RIGHT:
			Tetris.this.moveRightAction();
			break;
		case KeyEvent.VK_LEFT:
			Tetris.this.moveLeftAction();
			break;
		case KeyEvent.VK_DOWN:
			Tetris.this.softDropAction();
			break;
		case KeyEvent.VK_SPACE:
			Tetris.this.hardDropAction();
			break;
		case KeyEvent.VK_UP:
			Tetris.this.rotateRightAction();
			break;
		case KeyEvent.VK_P:
			state = Tetris.PAUSE;
			break;
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		}
	}

	private void rotateRightAction() {
		tetromino.rotateRight();
		if (outOfBounds() || coincide()) {
			tetromino.rotateLeft();
		}
	}

	private void hardDropAction() {
		while (Drop()) {
		}
		landIntoWall();
		int lines = destroyLines();
		this.lines += lines;
		this.score += SCORE_TABLE[lines];
		if (isGameOver()) {
			state = Tetris.GAME_OVER;
			System.out.println("T_T");
		} else {
			tetromino = nextOne;
			nextOne = Tetromino.randomOne();
		}
	}

	private void softDropAction() {
		if (Drop()) {
		} else {
			landIntoWall();
			int lines = destroyLines();
			this.lines += lines;
			this.score += SCORE_TABLE[lines];
			if (isGameOver()) {
				state = Tetris.GAME_OVER;
				System.out.println("T_T");
			} else {
				tetromino = nextOne;
				nextOne = Tetromino.randomOne();
			}
		}
	}

	private boolean isGameOver() {
		Cell[] cells = nextOne.cells;
		for (int i = 0; i < cells.length; i++) {
			int row = cells[i].getRow();
			int col = cells[i].getCol();
			if (wall[row][col] != null) {
				return true;
			}
		}
		return false;
	}

	private int destroyLines() {
		int lines = 0;
		for (int row = 0; row < MAX_ROW; row++) {
			if (fullCells(row)) {
				deleteRow(row);
				lines++;
			}
		}
		return lines;
	}

	private void deleteRow(int row) {
		for (int j = row; j > 0; j--) {
			System.arraycopy(wall[j - 1], 0, wall[j], 0, MAX_COL);
		}
		Arrays.fill(wall[0], null);
	}

	private boolean fullCells(int i) {
		Cell[] cells = wall[i];
		for (int j = 0; j < cells.length; j++) {
			if (cells[j] == null) {
				return false;
			}
		}
		return true;
	}

	private void landIntoWall() {
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			int row = cells[i].getRow();
			int col = cells[i].getCol();
			wall[row][col] = cells[i];
		}
	}

	private boolean Drop() {
		tetromino.moveDown();
		if (outOfBounds() || coincide()) {
			tetromino.moveUp();
			return false;
		}
		return true;
	}

	private void moveLeftAction() {
		tetromino.moveLeft();
		if (outOfBounds() || coincide()) {
			tetromino.moveRight();
		}
	}

	private void moveRightAction() {
		tetromino.moveRight();
		if (outOfBounds() || coincide()) {
			tetromino.moveLeft();
		}
	}
	
	private boolean outOfBounds() {
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			int row = cells[i].getRow();
			int col = cells[i].getCol();
			if (row < 0 || row >= MAX_ROW || col < 0 || col >= MAX_COL) {
				return true;
			}
		}
		return false;
	}
	
	private boolean coincide() {
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			int row = cells[i].getRow();
			int col = cells[i].getCol();
			if (wall[row][col] != null) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tetris");
		Tetris tetris = new Tetris();
		frame.setSize(background.getWidth(), background.getHeight());
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.add(tetris);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		tetris.action();
	}
}
