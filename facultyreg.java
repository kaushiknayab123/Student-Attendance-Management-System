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
import javax.swing.JTextArea;
import javax.swing.UnsupportedLookAndFeelException;

public class facultyreg extends javax.swing.JFrame {
     private javax.swing.JTextField a;
    private javax.swing.JTextField d;
    private javax.swing.JComboBox f;
    private javax.swing.JTextArea g;
    private javax.swing.JTextField h;
    private javax.swing.JTextField j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPasswordField s;
    
    public facultyreg() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        a = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        f = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        g = new javax.swing.JTextArea();
        h = new javax.swing.JTextField();
        j = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        s = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faculty Register/Remove");
        setPreferredSize(new java.awt.Dimension(650, 700));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faculty Registration or Deregistration");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255,0,0));
        jLabel3.setText("Faculty Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 70, 140, 40);
        
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Password");
        jLabel9.setForeground(new java.awt.Color(255,0,0));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 140, 140, 40);
        jPanel1.add(s);
        s.setBounds(250, 140, 290, 40);
        
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Name");
        jLabel4.setForeground(new java.awt.Color(255,0,0));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 210, 150, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Gender");
        jLabel5.setForeground(new java.awt.Color(255,0,0));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 270, 140, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Address");
        jLabel6.setForeground(new java.awt.Color(255,0,0));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 350, 150, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Mobile No.");
        jLabel7.setForeground(new java.awt.Color(255,0,0));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 440, 160, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Email Id");
        jLabel8.setForeground(new java.awt.Color(255,0,0));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 510, 150, 40);

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
        jButton1.setBounds(110, 590, 130, 40);

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
        jButton2.setBounds(290, 590, 130, 40);

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
        jButton3.setBounds(460, 590, 130, 40);
        jPanel1.add(a);
        a.setBounds(250, 70, 290, 40);
        jPanel1.add(d);
        d.setBounds(250, 210, 290, 40);

        f.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(f);
        f.setBounds(250, 270, 150, 40);

        g.setColumns(20);
        g.setRows(5);
        jScrollPane1.setViewportView(g);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 330, 340, 80);

        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        jPanel1.add(h);
        h.setBounds(250, 440, 280, 40);
        jPanel1.add(j);
        j.setBounds(250, 510, 280, 40);

        

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_attendance_management_system/9.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 0, 650, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    private void hActionPerformed(java.awt.event.ActionEvent evt){

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        String s1=a.getText();
        String s2=String.valueOf(s.getPassword());
        String s3=d.getText();
        String s4=f.getSelectedItem().toString();
        String s5=g.getText();
        String s6=h.getText();
        String s7=j.getText();
        try{
            if(s1.length()==0 || s2.length()==0 || s3.length()==0 || s4.length()==0 || s5.length()==0 || s6.length()==0 || s7.length()==0){
                JOptionPane.showMessageDialog(null, "Some fields are empty");
            }
            else{
                Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
                PreparedStatement ps = con.prepareStatement("insert into faculty values(?,?,?,?,?,?,?)");
                 ps.setString(1, s1);
                ps.setString(2, s2);
                ps.setString(3, s3);
                ps.setString(4, s4);
                ps.setString(5, s5);
                ps.setString(6, s6);
                ps.setString(7, s7);
                ps.executeUpdate();
                {
                    JOptionPane.showMessageDialog(null, "Faculty registration successful");
                }
            }    
        }catch (SQLException ex) {
             Logger.getLogger(facultyreg.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt){
        String s1=a.getText();
        try{
          
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
        String sql2= "DELETE FROM FACULTY WHERE facultyid = ?";
        PreparedStatement st1 = con.prepareStatement(sql2);
        st1.setString(1,s1);
        int rowsDeleted = st1.executeUpdate();
        if(rowsDeleted > 0){
        JOptionPane.showMessageDialog(null,"Faculty Detatils Removed Successfully");
        }
        }catch (SQLException ex) {
            Logger.getLogger(facultyreg.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt){
        admin nw = new admin();
        nw.setVisible(true);
        this.setVisible(false);
    }
    public static void main(String args[]){
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(facultyreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(facultyreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(facultyreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(facultyreg.class.getName()).log(Level.SEVERE, null, ex);
        } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facultyreg().setVisible(true);
            }
        });
    }

}