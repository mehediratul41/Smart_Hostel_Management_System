/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    String AdminId;
    public HomePage() {
        initComponents();
    }
    public HomePage(String AdminId)
    {
        this.AdminId  = AdminId;
        initComponents();
        
        
    }
    
    public int monthDiff(String query1,String query2)
    {
        int x = (Integer.valueOf(query1.substring(0,4)))*12+Integer.valueOf(query1.substring(4,6));
        int y = (Integer.valueOf(query2.substring(0,4)))*12+Integer.valueOf(query2.substring(4,6));
        
        return Math.abs(x-y);
    }
    
    public int calDue(String mealType,String seatId)
    {
        int cost = 0;
        PackageInfo p = new PackageInfo();
        p = new ConnectMSSQL().getPackageInfo("");
        if(mealType.equals("Breakfast"))
        {
            cost+= p.getB();
        }
        else if(mealType.equals("Lunch"))
        {
            cost+= p.getL();
        }
        else if(mealType.equals("Dinner"))
        {
            cost+= p.getD();
        }
        else if(mealType.equals("BreakFast+Lunch"))
        {
            cost+= p.getBl();
        }
        else if(mealType.equals("Breakfast+Dinner"))
        {
            cost+= p.getBd();
        }
        else if(mealType.equals("Lunch+Dinner"))
        {
            cost+= p.getLd();
        }
        else if(mealType.equals("Breakfast+Lunch+Dinner"))
        {
            cost+= p.getBld();
        }
        if(seatId.length()==0)
            return cost;
        SeatInfo s = (new ConnectMSSQL().getSeatInfo("where SeatId = '"+seatId+"'")).get(0);
        RoomInfo r = (new ConnectMSSQL().getRoomInfo("where RoomId = '"+s.getRoomId()+"'")).get(0);
        if(r.getType().equals("Ac"))
        {
            cost+= p.getAc();
        }
        else
        {
            cost+= p.getNonAc();
        }
            
        
        return cost;
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
        jLabel8 = new javax.swing.JLabel();
        settingsButton = new javax.swing.JButton();
        Payment = new javax.swing.JLabel();
        Member = new javax.swing.JLabel();
        memberButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        Room = new javax.swing.JLabel();
        roomButton = new javax.swing.JButton();
        Meal = new javax.swing.JLabel();
        mealButton = new javax.swing.JButton();
        Visitor = new javax.swing.JLabel();
        visitorButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        employeeButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        expenseButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dashboardButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25,25,112,150));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jLabel1)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Settings");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, -1, -1));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        settingsButton.setText("Settings");
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 130, 140));

        Payment.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        Payment.setForeground(new java.awt.Color(255, 255, 255));
        Payment.setText("Payment");
        getContentPane().add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        Member.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        Member.setForeground(new java.awt.Color(255, 255, 255));
        Member.setText("Member");
        getContentPane().add(Member, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        memberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        memberButton.setText("Member ");
        memberButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberButtonActionPerformed(evt);
            }
        });
        getContentPane().add(memberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 140));

        paymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        paymentButton.setText("Payment");
        paymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, 140));

        Room.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        Room.setForeground(new java.awt.Color(255, 255, 255));
        Room.setText("Room");
        getContentPane().add(Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        roomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        roomButton.setText("Room");
        roomButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(roomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 130, 140));

        Meal.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        Meal.setForeground(new java.awt.Color(255, 255, 255));
        Meal.setText("Meal");
        getContentPane().add(Meal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        mealButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        mealButton.setText("Meal");
        mealButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mealButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 130, 140));

        Visitor.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        Visitor.setForeground(new java.awt.Color(255, 255, 255));
        Visitor.setText("Visitor");
        getContentPane().add(Visitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, -1, -1));

        visitorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        visitorButton.setText("Visitors");
        visitorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(visitorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 130, 140));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        employeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        employeeButton.setText("Employee");
        employeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(employeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, 140));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Expense");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        expenseButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        expenseButton.setForeground(new java.awt.Color(255, 255, 255));
        expenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        expenseButton.setText("Expense");
        expenseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        expenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(expenseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 130, 140));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 90, 20));

        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hb.jpg"))); // NOI18N
        dashboardButton.setText("DashBoard");
        dashboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 130, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/MenuPagePhoto.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void visitorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorButtonActionPerformed
        new Visitor(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_visitorButtonActionPerformed

    private void memberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberButtonActionPerformed
        new Member(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_memberButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        new Payment(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void roomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomButtonActionPerformed
        new Room(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_roomButtonActionPerformed

    private void mealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealButtonActionPerformed
        new Meal(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mealButtonActionPerformed

    private void expenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenseButtonActionPerformed
        new Expense(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_expenseButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        new Settings(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed
        new Employee(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        new Dashboard(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dashboardButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Meal;
    private javax.swing.JLabel Member;
    private javax.swing.JLabel Payment;
    private javax.swing.JLabel Room;
    private javax.swing.JLabel Visitor;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton employeeButton;
    private javax.swing.JButton expenseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mealButton;
    private javax.swing.JButton memberButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JButton roomButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton visitorButton;
    // End of variables declaration//GEN-END:variables
}
