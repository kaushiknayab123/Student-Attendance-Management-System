package student_attendance_management_system;
import java.util.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class faculty extends javax.swing.JFrame {
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        public faculty(){
            initComponents();
            this.setResizable(false);
            Toolkit toolkit=getToolkit();
            Dimension size=toolkit.getScreenSize();
            setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        }
private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FACULTY HOME PAGE");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(51, 0, 490, 50);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("LOGOUT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(210, 470, 160, 50);

        jButton2.setFont(new java.awt.Font("Segoe UI",0,30));
        jButton2.setForeground(new java.awt.Color(0,204,51));
        jButton2.setText("Add Subject");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140,90,310,50);

        jButton3.setFont(new java.awt.Font("Segoe UI",0,30));
        jButton3.setForeground(new java.awt.Color(255,0,0));
        jButton3.setText("Remove Subject");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(140, 190, 310, 50);

        jButton4.setFont(new java.awt.Font("Segoe UI",0,30));
        jButton4.setForeground(new java.awt.Color(0,204,0));
        jButton4.setText("Mark Attendance");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(140, 280, 310, 50);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("View Attendance");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(140, 370, 310, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_attendance_management_system/7.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        Facultylogin nw = new Facultylogin();
        nw.setVisible(true);
        this.setVisible(false);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt){
       subject nw = new subject();
       nw.setVisible(true);
       this.setVisible(false);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt){
        subject nw = new subject();
        nw.setVisible(true);
        this.setVisible(false);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt){
        markattendance nw = new markattendance();
        nw.setVisible(true);
        this.setVisible(false);
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt){
        viewattendance nw = new viewattendance();
        nw.setVisible(true);
        this.setVisible(false);
    }
    public static void main(String args[]){
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(faculty.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
                Logger.getLogger(faculty.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
                Logger.getLogger(faculty.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(faculty.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new faculty().setVisible(true);
            }    
        });
    }
}