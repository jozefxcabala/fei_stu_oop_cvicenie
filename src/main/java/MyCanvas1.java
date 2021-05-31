import java.awt.*;

public class MyCanvas1 extends Canvas {
    public MyCanvas1(){
        super();
        this.setSize(500,500);
        this.setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        for(int i = 0; i <= 360; i++){
            double j = i * Math.PI / 360;
            int x1 = (int)(140-100*Math.sin(j));
            int y1 = (int)(130+100*Math.cos(j));
            int x2 = (int)(140+100*Math.sin(j));
            int y2 = (int)(130-100*Math.cos(j));
            g.setColor(Color.RED);
            g.drawLine(x1,y1,x2,y2);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.clearRect(0, 0, this.getWidth(), this.getHeight());
        }
    }
}
