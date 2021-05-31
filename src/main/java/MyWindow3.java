import javax.swing.*;

public class MyWindow3 extends JFrame {
    private MyCanvas3 canvas;
    public MyWindow3(String nameOfWidnow){
        super(nameOfWidnow);

        this.canvas = new MyCanvas3();
        this.add(this.canvas);

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
