package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;

public class showCase extends JPanel {
    public showCase(){
        this.setLayout(new GridLayout(9,1,0,10));
        int j=9;
        for(int k=0;k<j;k++){
            this.add(new ButtonForShowTray());
        }
    }
}


