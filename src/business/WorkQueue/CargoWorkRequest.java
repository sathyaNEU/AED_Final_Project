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
public class CargoWorkRequest extends WorkRequest{
    Pkg pkg;
    String result;
    AssignEmpWorkRequest prevAssignEmpReq;

    public Pkg getPkg() {
        return pkg;
    }

    public void setPkg(Pkg pkg) {
        this.pkg = pkg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public AssignEmpWorkRequest getPrevAssignEmpReq() {
        return prevAssignEmpReq;
    }

    public void setPrevAssignEmpReq(AssignEmpWorkRequest prevAssignEmpReq) {
        this.prevAssignEmpReq = prevAssignEmpReq;
    }
    
    
}
