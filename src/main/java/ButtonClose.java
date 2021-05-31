import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClose extends Button implements ActionListener {
    public ButtonClose(String nameOfButton){
        super(nameOfButton);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("App is closed");
        System.exit(0);
    }
}
