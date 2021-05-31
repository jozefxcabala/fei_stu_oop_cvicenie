import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDraw extends Button implements ActionListener {
    private MyCanvas2 canvas;

    public ButtonDraw(String nameOfButton, MyCanvas2 canvas){
        super(nameOfButton);
        this.canvas = canvas;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.canvas.isDrawing()) {
            this.canvas.setDrawing(false);
            System.out.println("Drawing is impossible");
        }
        else{
            this.canvas.setDrawing(true);
            System.out.println("Drawing is possible");
        }
    }
}
