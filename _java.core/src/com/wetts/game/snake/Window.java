package com.wetts.game.snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Window extends JPanel {

	public static final int MAX_ROW = 20;
	public static final int MAX_COL = 20;
	public static final int NORTH = -1;
	public static final int SOUTH = 1;
	public static final int WEST = -2;
	public static final int EAST = 2;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAMEOVER = 3;

	private static BufferedImage gameOver;
	private static BufferedImage pause;
	
	private Snake snake;
	private Food food;
	
	private int state;

	static {
		try {
			gameOver = ImageIO.read(Window.class.getResource("game-over.png"));
			pause = ImageIO.read(Window.class.getResource("pause.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Window() {
		init();
	}
	
	private void init() {
		snake = new Snake();
		food = productFood();
		state = RUNNING;
	}
	
	public void paint(Graphics g) {
		g.translate(Cell.CELL_SIZE, Cell.CELL_SIZE);
		paintWall(g);
		paintSnake(g);
		paintFood(g);
		paintState(g);
	}

	private void paintState(Graphics g) {
		switch (state) {
		case PAUSE:
			g.drawImage(pause, 0, 0, MAX_COL * Cell.CELL_SIZE, MAX_ROW * Cell.CELL_SIZE, null);
			break;
		case GAMEOVER:
			g.drawImage(gameOver, 0, 0, MAX_COL * Cell.CELL_SIZE, MAX_ROW * Cell.CELL_SIZE, null);
			break;
		}
	}

	private void paintFood(Graphics g) {
		g.setColor(Color.yellow);
		Cell cell = food.getCell();
		int row = cell.getRow();
		int col = cell.getCol();
		g.fill3DRect(col * Cell.CELL_SIZE, row * Cell.CELL_SIZE, Cell.CELL_SIZE, Cell.CELL_SIZE, true);
	}

	private void paintSnake(Graphics g) {
		g.setColor(Color.blue);
		for (Cell cell : snake.getCells()) {
			int x = cell.getCol() * Cell.CELL_SIZE;
			int y = cell.getRow() * Cell.CELL_SIZE;
			g.fill3DRect(x, y, Cell.CELL_SIZE, Cell.CELL_SIZE, true);
		}
	}

	private void paintWall(Graphics g) {
		g.setColor(Color.BLACK);
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				g.fill3DRect(col * Cell.CELL_SIZE, row * Cell.CELL_SIZE, Cell.CELL_SIZE, Cell.CELL_SIZE, true);
			}
		}
	}
	
	private boolean isEat(Cell head) {
		if (food.getCell().equals(head)) {
			return true;
		}
		return false;
	}
	
	private void moveAction(int direction) {
		Cell head = snake.creatHead(direction);
		if (!outOfBounds(head) && !eatMyself(head)) {
			boolean isEat = isEat(head);
			if (isEat) {
				food = productFood();
			}
			snake.move(head, isEat);
		} else {
			state = GAMEOVER;
		}
	}
	
	private Food productFood() {
		Food food = null;
		do {
			food = Food.randomFood();
		} while (snake.getCells().contains(food));
		return food;
	}

	private boolean outOfBounds(Cell head) {
		int row = head.getRow();
		int col = head.getCol();
		if (row < 0 || row >= Window.MAX_ROW || col < 0 || col >= Window.MAX_COL) {
			return true;
		}
		return false;
	}

	private boolean eatMyself(Cell head) {
		for (Cell cell : snake.getCells()) {
			if (cell.equals(head)) {
				return true;
			}
		}
		return false;
	}
	
	public void action() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				switch (state) {
				case RUNNING:
					processRunning(key);
					break;
				case PAUSE:
					processPause(key);
					break;
				case GAMEOVER:
					processGameOver(key);
					break;
				}
				repaint();
			}
		});
		this.requestFocus();
		this.setFocusable(true);
		
		Timer timer =new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				moveAction(snake.getDirection());
				repaint();
			}
		}, 0, 400);
	}

	protected void processGameOver(int key) {
		switch (key) {
		case KeyEvent.VK_S:
			init();
			break;
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		}
	}

	protected void processPause(int key) {
		switch (key) {
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		case KeyEvent.VK_C:
			state = RUNNING;
			break;
		}
	}

	protected void processRunning(int key) {
		switch (key) {
		case KeyEvent.VK_RIGHT:
			if (snake.getDirection() != WEST) {
				moveAction(EAST);
			}
			break;
		case KeyEvent.VK_LEFT:
			if (snake.getDirection() != EAST) {
				moveAction(WEST);
			}
			break;
		case KeyEvent.VK_DOWN:
			if (snake.getDirection() != NORTH) {
				moveAction(SOUTH);
			}
			break;
		case KeyEvent.VK_UP:
			if (snake.getDirection() != SOUTH) {
				moveAction(NORTH);
			}
			break;
		case KeyEvent.VK_P:
			state = PAUSE;
			break;
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		}
	}
}
