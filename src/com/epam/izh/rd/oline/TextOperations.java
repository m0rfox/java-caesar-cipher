package com.epam.izh.rd.oline;

public class TextOperations {
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

    public static char[] convertToCharWithIncrement(String textToConverting, int step){
        char[] charText = textToConverting.toCharArray();
        for (int i = 0, j = 0; i < charText.length; i++) {
            if (i != filter(charText)[j]) {
                if (1072 <= (int) charText[i] & (int) charText[i] <= 1103) {
                    if (((int) charText[i] + step) > 1103) {
                        charText[i] = (char) (1072 + (step - (1103 - (int) charText[i])) - 1);
                        if (charText[i] > 1077) {
                            charText[i]--;
                        }
                    } else if (charText[i] > 1077) {
                        charText[i] = (char) (charText[i] + step);
                    } else charText[i] = (char) (charText[i] + step - 1);
                } else if (1040 <= (int) charText[i] & (int) charText[i] <= 1071) {
                    if (((int) charText[i] + step) > 1071) {
                        charText[i] = (char) (1040 + (step - (1071 - (int) charText[i])) - 1);
                        if (charText[i] > 1045) {
                            charText[i]--;
                        }
                    } else if (charText[i] > 1045) {
                        charText[i] = (char) (charText[i] + step);
                    } else charText[i] = (char) (charText[i] + step - 1);
                } else j++;
                if (charText[i] == 1105) {
                    charText[i] = (char) (1077 + step);
                }
            }
        }
        return charText;
    }

    }
