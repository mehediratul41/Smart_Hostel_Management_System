/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database_project2;


public class MemberInfo {
    
    private String name;
    private String memberId;
    private String fathersName;
    private String mothersName;
    private String email;
    private String contactNo;
    private String dateOfBirth;
    private String bloodGroup;
    private String address;
    private String profession;
    private String guardianContactNo;
    private String seatNo;
    private String mealType;
    private int due;
    private byte[] image;
    private String lastDueMonth;

    public MemberInfo(String name, String memberId, String fathersName, String mothersName, String email, String contactNo, String dateOfBirth, String bloodGroup, String address, String profession, String guardianContactNo, String seatNo, String mealType, int due, byte[] image, String lastDueMonth) {
        this.name = name;
        this.memberId = memberId;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.email = email;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.address = address;
        this.profession = profession;
        this.guardianContactNo = guardianContactNo;
        this.seatNo = seatNo;
        this.mealType = mealType;
        this.due = due;
        this.image = image;
        this.lastDueMonth = lastDueMonth;
    }
    
    public MemberInfo()
    {
        ;
    }

    public String getLastDueMonth() {
        return lastDueMonth;
    }

    public void setLastDueMonth(String lastDueMonth) {
        this.lastDueMonth = lastDueMonth;
    }
    

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGuardianContactNo() {
        return guardianContactNo;
    }

    public void setGuardianContactNo(String guardianContactNo) {
        this.guardianContactNo = guardianContactNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
}
