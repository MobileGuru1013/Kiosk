/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.ui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author F
 */
public class JPInformationScreen extends JPanel  {

    private JLabel jlauthId = new JLabel("ID ");
    private JTextArea jtaauthID = new JTextArea("");
    private JLabel jlauthName = new JLabel("Name ");
    private JTextArea jtauthName = new JTextArea("");
    private JLabel jlauthSurname = new JLabel("Surname");
    private JTextArea jtauthSurname = new JTextArea("");
    private JLabel jlGroupName = new JLabel("Group");
    private JTextArea jtaGroupName = new JTextArea("");
    private JLabel jlCity = new JLabel("City");
    private JTextArea jtaCity = new JTextArea("");
    private JLabel jlLogOut = new JLabel("Logout");
    private JLabel jlcloseWindowsAuth = new JLabel(""); // close windows auth scree
    private JLabel jlViewSchedule = new JLabel("View Schedule");// implement Mouse Adapter same as for Sign in JLabel
    private JLabel jlEdit = new JLabel("Edit");// implement Mouse Adapter same as for Sign in JLabel

    public JPInformationScreen() {
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        
        jlauthId.setBounds(65, 10, 120, 25);
        jtaauthID.setBounds(125, 10, 120, 25);
        jlauthName.setBounds(65, 40, 120, 25);
        jtauthName.setBounds(125, 40, 120, 25);
        jlauthSurname.setBounds(65, 70, 120, 25);
        jtauthSurname.setBounds(125, 70, 120, 25);
        jlGroupName.setBounds(65, 100, 120, 25);
        jtaGroupName.setBounds(125, 100, 120, 25);
        jlCity.setBounds(65, 130, 120, 25);
        jtaCity.setBounds(125, 130, 120, 25);
        jlLogOut.setBounds(60, 700, 120, 25);
        jlEdit.setBounds(300, 700, 120, 25);
        jlViewSchedule.setBounds(540, 700, 120, 25);

        
        jlViewSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/schedule.png")));
        
        jlEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/edit.png")));
        
        jlLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/logout.png")));
        
        jtauthName.setEditable(false);
        jtaauthID.setEditable(false);
        jtauthSurname.setEditable(false);
        jtaCity.setEditable(false);
        jtaGroupName.setEditable(false);
        
        this.add(jlauthId);
        this.add(jtaauthID);
        this.add(jlauthName);
        this.add(jtauthName);
        this.add(jtauthSurname);
        this.add(jlauthSurname);
        this.add(jlGroupName);
        this.add(jtaGroupName);
        this.add(jlCity);
        this.add(jtaCity);
        //this.add(jblogout);
        this.add(jlLogOut);
        this.add(jlcloseWindowsAuth);
        this.add(jlViewSchedule);
        this.add(jlEdit);
    }

    public JLabel getLlauthId() {
        return jlauthId;
    }

    public JTextArea getJtaauthID() {
        return jtaauthID;
    }

    public JLabel getJlauthName() {
        return jlauthName;
    }

    public JTextArea getJtaauthName() {
        return jtauthName;
    }

    public JTextArea getJtaauthSurname() {
        return jtauthSurname;
    }


    public JLabel getJlcloseWindows() {
        return jlcloseWindowsAuth;
    }

    public void addEditStudentMouseAdapter(MouseAdapter e) {
        jlEdit.addMouseListener(e);
    }
    
    public void addLogOutAdapter(MouseAdapter e) {
        jlLogOut.addMouseListener(e);
    }
    
    public void addViewScheduleScreenListener(MouseAdapter e)
    {
        jlViewSchedule.addMouseListener(e);
    }

    public JTextArea getJtaGroupName() {
        return jtaGroupName;
    }

    public JTextArea getJtaCity() {
        return jtaCity;
    }
    
    
}
