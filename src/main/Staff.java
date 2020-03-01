/*
POS SYSTEM STAFF MANAGEMENT
 */
package main;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import dbconnection.DBconnect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Per$ival
 */
public class Staff extends javax.swing.JFrame {
        Connection con = null;
        PreparedStatement pst = null;
        Statement stmt = null;
        ResultSet rs = null;
        DefaultTableModel model = new DefaultTableModel();
        
    
    public Staff() {
        initComponents();
        con = DBconnect.connect();
        getTableDetails();
        showallpost();
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jtxtPost = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtFname = new javax.swing.JTextField();
        jtxtEmpoyeeID = new javax.swing.JTextField();
        jtxtLname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        jtxtCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtBasicSalary = new javax.swing.JTextField();
        jtxtBonus = new javax.swing.JTextField();
        jtxtEPF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtETF = new javax.swing.JTextField();
        jbtnAdd = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        bsalValidate = new javax.swing.JLabel();
        bsalValidate1 = new javax.swing.JLabel();
        bonusvalidate = new javax.swing.JLabel();
        epfValidate = new javax.swing.JLabel();
        etfvalidate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jtxtSearch = new javax.swing.JTextField();
        jbtnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(28000, 32767));

        jtxtPost.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPost.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Employee ID");

        jLabel6.setText("Employee Name");

        jtxtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFnameActionPerformed(evt);
            }
        });

        jtxtEmpoyeeID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtEmpoyeeIDKeyPressed(evt);
            }
        });

        jLabel7.setText("Address");

        jtxtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCityActionPerformed(evt);
            }
        });

        jLabel8.setText("City");

        jLabel10.setText("Enroll/Leave Date ");

        jLabel11.setText("Post");

        jtxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPasswordActionPerformed(evt);
            }
        });
        jtxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPasswordKeyTyped(evt);
            }
        });

        jLabel12.setText("Password");

        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("FirstName");

        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("LastName");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("LeaveDate");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("EnrollDate");

        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtxtPostLayout = new javax.swing.GroupLayout(jtxtPost);
        jtxtPost.setLayout(jtxtPostLayout);
        jtxtPostLayout.setHorizontalGroup(
            jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtxtPostLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(64, 64, 64)
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtPassword)
                            .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtxtPostLayout.createSequentialGroup()
                                .addComponent(jtxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jtxtLname))
                            .addComponent(jtxtEmpoyeeID)))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(15, 15, 15)
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jtxtPostLayout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtCity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtAddress, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel14)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel15)
                        .addGap(93, 93, 93))))
        );
        jtxtPostLayout.setVerticalGroup(
            jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtxtPostLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtxtEmpoyeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jtxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox)))
                .addGap(27, 27, 27)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel3.setText("BasicSalary");

        jLabel4.setText("Bonus");

        jLabel5.setText("EPF");

        jtxtBasicSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBasicSalaryActionPerformed(evt);
            }
        });
        jtxtBasicSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBasicSalaryKeyTyped(evt);
            }
        });

        jtxtBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBonusActionPerformed(evt);
            }
        });
        jtxtBonus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBonusKeyTyped(evt);
            }
        });

        jtxtEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEPFActionPerformed(evt);
            }
        });
        jtxtEPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEPFKeyTyped(evt);
            }
        });

        jLabel9.setText("ETF");

        jtxtETF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtETFKeyTyped(evt);
            }
        });

        jbtnAdd.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAdd.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtnClear.setBackground(new java.awt.Color(0, 0, 0));
        jbtnClear.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        bsalValidate.setForeground(java.awt.Color.red);

        bsalValidate1.setForeground(java.awt.Color.red);

        bonusvalidate.setForeground(java.awt.Color.red);

        epfValidate.setForeground(java.awt.Color.red);

        etfvalidate.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(bsalValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bonusvalidate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(epfValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etfvalidate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtxtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtETF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(98, 98, 98)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jtxtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(bsalValidate1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(369, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsalValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bonusvalidate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(epfValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtETF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etfvalidate, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(bsalValidate1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Fname", "Lname", "Address", "City", "EnrollDate", "LeaveDate", "Post", "BasicSalary", "Bonus", "EPF", "ETF", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jbtnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        jbtnUpdate.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnUpdateMouseClicked(evt);
            }
        });
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(0, 0, 0));
        jbtnExit.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jButton1.setText(" Report");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(361, 361, 361))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jtxtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnSearch.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnSearch.setText("Search");
        jbtnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(38000, 32767));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("STAFF MANAGEMENT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(697, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(627, 627, 627))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(901, 901, 901))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtxtPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCityActionPerformed

    private void jtxtBasicSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBasicSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBasicSalaryActionPerformed

    private void jtxtEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEPFActionPerformed

    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit!!","POS SYSTEM",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed
    }
    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtEmpoyeeID.setText(null);
        jtxtFname.setText(null);
        jtxtLname.setText(null);
        jtxtAddress.setText(null);
        jtxtCity.setText(null);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jComboBox.setSelectedItem(null);
        jtxtBasicSalary.setText(null);
        jtxtBonus.setText(null);
        jtxtEPF.setText(null);
        jtxtETF.setText(null);
        jtxtPassword.setText(null);
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jtxtBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBonusActionPerformed

    
    
      public ArrayList<Employee> GetEmployeeDetails(){
               
                ArrayList<Employee> GetEmp=null;
                
                
                GetEmp=new ArrayList<Employee>();
       
        try {
            con = DBconnect.connect();
            String qry="select * from employee";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            Employee list;
            while (rs.next()) {
               list =new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8),
                        rs.getString(9),rs.getString(10), rs.getString(11),rs.getString(12),rs.getString(13));
                        
                GetEmp.add(list);
              }
           
        }   catch (Exception e) {
            System.out.println(e);
        }
       return GetEmp; 
    }
      
      
      public void getTableDetails(){
        ArrayList<Employee> GetEmp=GetEmployeeDetails();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Object[] row=new Object[13];
        for (int a = 0; a < GetEmp.size(); a++) {
            row[0]=GetEmp.get(a).getId();
            row[1]=GetEmp.get(a).getfName();
            row[2]=GetEmp.get(a).getlName();
            row[3]=GetEmp.get(a).getaddress();
            row[4]=GetEmp.get(a).getcity();
            row[5]=GetEmp.get(a).getenrollDate();                                   
            row[6]=GetEmp.get(a).getleaveDate();
            row[7]=GetEmp.get(a).getpost();
            row[8]=GetEmp.get(a).getbasicSalary();
            row[9]=GetEmp.get(a).getbonus();
            row[10]=GetEmp.get(a).getEPF();
            row[11]=GetEmp.get(a).getETF();                                   
            row[12]=GetEmp.get(a).getpassword();
                                                       
            model.addRow(row);
        }
      
      }
      
      public void showDetails(int Value){
        jtxtEmpoyeeID.setText(GetEmployeeDetails().get( Value).getId());
        jtxtFname.setText(GetEmployeeDetails().get( Value).getfName());
        jtxtLname.setText(GetEmployeeDetails().get( Value).getlName());
        jtxtAddress.setText(GetEmployeeDetails().get( Value).getaddress());
        jtxtCity.setText(GetEmployeeDetails().get( Value).getcity()); 
        
        try{
            java.util.Date date1=null;
            date1=new SimpleDateFormat("dd-MM-yyyy").parse((String)GetEmployeeDetails().get(Value).getenrollDate());
            jDateChooser1.setDate(date1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }     
      
        
        
             
        try{
            java.util.Date date2=null;
            date2=new SimpleDateFormat("dd-MM-yyyy").parse((String)GetEmployeeDetails().get ( Value).getleaveDate());
            jDateChooser2.setDate(date2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }     
      
        jComboBox.setSelectedItem(GetEmployeeDetails().get(Value).getpost());
        jtxtBasicSalary.setText(GetEmployeeDetails().get( Value).getbasicSalary());
        jtxtBonus.setText(GetEmployeeDetails().get( Value).getbonus());
        jtxtEPF.setText(GetEmployeeDetails().get( Value).getEPF());
        jtxtETF.setText(GetEmployeeDetails().get( Value).getETF());
        jtxtPassword.setText(GetEmployeeDetails().get(Value).getpassword());
        
      
      }    
    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed

         int x = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO UPDATE");
         
         if (x==0){
             
         
        if (jtxtEmpoyeeID.getText().toString().equals("") ||jtxtFname.getText().toString().equals("") ||
            jtxtFname.getText().toString().equals("") ||
            jtxtAddress.getText().toString().equals("") ||
            jtxtCity.getText().toString().equals("")||
               
            jDateChooser1.getDate().toString().equals("")||    
            jDateChooser2.getDate().toString().equals("")||  
              
            jComboBox.getSelectedItem().toString().equals("")||
            jtxtBasicSalary.getText().toString().equals("") ||
            jtxtBonus.getText().toString().equals("") ||
            jtxtEPF.getText().toString().equals("")||
            jtxtETF.getText().toString().equals("")||
            jtxtPassword.toString().equals("")) {

            JOptionPane.showMessageDialog(null, "All fields must filed");

        }else{
                

            try{
               String qry="update employee set fName=?,lName=?,address=?,city=?,enrollDate=?,leaveDate=?,post=?,basicSalary=?,bonus=?,EPF=?,ETF=?,password=? where empId=?";
                PreparedStatement pst=con.prepareStatement(qry);

                
                pst.setString(1,jtxtFname.getText().toString());
                pst.setString(2,jtxtLname.getText().toString());
                pst.setString(3,jtxtAddress.getText().toString());
                pst.setString(4,jtxtCity.getText().toString());
           
                  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                String enrollDate=sdf.format(jDateChooser1.getDate());
                pst.setString(5,enrollDate);
                
                SimpleDateFormat sdfx=new SimpleDateFormat("dd-MM-yyyy");
                String leaveDate=sdfx.format(jDateChooser2.getDate());
                pst.setString(6,leaveDate);
                
                String values=jComboBox.getSelectedItem().toString();
                pst.setString(7, values);
                
                pst.setString(8,jtxtBasicSalary.getText().toString());
                pst.setString(9,jtxtBonus.getText().toString());
                pst.setString(10,jtxtEPF.getText().toString());
                pst.setString(11,jtxtETF.getText().toString());
                pst.setString(12,jtxtPassword.getText().toString());
                pst.setString(13,jtxtEmpoyeeID.getText().toString());
                int result=pst.executeUpdate();
                getTableDetails(); 
                if (result>=1) {
                  
                    JOptionPane.showMessageDialog(null,result+"  Updated Successfully");
                }else{
                    JOptionPane.showMessageDialog(null,"  Updation failed");
                }
                if (pst!=null) {
                    pst.close();
                }
                if (con!=null) {
                    con.close();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error in Update "+e);
            }
           
            jtxtEmpoyeeID.setText("");
            jtxtFname.setText("");
            jtxtLname.setText("");
            jtxtAddress.setText("");
            jtxtCity.setText("");
            jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);
            jComboBox.setSelectedItem(null);
            jtxtBasicSalary.setText("");
            jtxtBonus.setText("");
            jtxtEPF.setText("");
            jtxtETF.setText("");
            jtxtPassword.setText("");
             }
         }
    
    }//GEN-LAST:event_jbtnUpdateActionPerformed


    private void jbtnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnUpdateMouseClicked
       
                
    }//GEN-LAST:event_jbtnUpdateMouseClicked
    
    private void jtxtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFnameActionPerformed

    private void jtxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPasswordActionPerformed

    }//GEN-LAST:event_jtxtPasswordActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          int sd=jTable1.getSelectedRow();
        showDetails(sd);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed

         int x = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE");
         if(x==0){
             
         
        if (jtxtEmpoyeeID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter ID");
        }else{
            try{
                String qry="delete from employee where empId=?";
                 con = DBconnect.connect();
                PreparedStatement pst=con.prepareStatement(qry);
                pst.setInt(1, Integer.parseInt(jtxtEmpoyeeID.getText().toString()));
                int res=pst.executeUpdate();
               getTableDetails();
                if (res>=1) {
                    JOptionPane.showMessageDialog(null, "Employee Deleted Successfully");
                }else
                JOptionPane.showMessageDialog(null, "Failed To Delete Employee");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
         ArrayList<Employee> GetEmp=null;
        GetEmp=new ArrayList<Employee>();
        String val=jtxtSearch.getText().toString();
        try {
            con = DBconnect.connect();
            String qry="select * from employee where empId like '%"+val+"%'";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            Employee emp;
            while (rs.next()) {
               emp =new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8),
                        rs.getString(9),rs.getString(10), rs.getString(11),rs.getString(12),rs.getString(13));
                GetEmp.add(emp);
            }

            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.setRowCount(0); 
            Object[] row=new Object[13];
            for (int a = 0; a < GetEmp.size(); a++) {
             row[0]=GetEmp.get(a).getId();
            row[1]=GetEmp.get(a).getfName();
            row[2]=GetEmp.get(a).getlName();
            row[3]=GetEmp.get(a).getaddress();
            row[4]=GetEmp.get(a).getcity();
            row[5]=GetEmp.get(a).getenrollDate();                                   
            row[6]=GetEmp.get(a).getleaveDate();
            row[7]=GetEmp.get(a).getpost();
            row[8]=GetEmp.get(a).getbasicSalary();
            row[9]=GetEmp.get(a).getbonus();
            row[10]=GetEmp.get(a).getEPF();
            row[11]=GetEmp.get(a).getETF();                                   
            row[12]=GetEmp.get(a).getpassword();  
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed

        if(jtxtEmpoyeeID.getText()!=null || jtxtFname.getText()!=null || jtxtLname.getText()!=null || jtxtAddress.getText()!=null || jtxtCity.getText()!=null|| jDateChooser1.getDate()!=null || jDateChooser2.getDate()!=null||jComboBox.getSelectedItem()!=null||jtxtBasicSalary.getText()!=null||jtxtBonus.getText()!=null||jtxtEPF.getText()!=null||jtxtPassword.getText()!=null ){
            try {
                con = DBconnect.connect();

                PreparedStatement pst=con.prepareStatement("insert into employee" + "(empId,fName,lName,address,city,enrollDate,leaveDate,post,basicSalary,bonus,EPF,ETF,password) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1,jtxtEmpoyeeID.getText().toString());
                pst.setString(2,jtxtFname.getText().toString());
                pst.setString(3,jtxtLname.getText().toString());
                pst.setString(4,jtxtAddress.getText().toString());
                pst.setString(5,jtxtCity.getText().toString());
               
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                String enrollDate=sdf.format(jDateChooser1.getDate());
                pst.setString(6,enrollDate);
                
                SimpleDateFormat sdfx=new SimpleDateFormat("dd-MM-yyyy");
                String leaveDate=sdfx.format(jDateChooser2.getDate());
                pst.setString(7,leaveDate);
                
                String values=jComboBox.getSelectedItem().toString();
                pst.setString(8, values);

                pst.setString(9,jtxtBasicSalary.getText().toString());
                
                
                
                
                
                
                pst.setString(10,jtxtBonus.getText().toString());
                pst.setString(11,jtxtEPF.getText().toString());
                pst.setString(12,jtxtETF.getText().toString());
                pst.setString(13,jtxtPassword.getText().toString());

                int res=pst.executeUpdate();
                getTableDetails();
                if (res>=1) {
                    JOptionPane.showMessageDialog(null, res+" Number of Employee "
                        + "inserted succesesfully");
                }else
                JOptionPane.showMessageDialog(null, "Employee insert Failed");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            jtxtEmpoyeeID.setText("");
            jtxtFname.setText("");
            jtxtLname.setText("");
            jtxtAddress.setText("");
            jtxtCity.setText("");
           
            jtxtBasicSalary.setText("");
            jtxtBonus.setText("");
            jtxtEPF.setText("");
            jtxtETF.setText("");
            jtxtPassword.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "All fields must filed....");
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     EmployeeReport sl = new  EmployeeReport();
        sl.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jtxtBasicSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBasicSalaryKeyTyped
        try{
            int i=Integer.parseInt(jtxtBasicSalary.getText());
           bsalValidate.setText("");
        }catch(NumberFormatException e1) { 
            bsalValidate.setText("invalid number!");
        }
    }//GEN-LAST:event_jtxtBasicSalaryKeyTyped

    private void jtxtBonusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBonusKeyTyped
        try{
            int i=Integer.parseInt(jtxtBonus.getText());
           bonusvalidate.setText("");
        }catch(NumberFormatException e1) { 
            bonusvalidate.setText("invalid number!");
        }
    }//GEN-LAST:event_jtxtBonusKeyTyped

    private void jtxtEPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEPFKeyTyped
                try{
            int i=Integer.parseInt(jtxtEPF.getText());
           epfValidate.setText("");
        }catch(NumberFormatException e1) { 
            epfValidate.setText("invalid number!");
        }
    }//GEN-LAST:event_jtxtEPFKeyTyped

    private void jtxtETFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtETFKeyTyped
               try{
            int i=Integer.parseInt(jtxtETF.getText());
           etfvalidate.setText("");
        }catch(NumberFormatException e1) { 
            etfvalidate.setText("invalid number!");
        }
    }//GEN-LAST:event_jtxtETFKeyTyped

    private void jtxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPasswordKeyTyped
            
    }//GEN-LAST:event_jtxtPasswordKeyTyped

    private void jtxtEmpoyeeIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEmpoyeeIDKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            String name = jtxtEmpoyeeID.getText();  
            
            String sql = "select * from employee where empId = ?";
            try {
                
                
                pst = con.prepareStatement(sql);
                pst.setString(1, name);
                rs = pst.executeQuery();
                
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "Entered ID Not Found");
                }
                else {
                    String fName = rs.getString("fName");
                    String lName = rs.getString("lName");
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String enrollDate = rs.getString("enrollDate");
                    String leaveDate = rs.getString("leaveDate");
                    String post = rs.getString("post");
                    String password = rs.getString("password");
                    String basicSalary = rs.getString("basicSalary");
                    String bonus = rs.getString("bonus");
                    String EPF = rs.getString("EPF");
                    String ETF = rs.getString("ETF");
                    
                    jtxtFname.setText(fName.trim());
                    jtxtLname.setText(lName.trim());
                    jtxtAddress.setText(address.trim());
                    jtxtCity.setText(city.trim());
               
                
                    
                    jComboBox.setSelectedItem(post.trim());
                    jtxtPassword.setText(password.trim());
                    jtxtBasicSalary.setText(basicSalary.trim());
                    jtxtBonus.setText(bonus.trim());
                    jtxtEPF.setText(EPF.trim());
                    jtxtETF.setText(ETF.trim());
                    
                    
                }
                
                
                } catch (SQLException ex) {
                Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jtxtEmpoyeeIDKeyPressed
    
    
    public void showallpost() {
        
        try {
            
            stmt = con.createStatement();
            String sql = "select DISTINCT post from employee";
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                jComboBox.addItem(rs.getString("post"));
            }
            
        } catch (Exception e) {
        }
        
        
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bonusvalidate;
    private javax.swing.JLabel bsalValidate;
    private javax.swing.JLabel bsalValidate1;
    private javax.swing.JLabel epfValidate;
    private javax.swing.JLabel etfvalidate;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtBasicSalary;
    private javax.swing.JTextField jtxtBonus;
    private javax.swing.JTextField jtxtCity;
    private javax.swing.JTextField jtxtEPF;
    private javax.swing.JTextField jtxtETF;
    private javax.swing.JTextField jtxtEmpoyeeID;
    private javax.swing.JTextField jtxtFname;
    private javax.swing.JTextField jtxtLname;
    private javax.swing.JTextField jtxtPassword;
    private javax.swing.JPanel jtxtPost;
    private javax.swing.JTextField jtxtSearch;
    // End of variables declaration//GEN-END:variables

    private Object getAllOrderData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
