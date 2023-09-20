
package student_attendance_management_system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class viewattendance extends javax.swing.JFrame {

    private javax.swing.JTextField a;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox month;
    private javax.swing.JTextField s;
    
    public viewattendance() {
        initComponents();
        this.setResizable(false);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        s = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        month = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Attendance");
        setPreferredSize(new java.awt.Dimension(980, 650));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Attendance Report");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 0, 510, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Subject Code");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 60, 110, 30);
        jPanel1.add(a);
        a.setBounds(300, 60, 150, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("VIEW");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(830, 60, 120, 40);
        
    jButton2.setFont(new java.awt.Font("Segoe UI",1,24));
    jButton2.setForeground(new java.awt.Color(255,0,51));
    jButton2.setText("BACK");
    jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2Performed(evt);
            }
        });
    jPanel1.add(jButton2);
    jButton2.setBounds(370,470,140,40);


        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub Code", "Student Id", "Session", "Semester", "Month", "Date", "Time", "Attendance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 970, 490);

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel1.add(month);
        month.setBounds(650, 60, 150, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Month");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 60, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void sActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    String s1=a.getText();
    
    String s2=month.getSelectedItem().toString();
        try
        { 
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/student_attendance","postgres","5287445");
            String sql2="Select subcode from attendance where subcode=?";
            PreparedStatement st = con.prepareStatement(sql2);
            st.setString(1,s1);
            
            ResultSet si=st.executeQuery();
            if(si.next()){
            PreparedStatement ps=con.prepareStatement("select * from attendance where subcode=? and month=?");
            ps.setString(1,s1);        
            ps.setString(2,s2);
            ResultSet rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getString("subcode"),rs.getString("studentid"),rs.getString("session"),rs.getString("semester"),rs.getString("month"),rs.getString("date"),rs.getString("time"),rs.getString("attendance")};
                tm.addRow(o);
            }
            }
            else{
                        JOptionPane.showMessageDialog(null,"Student not enrolled for this subject!!!");
                    }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void jButton2Performed(java.awt.event.ActionEvent evt){
        faculty nw = new faculty();
        nw.setVisible(true);
        this.setVisible(false);
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
            Logger.getLogger(viewattendance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(viewattendance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(viewattendance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(viewattendance.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewattendance().setVisible(true);
            }
        });
    }

    
}
