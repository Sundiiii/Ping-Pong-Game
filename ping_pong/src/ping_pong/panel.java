package ping_pong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class panel extends JPanel implements Runnable {
	public static int GAME_WIDTH=1000;
	public static int GAME_HIGHT=(int)GAME_WIDTH*(5/9);
	public static final Dimension SCREEN_SIZE=new Dimension (GAME_WIDTH,GAME_HIGHT);
	public static int ball_diameter=20;
	public static int paddle_width=25;
	public static int paddle_hight=100;
	Thread gamethread;
	Image image;
	Graphics graphics ;
		Random random;
		paddle paddle1;
		paddle paddle2;
		ball ball1;
		score score1;
panel(){
	
}
public void newball() {
	
}
public void newpaddle() {
	
}
public void paint(Graphics g) {
	
}
public void draw() {
	
}
public void move() {
	
}
public void checkcollision() {
	
}
public void run() {
	
}
public class AL extends KeyAdapter {
	public void KeyPressed(KeyEvent e) {
	}
	public void KeyRealeased(KeyEvent e) {
	}
}
}
