import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;
public class GraphicsDemo2 {
    public static void draw(Graphics g) {
        //change color to yellow
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 100, 100);
        g.setColor(Color.black);
        g.drawLine(130, 180, 170, 180);

        g.setColor(Color.blue);
        g.fillOval(120, 130, 25, 25);
        //the left eye
        g.setColor(Color.blue);
        g.fillOval(155, 130, 25, 25);
        //the right eye
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
    //Try drawing a face on the screen with 2 colored in eyes and straight line for a mouth
