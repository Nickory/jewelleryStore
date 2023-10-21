package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addSuccess extends JDialog {
    public addSuccess(){
        Container container=this.getContentPane();
        JLabel jLabel=new JLabel("Add successful");
        jLabel.setBounds(50,30,100,30);
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
