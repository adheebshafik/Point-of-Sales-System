/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Lahiru
 */
public class Supplies extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();


    /**
     * Creates new form Supplies
     */
    public Supplies() {
        initComponents();
        con = DBconnect.connect();
        getTableDetails();
        showallpost();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtSID = new javax.swing.JTextField();
        jtxtPID = new javax.swing.JTextField();
        jtxtIN = new javax.swing.JTextField();
        jtxtQ = new javax.swing.JTextField();
        jtxtD = new javax.swing.JTextField();
        jtxtP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox = new javax.swing.JComboBox<>();
        jbADD = new javax.swing.JButton();
        jbUP = new javax.swing.JButton();
        jbDE = new javax.swing.JButton();
        jbCL = new javax.swing.JButton();
        jbPR = new javax.swing.JButton();
        jbEX = new javax.swing.JButton();
        jtxtSD = new javax.swing.JTextField();
        jtxtSetcg = new javax.swing.JTextField();
        jbtnSerach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("SUPPLIES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(jLabel1)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Supplier ID");

        jLabel3.setText("Product ID");

        jLabel4.setText("Supplied Date");

        jLabel5.setText("Item Type");

        jLabel6.setText("Item Name");

        jLabel7.setText("Quantity");

        jLabel8.setText("Discount");

        jLabel9.setText("Payment");

        jtxtSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSIDActionPerformed(evt);
            }
        });
        jtxtSID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSIDKeyTyped(evt);
            }
        });

        jtxtPID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPIDActionPerformed(evt);
            }
        });

        jtxtIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtINActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Supplier ID", "Product ID", "Sup.Date", "Item Type", "Item Name", "Quantity", "Discount", "Payment"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jbADD.setText("ADD");
        jbADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbADDActionPerformed(evt);
            }
        });

        jbUP.setText("Update");
        jbUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUPActionPerformed(evt);
            }
        });

        jbDE.setText("Delete");
        jbDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDEActionPerformed(evt);
            }
        });

        jbCL.setText("Clear");
        jbCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCLActionPerformed(evt);
            }
        });

        jbPR.setText("Print");
        jbPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPRActionPerformed(evt);
            }
        });

        jbEX.setText("Exit");
        jbEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEXActionPerformed(evt);
            }
        });

        jtxtSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSDActionPerformed(evt);
            }
        });

        jbtnSerach.setText("Search");
        jbtnSerach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSerachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(15, 15, 15))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSD, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtIN, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtD, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtP, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbCL)
                                    .addComponent(jbADD, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbPR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbUP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbEX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jtxtSetcg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSerach)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnSerach)
                            .addComponent(jtxtSetcg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtxtQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbADD)
                            .addComponent(jbUP)
                            .addComponent(jbDE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCL)
                    .addComponent(jbPR)
                    .addComponent(jbEX))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSIDActionPerformed

    private void jtxtPIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPIDActionPerformed

    private void jtxtINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtINActionPerformed

    
    public ArrayList<Suppliess> GetSupplies(){
               
                ArrayList<Suppliess> GetSupplies=null;
                
                
                GetSupplies=new ArrayList<Suppliess>();
       
        try {
            con = DBconnect.connect();
            String qry="select * from supplies";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            Suppliess list;
            while (rs.next()) {
                      list =new Suppliess(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                        
                GetSupplies.add(list);
              }
           
        }   catch (Exception e) {
            System.out.println(e);
        }
       return GetSupplies; 
    }
    

    
    
    public void getTableDetails(){
        ArrayList<Suppliess> Getsupp=GetSupplies();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Object[] row=new Object[8];
        for (int a = 0; a < GetSupplies().size(); a++) {
            row[0]=Getsupp.get(a).getSupId();
            row[1]=Getsupp.get(a).getProductId();
            row[2]=Getsupp.get(a).getSuppliedDate();
            row[3]=Getsupp.get(a).getItemType();
            row[4]=Getsupp.get(a).getItemName();
            row[5]=Getsupp.get(a).getQuantity();
            row[6]=Getsupp.get(a).getDiscountFromSup();
            row[7]=Getsupp.get(a).getPayment();
                                                      
         
            model.addRow(row);
        }
      
      }
      
      public void showDetails(int Value){
        jtxtSID.setText(GetSupplies().get( Value).getSupId());
        jtxtPID.setText(GetSupplies().get( Value).getProductId());
        jtxtSD.setText(GetSupplies().get( Value).getSuppliedDate());
        
        jComboBox.setSelectedItem(GetSupplies().get(Value).getItemType());   
        
       
        jtxtIN.setText(GetSupplies().get( Value).getItemName()); 
        jtxtQ.setText(GetSupplies().get( Value).getQuantity());
        jtxtD.setText(GetSupplies().get( Value).getDiscountFromSup());
        jtxtP.setText(GetSupplies().get( Value).getPayment()); 
       
        
        
        
        
        
      }
    
    
    private JFrame frame;
    private void jbEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEXActionPerformed
        // TODO add your handling code here:
         frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Point of Sale-Supplies",
             JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
             this.dispose();

    } 
    }//GEN-LAST:event_jbEXActionPerformed

    private void jbADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbADDActionPerformed
        // TODO add your handling code here:
        {                                      

        if(jtxtSID.getText()!=null || jtxtPID.getText()!=null || jtxtSD.getText()!=null ||jComboBox.getSelectedItem()!=null || jtxtIN.getText()!=null || jtxtQ.getText()!=null || jtxtD.getText()!=null || jtxtP.getText()!=null){
        try {
                con = DBconnect.connect();
        
                PreparedStatement pst=con.prepareStatement("insert into supplies"
                    + "(supId,productId,suppliedDate,itemType,itemName,quantity,discountFromSup,payment) values (?,?,?,?,?,?,?,?)");         
                pst.setString(1,jtxtSID.getText());
                pst.setString(2,jtxtPID.getText());
                
                pst.setString(3,jtxtSD.getText());
                
                 String values=jComboBox.getSelectedItem().toString();
                pst.setString(4, values);
                
                pst.setString(5,jtxtIN.getText());
                pst.setString(6,jtxtQ.getText());
                pst.setString(7,jtxtD.getText());
                pst.setString(8,jtxtP.getText());
                int DET=pst.executeUpdate();
                 getTableDetails();
                if (DET>=1) {
                    JOptionPane.showMessageDialog(null, DET+" SUPPLIES INSERTED SUCCESSFULLY");
                        
                }else
                JOptionPane.showMessageDialog(null, "Supplies Details Insert Failed ....");
        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
                          jtxtSID.setText("");
                          jtxtPID.setText("");
                          jtxtSD.setText("");
                          jtxtIN.setText("");
                          jtxtQ.setText("");
                          jtxtD.setText("");
                          jtxtP.setText("");
             
    
        }    
        else{
        JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_jbADDActionPerformed
    }
    private void jbUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUPActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO UPDATE");
        
        if(x==0){
        
        String sid =jtxtSID.getText();
        String pid =jtxtPID.getText();
        String sd =jtxtSD.getText();
        String iname =jtxtIN.getText();
        String qty =jtxtQ.getText();
        String dis =jtxtD.getText();
        String pay =jtxtP.getText();
        
        String sql = "UPDATE supplies SET supId = '"+sid+"', productId = '"+pid+"', suppliedDate ='"+sd+"',   itemName ='"+iname+"', quantity = '"+qty+"', discountFromSup = '"+dis+"', payment = '"+pay+"' Where supId = '"+sid+"'" ; 
            try {
                
                pst = con.prepareStatement(sql);
                pst.execute(); 
                showDetails(x);
                getTableDetails();
                
            } catch (Exception e) {
            }
   
        }
    }//GEN-LAST:event_jbUPActionPerformed

    private void jbPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPRActionPerformed
     supplierReport sl = new  supplierReport();
        sl.setVisible(true);

    }//GEN-LAST:event_jbPRActionPerformed

    private void jbDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDEActionPerformed
        // TODO add your handling code here:
             
         int x = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE");
         if(x==0){
             
         
        if (jtxtSID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Supplier ID");
        }else{
            try{
                String qry="delete from supplies where supId=?";
                 con = DBconnect.connect();
                PreparedStatement pst=con.prepareStatement(qry);
                pst.setInt(1, Integer.parseInt(jtxtSID.getText().toString()));
                int res=pst.executeUpdate();
               getTableDetails();
                if (res>=1) {
                    JOptionPane.showMessageDialog(null, " Deleted Successfully");
                }else
                JOptionPane.showMessageDialog(null, "Failed To Delete ");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    }//GEN-LAST:event_jbDEActionPerformed

    private void jbCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCLActionPerformed
        // TODO add your handling code here:
         jtxtSID.setText(null);
         jtxtPID.setText(null);
         
         jtxtIN.setText(null);
         jtxtQ.setText(null);
         jtxtD.setText(null);
       
         jtxtP.setText(null);
         
         
         
         
    }//GEN-LAST:event_jbCLActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jbtnSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSerachActionPerformed
     
         ArrayList<Suppliess> Getsupp=null;
        Getsupp=new ArrayList<Suppliess>();
        String val=jtxtSetcg.getText().toString();
        try {
            con = DBconnect.connect();
            String qry="select * from supplies where supId like '%"+val+"%'";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            Suppliess sup;
            while (rs.next()) {
               sup =new Suppliess(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                Getsupp.add(sup);
            }

            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.setRowCount(0); 
            Object[] row=new Object[8];
            for (int a = 0; a < Getsupp.size(); a++) {
             row[0]=Getsupp.get(a).getSupId();
            row[1]=Getsupp.get(a).getProductId();
            row[2]=Getsupp.get(a).getSuppliedDate();
            row[3]=Getsupp.get(a).getItemType();
            row[4]=Getsupp.get(a).getItemName();
            row[5]=Getsupp.get(a).getQuantity();
            row[6]=Getsupp.get(a).getDiscountFromSup();
            row[7]=Getsupp.get(a).getPayment();
                                                                           
            
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jbtnSerachActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r=jTable1.getSelectedRow();
       showDetails(r);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtxtSIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSIDKeyTyped

    private void jtxtSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSDActionPerformed

    
    public void showallpost() {
        
        try {
            
            stmt = con.createStatement();
            String sql = "select DISTINCT itemType from supplies";
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                jComboBox.addItem(rs.getString("itemType"));
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbADD;
    private javax.swing.JButton jbCL;
    private javax.swing.JButton jbDE;
    private javax.swing.JButton jbEX;
    private javax.swing.JButton jbPR;
    private javax.swing.JButton jbUP;
    private javax.swing.JButton jbtnSerach;
    private javax.swing.JTextField jtxtD;
    private javax.swing.JTextField jtxtIN;
    private javax.swing.JTextField jtxtP;
    private javax.swing.JTextField jtxtPID;
    private javax.swing.JTextField jtxtQ;
    private javax.swing.JTextField jtxtSD;
    private javax.swing.JTextField jtxtSID;
    private javax.swing.JTextField jtxtSetcg;
    // End of variables declaration//GEN-END:variables


   
}