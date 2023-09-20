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

public class studentreg extends javax.swing.JFrame {
    private javax.swing.JTextField a;
    private javax.swing.JTextField d;
    private javax.swing.JTextField f;
    private javax.swing.JComboBox g;
    private javax.swing.JComboBox h;
    private javax.swing.JTextArea j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField k;
    private javax.swing.JTextField l;
    private javax.swing.JPasswordField s;
    public studentreg(){
        initComponents();
        this.setResizable(false);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }
    
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        a = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        g = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        j = new javax.swing.JTextArea();
        k = new javax.swing.JTextField();
        l = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        s = new javax.swing.JPasswordField();
        f = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        h = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Register/Remove");
        setPreferredSize(new java.awt.Dimension(665, 800));
        
        jPanel1.setLayout(null);
        
        jLabel2.setFont(new java.awt.Font("Segoe UI",1,30));
        jLabel2.setForeground(new java.awt.Color(255,0,0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Registration or Remove");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0,0,650,50);
        
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Student Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 70, 140, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 190, 150, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 330, 140, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 470, 150, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Mobile No.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 570, 160, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Email Id");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 640, 150, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Register");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 700, 130, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Remove");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 700, 130, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 700, 130, 40);
        jPanel1.add(a);
        a.setBounds(250, 70, 290, 40);
        jPanel1.add(d);
        d.setBounds(250, 190, 290, 40);

        g.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(g);
        g.setBounds(250, 330, 170, 40);

        j.setColumns(20);
        j.setRows(5);
        jScrollPane1.setViewportView(j);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 460, 340, 80);

        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        jPanel1.add(k);
        k.setBounds(250, 570, 280, 40);
        jPanel1.add(l);
        l.setBounds(250, 640, 280, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 130, 140, 40);
        jPanel1.add(s);
        s.setBounds(250, 130, 290, 40);
        jPanel1.add(f);
        f.setBounds(250, 260, 290, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Father's Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 260, 170, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Course");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 400, 130, 40);

        h.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MCA-1st Year", "MCA-2nd Year" }));
        jPanel1.add(h);
        h.setBounds(250, 400, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_attendance_management_system/6.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 760);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );

        pack();
    }
    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1=a.getText();
        String s2=String.valueOf(s.getPassword());
        String s3=d.getText();
        String s4=f.getText();
        String s5=g.getSelectedItem().toString();
        String s6=h.getSelectedItem().toString();
        String s7=j.getText();
        String s8=k.getText();
        String s9=l.getText();
        try{
            if(s1.length()==0 || s2.length()==0 || s3.length()==0 || s4.length()==0 || s5.length()==0 || s6.length()==0 || s7.length()==0 || s8.length()==0 || s9.length()==0)
            {

                JOptionPane.showMessageDialog(null, "Some fields are EMPTY!!!");
            }
            else
            {
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
                PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
                ps.setString(1, s1);
                ps.setString(2, s2);
                ps.setString(3, s3);
                ps.setString(4, s4);
                ps.setString(5, s5);
                ps.setString(6, s6);
                ps.setString(7, s7);
                ps.setString(8, s8);
                ps.setString(9, s9);
                ps.executeUpdate();
                {
                    JOptionPane.showMessageDialog(null, "Student registration successful");
                }
            }
        }
        catch (HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Student already registered or Data filled may be Incorrect!!");
            System.out.println(ex);
        }        
    }
     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        admin nw=new admin();
        nw.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String s1=a.getText();
        try{  
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
                String sql2 = "DELETE FROM student WHERE studentid = ?";
               PreparedStatement statement1 = con.prepareStatement(sql2);
               statement1.setString(1, s1);
               int rowsDeleted = statement1.executeUpdate();
               if (rowsDeleted > 0)
               {
                    JOptionPane.showMessageDialog(null, "Student details removed successfully");
               }  
        }
        catch (HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Student Data filled may be Incorrect!!");
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
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new facultyreg().setVisible(true);
            }
        });
    }
}
