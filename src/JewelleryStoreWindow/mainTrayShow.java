package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;

public class mainTrayShow extends JDialog {
    public mainTrayShow(){
        Container container=this.getContentPane();
        this.setVisible(true);
        this.setSize(600,400);
        container.setLayout(null);

        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        panel.setBounds(10,10,500,30);
        //panel.setBackground(Color.green);

        JLabel jLabel=new JLabel("TraysShow");
        jLabel.setSize(150,30);
        JTextField jTextField=new JTextField();
        panel.add(jLabel);
        panel.add(jTextField);



        showTray panelForTrayShow=new showTray();
        JScrollPane jScrollPane=new JScrollPane(panelForTrayShow);
        jScrollPane.setBounds(10,100,500,200);

        container.add(panel);
        container.add(jScrollPane);
    }
}
