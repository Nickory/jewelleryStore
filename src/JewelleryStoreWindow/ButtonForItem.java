package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonForItem extends JButton{
    String string;
    public ButtonForItem(String string){
        this.string=string;
        new JButton();
        this.setText(string);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new mainItemShow();
            }
        });
    }
}
