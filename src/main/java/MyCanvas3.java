import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MyCanvas3 extends Canvas implements MouseListener, MouseMotionListener {
    private ArrayList<Polygon> listOfPolygon;
    private Point startPoint;
    private Point endPoint;
    private boolean newPolygonB;
    private Polygon newPolygonO;
    private ArrayList<Point> listOfLinePoints;

    public MyCanvas3(){
        super();
        this.listOfPolygon = new ArrayList<>();
        this.newPolygonB = false;
        this.listOfLinePoints = new ArrayList<>();
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setSize(500, 500);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            System.out.println("left");
            if(!newPolygonB){
                this.newPolygonO = new Polygon();
                this.newPolygonB = true;
            }
            this.newPolygonO.addPoint(e.getX(), e.getY());
            this.startPoint = new Point(e.getX(), e.getY());
            this.endPoint = new Point(this.startPoint);
            this.listOfLinePoints.add(this.startPoint);
            this.repaint();
        }
        if(SwingUtilities.isRightMouseButton(e)){
            System.out.println("right");
            this.newPolygonB = false;
            this.listOfPolygon.add(this.newPolygonO);
            this.listOfLinePoints.clear();
            this.repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        for (Polygon polygon : this.listOfPolygon) {
            g.drawPolygon(polygon);
        }

        for(int i = 0; i < this.listOfLinePoints.size()-1; i++){
            g.drawLine(this.listOfLinePoints.get(i).x, this.listOfLinePoints.get(i).y, this.listOfLinePoints.get(i+1).x, this.listOfLinePoints.get(i+1).y);
        }

        if(this.newPolygonB)
            g.drawLine(this.startPoint.x, this.startPoint.y, this.endPoint.x, this.endPoint.y);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(this.newPolygonB) {
            this.endPoint.x = e.getX();
            this.endPoint.y = e.getY();
            this.repaint();
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

    @Override
    public void mouseDragged(MouseEvent e) {

    }
}
