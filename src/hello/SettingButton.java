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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.NoSuchElementException;
import jssc.*;

/**
 *
 * @author user
 */
public class SettingButton extends hello {  
    SettingButton()
    {   
        
    butSozd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        File file = new File(text1.getText());
        
        if (!file.exists())
            try {
                file.createNewFile();
                dfm2.addElement("Файл создан");
                text1.setText(text1.getText());
                text3.setText(text1.getText());
        } catch (IOException ex) {
            Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
        }
        else
        {
            dfm2.addElement("Файл уже существует");
            text1.setText("");
        }
    }   
}
);

butZapic.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
       String name = text1.getText();
       File file = new File(name);
       if (file.exists())
       {
            try {
                FileWriter filewriter = new FileWriter(file, true);
                BufferedWriter bufferwriter = new BufferedWriter(filewriter);
                bufferwriter.write(text1area.getText() + "\r\n");
                bufferwriter.close();
                text1area.setText("");
                dfm2.addElement("Запись произведена");
        } catch (IOException ex) {
            Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            dfm2.addElement("Файла не существует ");
        }
    }  
}
);
butclear.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
       text1area.setText("");
       dfm2.addElement("Поле вывода очищено");
    }  
}
);

butDelete.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
       File file = new File(text1.getText());
       if (file.exists())
       {
            file.delete();
            dfm2.addElement("Файл удален");
            text1.setText("");
       }
       else
       {
           dfm2.addElement("Файла не сущетсвует");
       }
    }  
}
);

butVivod.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
       dfm3.removeAllElements();
       BufferedReader br = null;
       File file = new File(text1.getText());
       if (file.exists())
       {
           try {
            FileReader reader = new FileReader(text1.getText()); 
            br = new BufferedReader(new FileReader(text1.getText()));
            String line;
            while(null != (line = br.readLine()))
            {
                dfm3.addElement(line);
            }
            dfm2.addElement("Запись вопроизведена");
       } catch (IOException ex) {
               Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       else
       {
           dfm2.addElement("Файла не сущетсвует");
       }  
}
}
);

butVibor.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        JFileChooser filechooser = new JFileChooser();
        filechooser.showOpenDialog(JPanel);
        
        File file = filechooser.getSelectedFile();
        text1.setText(file.getName());
        text3.setText(file.getName());
        dfm2.addElement("Файл выбран");
    }  
}
);
butclear2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
       String name = text1.getText();
       File file = new File(name);
       if (file.exists())
       {
            try {
                FileWriter filewriter = new FileWriter(file);
                BufferedWriter bufferwriter = new BufferedWriter(filewriter);
                bufferwriter.write(""+ "\r\n");
                bufferwriter.close();
                text1area.setText("");
                dfm2.addElement("Файл очищен");
                dfm3.removeAllElements();
        } catch (IOException ex) {
            Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            dfm2.addElement("Файла не существует ");
        }
    }  
}
);
butclear3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
       if (outputfile.exists())
       {
            try {
                FileWriter filewriter = new FileWriter(outputfile);
                BufferedWriter bufferwriter = new BufferedWriter(filewriter);
                bufferwriter.write(""+ "\r\n");
                bufferwriter.close();
                text1area.setText("");
                dfm2.addElement("Выходной Файл очищен");
                dfm3.removeAllElements();
        } catch (IOException ex) {
            Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            dfm2.addElement("Файла не существует ");
        }
    }  
}
);

    }
    
}
