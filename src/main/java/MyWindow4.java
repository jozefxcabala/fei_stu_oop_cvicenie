import javax.swing.*;

public class MyWindow4 extends JFrame {
    private MyCanvas4 canvas;
    public MyWindow4(String nameOfWidnow){
        super(nameOfWidnow);

        this.canvas = new MyCanvas4();
        this.add(this.canvas);

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
