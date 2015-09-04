/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfinecipher;

/**
 *
 * @author Stephen J Kearns
 */
public class AlfineCipherEncrypting extends AlfineCipher{
    String EncryptedTxt;
    
    public AlfineCipherEncrypting(String plainTxt, int keyA, int keyB, int m) {
       this.plainTxt = plainTxt;
       this.keyA = keyA;
       this.keyB = keyB;
       this.m = m;
       EncryptedTxt = "";
    }
    
    
}
