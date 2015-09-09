/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfinecipher;

import java.util.ArrayList;

/**
 *
 * @author Stephen kearns
 */
public class AlfineCipher {

    String plainTxt,EncryptedChar;
    int keyA, keyB, m;
    StringBuffer sBuff;
    ArrayList<String> listTxt;
    ArrayList<Integer> listNums;
    char l;
  
    public AlfineCipher() {
        plainTxt = "";
        keyA = 0;
        keyB = 0;
        m = 26;
        listTxt = new ArrayList<String>();
        listNums = new ArrayList<Integer>();
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
    public void characterAlphabet(char l){
        switch(l){
            case 'a': listTxt.add("1");
                break;
            case 'b': listTxt.add("2");
                break;
            case 'c': listTxt.add("3");
                break;
            case 'd': listTxt.add("4");
                break;
            case 'e': listTxt.add("5");
                break;
            case 'f': listTxt.add("6");
                break;
            case 'g': listTxt.add("7");
                break;
            case 'h': listTxt.add("8");
                break;
            case 'i': listTxt.add("9");
                break;
            case 'j': listTxt.add("10");
                break;
            case 'k': listTxt.add("11");
                break;
            case 'l': listTxt.add("12");
                break;
            case 'm': listTxt.add("13");
                break;
            case 'n': listTxt.add("14");
                break;
            case 'o': listTxt.add("15");
                break;
            case 'p': listTxt.add("16");
                break;
            case 'q': listTxt.add("17");
                break;
            case 'r': listTxt.add("18");
                break;
            case 's': listTxt.add("19");
                break;
            case 't': listTxt.add("20");
                break;
            case 'u': listTxt.add("21");
                break;
            case 'v': listTxt.add("22");
                break;
            case 'w': listTxt.add("23");
                break;
            case 'x': listTxt.add("24");
                break;
            case 'y': listTxt.add("25");
                break;
            case 'z': listTxt.add("26");
                break;
           
            
                
        }
            
    }
    
    public void NumToChar(int num){
            switch(num){
            case 1: sBuff.append("a");
                break;
            case 2: sBuff.append("b");
                break;
            case 3: sBuff.append("c");
                break;
            case 4:sBuff.append("d");
                break;
            case 5:sBuff.append("e");
                break; 
            case 6: sBuff.append("f");
                break;
            case 7: sBuff.append("g");
                break;
            case 8: sBuff.append("h");
                break;
            case 9: sBuff.append("i");
                break;
            case 10: sBuff.append("j");
                break;
            case 11: sBuff.append("k");
                break;
            case 12: sBuff.append("l");
                break;
            case 13: sBuff.append("m");
                break;
            case 14: sBuff.append("n");
                break;
            case 15: sBuff.append("o");
                break;
            case 16: sBuff.append("p");
                break;
            case 17: sBuff.append("q");
                break;
            case 18: sBuff.append("r");
                break;
            case 19: sBuff.append("s");
                break;
            case 20: sBuff.append("t");
                break;
            case 21: sBuff.append("u");
                break;
            case 22: sBuff.append("v");
                break;
            case 23: sBuff.append("w");
                break;
            case 24: sBuff.append("x");
                break;
            case 25: sBuff.append("y");
                break;
            case 26: sBuff.append("z");
                break;
           
            
                
        }
            
           
    }
    
public char ConvertTxt(String plainTxt, int i){
        
       l = plainTxt.charAt(i);
   
    return l;
   
   }

   public void HoldingArryEncryptTxt(){
        for(int i = 0; i < listTxt.size(); i++){
           int stringToNum = Integer.parseInt(listTxt.get(i));
           listNums.add(stringToNum);
     }
        
   }


    
}
