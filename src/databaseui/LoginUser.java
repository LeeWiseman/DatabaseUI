
package databaseui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LoginUser extends JFrame{
    public static int ActiveUserID;
    JMenu returnMenu;
    JLabel label1, label2, label3;
    JButton register;
    JTextField textfield1;
    JPasswordField passwordfield1;
    JButton login;
    
    public LoginUser(){
        setTitle("Login");
        setSize(700,480);
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
      cpane.add(menuBar);
      setJMenuBar(menuBar);
                //title
                label1=new javax.swing.JLabel("Login");
                label1.setFont(new Font("Dialog", Font.ITALIC, 24));
                label1.setBounds(300,20,400,40);
                cpane.add(label1);
                
                //username
                label2=new javax.swing.JLabel("Username");
                label2.setFont(new Font("Dialog", Font.BOLD, 20));
                label2.setBounds(100,80,150,40);
                    cpane.add(label2);
                    //username text field
                     textfield1=new javax.swing.JTextField();
                     textfield1.setFont(new Font("Dialog", Font.BOLD, 16));
                     textfield1.setBounds(350,80,180,30);
                     cpane.add(textfield1);
                     
                     passwordfield1=new javax.swing.JPasswordField();
                passwordfield1.setFont(new Font("Dialog", Font.BOLD, 16));
                passwordfield1.setBounds(350,200,180,30);            
                cpane.add(passwordfield1);
                
                 label3=new javax.swing.JLabel("Password");
                label3.setFont(new Font("Dialog", Font.BOLD, 20));
                label3.setBounds(100,200,150,40);
                
                cpane.add(label3);
                     
                     login = new javax.swing.JButton("Login");
                    login.setFont(new Font("Dialog", Font.BOLD, 16));
                    login.setBounds(280,380,100,30);
                    cpane.add(login);

login.addActionListener((ActionEvent ev) -> {
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
    public static void setActiveUserID(int id){
        int ActiveUserID = id;
    }
    
    public static int getActiveUserID(){
        return ActiveUserID;
    }
}
