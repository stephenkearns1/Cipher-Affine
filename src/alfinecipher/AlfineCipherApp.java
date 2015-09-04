/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfinecipher;


import javax.swing.JOptionPane;

/**
 *
 * @author Stephen Kearns 
 */
public class AlfineCipherApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String plainTxt;
       int keyA, keyB;
       
       //init 
       plainTxt = "";
       keyA = 0;
       keyB = 0;
       
       //new instances 
       AlfineCipher Cipher = new AlfineCipher();
       
       
       plainTxt = JOptionPane.showInputDialog(null,"Enter the text to be encrypted");
       keyA = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a digit which is coprime with 26"));
       keyB = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number between 1 - 26"));
       
       //error checker 
       if(keyA == 2 || keyA == 4 || keyA == 6 || keyA == 8 || keyA == 10 || keyA == 12 || keyA == 13 || keyA == 14 || keyA == 16
          || keyA == 18 || keyA == 20 || keyA == 22 || keyA == 24 ){
           keyA = Integer.parseInt(JOptionPane.showInputDialog(null,"You entered an number which isnt co-prime with 26, please re-enter the digit"));
       }
       
       //pass values, for processing
       Cipher.setPlainTxt(plainTxt);
       Cipher.setKeyA(keyA);
       Cipher.setKeyB(keyB);
       
       
       
       
       
    }
    
}
