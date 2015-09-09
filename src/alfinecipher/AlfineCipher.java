/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfinecipher;

import java.util.ArrayList;

/**
 *
 * @author Stephen J Kearns
 */
public class AlfineCipher {

    String plainTxt, EncryptedChar;
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
    public void characterAlphabet(char l) {
        switch (l) {
            case 'a':
                listTxt.add("1");
                break;
            case 'b':
                listTxt.add("2");
                break;
            case 'c':
                listTxt.add("3");
                break;
            case 'd':
                listTxt.add("4");
                break;
            case 'e':
                listTxt.add("5");
                break;
            case 'f':
                listTxt.add("6");
                break;
            case 'g':
                listTxt.add("7");
                break;
            case 'h':
                listTxt.add("8");
                break;
            case 'i':
                listTxt.add("9");
                break;
            case 'j':
                listTxt.add("10");
                break;
            case 'k':
                listTxt.add("11");
                break;
            case 'l':
                listTxt.add("12");
                break;
            case 'm':
                listTxt.add("13");
                break;
            case 'n':
                listTxt.add("14");
                break;
            case 'o':
                listTxt.add("15");
                break;
            case 'p':
                listTxt.add("16");
                break;
            case 'q':
                listTxt.add("17");
                break;
            case 'r':
                listTxt.add("18");
                break;
            case 's':
                listTxt.add("19");
                break;
            case 't':
                listTxt.add("20");
                break;
            case 'u':
                listTxt.add("21");
                break;
            case 'v':
                listTxt.add("22");
                break;
            case 'w':
                listTxt.add("23");
                break;
            case 'x':
                listTxt.add("24");
                break;
            case 'y':
                listTxt.add("25");
                break;
            case 'z':
                listTxt.add("26");
                break;

        }

    }

    public void NumToChar(int num) {
        switch (num) {
            case 1:
                 listTxt.add("a");
                break;
            case 2:
                 listTxt.add("b");
                break;
            case 3:
                 listTxt.add("c");
                break;
            case 4:
                 listTxt.add("d");
                break;
            case 5:
                 listTxt.add("e");
                break;
            case 6:
                 listTxt.add("f");
                break;
            case 7:
                 listTxt.add("g");
                break;
            case 8:
                 listTxt.add("h");
                break;
            case 9:
                 listTxt.add("i");
                break;
            case 10:
                 listTxt.add("j");
                break;
            case 11:
                 listTxt.add("k");
                break;
            case 12:
                 listTxt.add("l");
                break;
            case 13:
                 listTxt.add("m");
                break;
            case 14:
                 listTxt.add("n");
                break;
            case 15:
                 listTxt.add("o");
                break;
            case 16:
                 listTxt.add("p");
                break;
            case 17:
                 listTxt.add("q");
                break;
            case 18:
                 listTxt.add("r");
                break;
            case 19:
                 listTxt.add("s");
                break;
            case 20:
                 listTxt.add("t");
                break;
            case 21:
                 listTxt.add("u");
                break;
            case 22:
                 listTxt.add("v");
                break;
            case 23:
                 listTxt.add("w");
                break;
            case 24:
                 listTxt.add("x");
                break;
            case 25:
                listTxt.add("y");
                break;
            case 26:
                listTxt.add("z");
                break;

        }

    }

    public char ConvertTxt(String plainTxt, int i) {

        l = plainTxt.charAt(i);

        return l;

    }

    public void HoldingArryEncryptTxt() {
        for (int i = 0; i < listTxt.size(); i++) {
            int stringToNum = Integer.parseInt(listTxt.get(i));
            listNums.add(stringToNum);
        }

    }

}
