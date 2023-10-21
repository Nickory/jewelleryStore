package JewelleryStoreWindow;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addFailed extends JDialog {
    public addFailed(){
        Container container=this.getContentPane();
        JLabel jLabel=new JLabel("Identifier repeat or lose information");
        jLabel.setBounds(20,30,160,60);
        JButton jButton=new JButton("OK");
        jButton.setBounds(70,120,60,30);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        container.add(jLabel);
        container.add(jButton);
        container.setLayout(null);
        this.setSize(200,200);
        this.setVisible(true);
    }
}
