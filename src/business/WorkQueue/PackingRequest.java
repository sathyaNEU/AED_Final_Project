/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Enterprise.AppLogBusiness.Pkg;

/**
 *
 * @author Sathya
 */
public class PackingRequest extends WorkRequest {
    Pkg pkg;
    String result;
    AssignEmpWorkRequest prevReq;
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Pkg getPkg() {
        return pkg;
    }

    public void setPkg(Pkg pkg) {
        this.pkg = pkg;
    }

    public AssignEmpWorkRequest getPrevReq() {
        return prevReq;
    }

    public void setPrevReq(AssignEmpWorkRequest prevReq) {
        this.prevReq = prevReq;
    }
    
}
