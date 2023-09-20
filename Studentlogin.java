package student_attendance_management_system;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Studentlogin extends javax.swing.JFrame{
    private javax.swing.JTextField a;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField s;
    
    public Studentlogin(){
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
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    a = new javax.swing.JTextField();
    s = new javax.swing.JPasswordField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Student Login");
    
    jPanel1.setLayout(null);
    
    jLabel2.setFont(new java.awt.Font("Segoe UI",1,36));
    jLabel2.setForeground(new java.awt.Color(255,0,0));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Student Login");
    jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel1.add(jLabel2);
    jLabel2.setBounds(1,-4,600,60);
    
    jLabel3.setFont(new java.awt.Font("Segoe UI",1,24));
    jLabel3.setText("Student Id");
    jPanel1.add(jLabel3);
    jLabel3.setBounds(90,160,130,40);
    
    jLabel4.setFont(new java.awt.Font("Segoe UI",1,24));
    jLabel4.setText("Password");
    jPanel1.add(jLabel4);
    jLabel4.setBounds(90,300,150,50);
    
    a.addActionListener(new java.awt.event.ActionListener() {
       
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
    });
    jPanel1.add(a);
    a.setBounds(250,160,250,40);
    jPanel1.add(s);
    s.setBounds(250,310,250,40);
    
    jButton1.setFont(new java.awt.Font("Segoe UI",1,24));
    jButton1.setForeground(new java.awt.Color(255,0,51));
    jButton1.setText("LOGIN");
    jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
    });
    jPanel1.add(jButton1);
    jButton1.setBounds(160,470,150,40);
    
    jButton2.setFont(new java.awt.Font("Segoe UI",1,24));
    jButton2.setForeground(new java.awt.Color(255,0,51));
    jButton2.setText("HOME");
    jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2Performed(evt);
            }
    });
    jPanel1.add(jButton2);
    jButton2.setBounds(370,470,140,40);
    
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_attendance_management_system/5.png")));
    jPanel1.add(jLabel1);
    jLabel1.setBounds(30,10,600,560);
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1,javax.swing.GroupLayout.PREFERRED_SIZE,602,javax.swing.GroupLayout.PREFERRED_SIZE));
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    pack();
    }
    private void aActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    private void jButton2Performed(java.awt.event.ActionEvent evt){
        welcome nw = new welcome();
        nw.setVisible(true);
        this.setVisible(false);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        String s1 = a.getText();
        String s2 = String.valueOf(s.getPassword());
        
        try{
            if(s1.length()==0 || s2.length()==0){
                JOptionPane.showMessageDialog(null,"Some Fields are Empty!!!");
            }
            else{
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
                String sql = "Select * from student where studentid=? and password=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,s1);
                ps.setString(2,s2);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    student nw = new student();
                    nw.setVisible(true);
                    this.setVisible(false);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Username or Password not matched");
                    
                }
                con.close();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Studentlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public static void main(String args[]){
       try{
                for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                    if("Nimbus".equals(info.getName())){
                       javax.swing.UIManager.setLookAndFeel(info.getClassName());
                       break;
                    }
               }
           } catch (ClassNotFoundException ex) {
            Logger.getLogger(Studentlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Studentlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Studentlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Studentlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       java.awt.EventQueue.invokeLater(new Runnable(){
           public void run(){
               new Studentlogin().setVisible(true);
           }
       });
   } 
    
    
    
    
    
}