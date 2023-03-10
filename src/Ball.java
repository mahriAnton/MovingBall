import javax.swing.*;
import java.awt.*;
public class Ball {

    private int x, y, size, xSpeed, ySpeed;
    private Color color;


    public Ball( ){
        x = (int)(Math.random()*500);
        y =(int)(Math.random()*500);
        size = 20;
       //size = (int)(Math.random()*50)+5;
        xSpeed = (int)(Math.random()*10)+3;
        ySpeed = (int)(Math.random()*10)+3;
        color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
    }

    public void drawBall(Graphics pony){
        pony.setColor(color);
        pony.fillOval(x,y,size,size);
    }


    public void moveRight(JPanel a){
        x+=xSpeed;
        if(x>=a.getWidth()-size){
            x=0;
        }
    }
    public void moveLeft(JPanel a){
        x -= xSpeed;
        if(x <= 0){
            x=a.getWidth();
        }
    }
    public void moveUp(){
        if (y >= 0) {
            y -= ySpeed;
        }
    }
    public void moveDown(JPanel a){
        if(y <= a.getHeight()-size){
            y += ySpeed;
        }
    }


    public void moveBall() {
        x += xSpeed;
        y += ySpeed;
        if (x >= 500 - size || x <= 0) {
            xSpeed = xSpeed * -1;
        }
        if (y <= 0 || y >= 480 - size) {
            ySpeed = ySpeed * -1;
        }

        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}

