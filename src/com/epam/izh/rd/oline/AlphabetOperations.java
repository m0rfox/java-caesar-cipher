package com.epam.izh.rd.oline;

public class AlphabetOperations {

    public static int[] filter(char[] charArr){
        int[] excludedCharacters= new int[charArr.length];
        for (int i = 0, j = 0; i < charArr.length; i++) {
            if (charArr[i] == '.' ^ charArr[i] == ' ' ^ charArr[i] == ',') {
                excludedCharacters[j] = i;
                j++;
            }
        }
        return excludedCharacters;
    }

    public static boolean checkingForLowercase(char latter) {
        return (1072 <= (int) latter & (int) latter <= 1103);
    }

    public static boolean checkingForUppercase(char latter) {
        return (1040 <= (int) latter & (int) latter <= 1071);
    }

    public static char lowercaseLetterOverflow(char latter, int step) {
        if (((int) latter + step) > 1103) {
            latter = (char) (1072 + (step - (1103 - (int) latter)) - 1);
            if (latter > 1077) {
                latter--;
            }
        } else if (latter > 1077) {
            latter = (char) (latter + step);
        } else latter = (char) (latter + step - 1);
        return latter;
    }

    public static char uppercaseLetterOverflow(char latter, int step) {
        if (((int) latter + step) > 1071) {
            latter = (char) (1040 + (step - (1071 - (int) latter)) - 1);
            if (latter > 1045) {
                latter--;
            }
        } else if (latter > 1045) {
            latter = (char) (latter + step);
        } else latter = (char) (latter + step - 1);
        return latter;
    }

    public static char convertingLatterE(char latter, int step) {
        if (latter == 1105) {
            latter = (char) (1077 + step);
        }
        return latter;
    }

    public static char convertingLatterLowerE(char latter, int step) {
        if (latter == 1025) {
            latter = (char) (1045 + step);
        }
        return latter;
    }
    }
