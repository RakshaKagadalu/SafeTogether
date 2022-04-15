/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAcc.UserAcc;
import java.util.Date;

/**
 *
 * @author raksh
 */
class WorkRequest {
     
    private Date mrequestDate;
    private Date mresolveDate;
    private String message;
    private String mstatus;

    public WorkRequest() {
         mrequestDate = new Date();
    }
    private UserAcc msender;
    private UserAcc mreceiver;

    public Date getMrequestDate() {
        return mrequestDate;
    }

    public void setMrequestDate(Date mrequestDate) {
        this.mrequestDate = mrequestDate;
    }

    public Date getMresolveDate() {
        return mresolveDate;
    }

    public void setMresolveDate(Date mresolveDate) {
        this.mresolveDate = mresolveDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    public UserAcc getMsender() {
        return msender;
    }

    public void setMsender(UserAcc msender) {
        this.msender = msender;
    }

    public UserAcc getMreceiver() {
        return mreceiver;
    }

    public void setMreceiver(UserAcc mreceiver) {
        this.mreceiver = mreceiver;
    }
    
    
}
