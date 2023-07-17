/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import static hello.hello.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.NoSuchElementException;
import jssc.*;

public class ComPortGUI {
    static String text;
    ComPortGUI()
    {


//butOpenPort.addActionListener(new ActionListener() {
//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        String namePort = text1.getText();
//        SerialPort serialPort = new SerialPort(namePort);
//        try {
//
//      serialPort.openPort();
//      
//      serialPort.setParams(SerialPort.BAUDRATE_9600,
//          SerialPort.DATABITS_8,
//          SerialPort.STOPBITS_1,
//          SerialPort.PARITY_NONE);
//
//       int mask = SerialPort.MASK_RXCHAR;
//      
//       serialPort.setEventsMask(mask);
//       
//       text3.setText("Порт открыт");
//       
//       dfm.removeAllElements();
//        } catch (SerialPortException ex) {
//            Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}
//}
//);
        

butActPort.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
       String namePort = (String) PortSettingbutton.Port.getSelectedItem();
       SerialPort serialPort = new SerialPort(namePort);
       
        try {
            
        if(!outputfile.exists())
    {
    outputfile.createNewFile();
    dfm2.addElement("Выходной файл создан");
    
    }
        
        serialPort.openPort();
        
      serialPort.setParams(Integer.parseInt((String) PortSettingbutton.Freq.getSelectedItem()),
          Integer.parseInt((String) PortSettingbutton.Databits.getSelectedItem()), 
          Integer.parseInt((String) PortSettingbutton.Stopbits.getSelectedItem()),
          Integer.parseInt((String) PortSettingbutton.Parity.getSelectedItem()));

       int mask = SerialPort.MASK_RXCHAR;
      
       serialPort.setEventsMask(mask);
       
           try { 
       FileReader reader = new FileReader(text1.getText());
           
       BufferedReader br = new BufferedReader(new FileReader(text1.getText()));
       FileWriter filewriter = new FileWriter(outputfile, true);
       BufferedWriter bufferwriter = new BufferedWriter(filewriter);


        
        String line;
        ArrayList<String> List = new ArrayList<String>();
        
            while((line = br.readLine()) != null)
            {
                if(!line.isEmpty())
                {
                    List.add(line);
                }
            }
            System.out.print("Введенный текст: " + List + "\n");
        
            String slist = List.toString();
            
            String slist1 = slist.replace(", ", "");
            String slist2 = slist1.replace("[", "");
            text = slist2.replace("]", "");
            
            System.out.print("Обработанный текст: " + text + "\n");
                
            byte [] array = new byte[text.length()/2];
            
            int index = 0;
        int val = 0;
        int sum = 0;
        
        for (int i = 0; i < array.length; i++)
        {
            index = i * 2;
            val = Integer.parseInt(text.substring(index, index + 2), 16);
            array[i] = (byte)val;
            serialPort.writeByte(array[i]);
        }
        
        Thread.sleep(500);
        
        serialPort.addEventListener(new hello.SerialPortReader(serialPort));
       
        dfm2.addElement("Опеарция выполнена");
              
        
        }    catch (FileNotFoundException ex) {
               Logger.getLogger(ComPortGUI.class.getName()).log(Level.SEVERE, null, ex);
               dfm2.addElement("Ошибка операции (COM)1.1");
           } catch (IOException ex) {
               Logger.getLogger(ComPortGUI.class.getName()).log(Level.SEVERE, null, ex);
               dfm2.addElement("Ошибка операции (COM2)1.2");
           } catch (InterruptedException ex) {
               Logger.getLogger(ComPortGUI.class.getName()).log(Level.SEVERE, null, ex);
               dfm2.addElement("Ошибка операции (COM2)1.3");
           }
        } catch (SerialPortException ex) {
            Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
            dfm2.addElement("Ошибка операции (COM2)2.1");
        } catch (IOException ex) {
            Logger.getLogger(ComPortGUI.class.getName()).log(Level.SEVERE, null, ex);
            dfm2.addElement("Ошибка операции (COM2)2.2");
        }
}
}
);

    }
}
