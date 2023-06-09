/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database_project2;

import static java.lang.Integer.min;
import java.util.ArrayList;
import java.awt.*;

import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

import javax.swing.table.TableModel;

import javax.swing.table.DefaultTableModel;

import javax.swing.table.*;

/**
 *
 * @author Asus
 */
public class Member extends javax.swing.JFrame {
    String AdminId;
    int currentLength = 0;
    int modIndex  =0;
    ArrayList<MemberInfo> arr = new ArrayList ();
   
    public Member() {
        initComponents();
        
    }
     public Member(String AdminId) {
        this.AdminId = AdminId;
        initComponents();
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(115);
        arr = new ConnectMSSQL().getMemberInfo("where  exists (Select MemberId from member) ");
        jTable1.setDefaultEditor(Object.class, null);
        clearTable(jTable1);
        
        if((modIndex+1)*16>arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        
        for(int i=0;i<currentLength;i++)
        {
           
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getSeatNo(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getMealType(),i, 5);
            jTable1.getModel().setValueAt(arr.get(i).getDue(),i, 6);
            jTable1.getModel().setValueAt("Details", i,7);
            
            
             
        }
        
        jTable1.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        jTable1.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),jTable1));
        
        prevButton.setVisible(false);
        if(arr.size()<=16)
            nextButton.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backToHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchByContact = new javax.swing.JTextField();
        searchBySeat = new javax.swing.JTextField();
        searchById = new javax.swing.JTextField();
        searchByName = new javax.swing.JTextField();
        addNewMember = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        searchByBlood = new javax.swing.JComboBox<>();
        searchByMeal = new javax.swing.JComboBox<>();
        search1 = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        backToHome.setText("Back");
        backToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Member Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backToHome)
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -6, 1050, 70));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact No", "Blood Group", "Seat No", "Meal Type", "Due Amount", "Action"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(1245, 6789));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1010, 270));

        searchByContact.setText("Search By Contact No");
        searchByContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByContactMouseClicked(evt);
            }
        });
        searchByContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByContactActionPerformed(evt);
            }
        });
        getContentPane().add(searchByContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 160, 30));

        searchBySeat.setText("Search By Seat No");
        searchBySeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBySeatMouseClicked(evt);
            }
        });
        getContentPane().add(searchBySeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 130, 160, 30));

        searchById.setText("Search By Id");
        searchById.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByIdMouseClicked(evt);
            }
        });
        searchById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdActionPerformed(evt);
            }
        });
        getContentPane().add(searchById, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 160, 30));

        searchByName.setText("Search By Name");
        searchByName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchByName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByNameMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchByNameMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchByNameMouseReleased(evt);
            }
        });
        getContentPane().add(searchByName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 160, 30));

        addNewMember.setBackground(new java.awt.Color(0, 102, 102));
        addNewMember.setText("Add New Member");
        addNewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMemberActionPerformed(evt);
            }
        });
        getContentPane().add(addNewMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 130, 40));

        reset.setBackground(new java.awt.Color(255, 153, 153));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 83, 80, -1));

        searchByBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By Blood Group", "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-" }));
        getContentPane().add(searchByBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, 30));

        searchByMeal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By Meal Type", "Breakfast+Lunch+Dinner", "Breakfast", "Lunch", "Dinner", "Breakfast+Lunch", "Breakfast+Dinner", "Lunch+Dinner" }));
        getContentPane().add(searchByMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 160, 30));

        search1.setBackground(new java.awt.Color(0, 102, 153));
        search1.setText("Search");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        getContentPane().add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 133, 80, -1));

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 70, 20));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 70, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hostel bed12.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1050, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void clearTable(final JTable table) {
    for (int i = 0; i < table.getRowCount(); i++) {
        for(int j = 0; j < table.getColumnCount(); j++) {
            table.setValueAt("", i, j);
        }
    }
}
    private void searchByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByIdActionPerformed

    private void searchByContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByContactActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        searchById.setText("Search By Id");
        searchByName.setText("Search By Name");
        searchByContact.setText("Search By Contact No");
        searchBySeat.setText("Search By Seat No");
        searchByMeal.setSelectedItem(0);
        searchByBlood.setSelectedIndex(0);
        
    }//GEN-LAST:event_resetActionPerformed

    private void backToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeActionPerformed
       HomePage obj2 = new HomePage(AdminId);
       this.setVisible(false);
       obj2.setVisible(true);
    }//GEN-LAST:event_backToHomeActionPerformed

    private void addNewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMemberActionPerformed
        
        
        new MemberRegistration(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addNewMemberActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        if(col==7 && row<currentLength)
        {
            
            new MemberDetails(AdminId,arr.get(row+16*modIndex).getMemberId()).setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void searchByNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByNameMouseClicked
        if(searchByName.getText().equals("Search By Name"))
            searchByName.setText("");
    }//GEN-LAST:event_searchByNameMouseClicked

    private void searchByNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByNameMouseExited
        
    }//GEN-LAST:event_searchByNameMouseExited

    private void searchByNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByNameMouseReleased
        
    }//GEN-LAST:event_searchByNameMouseReleased

    private void searchByIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByIdMouseClicked
       if(searchById.getText().equals("Search By Id"))
            searchById.setText("");
    }//GEN-LAST:event_searchByIdMouseClicked

    private void searchByContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByContactMouseClicked
        if(searchByContact.getText().equals("Search By Contact No"))
            searchByContact.setText("");
    }//GEN-LAST:event_searchByContactMouseClicked

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        modIndex++;
        prevButton.setVisible(true);
        if((modIndex+1)*16>=arr.size())
            nextButton.setVisible(false);
        clearTable(jTable1);
        if((modIndex+1)*16>arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        for(int i=0;i<currentLength;i++)
        {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());
        
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getMemberId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getSeatNo(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getMealType(),i, 5);
            jTable1.getModel().setValueAt(arr.get(i).getDue(),i, 6);
            jTable1.getModel().setValueAt("Details", i,7);
            
            
             
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        modIndex--;
        if(modIndex==0)
            prevButton.setVisible(false);
        nextButton.setVisible(true);
        clearTable(jTable1);
        if((modIndex+1)*16>arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        for(int i=0;i<currentLength;i++)
        {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());
        
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getMemberId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getSeatNo(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getMealType(),i, 5);
            jTable1.getModel().setValueAt(arr.get(i).getDue(),i, 6);
            jTable1.getModel().setValueAt("Details", i,7);
            
            
             
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        String query = "";
        String temp;
        
        temp = searchById.getText();
        if(temp.equals("Search By Id")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where MemberId='"+temp+"'";
            }
            else query+="and MemberId='"+temp+"'";
        }
        
        temp = searchByName.getText();
        if(temp.equals("Search By Name")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where Name='"+temp+"'";
            }
            else query+="and Name='"+temp+"'";
        }
        temp = searchByContact.getText();
        if(temp.equals("Search By Contact No")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where ContactNo='"+temp+"'";
            }
            else query+="and ContactNo='"+temp+"'";
        }
        temp = searchBySeat.getText();
        if(temp.equals("Search By Seat No")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where SeatNo='"+temp+"'";
            }
            else query+="and SeatNo='"+temp+"'";
        }
        temp = searchByBlood.getSelectedItem().toString();
        if(temp.equals("Search By Blood Group")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where BloodGroup='"+temp+"'";
            }
            else query+="and BloodGroup='"+temp+"'";
        }
        temp = searchByMeal.getSelectedItem().toString();
        if(temp.equals("Search By Meal Type")==false && temp.length()>0)
        {
            
            
            if(query.length()==0)
            {
                query+= "where MealType='"+temp+"'";
            }
            else query+="and MealType='"+temp+"'";
        }
        
        arr.clear();
        arr = new ConnectMSSQL().getMemberInfo(query);
            
            
        modIndex = 0;
        
        clearTable(jTable1);
        
        if((modIndex+1)*16>arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        
        for(int i=0;i<currentLength;i++)
        {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());
        
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getSeatNo(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getMealType(),i, 5);
            jTable1.getModel().setValueAt(arr.get(i).getDue(),i, 6);
            jTable1.getModel().setValueAt("Details", i,7);
            
            
             
        }
        jTable1.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        jTable1.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),jTable1));
        
        prevButton.setVisible(false);
        if(arr.size()<=16)
            nextButton.setVisible(false);
        else nextButton.setVisible(true);
        
        
    }//GEN-LAST:event_search1ActionPerformed

    private void searchBySeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBySeatMouseClicked
        if(searchBySeat.getText().equals("Search By Seat No"))
            searchBySeat.setText("");
    }//GEN-LAST:event_searchBySeatMouseClicked

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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewMember;
    private javax.swing.JButton backToHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton reset;
    private javax.swing.JButton search1;
    private javax.swing.JComboBox<String> searchByBlood;
    private javax.swing.JTextField searchByContact;
    private javax.swing.JTextField searchById;
    private javax.swing.JComboBox<String> searchByMeal;
    private javax.swing.JTextField searchByName;
    private javax.swing.JTextField searchBySeat;
    // End of variables declaration//GEN-END:variables

}
