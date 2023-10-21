package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addJewellery extends JDialog {
    public  static String  description;
    public static String type;
    public static String gender;
    public static int price;

    public addJewellery(){
        Container container=this.getContentPane();
        this.setVisible(true);
        container.setLayout(null);
        this.setSize(600,700);

        JLabel jLabel=new JLabel("add item");
        jLabel.setFont(new Font("Arial",Font.BOLD,30));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);  // 居中设置
        jLabel.setBounds(0, 0, 400, 70);

        JPanel jPanel=new JPanel(new GridLayout(5,2));
        jPanel.setBounds(80,80,400,300);
        JLabel jLabel1=new JLabel("description");
        JLabel jLabel2=new JLabel("type");
        JLabel jLabel3=new JLabel("gender");
        JLabel jLabel4=new JLabel("price");
        JLabel jLabel5=new JLabel("imageURL");
        JTextField jTextField=new JTextField();
        JTextField jTextField1=new JTextField();
        JTextField jTextField2=new JTextField();
        JTextField jTextField3=new JTextField();
        JTextField jTextField4=new JTextField();

        jPanel.add(jLabel1);
        jPanel.add(jTextField);
        jPanel.add(jLabel2);
        jPanel.add(jTextField1);
        jPanel.add(jLabel3);
        jPanel.add(jTextField2);
        jPanel.add(jLabel4);
        jPanel.add(jTextField3);
        jPanel.add(jLabel5);
        jPanel.add(jTextField4);




        JPanel jPanel1=new JPanel(new GridLayout(1,2));
        jPanel1.setBounds(30,540,540,60);
        JButton jButton=new JButton("add");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addSuccess();
                new addFailed();
                description=jTextField.getText();
                type=jTextField1.getText();
                gender=jTextField2.getText();
                price=Integer.parseInt(jTextField3.getText());
                description=jTextField.getText();
                System.out.println(description+"+"+type+"+"+gender+"+"+price);

                dispose();
            }
        });
        JButton jButton1=new JButton("add components");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
        jPanel1.add(jButton);
        jPanel1.add(jButton1);


        container.add(jLabel);
        container.add(jPanel);
        container.add(jPanel1);
    }
}
