package com.wetts.game.flappybird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlappyBird {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("飞扬的小鸟");
        BirdPanel panel = new BirdPanel();
        frame.add(panel);
        frame.setSize(432, 644 + 30);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//居中

        panel.action();
    }
}

//游戏界面
class BirdPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    //BufferedImage 用来保存图片
    BufferedImage background;
    Ground ground; //对象实例化
    Column column;
    Column column2;
    Bird bird;
    boolean isOver; //游戏是否结束?
    BufferedImage startImage; //游戏开始界面
    BufferedImage overImage; //游戏结束界面
    boolean started; //游戏是否已经开始?
    int score; //分数


    public BirdPanel() throws Exception {//构造器:初始化变量
        //ImageIO: 图片工厂
        background = ImageIO.read(getClass().getResource("bg.png"));
        startImage = ImageIO.read(getClass().getResource("start.png"));
        overImage = ImageIO.read(getClass().getResource("gameover.png"));

        restart();
    }

    //游戏重新开始
    public void restart() throws Exception {
        ground = new Ground();
        column = new Column(1);//1号柱子
        column2 = new Column(2);//2号柱子
        bird = new Bird();
        isOver = false;
        started = false;
        score = 0;
    }

    public void paint(Graphics g) {
        g.drawImage(background, 0, 0, null);
        g.drawImage(column.image, column.x - column.width / 2, column.y - column.height / 2, null);
        g.drawImage(column2.image, column2.x - column2.width / 2, column2.y - column2.height / 2, null);
        g.drawImage(ground.image, ground.x, ground.y, null);

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.WHITE);
        //绘制分数
        g.drawString("分数: " + score, 10, 30);

        Graphics2D g2d = (Graphics2D) g;//获得2维画笔
        g2d.rotate(-bird.alpha, bird.x, bird.y);//旋转坐标系(逆时针)
        g.drawImage(bird.image, bird.x - bird.width / 2, bird.y - bird.height / 2, null);
        g2d.rotate(bird.alpha, bird.x, bird.y);

        if (isOver) {//绘制结束背景
            g.drawImage(overImage, 0, 0, null);
        }

        if (!started) {//绘制开始背景
            g.drawImage(startImage, 0, 0, null);
        }

    }

    public void action() throws Exception {
        //添加鼠标点击激发的事件
        //MouseListener: 鼠标监听器
        //观察者设计模式、适配器设计模式
        //匿名内部类(实现与对象创建 合二为一)
        MouseListener l = new MouseAdapter() {
            //重写鼠标按下方法
            public void mousePressed(MouseEvent e) {
                if (isOver) {
                    try {
                        restart();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                } else {
                    bird.speed = 20;
                    started = true;
                }
            }
        };
        //绑定事件(绑定在当前面板上)
        this.addMouseListener(l);


        while (true) {
            if (!isOver) {
                if (started) {
                    column.step();
                    column2.step();
                    bird.step();
                    //快速移动代码: alt + 向上键|向下键
                }
                ground.step();
                bird.fly();

                if (bird.x == column.x || bird.x == column2.x) {
                    score++;
                }
            }
            if (bird.hit(ground) || bird.hit(column) || bird.hit(column2)) {
                isOver = true;
            }

            Thread.sleep(1000 / 50);
            repaint();
        }
    }
}

//地面
class Ground {
    BufferedImage image;
    int x;
    int y;

    public Ground() throws Exception {
        image = ImageIO.read(getClass().getResource("ground.png"));
        x = 0;
        y = 500;
    }

    public void step() {
        x--;
        //检查x的边界
        if (x < -432 / 4) {
            x = 0;
        }
    }
}

//柱子
class Column {
    BufferedImage image;
    int x;
    int y;
    int width;
    int height;
    Random random = new Random();
    int distance; //间距
    int gap; //间隙

    //num: 柱子编号
    public Column(int num) throws Exception {
        image = ImageIO.read(getClass().getResource("column.png"));
        width = image.getWidth();
        height = image.getHeight();
        distance = 245;
        x = 500 + (num - 1) * 245;
        y = random.nextInt(228) + 132;//132~360
        gap = 144;
    }

    public void step() {
        x--;
        //检查x边界
        if (x < -width / 2) {
            x = 2 * distance - width / 2;
            y = random.nextInt(228) + 132;
        }
    }

}

//鸟
class Bird {
    BufferedImage image;//当前鸟的状态
    BufferedImage[] images;//鸟的所有状态
    int x;
    int y;
    int width;
    int height;
    int size;
    int index; //鸟状态的下标
    double g; //重力加速度
    double t; //时间
    double speed; //初速度(经过时间t秒之后的末速度)
    double s; //经过时间t秒后的位移
    double alpha; //倾角

    public Bird() throws Exception {
        images = new BufferedImage[8];
        for (int i = 0; i < 8; i++) {
            images[i] = ImageIO.read(getClass().getResource(i + ".png"));
        }
        image = images[0];
        width = image.getWidth();
        height = image.getHeight();
        x = 132;//界面宽度的1/3
        y = 280;//界面高度的1/2
        size = 40;
        index = 0;

        g = 4.9;
        t = 0.25;
        speed = 20;
        s = 0;
        alpha = 0;
    }

    public void fly() {
        index++;//0 1 2 3 4 5 6 7 8 9 10 11 12
        image = images[(index / 8) % 8];
        //index:   0 1 2 3 4 5 6 7 8 9 10 11 12 .. 16 17
        //index/8: 0 0 0 0 0 0 0 0 1 1 1  1  1     2  2
        //     %8: 0 0 0 0 0 0 0 0
    }

    public void step() {//鸟的移动(物理公式[垂直上抛+自由落体])
        double v0 = speed;
        s = v0 * t - 0.5 * g * t * t;
        double vt = v0 - g * t;
        speed = vt;
        y = (int) (y - s);
        alpha = Math.atan(s / 8); //求反正切

    }

    //检查是否撞到地面?
    public boolean hit(Ground ground) {
        if (y + size / 2 > ground.y) {
            alpha = -Math.PI / 2;
            y = y - size / 2;
            return true;
        }
        return false;
    }

    //检查是否撞到柱子?(~方法重载~)
    public boolean hit(Column column) {
        int x1 = column.x - column.width / 2 - size / 2;
        int x2 = column.x + column.width / 2 + size / 2;
        int y1 = column.y - column.gap / 2 + size / 2;
        int y2 = column.y + column.gap / 2 - size / 2;

        if (x > x1 && x < x2) {
            if (y > y1 && y < y2) {
                return false;
            }
            return true;
        }
        return false;
    }

}