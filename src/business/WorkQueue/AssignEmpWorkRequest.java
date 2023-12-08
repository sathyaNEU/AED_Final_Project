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
public class AssignEmpWorkRequest extends WorkRequest{
    Pkg pkg;
    String result;

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
    
}
