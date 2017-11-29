/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.ui;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.ubt.kiosk.bussiness.AuthenticateUser;
import org.ubt.kiosk.bussiness.PersonService;
import org.ubt.kiosk.bussiness.StudentService;
import org.ubt.kiosk.entity.Person;
import org.ubt.kiosk.entity.Student;

/**
 *
 * @author F
 */
public class JFMain extends JFrame {

    private JPMain jpMain;
    private JPLoginScreen jpLoginScreen;
    private JPInformationScreen jpAuthScreen;
    private JPViewScheduleScreen jpViewScheduleScreen;
    private JPStudentEditScreen jpStudentEditScreen;
    private CardLayout clCardlayout ;
    private StudentService studentService;
    private PersonService personService;
    private Student student;

    public JFMain(JPMain jpMain, JPLoginScreen jpLoginScreen, JPInformationScreen jpAuthScreen,
            JPViewScheduleScreen jpViewScheduleScreen, JPStudentEditScreen jpStudentEditScreen) {
        this.jpMain = jpMain;
        this.jpLoginScreen = jpLoginScreen;
        this.jpAuthScreen = jpAuthScreen;
        this.jpViewScheduleScreen = jpViewScheduleScreen;
        this.jpStudentEditScreen = jpStudentEditScreen;
        clCardlayout = new CardLayout();
        studentService = new StudentService();
        personService = new PersonService();
        setUndecorated(true);// disable the minimize, maximize, close
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setBounds(100, 100, 300, 300);
        jpMain.setLayout(clCardlayout);
        //jploginscreen.setLayout(null);// if you want to change the [x, y, w, h] of  components set the layout manager to null...
        //but you will have problems when the frame size  changes
        //jpauthscreen.setLayout(null);
        jpMain.add(jpLoginScreen, "Login Screen");// it works by using the second paramteter to switch the JPanels
        jpMain.add(jpAuthScreen, "Information Screen");
        jpMain.add(jpStudentEditScreen, "Student");
        jpMain.add(jpViewScheduleScreen, "Schedule");
        clCardlayout.show(jpMain, "Change");

        add(jpMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Student Information System - Terminal Point");
        pack();
        setVisible(true);
    }

    public Student authUser() {
        String id = jpLoginScreen.getJtfstudentId().getText();
        String passcode = new String(jpLoginScreen.getJtfpassCode().getPassword());
        AuthenticateUser auth = new AuthenticateUser();
        Student value = auth.authenticate(id, passcode);
        return value;
    }

    public void showStudentInformationScreen() {
        student = authUser();
        if (student != null) {
            jpAuthScreen.getJtaauthID().setText(student.getStudentId() + "");
            jpAuthScreen.getJtaauthName().setText(student.getPersonId().getFirstName());
            jpAuthScreen.getJtaauthSurname().setText(student.getPersonId().getLastName());
            jpAuthScreen.getJtaGroupName().setText(student.getGroupId().getGroupName());
            jpAuthScreen.getJtaCity().setText(student.getPersonId().getCity());
            //clCardlayout.show(jpMain, "Information Screen");
            //switchToScreen(informationScreen);
            jpLoginScreen.setVisible(false);
            jpViewScheduleScreen.setVisible(false);
            jpStudentEditScreen.setVisible(false);
            jpAuthScreen.setVisible(true);
            //clCardlayout.next(jpMain);
            //clCardlayout.next(jpMain);
        } else {
            JOptionPane.showMessageDialog(null, "Wrong passcode");
        }
    }

    public void showLoginScreen() {
        jpLoginScreen.getJtfstudentId().setText("");
        jpLoginScreen.getJtfpassCode().setText("");
        jpLoginScreen.getJtfstudentId().requestFocusInWindow();
        //clCardlayout.show(jpMain, "Login Screen"); Maybe i will not use CardLayout
        //clCardlayout.previous(jpMain);
        //switchToScreen(loginScreen);
        //jpViewScheduleScreen.setVisible(false);
        jpAuthScreen.setVisible(false);
        jpStudentEditScreen.setVisible(false);
        jpViewScheduleScreen.setVisible(false);
        jpLoginScreen.setVisible(true);
        jpLoginScreen.getJtfstudentId().requestFocusInWindow();// request focus after logout

    }
    
    public void showViewScheduleScreen()
    {
        jpViewScheduleScreen.getJtaSubjectName()
                        .setText(student.getGroupId().getScheduleId().getSubjectId().getSubjectName());
        jpViewScheduleScreen.getJtaStartTime()
                        .setText(student.getGroupId().getScheduleId().getStartTime().toString()+"");
        jpViewScheduleScreen.getJtaEndTime()
                        .setText(student.getGroupId().getScheduleId().getEndTime().toString()+"");
        jpViewScheduleScreen.getJtaRoomNumber()
                        .setText(student.getGroupId().getScheduleId().getRoomId().getRoomId()+"");
        jpViewScheduleScreen.getJtaStatus()
                        .setText(student.getGroupId().getScheduleId().getStatusId().getStatusName());
        
        jpAuthScreen.setVisible(false);
        jpLoginScreen.setVisible(false);
        jpStudentEditScreen.setVisible(false);
        jpViewScheduleScreen.setVisible(true);
        
    }
    
    public void showEditStudentScreen() 
    {
        jpStudentEditScreen.getJtaCity().setText(student.getPersonId().getCity());
        jpStudentEditScreen.getJtaauthID().setText(student.getStudentId()+"");
        jpStudentEditScreen.getJtaGroupName().setText(student.getGroupId().getGroupName());
        jpStudentEditScreen.getJtauthName().setText(student.getPersonId().getFirstName());
        jpStudentEditScreen.getJtauthSurname().setText(student.getPersonId().getLastName());
        
        jpAuthScreen.setVisible(false);
        jpLoginScreen.setVisible(false);
        jpViewScheduleScreen.setVisible(false);
        jpStudentEditScreen.setVisible(true);

    }
    
    
    public void editStudent()
    {
        Person person = student.getPersonId();
        person.setCity(jpStudentEditScreen.getJtaCity().getText());
        student.setPersonId(person);
        person.setStudent(student);
        personService.update(person);
        studentService.update(student);
    }

    public JLabel getJlCloseWindowsLoginScreen() {
        return jpLoginScreen.getJlcloseWindows();
    }
    
     public JLabel getJlLoginLabel() {
        return jpLoginScreen.getJllogin();
    }



    public void switchToScreen(String screen)
    {
        clCardlayout.show(jpMain, screen);
    }

}
