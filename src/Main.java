import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main (String[] args){
System.out.println("Hi I'm on replit");
        System.out.println("I'm on intellij");
        //create a frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);

        //create a panel
        BallPanel myBall = new BallPanel();

        //add stuff to panel

        //and panel to frame
        myFrame.add(myBall);

        //make frame visible
        myFrame.setVisible(true);



    }
}