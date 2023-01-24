import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallPanel extends JPanel{
    int x = 100;
    int y = 50;
    int xSpeed=3;
    int ySpeed = 1;
    Ball ball = new Ball();

    public BallPanel(){
        setBackground(new Color(255,0,0));
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int key = e.getKeyCode();

                if (key == 68 || key == 39){
                    //move ball to the right
                    ball.moveRight();
                } else if (key == 65 || key ==37){
                    ball.moveLeft();
                } else if(key ==87 || key == 38){
                    ball.moveUp();

                } else if(key ==83  || key == 40){
                    ball.moveDown();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        ball.drawBall(g);

        repaint();


    }
}
