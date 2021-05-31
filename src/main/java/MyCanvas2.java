import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyCanvas2 extends Canvas implements MouseListener {
    private boolean drawing;
    private boolean coordination;
    private ArrayList<Rectangle> listOfRectangle;

    public MyCanvas2(){
        super();
        this.addMouseListener(this);
        this.listOfRectangle = new ArrayList<>();
        this.drawing = false;
        this.coordination = false;
        this.setBackground(Color.WHITE);
    }

    public boolean isCoordination() {
        return coordination;
    }

    public void setCoordination(boolean coordination) {
        this.coordination = coordination;
    }

    public boolean isDrawing() {
        return drawing;
    }

    public void setDrawing(boolean drawing) {
        this.drawing = drawing;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Rectangle rectangle : this.listOfRectangle) {
            g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(),
                    rectangle.getHeight());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(this.isDrawing()){
            Rectangle newRectangle = new Rectangle(e.getX(), e.getY());
            this.listOfRectangle.add(newRectangle);
            this.repaint();
        }


        if(this.isCoordination()){
            String message = "x: " + e.getX() + " y: " + e.getY();
            JOptionPane.showMessageDialog(this, message);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
