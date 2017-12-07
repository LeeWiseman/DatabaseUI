package databaseui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MakeComment extends JFrame{
    JMenu returnMenu;
    JLabel label1,label2;
    JButton comment;
    JTextArea textfield1;
    public MakeComment(){
        setTitle("Make Comment");
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
      
      label1=new javax.swing.JLabel("Comments");
                label1.setFont(new Font("Dialog", Font.ITALIC, 24));
                label1.setBounds(300,20,400,40);
                cpane.add(label1);
                
                 label2=new javax.swing.JLabel("Make Comment :");
                label2.setFont(new Font("Dialog", Font.BOLD, 20));
                label2.setBounds(100,80,240,40);
                    cpane.add(label2);
                    
                    textfield1=new javax.swing.JTextArea();
                     textfield1.setFont(new Font("Dialog", Font.BOLD, 16));
                     textfield1.setBounds(100,120,500,200);
                     cpane.add(textfield1);
                     
                    comment = new javax.swing.JButton("Post");
                    comment.setFont(new Font("Dialog", Font.BOLD, 16));
                    comment.setBounds(300,350,100,30);
                    cpane.add(comment);
                    
                    comment.addActionListener((ActionEvent ev) -> {
                        //store comment
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
