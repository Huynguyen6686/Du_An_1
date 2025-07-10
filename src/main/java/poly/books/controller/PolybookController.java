/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.books.controller;

import javax.swing.JDialog;
import javax.swing.JFrame;
import poly.books.ui.LoginJDialog;
import poly.books.ui.WelcomeJDialog;
import poly.books.util.XDialog;

/**
 *
 * @author HuyNguyen
 */
public interface PolybookController  {
     
     
    default void exit(){ 
        if(XDialog.confirm("Bạn muốn kết thúc?")){ 
            System.exit(0); 
        } 
    } 
        default void showJDialog(JDialog dialog){ 
        dialog.setLocationRelativeTo(null); 
        dialog.setVisible(true); 
    } 
    default void showWelcomeJDialog(JFrame frame){ 
        this.showJDialog(new WelcomeJDialog(frame, true)); 
    } 
    default void showLoginJDialog(JFrame frame){ 
        this.showJDialog(new LoginJDialog(frame, true)); 
    } 
}
