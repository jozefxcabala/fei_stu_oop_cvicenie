import javax.swing.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
    private JPanel buttonsPanel;
    private MyCanvas2 canvas;
    private ButtonClose close;
    private ButtonDraw draw;
    private ButtonClick click;

    public MyWindow2(String nameOfWindow){
        super(nameOfWindow);
        this.setLayout(new BorderLayout());

        this.buttonsPanel = new JPanel();
        this.buttonsPanel.setLayout(new GridLayout(2, 1));

        this.canvas = new MyCanvas2();
        this.close = new ButtonClose("close");
        this.draw = new ButtonDraw("draw", this.canvas);
        this.click = new ButtonClick("click", this.canvas);

        this.buttonsPanel.add(this.close);
        this.buttonsPanel.add(this.draw);

        this.add(this.buttonsPanel, BorderLayout.PAGE_START);
        this.add(this.canvas, BorderLayout.CENTER);
        this.add(this.click, BorderLayout.PAGE_END);

        this.pack();
        this.setVisible(true);
        this.setSize(300,300);
    }
}
