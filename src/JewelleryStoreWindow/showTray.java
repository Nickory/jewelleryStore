package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;

public class showTray extends JPanel {
    public showTray() {
        this.setLayout(new GridLayout(9, 1, 0, 10));
        int j = 9;
        for (int k = 0; k < j; k++) {
            this.add(new ButtonForItem("这是一个item"));
        }
    }
}
