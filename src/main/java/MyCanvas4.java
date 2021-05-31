import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MyCanvas4 extends Canvas implements MouseListener, MouseMotionListener {
    private Point startPoint;
    private Point actualPosition;
    private ArrayList<Point> listOfPoints;
    private boolean pressed;

    public MyCanvas4(){
        this.startPoint = new Point();
        this.actualPosition = new Point();
        this.listOfPoints = new ArrayList<>();
        this.pressed = false;

        this.setBackground(Color.WHITE);
        this.setSize(500,500);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));

        for(int i = 0; i < this.listOfPoints.size()-1; i++){
            g.drawLine(this.listOfPoints.get(i).x, this.listOfPoints.get(i).y, this.listOfPoints.get(i+1).x, this.listOfPoints.get(i+1).y);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.pressed = true;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.actualPosition.x = e.getX();
        this.actualPosition.y = e.getY();
        this.listOfPoints.add(new Point(this.actualPosition));
        this.repaint();
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.pressed = false;
        this.listOfPoints.clear();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
