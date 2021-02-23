package alfabetohebreo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
* @author JOSUÉ DANIEL REYNA ROLDÁN OCHOA
 * 
 * 
*/

public class PanelPrincipal {
     
    public PanelPrincipal(){
        
    }
    public void panel1() throws IOException{
BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));

System.out.println("EL ALFABETO EN HEBREO ת-א"+" #1-22");
System.out.println("");
System.out.println("La Letra #1  del Alfabeto en Hebreo es:"+" "+"א");
System.out.println("La Letra #2  del Alfabeto en Hebreo es:"+" "+"ב");
System.out.println("La Letra #3  del Alfabeto en Hebreo es:"+" "+"ג");
System.out.println("La Letra #4  del Alfabeto en Hebreo es:"+" "+"ד");
System.out.println("La Letra #5  del Alfabeto en Hebreo es:"+" "+"ה");
System.out.println("La Letra #6  del Alfabeto en Hebreo es:"+" "+"ו");
System.out.println("La Letra #7 del Alfabeto en Hebreo es:"+" "+"ז");
System.out.println("La Letra #8  del Alfabeto en Hebreo es:"+" "+"ח");
System.out.println("La Letra #9  del Alfabeto en Hebreo es:"+" "+"ט");
System.out.println("La Letra #10  del Alfabeto en Hebreo es:"+" "+"י");
System.out.println("La Letra #11 del Alfabeto en Hebreo es:"+" "+"כ"+" "+"ך");
System.out.println("La Letra #12 del Alfabeto en Hebreo es:"+" "+"ל");
System.out.println("La Letra #13 del Alfabeto en Hebreo es:"+" "+"מ"+" "+"ם");
System.out.println("La Letra #14 del Alfabeto en Hebreo es:"+" "+"נ"+" "+"ן");
System.out.println("La Letra #15 del Alfabeto en Hebreo es:"+" "+"ס");
System.out.println("La Letra #16 del Alfabeto en Hebreo es:"+" "+"ע");
System.out.println("La Letra #17 del Alfabeto en Hebreo es:"+" "+"פ"+" "+"ף");
System.out.println("La Letra #18 del Alfabeto en Hebreo es:"+" "+"צ"+" "+"ץ");
System.out.println("La Letra #19 del Alfabeto en Hebreo es:"+" "+"ק");
System.out.println("La Letra #20 del Alfabeto en Hebreo es:"+" "+"ר");
System.out.println("La Letra #21 del Alfabeto en Hebreo es:"+" "+"ש");
System.out.println("La Letra #22 del Alfabeto en Hebreo es:"+" "+"ת");
    
}

public void panel2(){
String [] az= new String[27];
JFrame fm= new JFrame();
fm.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/alfabetohebreo/utiles.png")));
fm.setResizable(false);
fm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
fm.setAlwaysOnTop(true);
JTextField ar= new JTextField();
ar.setHorizontalAlignment(JTextField.CENTER);
ar.setSize(50,50);
JLabel lb= new JLabel();
JButton bt= new JButton("Aceptar");
String lb1="";
String tx= "";
String [] alf= new String[27];

alf[0]="א";    
alf[1]="ב";    
alf[2]="ג";  
alf[3]="ד";   
alf[4]="ה";   
alf[5]="ו";  
alf[6]="ז";  
alf[7]="ח";  
alf[8]="ט";  
alf[9]="י";  
alf[10]="כ";  
alf[11]="ך";   
alf[12]="ל";   
alf[13]="מ";    
alf[14]="ם";   
alf[15]="נ";   
alf[16]="ן";   
alf[17]="ס";   
alf[18]="ע";    
alf[19]="פ";  
alf[20]="ף";     
alf[21]="צ";  
alf[22]="ץ";  
alf[23]="ק";  
alf[24]="ר";   
alf[25]="ש";   
alf[26]="ת";   
    
lb.setText(lb1);
tx= ar.getText();
lb.setBounds(90,0,100,100);
ar.setBounds(50,90,100,20);
bt.setBounds(40,130,120,20);
fm.setLayout(null);

fm.add(lb);
fm.add(ar);
fm.add(bt);

fm.setBounds(1100,500,200,200);
fm.setLocationRelativeTo(null);
fm.setVisible(true);
Random n= new Random();
Random m= new Random();
int a= (int) (n.nextInt(2));
int x= (int) (m.nextInt(26));
int g=x;
int b=a;
if(b==0){
lb.setText(alf[g]);
}else if(b==1){
lb.setText(alf[g]);
}

bt.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(lb.getText().equals(ar.getText())  ||lb.getText().equals(ar.getText())      ){
int a= (int) (n.nextInt(2));
int x= (int) (m.nextInt(26));
if(a==0){
lb.setText(alf[x]);
ar.setText("");
}else if(a==1){
lb.setText(alf[x]);
ar.setText("");
}
}else{
JOptionPane.showMessageDialog(null,"INCORRECTO!!!","INCORRECTO",JOptionPane.ERROR_MESSAGE);
ar.setText("");
}
}
});


Action action = new AbstractAction()
{
@Override
public void actionPerformed(ActionEvent e)
{
if(lb.getText().equals(ar.getText())  ||lb.getText().equals(ar.getText())      ){
int a= (int) (n.nextInt(2));
int x= (int) (m.nextInt(26));
if(a==0){
lb.setText(alf[x]);
ar.setText("");
}else if(a==1){
lb.setText(alf[x]);
ar.setText("");
}
}else{
JOptionPane.showMessageDialog(null,"INCORRECTO!!!","INCORRECTO",JOptionPane.ERROR_MESSAGE);
ar.setText("");
}
}
};
ar.addActionListener( action );
}
}