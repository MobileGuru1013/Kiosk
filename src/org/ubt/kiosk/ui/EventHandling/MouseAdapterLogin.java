/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.ui.EventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.ubt.kiosk.ui.JFMain;

/**
 *
 * @author F
 */
public class MouseAdapterLogin extends MouseAdapter{
    private JFMain jfMain;

    public MouseAdapterLogin(JFMain jfMain) {
        this.jfMain = jfMain;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) 
    {
        jfMain.showStudentInformationScreen();;
    }
    
    @Override
     public void mouseEntered(MouseEvent arg0) {
        jfMain.getJlLoginLabel()
                    .setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/sign-hover.png")));
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
         jfMain.getJlLoginLabel()
                   .setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/sign.png")));
    }

}
