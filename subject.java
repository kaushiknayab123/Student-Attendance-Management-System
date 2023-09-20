/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_attendance_management_system;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author kumar
 */
public class subject extends javax.swing.JFrame {

    private javax.swing.JTextField a;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField s;
 
    public subject() {
        initComponents();
        this.setResizable(false);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        s = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subject");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add or Remove Subject");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1, -4, 600, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Subject Code");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 150, 170, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Subject Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 300, 180, 50);

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a);
        a.setBounds(250, 160, 250, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 470, 140, 50);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 470, 140, 50);
        jPanel1.add(s);
        s.setBounds(250, 310, 260, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("REMOVE");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(240, 470, 140, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_attendance_management_system/5.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 600, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        faculty nw=new faculty();
        nw.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1=a.getText();
        String s2=s.getText();
        try{
            if(s1.length()==0 || s2.length()==0)
            {

                JOptionPane.showMessageDialog(null, "Some fields are EMPTY!!!");
            }
            else
            {
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
                PreparedStatement ps = con.prepareStatement("insert into subject values(?,?)");
					ps.setString(1, s1);
					ps.setString(2, s2);
					ps.executeUpdate();
					{
						JOptionPane.showMessageDialog(null, "Subject added successfully");
					}
            }
        }
        catch (HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }        
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String s1=a.getText();
        try{  
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
                String sql2 = "DELETE FROM subject WHERE subcode = ?";
               PreparedStatement statement1 = con.prepareStatement(sql2);
               statement1.setString(1, s1);
               int rowsDeleted = statement1.executeUpdate();
               if (rowsDeleted > 0)
               {
                    JOptionPane.showMessageDialog(null, "Subject details removed successfully");
               }  
        }
        catch (HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subject().setVisible(true);
            }
        });
    }

}
