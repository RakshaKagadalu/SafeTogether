/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class OutbreakTracerDir {
     ArrayList<OutbreakTracer> outbreakLog = new ArrayList<OutbreakTracer>();
     
       public void addrequest(OutbreakTracer user){
        outbreakLog.add(user);
    }
    
    public void removerequest(OutbreakTracer user){
        outbreakLog.remove(user);
    }

    public ArrayList<OutbreakTracer> getOutbreakLog() {
        return outbreakLog;
    }

    public void setOutbreakLog(ArrayList<OutbreakTracer> outbreakLog) {
        this.outbreakLog = outbreakLog;
    }
    
}
