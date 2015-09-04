/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfinecipher;

/**
 *
 * @author Stephen kearns
 */
public class AlfineCipher {

    String plainTxt,EncryptedChar;
    int keyA, keyB, m;
    StringBuffer sBuff; 
  
    public AlfineCipher() {
        plainTxt = "";
        keyA = 0;
        keyB = 0;
        m = 26;
        sBuff = new StringBuffer();
    }

    public void setPlainTxt(String plainTxt) {
        this.plainTxt = plainTxt;
    }

    public void setKeyA(int keyA) {
        this.keyA = keyA;
    }

    public void setKeyB(int keyB) {
        this.keyB = keyB;
    }
    // function will take each of the charactors one at a time, and return there numeric repersentation
    public void characterAlphabet(String letter){
        switch(plainTxt){
            case "a": EncryptedChar = "A";
                break;
            case "b": 
                break;
            case "c": 
                break;
            case "d":
                break;
            case "e":
                break;
            case "f":
                break;
            case "g":
                break;
            case "h":
                break;
            case "i":
                break;
            case "j":
                break;
            case "k":
                break;
            case "l":
                break;
            case "m":
                break;
            case "n":
                break;
            case "o":
                break;
            case "p":
                break;
            case "q":
                break;
            case "r":
                break;
            case "s":
                break;
            case "t":
                break;
            case "u":
                break;
            case "v":
                break;
            case "w":
                break;
            case "x":
                break;
            case "y":
                break;
            case "z":
                break;
           
            
                
        }
            
    }
    
    public void NumToChar(int num){
            switch(num){
            case 1: EncryptedChar = "A";
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
           
            
                
        }
    }


    
}
