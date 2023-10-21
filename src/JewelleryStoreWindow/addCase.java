package JewelleryStoreWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addCase extends JDialog {
    public static String caseIdentifier;
    public  static String CaseType;
    public static boolean isLight=false;
    public addCase(){JLabel jLabel=new JLabel("addCase");
        jLabel.setBounds(30,10,100,20);

        JLabel jLabel1=new JLabel("Identifier:");
        jLabel1.setBounds(30,50,100,20);
        JTextField textField=new JTextField();
        textField.setBounds(150,50,100,20);
         caseIdentifier=textField.getText();
        System.out.println(caseIdentifier);

        JLabel jLabel2=new JLabel("Type:");
        jLabel2.setBounds(30,100,100,20);
        TextField textField1=new TextField();
        textField1.setBounds(150,100,100,20);
         CaseType=textField1.getText();
        System.out.println(CaseType);

        JLabel jLabel3=new JLabel("IsLighted");
        jLabel3.setBounds(30,140,100,20);


        JRadioButton radioButton =new JRadioButton("yes");
        radioButton.setBounds(70,140,50,20);
        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLight=true;
            }
        });
        JRadioButton radioButton1=new JRadioButton("no");
        radioButton1.setBounds(100,140,50,20);
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLight=false;
            }
        });

        ButtonGroup group=new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton);

        JButton jButton=new JButton("ADD");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseIdentifier=textField.getText();
                CaseType=textField1.getText();
                System.out.println(caseIdentifier+CaseType+isLight);
                dispose();
                //if(){
                new addSuccess();
                //}else{
                new addFailed();
                //}添加成功时，添加失败是所弹得弹窗
            }
        });
        jButton.setBounds(120,230,60,30);

        Container container=this.getContentPane();
        container.setLayout(null);
        container.add(jLabel);
        container.add(jLabel1);
        container.add(jLabel2);
        container.add(jLabel3);
        container.add(textField);
        container.add(textField1);
        container.add(jButton);
        container.add(radioButton1);
        container.add(radioButton);
        this.setVisible(true);
        this.setSize(300,350);
        this.setResizable(false);

    }
}
