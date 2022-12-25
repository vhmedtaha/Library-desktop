
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;


public class EditProfile extends javax.swing.JFrame {

    /**
     * Creates new form editProfile
     */
    public EditProfile() {
        initComponents();
        txtUsername.setText(Library.getUsernameId());
        txtEmail.setText(Library.getEmailId());
        txtPhone.setText(Library.getPhoneId());
        txtName.setText(Library.getNameId());
        txtPassword.setText(Library.getPasswordId());
        imgShow.setIcon(ResizeImage(Library.getPathId()));
        System.out.println(Library.getPathId());
    }
    
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(220, 280,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        UserPhoto = new javax.swing.JLabel();
        CancelButton = new javax.swing.JPanel();
        Cancel = new javax.swing.JLabel();
        SaveButton = new javax.swing.JPanel();
        Save = new javax.swing.JLabel();
        imgShow = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titlebar = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        Buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        ButtonMin = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(38, 42, 66));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("PT2022");
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("User name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtUsername.setText("User Name");
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("peter@gmail.com");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 210, -1));
        jPanel1.add(UserPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 230));

        CancelButton.setBackground(new java.awt.Color(0, 141, 190));
        CancelButton.setForeground(new java.awt.Color(0, 133, 206));
        CancelButton.setLayout(new java.awt.BorderLayout());

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancel.setForeground(new java.awt.Color(242, 242, 242));
        Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel.setText("Cancel");
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
        });
        CancelButton.add(Cancel, java.awt.BorderLayout.CENTER);

        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 160, 30));

        SaveButton.setBackground(new java.awt.Color(0, 141, 190));
        SaveButton.setForeground(new java.awt.Color(0, 133, 206));
        SaveButton.setLayout(new java.awt.BorderLayout());

        Save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(242, 242, 242));
        Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Save.setText("Save");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveMouseExited(evt);
            }
        });
        SaveButton.add(Save, java.awt.BorderLayout.CENTER);

        jPanel1.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 160, 30));

        imgShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgShow.setPreferredSize(new java.awt.Dimension(210, 290));
        jPanel1.add(imgShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 220, 280));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Phone:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(204, 204, 204));
        txtPhone.setText("PT2022");
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setText("Name");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 80, 30));

        updateBtn1.setText("Update");
        updateBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtn1MouseClicked(evt);
            }
        });
        jPanel1.add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 80, 30));

        jPanel2.setBackground(new java.awt.Color(0, 141, 190));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Profile");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        titlebar.setBackground(new java.awt.Color(83, 103, 255));
        titlebar.setPreferredSize(new java.awt.Dimension(800, 40));
        titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titlebarMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titlebarMouseReleased(evt);
            }
        });
        titlebar.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(83, 103, 255));
        iconminmaxclose.setPreferredSize(new java.awt.Dimension(150, 50));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonclose.setBackground(new java.awt.Color(83, 103, 255));
        Buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Buttonclose.add(close, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 40));

        ButtonMin.setBackground(new java.awt.Color(83, 103, 255));
        ButtonMin.setLayout(new java.awt.BorderLayout());

        minimize.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(242, 242, 242));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        ButtonMin.add(minimize, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(ButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 40));

        titlebar.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        getContentPane().add(titlebar, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(753, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CancelMouseClicked

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        changecolor(CancelButton, new Color(204, 204, 204));
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        changecolor(CancelButton, new Color(0, 133, 206));
    }//GEN-LAST:event_CancelMouseExited
    
    public boolean isGood(String...  s) {
        boolean x = true;
        for (String str : s)    x &= !str.isEmpty();
        return x;
    }
    
    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        String usernameLow = txtUsername.getText().toLowerCase();
        String emailLow = txtEmail.getText().toLowerCase();
        System.out.println(filename);
        
        System.out.println("test: "+filename);  
        if(!imgChanged && txtName.getText().equals(Library.getNameId()) && emailLow.equals(Library.getEmailId()) && usernameLow.equals(Library.getUsernameId()) && txtPassword.getText().equals(Library.getPasswordId()) && txtPhone.getText().equals(Library.getPhoneId())) {
            JOptionPane.showMessageDialog(null, "There's nothing to update");
        }      
        else if(isGood(txtName.getText(), usernameLow, emailLow, txtPassword.getText(), txtPhone.getText())) {
            if(imgChanged) {
                if(filename.equals("upload/profileImgs/default.png")) {
                    String statement = "UPDATE persons SET img='upload/profileImgs/default.png' WHERE id='"+Library.getLoginId()+"';";
                    imgShow.setIcon(ResizeImage("upload/profileImgs/default.png"));
                    Library.setPathId("upload/profileImgs/default.png");
                    JOptionPane.showMessageDialog(null, "Update Done");
                    Tools.excecuateStatement(statement);
                    Tools.closeConnection();

                }
                else {
                    try {
                        Integer id = Library.getLoginId();
                        String newPath = "upload/profileImgs/";
                        File dir = new File(newPath);
                        if(!dir.exists()) {
                            dir.mkdirs();
                        }

                        File src = null;
                        File dest = null;

                        String ext = filename.substring(filename.lastIndexOf('.') + 1);
                        src = new File(filename);
                        String fileNewName = newPath + id + '.' + ext;
                        dest = new File(fileNewName);
                        Library.setPathId(fileNewName);
                        File file = new File(Library.getPathId());
                        System.out.println(Library.getPathId());
                        
                        if (!Library.getPathId().equals("upload/profileImgs/default.png") && file.delete()) {
                            System.out.println("File deleted successfully");
                        }
                        else {
                            System.out.println("Failed to delete the file");
                        }
                        String st = newPath + "/dssssa." + ext;
                        System.out.println(st);

                        Files.copy(src.toPath(), dest.toPath());
                        String statement = "UPDATE persons SET img='"+fileNewName+"' WHERE id='"+id+"';";
                        JOptionPane.showMessageDialog(null, "Update Done");
                        Tools.excecuateStatement(statement);
                        Tools.closeConnection();
                    } catch (IOException ex) {
                        Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if(!(txtName.getText().equals(Library.getNameId()) && emailLow.equals(Library.getEmailId()) && usernameLow.equals(Library.getUsernameId()) && txtPassword.getText().equals(Library.getPasswordId()) && txtPhone.getText().equals(Library.getPhoneId()))) {
                String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(emailLow);
                if(!matcher.matches()) {
                    JOptionPane.showMessageDialog(null, "Invalid Email", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String username = "SELECT * FROM persons WHERE username='"+ usernameLow+"' AND id!='"+Library.getLoginId()+"';";
                String email = "SELECT * FROM persons WHERE email='"+ emailLow+"' AND id!='"+Library.getLoginId()+"';";
                Tools.connectionToSql();
                ResultSet userRs = Tools.selectQuery(username);
                ResultSet emailRs = Tools.selectQuery(email);
                try {
                    boolean uniUser = userRs.next();
                    boolean uniEmail = emailRs.next();
                    System.out.println(uniUser + " "+ txtEmail.getText());
                    if(uniUser && uniEmail) {
                        JOptionPane.showMessageDialog(null, "User and Email already Exists", "Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    else if(uniUser) {
                        JOptionPane.showMessageDialog(null, "User already Exists", "Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    } 
                    else if(uniEmail) {
                        JOptionPane.showMessageDialog(null, "Email already Exists", "Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    else {
                        String statement = "UPDATE persons SET username='"+usernameLow+"', email='"+emailLow+"', name='"+txtName.getText()+"', password='"+txtPassword.getText()+"', phone='"+txtPhone.getText()+"' WHERE id='"+Library.getLoginId()+"';";
                        boolean check = Tools.excecuateStatement(statement);
                        Tools.closeConnection();
                        if(check) {
                            JOptionPane.showMessageDialog(null, "Update is Done");
                            Library.setUsernameId(usernameLow);
                            Library.setEmailId(emailLow);
                            Library.setNameId(txtName.getText());
                            Library.setPhoneId(txtPhone.getText());
                            Library.setPasswordId(txtPassword.getText());
                        }
                        this.dispose();         
                        Profile main = new Profile() ; 
                        main.setVisible(true);
                    }
                    
                } catch(Exception ex) {

                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "All Fields Required", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveMouseClicked

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        changecolor(SaveButton, new Color(204, 204, 204));
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        changecolor(SaveButton, new Color(0, 133, 206));
    }//GEN-LAST:event_SaveMouseExited

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void updateBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn1MouseClicked
        imgChanged = true; 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            imgShow.setIcon(ResizeImage(path));
            filename = selectedFile.getAbsolutePath();
           }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Data");
        }
    }//GEN-LAST:event_updateBtn1MouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        imgChanged = true; 
        Integer id = Library.getLoginId();
        String fileNewName = "upload/profileImgs/default.png";
        filename = "upload/profileImgs/default.png";
        Library.setPathId(fileNewName);
        imgShow.setIcon(ResizeImage(fileNewName));
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(Buttonclose, new Color(25, 29, 74));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(Buttonclose, new Color(83, 103, 255));
    }//GEN-LAST:event_closeMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setExtendedState(Mainmenu.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        changecolor(ButtonMin, new Color(25, 29, 74));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        changecolor(ButtonMin, new Color(83, 103, 255));
    }//GEN-LAST:event_minimizeMouseExited

    private void titlebarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseEntered
        titlebar.setVisible(true);
    }//GEN-LAST:event_titlebarMouseEntered

    private void titlebarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_titlebarMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonMin;
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JLabel Cancel;
    private javax.swing.JPanel CancelButton;
    private javax.swing.JLabel Save;
    private javax.swing.JPanel SaveButton;
    private javax.swing.JLabel UserPhoto;
    private javax.swing.JLabel close;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JLabel imgShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel titlebar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
    String filename = null;
    Boolean imgChanged = false;
}
