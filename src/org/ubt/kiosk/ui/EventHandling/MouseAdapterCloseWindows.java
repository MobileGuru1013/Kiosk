/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.ui.EventHandling;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import org.ubt.kiosk.ui.JFMain;

/**
 *
 * @author F
 */
public class MouseAdapterCloseWindows extends MouseAdapter {

    private JFMain jpinterface;
    
    public MouseAdapterCloseWindows(JFMain jpinterface) 
    {
        this.jpinterface = jpinterface;
    }

    @Override
    public void mouseEntered(MouseEvent arg0) 
    {
        jpinterface.getJlCloseWindowsLoginScreen()
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/close-hover.png")));
    }

    @Override
    public void mouseExited(MouseEvent arg0) 
    {

        jpinterface.getJlCloseWindowsLoginScreen()
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/close.png")));

    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
         System.exit(0);
    }
}
