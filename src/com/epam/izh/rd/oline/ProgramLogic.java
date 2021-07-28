package com.epam.izh.rd.oline;

public class ProgramLogic {

    public static char[] convertToCharWithIncrement(String textToConverting, int step){
        char[] charText = textToConverting.toCharArray();
        for (int i = 0, j = 0; i < charText.length; i++) {
            if (i != AlphabetOperations.filter(charText)[j]) {
                if (AlphabetOperations.checkingForLowercase(charText[i])) {
                    charText[i] = AlphabetOperations.lowercaseLetterOverflow(charText[i],step);
                } else if (AlphabetOperations.checkingForUppercase(charText[i])) {
                    charText[i] = AlphabetOperations.uppercaseLetterOverflow(charText[i], step);
                }
                charText[i] = AlphabetOperations.convertingLatterE(charText[i], step);
                charText[i] = AlphabetOperations.convertingLatterLowerE(charText[i], step);

            }else j++;
        }
        return charText;
    }

    public static void startOfDecoding(String path, int step){
        for (int i = 0; i < step; i++) {
            System.out.println(ProgramLogic.convertToCharWithIncrement(ReadFile.readFileFromResources(path), i));

        }
    }


    }
