package Interfaces;

import Classes.General.Button;
import Classes.UserLogin.*;
import javax.swing.ImageIcon;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

public class UserLogin extends javax.swing.JFrame {
    
   private ListUserLogin userLogin;
   Classes.UserLogin.UserLoginXML ob = new Classes.UserLogin.UserLoginXML();

   public UserLogin() 
   {
      initComponents();
      this.setResizable(false);
      ob.loadUserLoginXML();
      setIconImage(new ImageIcon(getClass().getResource("/Images/Login.png")).getImage());
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLoginPanel = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPwd = new javax.swing.JLabel();
        jBtnLogin = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jTxtUserName = new javax.swing.JTextField();
        jTxtPwd = new javax.swing.JTextField();
        jLabelPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Infinity Real Estates");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelUserName.setText("User Name");

        jLabelPwd.setText("Password");

        jBtnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBtnLogin.setText("Login");
        jBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnLoginMouseExited(evt);
            }
        });
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });

        jBtnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnCancel.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancel.setText("Cancel");
        jBtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnCancelMouseExited(evt);
            }
        });
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jLabelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginPic.png"))); // NOI18N

        javax.swing.GroupLayout jLoginPanelLayout = new javax.swing.GroupLayout(jLoginPanel);
        jLoginPanel.setLayout(jLoginPanelLayout);
        jLoginPanelLayout.setHorizontalGroup(
            jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginPanelLayout.createSequentialGroup()
                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLoginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPicture))
                    .addGroup(jLoginPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLoginPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLoginPanelLayout.createSequentialGroup()
                                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUserName)
                                    .addComponent(jLabelPwd))
                                .addGap(54, 54, 54)
                                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtUserName)
                                    .addComponent(jTxtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jLoginPanelLayout.setVerticalGroup(
            jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserName))
                .addGap(18, 18, 18)
                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLogin)
                    .addComponent(jBtnCancel))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
      // Start, Button formatting
      jBtnLogin.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnCancel.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      // End, Button formatting
    }//GEN-LAST:event_formWindowOpened

    private void jBtnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLoginMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnLogin, "Entry");
    }//GEN-LAST:event_jBtnLoginMouseEntered

    private void jBtnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLoginMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnLogin, "Exit");
    }//GEN-LAST:event_jBtnLoginMouseExited

    private void jBtnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCancelMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnCancel, "Entry");
    }//GEN-LAST:event_jBtnCancelMouseEntered

    private void jBtnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCancelMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnCancel, "Exit");
    }//GEN-LAST:event_jBtnCancelMouseExited

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnLoginActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
      this.dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

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
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;

            javax.swing.UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelWin");
            javax.swing.UIManager.put("RootPane.setupButtonVisible", false);

        } catch (javax.swing.UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPwd;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jLoginPanel;
    private javax.swing.JTextField jTxtPwd;
    private javax.swing.JTextField jTxtUserName;
    // End of variables declaration//GEN-END:variables
    
}
