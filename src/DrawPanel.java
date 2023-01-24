import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel{

    public DrawPanel(){
        setBackground(new Color(255,0,0));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillOval(100,200,50,75);
        //drawString
        //drawLine
        //drawArch
        //fillPolygon
        //fillRec
        //drawOval
        //create a picture
    }
}