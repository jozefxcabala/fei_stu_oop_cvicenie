import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClick extends Button implements ActionListener {
    private MyCanvas2 canvas;
    public ButtonClick(String nameOfButton, MyCanvas2 canvas){
        super(nameOfButton);
        this.canvas = canvas;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.canvas.isCoordination()) {
            this.canvas.setCoordination(false);
            System.out.println("Findout coordination is impossible");
        }
        else{
            this.canvas.setCoordination(true);
            System.out.println("Find coordination is possible");
        }
    }
}
