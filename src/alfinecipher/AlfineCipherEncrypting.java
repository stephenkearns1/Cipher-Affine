/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfinecipher;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen J Kearns
 */
public class AlfineCipherEncrypting extends AlfineCipher{
   protected String EncryptedTxt;
   protected int num, encipher;
   
    public AlfineCipherEncrypting(String plainTxt, int keyA, int keyB, int m, char l,StringBuffer sBuff) {
       this.plainTxt = plainTxt;
       this.keyA = keyA;
       this.keyB = keyB;
       this.m = m;
       this.l = l;
       this.sBuff = sBuff;
       EncryptedTxt = "";
       encipher = 0;
    }
    
    
    public String Encrypt(){
        
     //try catch to find errors
      plainTxt = plainTxt.replaceAll("\\s+","");
      try {
            for (int i = 0; i < plainTxt.length(); i++) {
                ConvertTxt(plainTxt, i);
                characterAlphabet(l);
                // arrNums.add(Character.getNumericValue((sBuff.charAt(i))));
                System.out.println(listTxt.get(i) + "\n Newline:");

             }

            //sBuff = new StringBuffer(); 
            HoldingArryEncryptTxt();
            listTxt.clear();
            for (int j = 0; j < plainTxt.length(); j++) {
                int holding = 0;
                holding = listNums.get(j);
                encipher = (holding * keyA + keyB) % m;
                NumToChar(encipher);
                //JOptionPane.showMessageDialog(null, listNums.get(j) + "\n");

            }
            StringBuilder sb;
            sb = new StringBuilder();
          for (String s : listTxt){
                sb.append(s);
                
            }
           
          EncryptedTxt = sb.toString();
          
          JOptionPane.showMessageDialog(null, "Encrypted Text" + EncryptedTxt);


        } catch (Exception e) {
            System.out.println(e);
        }
    return EncryptedTxt;

    } //end of function
     
    
    
}
