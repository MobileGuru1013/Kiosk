/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author F
 */
public class JPLoginScreen extends JPanel{

    private JPasswordField jtfpassCode = new JPasswordField(10);
    private JTextField jtfstudentId = new JTextField(10);
    private JLabel jlpassCode = new JLabel("");// Enter your pass code
    private JLabel jlstudentId = new JLabel("");// Student ID
    private JLabel jllogin = new JLabel("");//login JLabel
    private JLabel jlcloseWindows = new JLabel(""); // close windows main screen

    public JPLoginScreen() {
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        
        jtfpassCode.setBorder(null);
        jtfpassCode.setHorizontalAlignment(0);
        jtfpassCode.setForeground(Color.GRAY);
        jtfpassCode.setFont(new Font("Tahoma", 1, 16));
        jtfpassCode.setBounds(83, 178, 136, 20);// studentId.setBounds(83, 178, 136, 20);
        
        jtfstudentId.setBorder(null);
        jtfstudentId.setHorizontalAlignment(0);
        jtfstudentId.setForeground(Color.GRAY);
        jtfstudentId.setFont(new Font("Tahoma", 1, 16));
        jtfstudentId.setBounds(83, 139, 136, 20);
        
        jlpassCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/textField.png")));
        jlpassCode.setBounds(78, 133, 145, 30);// 78,133
        
        jlstudentId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/textField.png")));
        jlstudentId.setBounds(78, 173, 145, 30);//78,173

        jllogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/sign.png")));
        jllogin.setBounds(78, 219, 140, 38);
        
        jlcloseWindows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/ubt/kiosk/view/images/close.png")));
        jlcloseWindows.setBounds(760, 1, 25, 25);
        
        this.add(jlstudentId);
        this.add(jtfstudentId);
        this.add(jlpassCode);// disable passcodeLabel if there is no RFID Input
        this.add(jtfpassCode);// disable passcode if there is no RFID Input
        this.add(jllogin);// disable login if there is no RFID Input
        this.add(jlcloseWindows);
        jtfstudentId.requestFocusInWindow();

    }

    public JPasswordField getJtfpassCode() {
        return jtfpassCode;
    }

    public JTextField getJtfstudentId() {
        return jtfstudentId;
    }

    public JLabel getJlpassCode() {
        return jlpassCode;
    }

    public JLabel getJlstudentId() {
        return jlstudentId;
    }

    public JLabel getJllogin() {
        return jllogin;
    }

    public JLabel getJlcloseWindows() {
        return jlcloseWindows;
    }
    
    public void addCloseMainWindowsMouseAdapter(MouseAdapter e) 
    {
        jlcloseWindows.addMouseListener(e);
    }

    public void addLoginMouseAdapter(MouseAdapter e) 
    {
        jllogin.addMouseListener(e);
    }
    
}
