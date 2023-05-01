
package database_project2;

public class EmployeeInfo {
    private String name;
    private String employeeId;
    private String fathersName;
    private String mothersName;
    private String email;
    private String contactNo;
    private String dateOfBirth;
    private String bloodGroup;
    private String address;
    private String guardianContactNo;
    private String post;
    private int Salary;
    private byte[] image;
    
     public EmployeeInfo() {
    }

    public EmployeeInfo(String name, String employeeId, String fathersName, String mothersName, String email, String contactNo, String dateOfBirth, String bloodGroup, String address, String guardianContactNo, String post, int Salary, byte[] image) {
        this.name = name;
        this.employeeId = employeeId;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.email = email;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.address = address;
        this.guardianContactNo = guardianContactNo;
        this.post = post;
        this.Salary = Salary;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public String getGuardianContactNo() {
        return guardianContactNo;
    }

    public void setGuardianContactNo(String guardianContactNo) {
        this.guardianContactNo = guardianContactNo;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
     
     
}
