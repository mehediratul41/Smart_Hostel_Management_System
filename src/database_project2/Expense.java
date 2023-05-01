/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabiha
 */
package database_project2;

import static database_project2.PaymentHistory.clearTable;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class Expense extends javax.swing.JFrame {

    /**
     * Creates new form Expense
     */
    String AdminId;
    int modIndex;
    int currentLength;
    ArrayList<ExpenseInfo> arr =  new ArrayList();
    public Expense() {
        initComponents();
        
    }
    public Expense(String AdminId) {
        initComponents();
        this.AdminId  =  AdminId;
        date.getSettings().setAllowKeyboardEditing(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.LEFT );
        for(int x=0;x<4;x++){
         jTable1.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
        }
        LocalDate currentdate = LocalDate.now();       
        Calendar c = Calendar.getInstance();
        String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH );
        monthlyExpense.setText(new ConnectMSSQL().getValue("Select SUM(Amount) from Expense where Date Like '"+month+"%"+currentdate.getYear()+"'"));
        
        
        arr.clear();
        arr = new ConnectMSSQL().getExpenseInfo("");
        if((modIndex+1)*16>arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        
        for(int i=0;i<currentLength;i++)
        {
           
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getDate(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getAmount(),i, 3);
            jTable1.getModel().setValueAt("Undo", i,4);
            
            
             
        }
        
        jTable1.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        jTable1.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),jTable1));
        
        prevButton.setVisible(false);
        if(arr.size()<=16)
            nextButton.setVisible(false);
        
    
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
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        expenseName = new javax.swing.JTextField();
        resetButon = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        date = new com.github.lgooddatepicker.components.DatePicker();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        monthlyExpense = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel1.setText("Expense");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(474, 474, 474))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 70));

        jLabel2.setText("Expense Name:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel4.setText("Date:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel5.setText("Amount:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 300, 30));
        getContentPane().add(expenseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 300, 30));

        resetButon.setText("Reset");
        resetButon.setBackground(new java.awt.Color(255, 102, 102));
        resetButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 90, 30));

        saveButton.setText("Save");
        saveButton.setBackground(new java.awt.Color(102, 153, 255));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 90, 30));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Expense Id", "Expense Name", "Date", "Amount", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 990, 260));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 300, 30));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jLabel3.setText("Monthly Expense:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 170, 20));

        monthlyExpense.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        monthlyExpense.setEnabled(false);
        getContentPane().add(monthlyExpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 190, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hostel meal.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButonActionPerformed
        expenseName.setText("");
        amount.setText("");
        date.clear();
    }//GEN-LAST:event_resetButonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new HomePage(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed
    public static void clearTable(final JTable table) 
    {
        for (int i = 0; i < table.getRowCount(); i++) 
        {
            for(int j = 0; j < table.getColumnCount(); j++) 
            {
                table.setValueAt("", i, j);
            }   
        }
    }
    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(expenseName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Expense Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(amount.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Amount is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(amount.getText().length()>7)
        {
            JOptionPane.showMessageDialog(this, "Amount size should be less than or equal to 7 digits","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(date.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Date Selection is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        
            ExpenseInfo expense =  new ExpenseInfo();
            expense.setExpenseId(new ConnectMSSQL().getSerial("ExpenseSerial")+this.AdminId);
            expense.setExpenseName(expenseName.getText());
            expense.setAmount(Integer.parseInt(amount.getText()));
            expense.setDate(date.getText());
            try
            {
                new ConnectMSSQL().addExpense(expense);
                new ConnectMSSQL().update("SerialNo","ExpenseSerial =  ExpenseSerial+1");
                JOptionPane.showMessageDialog(this, "Expense Added Successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
                LocalDate currentdate = LocalDate.now();
                
                arr = new ConnectMSSQL().getExpenseInfo("where date like '"+currentdate.getMonth()+"%"+currentdate.getYear()+"'");
                int total = 0;
                for(int i=0;i<arr.size();i++)
                {
                    total+= arr.get(i).getAmount();
                }
                monthlyExpense.setText(Integer.toString(total));


                arr.clear();
                arr = new ConnectMSSQL().getExpenseInfo("");
                clearTable(jTable1);

                if((modIndex+1)*16>arr.size())
                    currentLength = arr.size()%16;
                else currentLength = 16;

                for(int i=0;i<currentLength;i++)
                {

                    jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseId(),i, 0);
                    jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseName(),i, 1);
                    jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getDate(),i, 2);
                    jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getAmount(),i, 3);
                    jTable1.getModel().setValueAt("Undo", i,4);



                }
                prevButton.setVisible(false);
                if(arr.size()<=16)
                    nextButton.setVisible(false);
                else nextButton.setVisible(true);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        resetButonActionPerformed(evt);
        
    }//GEN-LAST:event_saveButtonActionPerformed

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

            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getDate(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getAmount(),i, 3);
            jTable1.getModel().setValueAt("Undo", i,4);

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

            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getExpenseName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getDate(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getAmount(),i, 3);
            jTable1.getModel().setValueAt("Undo", i,4);

        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        if(col==4 && row<currentLength)
        {
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to Undo?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            if(x==0)
            {
                try
                {
                    new ConnectMSSQL().delete("Expense"," where ExpenseId = '"+jTable1.getValueAt(row, 0)+"'");
                    JOptionPane.showMessageDialog(this, "Expense Undo Succesfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    new Expense(this.AdminId).setVisible(true);
                    this.setVisible(false);
                
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Error Occured", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton backButton;
    private com.github.lgooddatepicker.components.DatePicker date;
    private javax.swing.JTextField expenseName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField monthlyExpense;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton resetButon;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
