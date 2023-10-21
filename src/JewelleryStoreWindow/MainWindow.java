package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow(){
        Container container=this.getContentPane();
        container.setLayout(null);


        //添加第一个布局及其设置,第一个布局主要管理各种功能键，如addCase，addTray等。。。
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(9, 1));

        JButton jButton1 = new JButton("addNewCase");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addCase();
            }
        });

        JButton jButton2 = new JButton("addNewTray");
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addTray();
            }
        });
        JButton jButton3 = new JButton("addNewJewellery");
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addJewellery();
            }
        });
        JButton jButton4 = new JButton("removeItem");
        JButton jButton6 = new JButton("reset");
        JButton jButton7 = new JButton("save");
        JButton jButton8 = new JButton("load");
        JButton jButton9 = new JButton("ViewAllStack");

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton9);
        jPanel.add(jButton6);
        jPanel.add(jButton7);
        jPanel.add(jButton8);

        jPanel.setBounds(20, 80, 200, 470);


        //第二个布局，第二个布局有一个search框和一个获得当前全部珠宝所值的数额的label
        JPanel jPanel2=new JPanel();
        jPanel2.setLayout(null);
        jPanel2.setBounds(250,100,500,130);

        JLabel jLabel=new JLabel("search Items");
        jLabel.setBounds(10,10,100,20);

        JTextField field=new JTextField();
        field.setBounds(10,40,500,20);

        JLabel jLabel1=new JLabel("Stock value");
        jLabel1.setBounds(10,80,100,20);

        int i=100;//获得当前store里面的全部珠宝所值的数额
        JLabel jLabel2=new JLabel("$"+i);
        jLabel2.setBounds(10,90,100,50);

        pack();

        jPanel2.add(jLabel);
        jPanel2.add(field);
        jPanel2.add(jLabel1);
        this.add(jLabel2);



        //第三个布局，包含case，tray和jewellery
        showCase panel=new showCase();
        JScrollPane jScrollPane=new JScrollPane(panel);
        jScrollPane.setBounds(250,250,500,300);


        //第四个布局，只有个一个大标题
        JLabel label = new JLabel("JEWELLERY STORE");
        label.setFont(new Font("Arial", Font.BOLD, 30));  // 设置字体为粗体，大小为30
        label.setHorizontalAlignment(SwingConstants.CENTER);  // 居中设置
        label.setBounds(0, 0, 800, 70);



        //将第布局添加到JFrame中
        container.add(jPanel);
        container.add(jPanel2);
        container.add(jScrollPane);
        container.add(label);


        //设置JFrame
        this.setVisible(true);
        this.setBounds(200,200,800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
