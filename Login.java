
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        jLabel2.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(41, 54, 80));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 30, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabel2.setText("Incrote UsearName or Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jTextField1.setBackground(new java.awt.Color(41, 54, 80));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 118, 221));
        jTextField1.setText("Enter Usearname");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 340, -1));

        jPasswordField1.setBackground(new java.awt.Color(41, 54, 80));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 118, 221));
        jPasswordField1.setText("Enter Password");
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 340, 20));

        jCheckBox1.setBackground(new java.awt.Color(41, 54, 80));
        jCheckBox1.setForeground(new java.awt.Color(41, 54, 80));
        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background1.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1370, 770));

        resetButton.setBackground(new java.awt.Color(41, 54, 80));
        resetButton.setText("Reset");
        resetButton.setBorder(null);
        resetButton.setOpaque(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 60, 30));

        loginButton.setBackground(new java.awt.Color(41, 54, 80));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        loginButton.setText("login");
        loginButton.setBorder(null);
        loginButton.setOpaque(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 485, 60, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int a=JOptionPane.showConfirmDialog(null,"Are you sure you went to exit now","Select",JOptionPane.YES_NO_OPTION);
      if(a==0)
      {
          System.exit(0);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jLabel2.setVisible(false);
        if(jTextField1.getText().equals("Enter Usearname"))
        {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jLabel2.setVisible(false);
        if(jTextField1.getText().equals(""))
        {
            jTextField1.setText("Enter Usearname");
            jTextField1.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jLabel2.setVisible(false);
        if(jPasswordField1.getText().equals("Enter Password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        jLabel2.setVisible(false);
        if(jPasswordField1.getText().equals(""))
        {
            jPasswordField1.setText("Enter Password");
            jPasswordField1.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected())
       {
           jPasswordField1.setEchoChar((char)0);
       }
       else
       {
           jPasswordField1.setEchoChar('*');
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
         if(jTextField1.getText().equals("admin")&& jPasswordField1.getText().equals("12345"))
         {
             setVisible(false);
             new Home().setVisible(true);
         }
         else
         {
             jLabel2.setVisible(true);
         }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       jTextField1.setText("");
       jPasswordField1.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
