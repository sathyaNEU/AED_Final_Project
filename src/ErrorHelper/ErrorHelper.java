/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErrorHelper;

import javax.swing.JOptionPane;

/**
 *
 * @author Sathya
 */
public class ErrorHelper {
    public static void showWarning(String errMsg){
        JOptionPane.showMessageDialog(null, errMsg, "Warning", JOptionPane.WARNING_MESSAGE);
    }
    public static void showError(String errMsg){
         JOptionPane.showMessageDialog(null, errMsg, "Error", JOptionPane.WARNING_MESSAGE);
    }
}
