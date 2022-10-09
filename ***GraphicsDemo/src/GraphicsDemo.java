 import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;
public class GraphicsDemo {
    public static void draw(Graphics g)
    {
        //change color to blue
        g.setColor(Color.BLUE);
        //top left corner of the drawing begins at (0,0)
        // or the northwest corner of the screen.
        g.fillRect(5,5,10,20);
        //this draws a filled in BLUE rectangle at 5,5 on top left with with 10
        // and height 20
        g.setColor(Color.RED);
        g.fillOval(50, 50,  30, 30);
        g.setColor(Color.GREEN);
        g.drawLine(100, 0, 100, 50);
        g.setColor(Color.MAGENTA);
        g.drawString("Hello CUS 1115",0,310);
        g.setColor(Color.CYAN);
        g.drawLine(0,250,300,250);
        g.setColor(Color.GREEN);
        g.drawRect(0,175,25,30);
        g.setColor(Color.ORANGE);
        g.drawOval(0, 270, 15, 20);
        g.setColor(Color.GRAY);
        g.drawString("We are testing graphics methods here.",0,155);
    }
    public static void main(String[] args){
        JFrame frame= new JFrame();
        int WIDTH=400;
        int HEIGHT=400;
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent component= new JComponent()
        {
            public void paintComponent(Graphics graph){draw(graph);
            }
        }
                ;frame.add(component);frame.setVisible(true);
    }
}
