
package databaseui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DatabaseUI extends JFrame{
    //initialize UI elements
private JMenu updateMenu;
private JMenu userMenu;
private JMenu deleteMenu;




 public DatabaseUI(){
     //Sets Attributes of main GUI
        setTitle("Stumblr");
        setSize(1000, 650);
        setResizable(false);
        setLocation(0, 0);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cpane = getContentPane();
        cpane.setLayout(new FlowLayout());
        JLabel label = new JLabel("STUMBLR");
        label.setFont(new Font("Dialog",Font.BOLD,24));
        cpane.add(label);
        CreateUserMenu();
        CreateUpdateMenu();
        CreateDeleteMenu();
        
        //Create Menu Bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(userMenu);
        menuBar.add(updateMenu);
        menuBar.add(deleteMenu);
        cpane.add(menuBar);
        setJMenuBar(menuBar);
        
        
        
 }
  

    private void CreateDeleteMenu() {
        deleteMenu = new JMenu();
        JMenuItem deleteComment = new JMenuItem("Delete Comment");
        JMenuItem deleteProfile = new JMenuItem("Delete Profile");
        
        deleteMenu.add(deleteComment);
        deleteMenu.add(deleteProfile);
        
        deleteMenu.setText("Delete");
        
        deleteComment.addActionListener((ActionEvent ev) -> {
            DeleteComment del = new DeleteComment();
            del.setVisible(true);
            this.setVisible(false);
            this.dispose();
        });
        
        deleteProfile.addActionListener((ActionEvent ev) -> {
            DeleteProfile del = new DeleteProfile();
            del.setVisible(true);
            this.setVisible(false);
            this.dispose();
        });
                }         
                

    private void CreateUserMenu() {
        
        userMenu = new JMenu();
        JMenuItem newUser = new JMenuItem("Register");
        JMenuItem login = new JMenuItem("Login");
        JMenuItem comment = new JMenuItem("Make Comment");
        userMenu.add(newUser);
        userMenu.add(login);
        userMenu.add(comment);
        userMenu.setText("User");
        
        newUser.addActionListener((ActionEvent ev) -> {
            RegisterUser userpage = new RegisterUser();
            userpage.setVisible(true);
            this.setVisible(false);
            this.dispose();
            
        });
        
        login.addActionListener((ActionEvent ev) -> {
            LoginUser loginpage = new LoginUser();
            loginpage.setVisible(true);
            this.setVisible(false);
            this.dispose();
        });
        
        comment.addActionListener((ActionEvent ev) -> {
            MakeComment commentpage = new MakeComment();
            commentpage.setVisible(true);
            this.setVisible(false);
            this.dispose();
        });

            }

    private void CreateUpdateMenu() {
        updateMenu = new JMenu();
        JMenuItem editComment = new JMenuItem("Edit Comments");
        JMenuItem editProfile = new JMenuItem("Edit Your Profile");
        updateMenu.add(editComment);
        updateMenu.add(editProfile);
        updateMenu.setText("Update");
        
        editComment.addActionListener((ActionEvent ev) -> {
            UpdateCommentsPage ucommentpage = new UpdateCommentsPage();
            ucommentpage.setVisible(true);
            this.setVisible(false);
            this.dispose();
        });
        
        editProfile.addActionListener((ActionEvent ev) -> {
            //edit profile action here
            EditProfile editprofile = new EditProfile();
            editprofile.setVisible(true);
            this.setVisible(false);
            this.dispose();
        });
    }
    
      public static void main(String[] args) {
        DatabaseUI ui = new DatabaseUI();
        ui.setVisible(true);

    }
}   

