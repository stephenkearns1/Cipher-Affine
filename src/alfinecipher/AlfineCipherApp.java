/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfinecipher;


import javax.swing.JOptionPane;

/**
 *
 * @author Stephen J Kearns 
 */
public class AlfineCipherApp {

    public static void main(String[] args) {
        String plainTxt;
        int keyA, keyB, m;
        char l;
        StringBuffer sBuff;

        plainTxt = "";
        keyA = 0;
        keyB = 0;
        m = 26;
        l = '\0';
        sBuff = new StringBuffer();

        AlfineCipherEncrypting Encrypting = new AlfineCipherEncrypting(plainTxt, keyA, keyB, m, l, sBuff);
        AffineCipherDecrypting decrypting = new AffineCipherDecrypting(keyA, keyB, m, l);

        plainTxt = JOptionPane.showInputDialog(null, "Enter the text to be encrypted");
        keyA = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a digit which is coprime with 26"));
        keyB = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 1 - 26"));

        //error checker 
        if (keyA == 2 || keyA == 4 || keyA == 6 || keyA == 8 || keyA == 10 || keyA == 12 || keyA == 13 || keyA == 14 || keyA == 16
                || keyA == 18 || keyA == 20 || keyA == 22 || keyA == 24) {
            keyA = Integer.parseInt(JOptionPane.showInputDialog(null, "You entered an number which isnt co-prime with 26, please re-enter the digit"));
        }

        Encrypting.setPlainTxt(plainTxt);
        Encrypting.setKeyA(keyA);
        Encrypting.setKeyB(keyB);

        //encrypts the text, entered by the user, and returns the encryoted txt,for decryption 
        String encryptedTxt = Encrypting.Encrypt();

        //set the keys, for decryption 
        decrypting.setKeyA(keyA);
        decrypting.setKeyB(keyB);

        decrypting.Decrypt(encryptedTxt);
        
        

    }

}
