package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonForShowTray extends JButton {
    public ButtonForShowTray() {
        this.setText("nihao");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new mainTrayShow();
            }
        });
    }
}
