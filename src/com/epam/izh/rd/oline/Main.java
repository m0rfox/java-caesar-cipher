package com.epam.izh.rd.oline;


public class Main {

    public static void main(String[] args){
        System.out.println( ReadFile.readFileFromResources("src/com/epam/izh/rd/oline/Resources/Text.txt"));
        for (int i = 0; i < 32; i++){
            System.out.println(TextOperations.convertToCharWithIncrement(ReadFile.readFileFromResources("src/com/epam/izh/rd/oline/Resources/Text.txt"),i));
        }

    }
}
