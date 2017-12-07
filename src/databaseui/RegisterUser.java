/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
/**
 *
 * @author leewi
 */
public class RegisterUser extends JFrame{
    JMenu returnMenu;
JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,s1,s2,s3,labelID;
JPanel panel;
//JFrame jf;
JButton register;
JTextField textfield1,textfield2,textfield3,textfield4a,textfield4b,textfield4c,textfield5,textfield6,textfield7,textfield8,textfield9,textfieldtest;
JPasswordField passwordfield1;
JRadioButton radiobutton2,radiobutton3;
String username,password,email;
JComboBox combobox1;
int index,count;

    public RegisterUser(){
       setTitle("Register");
        setSize(700,500);
        setResizable(false);
        setLocation(0, 0);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cpane = getContentPane();
 //       cpane.setLayout(new FlowLayout());
        cpane.setLayout(null);
//        
      CreateReturnMenu();
        //Create Menu Bar
       JMenuBar menuBar = new JMenuBar();
     menuBar.add(returnMenu);
//        
        cpane.add(menuBar);
      setJMenuBar(menuBar);
        
           
                panel=new javax.swing.JPanel();
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                panel.setLayout(null);
                //header
                label1=new javax.swing.JLabel("Register");
                label1.setFont(new Font("Dialog", Font.ITALIC, 24));
                label1.setBounds(300,20,400,40);
                panel.add(label1);
                    cpane.add(label1);
                    //usrname label
                label2=new javax.swing.JLabel("Username");
                label2.setFont(new Font("Dialog", Font.BOLD, 20));
                label2.setBounds(100,80,150,40);
                panel.add(label2);
                    cpane.add(label2);
                    //Password label (gender)
                label3=new javax.swing.JLabel("Gender");
                label3.setFont(new Font("Dialog", Font.BOLD, 20));
                label3.setBounds(100,140,150,40);
                panel.add(label3);
cpane.add(label3);
                    //email (password)
                label4=new javax.swing.JLabel("Password");
                label4.setFont(new Font("Dialog", Font.BOLD, 20));
                label4.setBounds(100,200,150,40);
                panel.add(label4);
cpane.add(label4);
                label5=new javax.swing.JLabel("E-mail");
                label5.setFont(new Font("Dialog", Font.BOLD, 20));
                label5.setBounds(100,260,150,40);
                panel.add(label5);
cpane.add(label5);

                labelID=new javax.swing.JLabel("UserID");
                labelID.setFont(new Font("Dialog", Font.BOLD, 20));
                labelID.setBounds(100,320,150,40);
                
                panel.add(labelID);
cpane.add(labelID);

                //Username textField
                textfield1=new javax.swing.JTextField();
                textfield1.setFont(new Font("Dialog", Font.BOLD, 16));
                textfield1.setBounds(350,80,180,30);
                panel.add(textfield1);
cpane.add(textfield1);

                label10=new javax.swing.JLabel("Male");
                label10.setFont(new Font("Dialog", Font.BOLD, 20));
                label10.setBounds(350,140,60,40);
                panel.add(label10);
cpane.add(label10);
                label11=new javax.swing.JLabel("Female");
                label11.setFont(new Font("Dialog", Font.BOLD, 20));
                label11.setBounds(460,140,100,40);
                panel.add(label11);
cpane.add(label11);

                radiobutton2=new javax.swing.JRadioButton();
                radiobutton2.setFont(new Font("Dialog", Font.BOLD, 16));
                radiobutton2.setBounds(420,140,20,30);
                panel.add(radiobutton2);
cpane.add(radiobutton2);
                radiobutton3=new javax.swing.JRadioButton();
                radiobutton3.setFont(new Font("Dialog", Font.BOLD, 16));
                radiobutton3.setBounds(570,140,20,30);
                panel.add(radiobutton3);
cpane.add(radiobutton3);
                ButtonGroup jb = new ButtonGroup();
                jb.add(radiobutton2);
                jb.add(radiobutton3);
                
                    //password text field
                textfield3=new javax.swing.JPasswordField();
                textfield3.setFont(new Font("Dialog", Font.BOLD, 16));
                textfield3.setBounds(350,200,180,30);
                panel.add(textfield3);
cpane.add(textfield3);
                //email text box
                textfield5 = new JTextField();
                textfield5.setBounds(350,260,230,30);
                textfield5.setFont(new Font("Dialog", Font.BOLD, 16));
                panel.add(textfield5);
                cpane.add(textfield5);

            //ID
               textfield6=new javax.swing.JTextField();
                textfield6.setFont(new Font("Dialog", Font.BOLD, 16));
                textfield6.setBounds(350,330,200,30);
                textfield6.setEditable(false);
                panel.add(textfield6);
cpane.add(textfield6);

                register = new javax.swing.JButton("Register");
                register.setFont(new Font("Dialog", Font.BOLD, 16));
                register.setBounds(280,380,100,30);
                panel.add(register);
cpane.add(register);

register.addActionListener((ActionEvent ev) -> {
            User user1 = new User();
                user1.setUsername(textfield1.getText());
                   user1.setPassword(textfield3.getText());
                   user1.setEmail(textfield5.getText());
                JOptionPane.showMessageDialog(null,"Successfully Registered User "+user1.getUsername()+" with password '"+user1.getPassword()+"' \nAnd email "+user1.getEmail());
                DatabaseUI database = new DatabaseUI();
            database.setVisible(true);
            this.setVisible(false);
            this.dispose();
        });
        
}

    private void CreateReturnMenu() {
        
        returnMenu = new JMenu();
        returnMenu.setText("File");
        JMenuItem returnItem = new JMenuItem("Return to home page");
        returnMenu.add(returnItem);
        
        returnItem.addActionListener((ActionEvent ev) -> {
            DatabaseUI database = new DatabaseUI();
            database.setVisible(true);
            this.setVisible(false);
            this.dispose();
            
        });
    }
}
