package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addTray extends JDialog{
    public static String trayIdentifier;
    public static String trayColor;
    public static int traySizeHeight;
    public static int traySizeWidth;
    public addTray(){
        Container container=this.getContentPane();
        container.setLayout(null);
        this.setSize(800,600);
        this.setVisible(true);

        //第一个布局
        JPanel jPanel=new JPanel();
        jPanel.setBounds(50,30,300,100);
        // jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(null);

        JLabel jLabel=new JLabel("addTray");
        jLabel.setBounds(10,10,60,30);
        jPanel.add(jLabel);



        //第二个布局
        JPanel jPanel1=new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setBounds(50,100,300,400);
        //jPanel1.setBackground(Color.BLUE);

        JLabel jLabel1=new JLabel("choose a case");
        jLabel1.setBounds(10,10,300,50);
        showCase panel=new showCase();
        JScrollPane jScrollPane=new JScrollPane(panel);
        jScrollPane.setBounds(10,70,300,300);

        jPanel1.add(jLabel1);
        jPanel1.add(jScrollPane);


        //添加第三个布局
        JPanel jPanel2=new JPanel();
        jPanel2.setBounds(400,30,200,500);
        jPanel2.setLayout(null);
        //jPanel2.setBackground(Color.green);


        JLabel jLabel2=new JLabel("identifier");
        jLabel2.setBounds(10,10,50,30);
        JLabel jLabel3=new JLabel("color");
        jLabel3.setBounds(10,50,50,30);
        JLabel jLabel4=new JLabel("SizeHeight");
        jLabel4.setBounds(10,90,50,30);
        JLabel jLabel5=new JLabel("SizeWidth");
        jLabel5.setBounds(10,130,50,30);

        TextField textField=new TextField();
        textField.setBounds(70,10,50,030);
        TextField textField1=new TextField();
        textField1.setBounds(70,50,50,030);
        TextField textField2=new TextField();
        textField2.setBounds(70,90,50,030);
        TextField textField3=new TextField();
        textField3.setBounds(70,130,50,030);

        JButton jButton1=new JButton("ADD");
        jButton1.setBounds(100,400,60,50);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trayIdentifier=textField.getText();
                trayColor=textField1.getText();
                traySizeHeight=Integer.parseInt(textField2.getText());
                traySizeWidth=Integer.parseInt(textField3.getText());
                System.out.println(trayIdentifier+"+"+trayColor+"+"+traySizeHeight+"+"+traySizeWidth);
                dispose();
                //if(){
                new addSuccess();
                //}else{
                new addFailed();
                //}添加成功时，添加失败是所弹得弹窗
            }
        });

        jPanel2.add(jLabel2);
        jPanel2.add(jLabel3);
        jPanel2.add(jLabel4);
        jPanel2.add(jLabel5);
        jPanel2.add(textField);
        jPanel2.add(textField1);
        jPanel2.add(textField2);
        jPanel2.add(textField3);
        jPanel2.add(jButton1);


        container.add(jPanel);
        container.add(jPanel1);
        container.add(jPanel2);

    }
}
