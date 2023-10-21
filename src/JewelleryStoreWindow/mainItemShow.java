package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;

public class mainItemShow extends JDialog {
    public mainItemShow(){
        Container container=this.getContentPane();
        this.setVisible(true);
        this.setSize(400,600);
        container.setLayout(null);

        JPanel jPanel=new JPanel();
        jPanel.setBounds(10,10,350,30);
        jPanel.setLayout(new FlowLayout());
        JLabel jLabel=new JLabel("Item Show");
        JTextField textField=new JTextField();
        textField.setSize(200,30);

        jPanel.add(jLabel,FlowLayout.LEFT);
        jPanel.add(textField,FlowLayout.CENTER );

        container.add(jPanel);
    }
}
