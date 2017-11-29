/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.ui;

import org.ubt.kiosk.ui.EventHandling.MouseAdapterBackFromEditScreen;
import org.ubt.kiosk.ui.EventHandling.MouseAdapterCloseWindows;
import org.ubt.kiosk.ui.EventHandling.MouseAdapterEditScreen;
import org.ubt.kiosk.ui.EventHandling.MouseAdapterLogOut;
import org.ubt.kiosk.ui.EventHandling.MouseAdapterLogin;
import org.ubt.kiosk.ui.EventHandling.MouseAdapterUpdateStudentEditScreen;
import org.ubt.kiosk.ui.EventHandling.MouseAdapterViewSchedule;

/**
 *
 * @author F 
 * Starts the main Gui app, and assigns the listeners for each
 * components start the application
 */
public class Main {

    public static void main(String[] args) {
        
        JPMain jpMain = new JPMain();
        JPLoginScreen jpLoginScreen = new JPLoginScreen();
        JPInformationScreen jpStudentInformation = new JPInformationScreen();
        JPViewScheduleScreen jpViewScheduleScreen = new JPViewScheduleScreen();
        JPStudentEditScreen jpStudentEditScreen = new JPStudentEditScreen();
        JFMain jfMain = new JFMain(jpMain, jpLoginScreen, jpStudentInformation, jpViewScheduleScreen, jpStudentEditScreen);
        
        jpLoginScreen.addCloseMainWindowsMouseAdapter(new MouseAdapterCloseWindows(jfMain));
        jpLoginScreen.addLoginMouseAdapter(new MouseAdapterLogin(jfMain));
        jpStudentInformation.addEditStudentMouseAdapter(new MouseAdapterEditScreen(jfMain));
        jpStudentInformation.addViewScheduleScreenListener(new MouseAdapterViewSchedule(jfMain));
        jpStudentInformation.addLogOutAdapter(new MouseAdapterLogOut(jfMain));
        jpStudentEditScreen.addBackMouseAdapter(new MouseAdapterBackFromEditScreen(jfMain));
        jpStudentEditScreen.addUpdateMouseAdapter(new MouseAdapterUpdateStudentEditScreen(jfMain));
        jpViewScheduleScreen.addBackMouseAdapter(new MouseAdapterBackFromEditScreen(jfMain));

        jfMain.setSize(800, 800);

    }
}
