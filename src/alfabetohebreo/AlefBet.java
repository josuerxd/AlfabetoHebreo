/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfabetohebreo;

import java.util.HashMap;

/**
 *
 * @author JOSUÉ DANIEL REYNA ROLDÁN OCHOA.
 */
public class AlefBet {
private HashMap<String,HashMap<String,String>> hashmap= new HashMap  <String,HashMap<String,String>> ();
public HashMap<String,HashMap<String,String>> alefbet= new HashMap  <String,HashMap<String,String>> ();
private HashMap<String ,String> alef= new HashMap<String,String>();
private HashMap<String ,String> bet= new HashMap<String,String>();
private HashMap<String ,String> guimel= new HashMap<String,String>();
private HashMap<String ,String> dalet= new HashMap<String,String>();
private HashMap<String ,String> hei= new HashMap<String,String>();
private HashMap<String ,String> vav= new HashMap<String,String>();
private HashMap<String ,String> zayin= new HashMap<String,String>();
private HashMap<String ,String> het= new HashMap<String,String>();
private HashMap<String ,String> tet= new HashMap<String,String>();
private HashMap<String ,String> yod= new HashMap<String,String>();
private HashMap<String ,String> kaf= new HashMap<String,String>();
private HashMap<String ,String> jafsofit= new HashMap<String,String>();
private HashMap<String ,String> lamed= new HashMap<String,String>();
private HashMap<String ,String> mem= new HashMap<String,String>();
private HashMap<String ,String> memsofit= new HashMap<String,String>();
private HashMap<String ,String> nun= new HashMap<String,String>();
private HashMap<String ,String> nunsofit= new HashMap<String,String>();
private HashMap<String ,String> samej= new HashMap<String,String>();
private HashMap<String ,String> ayin= new HashMap<String,String>();
private HashMap<String ,String> pe= new HashMap<String,String>();
private HashMap<String ,String> pesofit= new HashMap<String,String>();
private HashMap<String ,String> tzadi= new HashMap<String,String>();
private HashMap<String ,String> tzadisofit= new HashMap<String,String>();
private HashMap<String ,String> kuf= new HashMap<String,String>();
private HashMap<String ,String> reish= new HashMap<String,String>();
private HashMap<String ,String> shin= new HashMap<String,String>();
private HashMap<String ,String> tav= new HashMap<String,String>();


public void ALefBet(){
alef.put("simbolo","א");
alef.put("valor","1");
alef.put("nombre","alef");
alef.put("numero","1");
hashmap.put("א",alef);
hashmap.put("1",alef);

bet.put("simbolo","ב");
bet.put("valor","2");
bet.put("nombre","bet");
bet.put("numero","2");
hashmap.put("ב",bet);
hashmap.put("2",bet);

guimel.put("simbolo","ג");
guimel.put("valor","3");
guimel.put("nombre","guimel");
guimel.put("numero","3");
hashmap.put("ג",guimel);
hashmap.put("3",guimel);


dalet.put("simbolo","ד");
dalet.put("valor","4");
dalet.put("nombre","dalet");
dalet.put("numero","4");
hashmap.put("ד",dalet);
hashmap.put("4",dalet);

hei.put("simbolo","ה");
hei.put("valor","5");
hei.put("nombre","hei");
hei.put("numero","5");
hashmap.put("ה",hei);
hashmap.put("5",hei);

vav.put("simbolo","ו");
vav.put("valor","6");
vav.put("nombre","vav");
vav.put("numero","6");
hashmap.put("ו",vav);
hashmap.put("6",vav);

zayin.put("simbolo","ז");
zayin.put("valor","7");
zayin.put("nombre","zayin");
zayin.put("numero","7");
hashmap.put("ז",zayin);
hashmap.put("7",zayin);

het.put("simbolo","ח");
het.put("valor","8");
het.put("nombre","jet");
het.put("numero","8");
hashmap.put("ח",het);
hashmap.put("8",het);

tet.put("simbolo","ט");
tet.put("valor","9");
tet.put("nombre","tet");
tet.put("numero","9");
hashmap.put("ט",tet);
hashmap.put("9",tet);

yod.put("simbolo","י");
yod.put("valor","10");
yod.put("nombre","yud");
yod.put("numero","10");
hashmap.put("י",yod);
hashmap.put("10",yod);

kaf.put("simbolo","כ");
kaf.put("valor","20");
kaf.put("nombre","kaf");
kaf.put("numero","11");
hashmap.put("כ",kaf);
hashmap.put("11",kaf);

jafsofit.put("simbolo","ך");
jafsofit.put("valor","20");
jafsofit.put("nombre","jaf sofit");
jafsofit.put("numero","11");
hashmap.put("ך",jafsofit);
hashmap.put("1111",jafsofit);

lamed.put("simbolo","ל");
lamed.put("valor","30");
lamed.put("nombre","lamed");
lamed.put("numero","12");
hashmap.put("ל",lamed);
hashmap.put("12",lamed);

mem.put("simbolo","מ");
mem.put("valor","40");
mem.put("nombre","mem");
mem.put("numero","13");
hashmap.put("מ",mem);
hashmap.put("13",mem);

memsofit.put("simbolo","ם");
memsofit.put("valor","40");
memsofit.put("nombre","mem sofit");
memsofit.put("numero","13");
hashmap.put("ם",memsofit);
hashmap.put("1313",memsofit);

nun.put("simbolo","נ");
nun.put("valor","50");
nun.put("nombre","nun");
nun.put("numero","14");
hashmap.put("נ",nun);
hashmap.put("14",nun);

nunsofit.put("simbolo","ן");
nunsofit.put("valor","50");
nunsofit.put("nombre","nun sofit");
nunsofit.put("numero","14");
hashmap.put("ן",nunsofit);
hashmap.put("1414",nunsofit);

samej.put("simbolo","ס");
samej.put("valor","60");
samej.put("nombre","samej");
samej.put("numero","15");
hashmap.put("ס",samej);
hashmap.put("15",samej);

ayin.put("simbolo","ע");
ayin.put("valor","70");
ayin.put("nombre","ayin");
ayin.put("numero","16");
hashmap.put("ע",ayin);
hashmap.put("16",ayin);

pe.put("simbolo","פ");
pe.put("valor","80");
pe.put("nombre","pe");
pe.put("numero","17");
hashmap.put("פ",pe);
hashmap.put("17",pe);

pesofit.put("simbolo","ף");
pesofit.put("valor","80");
pesofit.put("nombre","pe sofit");
pesofit.put("numero","17");
hashmap.put("ף",pesofit);
hashmap.put("1717",pesofit);

tzadi.put("simbolo","צ");
tzadi.put("valor","90");
tzadi.put("nombre","tzadi");
tzadi.put("numero","18");
hashmap.put("צ",tzadi);
hashmap.put("18",tzadi);

tzadisofit.put("simbolo","ץ");
tzadisofit.put("valor","90");
tzadisofit.put("nombre","tzadi sofit");
tzadisofit.put("numero","18");
hashmap.put("ץ",tzadisofit);
hashmap.put("1818",tzadisofit);

kuf.put("simbolo","ק");
kuf.put("valor","100");
kuf.put("nombre","kuf");
kuf.put("numero","19");
hashmap.put("ק",kuf);
hashmap.put("19",kuf);

reish.put("simbolo","ר");
reish.put("valor","200");
reish.put("nombre","reish");
reish.put("numero","20");
hashmap.put("ר",reish);
hashmap.put("20",reish);

shin.put("simbolo","ש");
shin.put("valor","300");
shin.put("nombre","shin");
shin.put("numero","21");
hashmap.put("ש",shin);
hashmap.put("21",shin);

tav.put("simbolo","ת");
tav.put("valor","400");
tav.put("nombre","tav");
tav.put("numero","22");
hashmap.put("ת",tav);
hashmap.put("22",tav);
alefbet=hashmap;

}



}
