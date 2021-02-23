/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfabetohebreo;

import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.JTable;

/**
 *
* @author JOSUÉ DANIEL REYNA ROLDÁN OCHOA
 */
public class AlfabetoHebreo extends javax.swing.JFrame {
private HashMap<String,String> hashMap= new HashMap<String,String>();
    /**
     * Creates new form AlfabetoHebreo
     */
    
    public AlfabetoHebreo() {
   initComponents();
   setLocationRelativeTo(null);  
   setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/alfabetohebreo/utiles.png")));
      
        hashMap.put("04", "1");
        hashMap.put("03", "1");
        hashMap.put("02", "1");
        hashMap.put("01", "1");
        hashMap.put("00", "1");
        
        
        hashMap.put("13", "2");
        hashMap.put("12", "2");
        hashMap.put("11", "2");
        hashMap.put("10", "2");
        
        
        hashMap.put("23", "3");
        hashMap.put("22", "3");
        hashMap.put("21", "3");
        hashMap.put("20", "3");
        
      
        hashMap.put("33", "4");
        hashMap.put("32", "4");
        hashMap.put("31", "4");
        hashMap.put("30", "4");
        
         
        hashMap.put("43", "5");
        hashMap.put("42", "5");
        hashMap.put("41", "5");
        hashMap.put("40", "5");
        
         
        hashMap.put("53", "6");
        hashMap.put("52", "6");
        hashMap.put("51", "6");
        hashMap.put("50", "6");
        
        
        hashMap.put("63", "7");
        hashMap.put("62", "7");
        hashMap.put("61", "7");
        hashMap.put("60", "7");
        
        
        hashMap.put("73", "8");
        hashMap.put("72", "8");
        hashMap.put("71", "8");
        hashMap.put("70", "8");
        
        
        
        hashMap.put("83", "9");
        hashMap.put("82", "9");
        hashMap.put("81", "9");
        hashMap.put("80", "9");
        
        
        
        hashMap.put("93", "10");
        hashMap.put("92", "10");
        hashMap.put("91", "10");
        hashMap.put("90", "10");
        
        hashMap.put("103", "11");
        hashMap.put("102", "11");
        hashMap.put("101", "11");
        hashMap.put("100", "11");
        
        hashMap.put("113", "11");
        hashMap.put("112", "11");
        hashMap.put("111", "11");
        hashMap.put("110", "11");
        
        hashMap.put("123", "12");
        hashMap.put("122", "12");
        hashMap.put("121", "12");
        hashMap.put("120", "12");
        
        hashMap.put("133", "13");
        hashMap.put("132", "13");
        hashMap.put("131", "13");
        hashMap.put("130", "13");
        
        hashMap.put("143", "13");
        hashMap.put("142", "13");
        hashMap.put("141", "13");
        hashMap.put("140", "13");
        
        hashMap.put("153", "14");
        hashMap.put("152", "14");
        hashMap.put("151", "14");
        hashMap.put("150", "14");
        
        hashMap.put("163", "14");
        hashMap.put("162", "14");
        hashMap.put("161", "14");
        hashMap.put("160", "14");
        
        hashMap.put("173", "15");
        hashMap.put("172", "15");
        hashMap.put("171", "15");
        hashMap.put("170", "15");
        
        
        hashMap.put("183", "16");
        hashMap.put("182", "16");
        hashMap.put("181", "16");
        hashMap.put("180", "16");
        
        
        hashMap.put("193", "17");
        hashMap.put("192", "17");
        hashMap.put("191", "17");
        hashMap.put("190", "17");
        
        hashMap.put("203", "17");
        hashMap.put("202", "17");
        hashMap.put("201", "17");
        hashMap.put("200", "17");
        
        hashMap.put("213", "18");
        hashMap.put("212", "18");
        hashMap.put("211", "18");
        hashMap.put("210", "18");
        
        hashMap.put("223", "18");
        hashMap.put("222", "18");
        hashMap.put("221", "18");
        hashMap.put("220", "18");
        
        hashMap.put("233", "19");
        hashMap.put("232", "19");
        hashMap.put("231", "19");
        hashMap.put("230", "19");
        
        hashMap.put("243", "20");
        hashMap.put("242", "20");
        hashMap.put("241", "20");
        hashMap.put("240", "20");
        
        hashMap.put("253", "21");
        hashMap.put("252", "21");
        hashMap.put("251", "21");
        hashMap.put("250", "21");
        
        
        hashMap.put("263", "22");
        hashMap.put("262", "22");
        hashMap.put("261", "22");
        hashMap.put("260", "22");
        
        
        
        
        
    }
 
 private String buscar(String val){
    String result=null;
    result=hashMap.get(val);
    if(result==null){
    result="ninguno";
    }
    return result;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALEF-BET");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "ALEF", "א", "1"},
                {"2", "BET", "ב", "2"},
                {"3", "GUIMEL", "ג", "3"},
                {"4", "DALET", "ד", "4"},
                {"5", "HEI", "ה", "5"},
                {"6", "VAV", "ו", "6"},
                {"7", "ZAYIN", "ז", "7"},
                {"8", "JET", "ח", "8"},
                {"9", "TET", "ט", "9"},
                {"10", "YUD", "י", "10"},
                {"11", "KAF", "כ", "20"},
                {"11", "JAF SOFIT", "ך", "20"},
                {"12", "LAMED", "ל", "30"},
                {"13", "MEM", "מ", "40"},
                {"13", "MEM SOFIT", "ם", "40"},
                {"14", "NUN", "נ", "50"},
                {"14", "NUN SOFIT", "ן", "50"},
                {"15", "SAMEJ", "ס", "60"},
                {"16", "AYIN", "ע", "70"},
                {"17", "PE", "פ", "80"},
                {"17", "FE SOFIT", "ף", "80"},
                {"18", "TZADI", "צ", "90"},
                {"18", "TZADI SOFIT", "ץ", "90"},
                {"19", "KUF", "ק", "100"},
                {"20", "REISH", "ר", "200"},
                {"21", "SHIN", "ש", "300"},
                {"22", "TAV", "ת", "400"}
            },
            new String [] {
                "NUMERO", "NOMBRE", "LETRA", "VALOR"
            }
        ));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 5, 510, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       int selectedRow = jTable1.getSelectedRow();
    int selectedColumn = jTable1.getSelectedColumn();     
    String value= selectedRow+""+ selectedColumn;
   
  //  System.out.println(buscar(value));
    String v=buscar(value);
  //System.out.println(v);
    if(v=="ninguno"){}else{
    new JFrameImagen(v).setVisible(true);
 
    }
          
          
    
jTable1.getSelectionModel().clearSelection();
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlfabetoHebreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlfabetoHebreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlfabetoHebreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlfabetoHebreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlfabetoHebreo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
