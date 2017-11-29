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
public class JPViewScheduleScreen extends JPanel  {

    private JLabel jlSubjectName = new JLabel("Name");
    private JTextArea jtaSubjectName = new JTextArea("");
    private JLabel jlStartTime = new JLabel("Start ");
    private JTextArea jtaStartTime = new JTextArea("");
    private JLabel jlEndTime = new JLabel("End ");
    private JTextArea jtaEndTime = new JTextArea("");
    private JLabel jlRoomNumber = new JLabel("Room ");
    private JTextArea jtaRoomNumber = new JTextArea("");
    private JLabel jlStatus = new JLabel("Status");
    private JTextArea jtaStatus = new JTextArea("");
    private JLabel jlBack = new JLabel("Back");
    private JLabel jlcloseWindowsAuth = new JLabel(""); // close windows auth scree

    public JPViewScheduleScreen() {
        this.setBackground(Color.GRAY);
        this.setLayout(null);

        jlSubjectName.setBounds(65, 10, 120, 25);
        jtaSubjectName.setBounds(125, 10, 120, 25);
        jlStartTime.setBounds(65, 40, 120, 25);
        jtaStartTime.setBounds(125, 40, 120, 25);
        jlEndTime.setBounds(65, 70, 120, 25);
        jtaEndTime.setBounds(125, 70, 120, 25);
        jlRoomNumber.setBounds(65, 100, 120, 25);
        jtaRoomNumber.setBounds(125, 100, 120, 25);
        jlStatus.setBounds(65, 130, 120, 25);
        jtaStatus.setBounds(125, 130, 120, 25);
        jlBack.setBounds(300, 700, 120, 25);

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/back.png")));

        jtaSubjectName.setEditable(false);
        jtaStartTime.setEditable(false);
        jtaEndTime.setEditable(false);
        jtaRoomNumber.setEditable(false);
        jtaStatus.setEditable(false);

        this.add(jlSubjectName);
        this.add(jtaSubjectName);
        this.add(jlStartTime);
        this.add(jtaStartTime);
        this.add(jlEndTime);
        this.add(jtaEndTime);
        this.add(jlRoomNumber);
        this.add(jtaRoomNumber);
        this.add(jlStatus);
        this.add(jtaStatus);
        this.add(jlBack);

    }

    public JLabel getJlcloseWindows() {
        return jlcloseWindowsAuth;
    }

    public void addBackMouseAdapter(MouseAdapter e) {
        jlBack.addMouseListener(e);
    }

    public JTextArea getJtaSubjectName() {
        return jtaSubjectName;
    }

    public JTextArea getJtaStartTime() {
        return jtaStartTime;
    }

    public JTextArea getJtaEndTime() {
        return jtaEndTime;
    }

    public JTextArea getJtaRoomNumber() {
        return jtaRoomNumber;
    }

    public JTextArea getJtaStatus() {
        return jtaStatus;
    }



    
    
}
