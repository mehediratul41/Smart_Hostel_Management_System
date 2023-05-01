/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

/**
 *
 * @author SARK
 */
public class VisitorInfo {
    
    private String VisitorId;
    private String VisitorsName;
    private String MemberId;
    private String TimeIn;
    private String TimeOut;
    public VisitorInfo()
    {
        
    }
    public VisitorInfo(String VisitorId, String VisitorsName, String MemberId, String TimeIn, String TimeOut) {
        this.VisitorId = VisitorId;
        this.VisitorsName = VisitorsName;
        this.MemberId = MemberId;
        this.TimeIn = TimeIn;
        this.TimeOut = TimeOut;
    }

    public String getVisitorId() {
        return VisitorId;
    }

    public void setVisitorId(String VisitorId) {
        this.VisitorId = VisitorId;
    }

    public String getVisitorsName() {
        return VisitorsName;
    }

    public void setVisitorsName(String VisitorsName) {
        this.VisitorsName = VisitorsName;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public String getTimeIn() {
        return TimeIn;
    }

    public void setTimeIn(String TimeIn) {
        this.TimeIn = TimeIn;
    }

    public String getTimeOut() {
        return TimeOut;
    }

    public void setTimeOut(String TimeOut) {
        this.TimeOut = TimeOut;
    }
    
    
}
