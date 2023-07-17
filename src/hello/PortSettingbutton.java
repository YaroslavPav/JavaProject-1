/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;



import static hello.ComponentPosition.butAct;
import static hello.hello.Frame;
import static hello.hello.Frame2;
import static hello.hello.butSozd;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JList;
import jssc.SerialPortList;

/**
 *
 * @author user
 */
public class PortSettingbutton extends hello {
    static String[] portNames = SerialPortList.getPortNames();
    static String[] portfreq = {"9600", "1200", "4800", "14400", "19200"};
    static String[] portDATABITS = {"8", "5", "7", "8"};
    static String[] portStopBITS = {"1", "2"};
    static String[] parity = {"0", "1", "2", "3", "4"};
    
    static JComboBox Port = new JComboBox(portNames); 
    static JComboBox Freq = new JComboBox(portfreq); 
    static JComboBox Databits = new JComboBox(portDATABITS); 
    static JComboBox Stopbits = new JComboBox(portStopBITS); 
    static JComboBox Parity = new JComboBox(parity);
    PortSettingbutton(){
        
    Port.setCursor(new Cursor(Cursor.HAND_CURSOR));
    Freq.setCursor(new Cursor(Cursor.HAND_CURSOR));
    Databits.setCursor(new Cursor(Cursor.HAND_CURSOR));
    Stopbits.setCursor(new Cursor(Cursor.HAND_CURSOR));
    Parity.setCursor(new Cursor(Cursor.HAND_CURSOR));

    butSettings.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) { 

        Frame2.setSize(1920,1080);
        Frame2.setLocationRelativeTo(null);

        Frame2.setLayout(new GridBagLayout());
        Frame2.setVisible(true);
        
        result.setLayoutOrientation(JList.HEIGHT);
        Frame2.add(Port, ComponentPosition.portLis);
        Frame2.add(Freq, ComponentPosition.Freq);
        Frame2.add(Databits, ComponentPosition.DATA);
        Frame2.add(Stopbits, ComponentPosition.STOP);
        Frame2.add(Parity, ComponentPosition.PAR);
        Frame2.add(Log2, ComponentPosition.LOG2_2);
        Frame2.add(ScrollLOG2, ComponentPosition.LOG_2);
        Frame2.add(LportName, ComponentPosition.LportLis);
        Frame2.add(LFreq, ComponentPosition.LFreq);
        Frame2.add(LData, ComponentPosition.LDATA);
        Frame2.add(LStop, ComponentPosition.LSTOP);
        Frame2.add(LPAR, ComponentPosition.LPARy);
        Frame2.add(ScrollRes, ComponentPosition.LRES);
        Frame2.add(LResult, ComponentPosition.LRES_2);
        Frame2.add(butActPort, ComponentPosition.butAct);
        Frame2.add(text3, ComponentPosition.name);
        Frame2.add(Nazv2, ComponentPosition.name1);
        Frame2.add(butclear3, ComponentPosition.butclear3);
        
        Frame2.pack();
        Frame2.setLocationRelativeTo(null);
        }
}
);
    
    }
}
