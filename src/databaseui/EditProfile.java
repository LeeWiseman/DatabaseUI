
package databaseui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EditProfile extends JFrame{
JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,s1,s2,s3,labelID;
JPanel panel;
JButton done, jb1,jb2,jb3,jb4;
JTextField textfield1,textfield2,textfield3,textfield4a,textfield4b,textfield4c,textfield5,textfield6,textfield7,textfield8,textfield9,textfieldtest;
JPasswordField passwordfield1;
JRadioButton radiobutton2,radiobutton3;
String username,password,email;
JComboBox combobox1;
JMenu returnMenu;
int index,count;
public EditProfile(){
     setTitle("Update Info");
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
                
                //Header
                label1=new javax.swing.JLabel("Update Info");
                label1.setFont(new Font("Dialog", Font.ITALIC, 24));
                label1.setBounds(300,20,400,40);
                panel.add(label1);
                cpane.add(label1);
                    
                //Username Label
                label2=new javax.swing.JLabel("Username");
                label2.setFont(new Font("Dialog", Font.BOLD, 20));
                label2.setBounds(50,80,150,40);
                panel.add(label2);
                    cpane.add(label2);

                //Password Label
                label4=new javax.swing.JLabel("Password");
                label4.setFont(new Font("Dialog", Font.BOLD, 20));
                label4.setBounds(50,130,150,40);
                panel.add(label4);
                cpane.add(label4);
                
                //Email Label
                label5=new javax.swing.JLabel("E-mail");
                label5.setFont(new Font("Dialog", Font.BOLD, 20));
                label5.setBounds(50,180,150,40);
                panel.add(label5);
                cpane.add(label5);
                
                //User ID Label
                labelID=new javax.swing.JLabel("UserID");
                labelID.setFont(new Font("Dialog", Font.BOLD, 20));
                labelID.setBounds(50,230,150,40);
                panel.add(labelID);
                cpane.add(labelID);

                //Username Text Box
                textfield1=new javax.swing.JTextField();
                textfield1.setFont(new Font("Dialog", Font.BOLD, 16));
                textfield1.setBounds(200,80,200,30);
                textfield1.setEditable(false);
                panel.add(textfield1);
                cpane.add(textfield1);
                jb1 = new JButton("Edit");
                jb1.setBounds(400,80,60,30);
                jb1.setVisible(true);
                cpane.add(jb1);
                
                jb1.addActionListener((ActionEvent ev) -> {
                    String newUsername;
                    newUsername = JOptionPane.showInputDialog("What is your new username ?");
                    textfield1.setText(newUsername);
        });

                
                    //Password Text Box
                textfield3=new javax.swing.JPasswordField();
                textfield3.setFont(new Font("Dialog", Font.BOLD, 16));
                textfield3.setBounds(200,130,200,30);
                textfield3.setEditable(false);
                panel.add(textfield3);
                cpane.add(textfield3);
                jb2 = new JButton("Edit");
                jb2.setBounds(400,130,60,30);
                jb2.setVisible(true);
                cpane.add(jb2);
                jb2.addActionListener((ActionEvent ev) -> {
                    String newPassword;
                    newPassword = JOptionPane.showInputDialog("What is your new password ?");
                    textfield3.setText(newPassword);
        });
                
                //email text box
                textfield5 = new JTextField();
                textfield5.setFont(new Font("Dialog", Font.BOLD, 16));
                textfield5.setBounds(200,180,200,30);
                textfield5.setEditable(false);
                panel.add(textfield5);
                cpane.add(textfield5);
                jb3 = new JButton("Edit");
                jb3.setBounds(400,180,60,30);
                jb3.setVisible(true);
                cpane.add(jb3);
                jb3.addActionListener((ActionEvent ev) -> {
                    String newEmail;
                    newEmail = JOptionPane.showInputDialog("What is your new email ?");
                    textfield5.setText(newEmail);
        });

            //ID
               textfield6=new javax.swing.JTextField();
                textfield6.setFont(new Font("Dialog", Font.BOLD, 16));
                textfield6.setBounds(200,230,100,30);
                textfield6.setEditable(false);
                panel.add(textfield6);
cpane.add(textfield6);

                done = new javax.swing.JButton("Finish");
                done.setFont(new Font("Dialog", Font.BOLD, 16));
                done.setBounds(280,380,100,30);
                panel.add(done);
cpane.add(done);

done.addActionListener((ActionEvent ev) -> {
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
