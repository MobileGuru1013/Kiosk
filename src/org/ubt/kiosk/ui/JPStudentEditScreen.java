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
public class JPStudentEditScreen extends JPanel {
    
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
    private JLabel jlUpdate = new JLabel("Update");
    private JLabel jlBack = new JLabel("Back");
    private JLabel jlCloseWindows = new JLabel();

    public JPStudentEditScreen() 
    {
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
        jlUpdate.setBounds(60, 700, 120, 25);
        jlBack.setBounds(300, 700, 120, 25);
        
        jlUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/update.png")));

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/back.png")));
        
        
        jtauthName.setEditable(false);
        jtaauthID.setEditable(false);
        jtauthSurname.setEditable(false);
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
        this.add(jlUpdate);
        this.add(jlBack);
    }

    public JLabel getJlcloseWindows() {
        return jlCloseWindows;
    }

    public JTextArea getJtaCity() {
        return jtaCity;
    }

    public JTextArea getJtaauthID() {
        return jtaauthID;
    }

    public JTextArea getJtauthName() {
        return jtauthName;
    }

    public JTextArea getJtauthSurname() {
        return jtauthSurname;
    }

    public JTextArea getJtaGroupName() {
        return jtaGroupName;
    }
    
    public void addBackMouseAdapter(MouseAdapter e) 
    {
        jlBack.addMouseListener(e);
    }

    public void addUpdateMouseAdapter(MouseAdapter e) 
    {
        jlUpdate.addMouseListener(e);
    }
}
