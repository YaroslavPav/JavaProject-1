/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 *
 * @author user
 */
public class ComponentPosition extends hello { 
static GridBagConstraints butsozd = new GridBagConstraints();
static GridBagConstraints butAct = new GridBagConstraints();
static GridBagConstraints butvibor = new GridBagConstraints(); 
static GridBagConstraints butdel = new GridBagConstraints(); 
static GridBagConstraints c3 = new GridBagConstraints(); 
static GridBagConstraints NAZV = new GridBagConstraints(); 
static GridBagConstraints LOG = new GridBagConstraints(); 
static GridBagConstraints LOG2 = new GridBagConstraints();
static GridBagConstraints LOG_2 = new GridBagConstraints();
static GridBagConstraints LOG2_2 = new GridBagConstraints();
static GridBagConstraints butzapic = new GridBagConstraints();
static GridBagConstraints text1area = new GridBagConstraints();
static GridBagConstraints butvivod = new GridBagConstraints();
static GridBagConstraints text2area = new GridBagConstraints();
static GridBagConstraints butclear = new GridBagConstraints();
static GridBagConstraints butclear2 = new GridBagConstraints();
static GridBagConstraints butclear3 = new GridBagConstraints();
static GridBagConstraints butSettings = new GridBagConstraints();
static GridBagConstraints butPor = new GridBagConstraints();
static GridBagConstraints portLis = new GridBagConstraints();
static GridBagConstraints Freq = new GridBagConstraints();
static GridBagConstraints DATA = new GridBagConstraints();
static GridBagConstraints STOP = new GridBagConstraints();
static GridBagConstraints PAR = new GridBagConstraints();
static GridBagConstraints LportLis = new GridBagConstraints();
static GridBagConstraints LFreq = new GridBagConstraints();
static GridBagConstraints LDATA = new GridBagConstraints();
static GridBagConstraints LSTOP = new GridBagConstraints();
static GridBagConstraints LPARy = new GridBagConstraints();
static GridBagConstraints LRES = new GridBagConstraints();
static GridBagConstraints LRES_2 = new GridBagConstraints();
static GridBagConstraints name = new GridBagConstraints();
static GridBagConstraints name1 = new GridBagConstraints();
static GridBagConstraints namearea1 = new GridBagConstraints();
static GridBagConstraints namearea2 = new GridBagConstraints();

ComponentPosition() {  
 
//Блок кнопок
    
butsozd.gridx = 0;
butsozd.gridy = 0;
butsozd.gridheight = 1;
butsozd.gridwidth = 1;
butsozd.weightx = 1;
butsozd.weighty = 1;
butsozd.anchor = GridBagConstraints.NORTH;
butsozd.fill = GridBagConstraints.HORIZONTAL;
butsozd.insets = new Insets(50,20,2,2100);
butsozd.ipady = 5;
butsozd.ipadx = 0;

butvibor.gridx = 0;
butvibor.gridy = 0;
butvibor.gridheight = 1;
butvibor.gridwidth = 1;
butvibor.weightx = 1;
butvibor.weighty = 1;
butvibor.anchor = GridBagConstraints.NORTH;
butvibor.fill = GridBagConstraints.HORIZONTAL;
butvibor.insets = new Insets(90,20,2,2100);
butvibor.ipady = 5;
butvibor.ipadx = 0;

butdel.gridx = 0;
butdel.gridy = 0;
butdel.gridheight = 1;
butdel.gridwidth = 1;
butdel.weightx = 1;
butdel.weighty = 1;
butdel.anchor = GridBagConstraints.NORTH;
butdel.fill = GridBagConstraints.HORIZONTAL;
butdel.insets = new Insets(130,20,2,2100);
butdel.ipady = 5;
butdel.ipadx = 0;

butzapic.gridx = 0;
butzapic.gridy = 0;
butzapic.gridheight = 1;
butzapic.gridwidth = 1;
butzapic.weightx = 1;
butzapic.weighty = 1;
butzapic.anchor = GridBagConstraints.NORTH;
butzapic.fill = GridBagConstraints.HORIZONTAL;
butzapic.insets = new Insets(300,20,2,2100);
butzapic.ipady = 5;
butzapic.ipadx = 0;

butvivod.gridx = 0;
butvivod.gridy = 0;
butvivod.gridheight = 1;
butvivod.gridwidth = 1;
butvivod.weightx = 1;
butvivod.weighty = 1;
butvivod.anchor = GridBagConstraints.NORTH;
butvivod.fill = GridBagConstraints.HORIZONTAL;
butvivod.insets = new Insets(550,20,2,2100);
butvivod.ipady = 5;
butvivod.ipadx = 0;

butclear.gridx = 0;
butclear.gridy = 0;
butclear.gridheight = 1;
butclear.gridwidth = 1;
butclear.weightx = 1;
butclear.weighty = 1;
butclear.anchor = GridBagConstraints.NORTH;
butclear.fill = GridBagConstraints.HORIZONTAL;
butclear.insets = new Insets(350,20,2,2100);
butclear.ipady = 5;
butclear.ipadx = 0;

butclear2.gridx = 0;
butclear2.gridy = 0;
butclear2.gridheight = 1;
butclear2.gridwidth = 1;
butclear2.weightx = 1;
butclear2.weighty = 1;
butclear2.anchor = GridBagConstraints.NORTH;
butclear2.fill = GridBagConstraints.HORIZONTAL;
butclear2.insets = new Insets(400,20,2,2100);
butclear2.ipady = 5;
butclear2.ipadx = 0;

butSettings.gridx = 0;
butSettings.gridy = 0;
butSettings.gridheight = 1;
butSettings.gridwidth = 1;
butSettings.weightx = 1;
butSettings.weighty = 1;
butSettings.anchor = GridBagConstraints.NORTH;
butSettings.fill = GridBagConstraints.HORIZONTAL;
butSettings.insets = new Insets(40,1100,2,1000);
butSettings.ipady = 5;
butSettings.ipadx = 0;

//Блок текстфилдов

c3.gridx = 0;
c3.gridy = 0;
c3.gridheight = 1;
c3.gridwidth = 1;
c3.weightx = 1;
c3.weighty = 1;
c3.anchor = GridBagConstraints.NORTH;
c3.fill = GridBagConstraints.HORIZONTAL;
c3.insets = new Insets(75,500,2,1700);
c3.ipady = 30;
c3.ipadx = 0;

text1area.gridx = 0;
text1area.gridy = 0;
text1area.gridheight = 1;
text1area.gridwidth = 1;
text1area.weightx = 1;
text1area.weighty = 1;
text1area.anchor = GridBagConstraints.NORTH;
text1area.fill = GridBagConstraints.HORIZONTAL;
text1area.insets = new Insets(350,500,2,1700);
text1area.ipady = 0;
text1area.ipadx = 0;

text2area.gridx = 0;
text2area.gridy = 0;
text2area.gridheight = 1;
text2area.gridwidth = 1;
text2area.weightx = 1;
text2area.weighty = 1;
text2area.anchor = GridBagConstraints.NORTH;
text2area.fill = GridBagConstraints.HORIZONTAL;
text2area.insets = new Insets(500,500,2,1700);
text2area.ipady = 0;
text2area.ipadx = 0;

namearea1.gridx = 0;
namearea1.gridy = 0;
namearea1.gridheight = 1;
namearea1.gridwidth = 1;
namearea1.weightx = 1;
namearea1.weighty = 1;
namearea1.anchor = GridBagConstraints.NORTH;
namearea1.fill = GridBagConstraints.HORIZONTAL;
namearea1.insets = new Insets(320,500,2,1700);
namearea1.ipady = 0;
namearea1.ipadx = 0;

namearea2.gridx = 0;
namearea2.gridy = 0;
namearea2.gridheight = 1;
namearea2.gridwidth = 1;
namearea2.weightx = 1;
namearea2.weighty = 1;
namearea2.anchor = GridBagConstraints.NORTH;
namearea2.fill = GridBagConstraints.HORIZONTAL;
namearea2.insets = new Insets(470,500,2,1700);
namearea2.ipady = 0;
namearea2.ipadx = 0;

LOG.gridx = 0;
LOG.gridy = 0;
LOG.gridheight = 1;
LOG.gridwidth = 1;
LOG.weightx = 0;
LOG.weighty = 0;
LOG.anchor = GridBagConstraints.EAST;
LOG.fill = GridBagConstraints.VERTICAL;
LOG.insets = new Insets(80,2,100,50);
LOG.ipady = 0;
LOG.ipadx = 30;

//Блок подписей

LOG2.gridx = 0;
LOG2.gridy = 0;
LOG2.gridheight = 1;
LOG2.gridwidth = 1;
LOG2.weightx = 0;
LOG2.weighty = 0;
LOG2.anchor = GridBagConstraints.NORTH;
LOG2.fill = GridBagConstraints.HORIZONTAL;
LOG2.insets = new Insets(45,2220,150,50);
LOG2.ipady = 0;
LOG2.ipadx = 0;


NAZV.gridx = 0;
NAZV.gridy = 0;
NAZV.gridheight = 10;
NAZV.gridwidth = 10;
NAZV.weightx = 2;
NAZV.weighty = 2;
NAZV.anchor = GridBagConstraints.NORTH;
NAZV.fill = GridBagConstraints.HORIZONTAL;
NAZV.insets = new Insets(45,500,2,1700);
NAZV.ipady = 8;
NAZV.ipadx = 0;

//Блок скроллов


// Окно настройки 

butclear3.gridx = 0;
butclear3.gridy = 4;
butclear3.gridheight = 1;
butclear3.gridwidth = 2;
butclear3.weightx = 1;
butclear3.weighty = 1;
butclear3.anchor = GridBagConstraints.NORTH;
butclear3.fill = GridBagConstraints.HORIZONTAL;
butclear3.insets = new Insets(250,20,2,0);
butclear3.ipady = 5;
butclear3.ipadx = 0;

portLis.gridx = 1;
portLis.gridy = 0;
portLis.gridheight = 1;
portLis.gridwidth = 1;
portLis.weightx = 0;
portLis.weighty = 0;
portLis.anchor = GridBagConstraints.NORTH;
portLis.fill = GridBagConstraints.HORIZONTAL;
portLis.insets = new Insets(50,20,2,100);
portLis.ipady = 50;
portLis.ipadx = 80;

Freq.gridx = 1;
Freq.gridy = 1;
Freq.gridheight = 1;
Freq.gridwidth = 1;
Freq.weightx = 0;
Freq.weighty = 0;
Freq.anchor = GridBagConstraints.NORTH;
Freq.fill = GridBagConstraints.HORIZONTAL;
Freq.insets = new Insets(50,20,2,100);
Freq.ipady = 50;
Freq.ipadx = 80;

DATA.gridx = 1;
DATA.gridy = 2;
DATA.gridheight = 1;
DATA.gridwidth = 1;
DATA.weightx = 0;
DATA.weighty = 0;
DATA.anchor = GridBagConstraints.NORTH;
DATA.fill = GridBagConstraints.HORIZONTAL;
DATA.insets = new Insets(50,20,2,100);
DATA.ipady = 50;
DATA.ipadx = 80;

STOP.gridx = 1;
STOP.gridy = 3;
STOP.gridheight = 1;
STOP.gridwidth = 1;
STOP.weightx = 0;
STOP.weighty = 0;
STOP.anchor = GridBagConstraints.NORTH;
STOP.fill = GridBagConstraints.HORIZONTAL;
STOP.insets = new Insets(50,20,2,100);
STOP.ipady = 50;
STOP.ipadx = 80;

PAR.gridx = 1;
PAR.gridy = 4;
PAR.gridheight = 1;
PAR.gridwidth = 1;
PAR.weightx = 0;
PAR.weighty = 0;
PAR.anchor = GridBagConstraints.NORTH;
PAR.fill = GridBagConstraints.HORIZONTAL;
PAR.insets = new Insets(50,20,800,100);
PAR.ipady = 50;
PAR.ipadx = 80;

LOG2_2.gridx = 3;
LOG2_2.gridy = 0;
LOG2_2.gridheight = 5;
LOG2_2.gridwidth = 1;
LOG2_2.weightx = 0;
LOG2_2.weighty = 0;
LOG2_2.anchor = GridBagConstraints.NORTH;
LOG2_2.fill = GridBagConstraints.HORIZONTAL;
LOG2_2.insets = new Insets(50,20,2,120);
LOG2_2.ipady = 0;
LOG2_2.ipadx = 0;

LOG_2.gridx = 3;
LOG_2.gridy = 1;
LOG_2.gridheight = 5;
LOG_2.gridwidth = 1;
LOG_2.weightx = 0;
LOG_2.weighty = 0;
LOG_2.anchor = GridBagConstraints.NORTH;
LOG_2.fill = GridBagConstraints.HORIZONTAL;
LOG_2.insets = new Insets(2,2,500,120);
LOG_2.ipady = 700;
LOG_2.ipadx = 300;

LportLis.gridx = 0;
LportLis.gridy = 0;
LportLis.gridheight = 1;
LportLis.gridwidth = 1;
LportLis.weightx = 0;
LportLis.weighty = 0;
LportLis.anchor = GridBagConstraints.NORTH;
LportLis.fill = GridBagConstraints.HORIZONTAL;
LportLis.insets = new Insets(50,20,2,0);
LportLis.ipady = 50;
LportLis.ipadx = 80;

LFreq.gridx = 0;
LFreq.gridy = 1;
LFreq.gridheight = 1;
LFreq.gridwidth = 1;
LFreq.weightx = 0;
LFreq.weighty = 0;
LFreq.anchor = GridBagConstraints.NORTH;
LFreq.fill = GridBagConstraints.HORIZONTAL;
LFreq.insets = new Insets(50,20,2,0);
LFreq.ipady = 50;
LFreq.ipadx = 80;

LDATA.gridx = 0;
LDATA.gridy = 2;
LDATA.gridheight = 1;
LDATA.gridwidth = 1;
LDATA.weightx = 0;
LDATA.weighty = 0;
LDATA.anchor = GridBagConstraints.NORTH;
LDATA.fill = GridBagConstraints.HORIZONTAL;
LDATA.insets = new Insets(50,20,2,0);
LDATA.ipady = 50;
LDATA.ipadx = 80;

LSTOP.gridx = 0;
LSTOP.gridy = 3;
LSTOP.gridheight = 1;
LSTOP.gridwidth = 1;
LSTOP.weightx = 0;
LSTOP.weighty = 0;
LSTOP.anchor = GridBagConstraints.NORTH;
LSTOP.fill = GridBagConstraints.HORIZONTAL;
LSTOP.insets = new Insets(50,20,2,0);
LSTOP.ipady = 50;
LSTOP.ipadx = 80;

LPARy.gridx = 0;
LPARy.gridy = 4;
LPARy.gridheight = 1;
LPARy.gridwidth = 1;
LPARy.weightx = 0;
LPARy.weighty = 0;
LPARy.anchor = GridBagConstraints.NORTH;
LPARy.fill = GridBagConstraints.HORIZONTAL;
LPARy.insets = new Insets(50,20,2,0);
LPARy.ipady = 50;
LPARy.ipadx = 80;

butAct.gridx = 0;
butAct.gridy = 4;
butAct.gridheight = 1;
butAct.gridwidth = 2;
butAct.weightx = 0;
butAct.weighty = 0;
butAct.anchor = GridBagConstraints.NORTH;
butAct.fill = GridBagConstraints.HORIZONTAL;
butAct.insets = new Insets(150,20,2,0);
butAct.ipady = 10;
butAct.ipadx = 0;

LRES.gridx = 2;
LRES.gridy = 1;
LRES.gridheight = 5;
LRES.gridwidth = 1;
LRES.weightx = 0;
LRES.weighty = 0;
LRES.anchor = GridBagConstraints.NORTH;
LRES.fill = GridBagConstraints.HORIZONTAL;
LRES.insets = new Insets(2,20,2,900);
LRES.ipady = 300;
LRES.ipadx = 500;

LRES_2.gridx = 2;
LRES_2.gridy = 0;
LRES_2.gridheight = 1;
LRES_2.gridwidth = 1;
LRES_2.weightx = 0;
LRES_2.weighty = 0;
LRES_2.anchor = GridBagConstraints.NORTH;
LRES_2.fill = GridBagConstraints.HORIZONTAL;
LRES_2.insets = new Insets(50,20,2,900);
LRES_2.ipady = 50;
LRES_2.ipadx = 80;

name.gridx = 2;
name.gridy = 3;
name.gridheight = 5;
name.gridwidth = 1;
name.weightx = 0;
name.weighty = 0;
name.anchor = GridBagConstraints.NORTH;
name.fill = GridBagConstraints.HORIZONTAL;
name.insets = new Insets(150,20,2,900);
name.ipady = 30;
name.ipadx = 0;

name1.gridx = 2;
name1.gridy = 2;
name1.gridheight = 5;
name1.gridwidth = 1;
name1.weightx = 0;
name1.weighty = 0;
name1.anchor = GridBagConstraints.NORTH;
name1.fill = GridBagConstraints.HORIZONTAL;
name1.insets = new Insets(230,20,2,900);
name1.ipady = 30;
name1.ipadx = 0;
}
}
