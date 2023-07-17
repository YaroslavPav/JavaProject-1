/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import static hello.ComponentPosition.butclear2;
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




public class hello{
    

    
static JFrame Frame = new JFrame("Pprog");
static JFrame Frame2 = new JFrame("Насттройка COM порта");
static JPanel JPanel = new JPanel();
   
static JTextField text1 = new JTextField(30);
static JTextField text1port = new JTextField(30);
static JTextField text3 = new JTextField(30);
static JTextArea text1area = new JTextArea(5, 30);

static DefaultListModel dfm = new DefaultListModel();
static DefaultListModel dfm2 = new DefaultListModel();
static DefaultListModel dfm3 = new DefaultListModel();
//static DefaultListModel dfm4 = new DefaultListModel();
static JList result = new JList(dfm);
//static JList PortSet = new JList(dfm4);
static JList LOG = new JList(dfm2);
static JList text2area = new JList(dfm3);
static JList LOG2 = new JList(dfm2);

static JScrollPane Scroll1area =  new JScrollPane(text1area);
static JScrollPane Scroll2area =  new JScrollPane(text2area);
static JScrollPane ScrollRes =  new JScrollPane(result);
static JScrollPane ScrollLOG =  new JScrollPane(LOG);
static JScrollPane ScrollLOG2 =  new JScrollPane(LOG2);

static JButton butSozd = new JButton("Создание файла");
static JButton butSettings = new JButton("Работа с COM портом");
static JButton butVibor = new JButton("Выбрать файл");
static JButton butVivod = new JButton("Содержимое файла");
static JButton butZapic = new JButton("Запись текста в файл");
static JButton butDelete = new JButton("Удаление файла"); 
static JButton butPort = new JButton("Выбрать порт");
static JButton butOpenPort = new JButton("Открыть порт");
static JButton butclear = new JButton("Очистить поле ввода");
static JButton butclear2 = new JButton("Очистить файл для записи");
static JButton butclear3 = new JButton("Очистить выходной файл");
static JButton butActPort = new JButton("Вывести на порт");

static JLabel Log2 = new JLabel("Ответ программы:");
static JLabel Nazv = new JLabel("Название рабочего файла:");
static JLabel NazvPole1 = new JLabel("Поле записи в файл:");
static JLabel NazvPort = new JLabel("Название порта:");
static JLabel LportName = new JLabel("Выбор порта:");
static JLabel LFreq = new JLabel("Выбор BAUDRATE:");
static JLabel LData = new JLabel("Выбор DATABITS:");
static JLabel LStop = new JLabel("Выбор STOPBITS:");
static JLabel LPAR = new JLabel("Выбор PARITY:");
static JLabel Nazv2 = new JLabel("Название рабочего файла:");
static JLabel LResult = new JLabel("Возвращенный текст:");
static JLabel namearea1 = new JLabel("Поле для записи:");
static JLabel namearea2 = new JLabel("Поле вывода:");

static File file = new File(text1.getText());
static File outputfile = new File("outputFile.txt");
   
public static void main(String args[]) throws FileNotFoundException, IOException {  

JPanel.revalidate();

butSozd.setCursor(new Cursor(Cursor.HAND_CURSOR));
butDelete.setCursor(new Cursor(Cursor.HAND_CURSOR));
butVibor.setCursor(new Cursor(Cursor.HAND_CURSOR));
butZapic.setCursor(new Cursor(Cursor.HAND_CURSOR));
butSettings.setCursor(new Cursor(Cursor.HAND_CURSOR));
butVivod.setCursor(new Cursor(Cursor.HAND_CURSOR));
butPort.setCursor(new Cursor(Cursor.HAND_CURSOR));
butclear.setCursor(new Cursor(Cursor.HAND_CURSOR));
butclear2.setCursor(new Cursor(Cursor.HAND_CURSOR));
butclear3.setCursor(new Cursor(Cursor.HAND_CURSOR));
butActPort.setCursor(new Cursor(Cursor.HAND_CURSOR));

new SettingButton();
new ComPortGUI();
new ComponentPosition();
new PortSettingbutton();

Toolkit razmer = Toolkit.getDefaultToolkit();
Dimension position = razmer.getScreenSize();
text1area.setLineWrap(true);

//JPanel.setBackground(Color.WHITE);
Frame.setSize(1920,1080);
Frame.setLocationRelativeTo(null);
Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
Frame.setLayout(new GridBagLayout());
    
Frame.add(butSettings, ComponentPosition.butSettings);
Frame.add(butSozd, ComponentPosition.butsozd);
Frame.add(butclear, ComponentPosition.butclear);
Frame.add(butVibor, ComponentPosition.butvibor);
Frame.add(butVivod, ComponentPosition.butvivod);
Frame.add(butZapic, ComponentPosition.butzapic);
Frame.add(butDelete, ComponentPosition.butdel);
Frame.add(butclear2, ComponentPosition.butclear2);


Frame.add(text1, ComponentPosition.c3);
Frame.add(Scroll1area, ComponentPosition.text1area);
Frame.add(Scroll2area, ComponentPosition.text2area);
Frame.add(Nazv, ComponentPosition.NAZV);
Frame.add(namearea1, ComponentPosition.namearea1);
Frame.add(namearea2, ComponentPosition.namearea2);
Frame.add(Log2, ComponentPosition.LOG2);
Frame.add(ScrollLOG, ComponentPosition.LOG);




Frame.setVisible(true);

Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
}

static class SerialPortReader implements SerialPortEventListener {
    
    private SerialPort serialPort;
    
    public SerialPortReader(SerialPort serialPort) {
      this.serialPort = serialPort;
    }

    @Override
    public void serialEvent(SerialPortEvent event) {
        


            if (event.isRXCHAR() && event.getEventValue() > 1)

            {
                int [] BAZA = new int[ComPortGUI.text.length()/2];
                String[] hex = new String[BAZA.length];
                try {
                    FileWriter filewriter = new FileWriter(outputfile, true);
                    BufferedWriter bufferwriter = new BufferedWriter(filewriter);
                    BAZA = serialPort.readIntArray();
                    dfm.removeAllElements();
                    for (int i = 0; i < BAZA.length; i++)
                    {   

                        hex[i] = Integer.toHexString(BAZA[i]);

                        result.setLayoutOrientation(JList.HEIGHT);
//                        System.out.print(hex[i] + " ");  
                        bufferwriter.write(hex[i]);
                        bufferwriter.write(" - ");
                        bufferwriter.write(BAZA[i] + " ");
                        bufferwriter.write("\n");
                        dfm.addElement(hex[i] + " ");                        
                    }

                    bufferwriter.write("\n");
                    bufferwriter.close();

                    serialPort.closePort();
                    System.out.println("Порт закрыт"); 
                } catch (SerialPortException ex) {
                    Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(hello.class.getName()).log(Level.SEVERE, null, ex);
                }
            }     
        }
  }

}
