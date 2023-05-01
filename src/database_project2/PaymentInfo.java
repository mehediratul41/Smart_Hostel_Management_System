/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

public class PaymentInfo {
    
    
    private String paymentId;
    private String memberId;
    private String name;
    private String dateAndTime;
    private String adminId;
    private int amount;

    public PaymentInfo() {
    }

    public PaymentInfo(String paymentId, String memberId, String name, String dateAndTime, String adminId, int amount) {
        this.paymentId = paymentId;
        this.memberId = memberId;
        this.name = name;
        this.dateAndTime = dateAndTime;
        this.adminId = adminId;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
