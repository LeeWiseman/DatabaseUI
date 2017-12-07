
package databaseui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Array;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class CommentEditor extends JFrame{
    JTextArea textfield1;
    JButton button;
    JLabel label1;
     public CommentEditor(){
         setTitle("Edit Comments");
        setSize(700,350);
        setResizable(true);
        setLocation(0, 0);
        setLocationRelativeTo(null);
        Container cpane = getContentPane();
        cpane.setLayout(null);
        
        label1=new javax.swing.JLabel("Edit Comment");
                label1.setFont(new Font("Dialog", Font.ITALIC, 24));
                label1.setBounds(300,20,400,40);
                cpane.add(label1);
                
                    textfield1= new JTextArea();
                    textfield1.setBounds(100,100,500,100);
                    String commentEdit = UpdateCommentsPage.getCommentContent();
                    textfield1.setText(commentEdit);
                    textfield1.setEditable(true);
                    
                    cpane.add(textfield1);
                       
                    button = new javax.swing.JButton("Post");
                    button.setFont(new Font("Dialog", Font.BOLD, 16));
                    button.setBounds(300,250,100,30);
                    cpane.add(button);
                    
                    button.addActionListener((ActionEvent ev) -> {
                        //edit comment
                            
                         });
                    
                       
        

        
     }
}
