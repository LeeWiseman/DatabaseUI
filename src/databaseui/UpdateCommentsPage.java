package databaseui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Array;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class UpdateCommentsPage extends JFrame{
    JMenu returnMenu;
     JLabel label1,label2;
    JButton comment, comment2;
    JTextArea textfield1;
    String[] commentsArray={"Hell yeah","Whats good ma dude","Eat my dick off bro","Yeah Yeah I bet you scumbag","Who the fuck are you bro get out of here please","How can I Help you today you spicolli looking ass"} ;
    JFrame commentsFrame = new JFrame();
    static String editComment;
    
    public UpdateCommentsPage(){
        
        setTitle("Edit Comments");
        setSize(700,800);
        setResizable(true);
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
      //Title
       label1=new javax.swing.JLabel("Comments");
                label1.setFont(new Font("Dialog", Font.ITALIC, 24));
                label1.setBounds(300,20,400,40);
                cpane.add(label1);

                for(int i = 0; i<commentsArray.length;i++){
                    JTextArea textArea = new JTextArea();
                    textArea.setBounds(100,(i*100)+100,450,50);
                    textArea.setText(commentsArray[i]);
                    textArea.setEditable(false);
                    cpane.add(textArea);
                    //add edit comment button
                     comment = new javax.swing.JButton("Edit Comment");
                    comment.setFont(new Font("Dialog", Font.BOLD, 16));
                    comment.setBounds(150,(i*100)+155,300,15);
                    cpane.add(comment);
                    
                    comment.addActionListener((ActionEvent ev) -> {
                        //edit changed comments
                            setCommentContent(textArea.getText());
                            CommentEditor editcom = new CommentEditor();
                            editcom.setVisible(true);
                         });
                    
                       }
                
               
                
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
            
        });    }
    
    public void setCommentContent(String content){
        editComment = content;
    }
    
    public static String getCommentContent(){
        return editComment;
    }
}
