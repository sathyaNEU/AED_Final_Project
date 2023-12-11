/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        BusinessAdmin("Business Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        AppLogEmp("Application Logistics Employee"),
        Packager("Packager"),
        AA_Officer("Airport Authority Officer"),
        CargoAdmin("Cargo Admin"),
        OGLogAdmin("On-Ground Shipping Admin"),
        OGLogEmp("On-Ground Logistic Employee"),
        Customer("User");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, JPanel prevContainer);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }

}
