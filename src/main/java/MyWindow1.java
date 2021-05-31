import javax.swing.*;
import java.awt.*;

public class MyWindow1 extends JFrame {
    private MyCanvas1 canvas;
    private BorderLayout layout;

    public MyWindow1(String nameOfWindow){
        super(nameOfWindow);

        this.layout = new BorderLayout();
        this.setLayout(this.layout);

        this.canvas = new MyCanvas1();
        this.add(this.canvas);

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
