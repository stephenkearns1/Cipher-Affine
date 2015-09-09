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
public class AffineCipherDecrypting extends AlfineCipher {

    protected ArrayList<Integer> numList;
    protected int decipher;
    private int inverse;

    public AffineCipherDecrypting(int keyA, int keyB, int m, char l) {
        this.keyA = keyA;
        this.keyB = keyB;
        this.m = m;
        this.l = l;
        numList = new ArrayList<Integer>();
        decipher = 0;
    }

    private int modInverse() {

        double inverseFind;

        inverse = 0;
        /*
          
         Finds the Multiplicative inverse of keyA by,
         multiplying i by m which is the size of the alphbate, and adding 1, 
         then dividing by keyA. numbers are subitsuited into i starting from 1 to 26,
         untill a whole number is found.
      
         */

        for (int i = 1; i <= m; i++) {
            try {
                inverseFind = (i * m + 1) / keyA;
                if (inverseFind % 1 == 0) {
                    inverse = (int) inverseFind;
                    break;
                }
            } catch (java.lang.ArithmeticException e) {
                System.out.println(e);
            }

        } // end of loop
        return inverse;
    }

    protected void Decrypt(String encryptedTxt) {
        for (int i = 0; i < encryptedTxt.length(); i++) {
            ConvertTxt(encryptedTxt, i);
            characterAlphabet(l);
        }

        HoldingArryEncryptTxt();
        modInverse();
        for (int j = 0; j < encryptedTxt.length(); j++) {
            int holding = 0;
            holding = numList.get(j);
            decipher = (inverse * holding - keyB) % m;
            NumToChar(decipher);
            JOptionPane.showMessageDialog(null, numList.get(j) + "\n");
        }
    }
   

}
