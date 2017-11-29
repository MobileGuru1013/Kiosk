/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.ui.EventHandling;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.ubt.kiosk.ui.JFMain;

/**
 *
 * @author F
 */
public class MouseAdapterViewSchedule extends MouseAdapter{
    private JFMain jfMain;

    public MouseAdapterViewSchedule(JFMain jfMain) 
    {
        this.jfMain = jfMain;
    }
    
    @Override
    public void mouseClicked(MouseEvent arg0) 
    {
        jfMain.showViewScheduleScreen();
    }
    
}
