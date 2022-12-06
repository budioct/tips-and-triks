package com.tutorial.javatips.resource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class MembacaFileDiProduction {

    public static void main(String[] args) throws Exception {

//        File file = new File("src/main/resources/artikel.txt"); // Relative folder.. tidak di rekomendasikan di production
//        File file = new File("/Dev/2022/Java/TipsAndTriks/membaca-file-dari-resources-diproduction/src/main/resources/artikel.txt"); // Absulute folder.. tidak di rekomendasikan di production
//        FileInputStream fileInputStream = new FileInputStream(file);

        InputStream fileInputStream = MembacaFileDiProduction.class.getResourceAsStream("/files/artikel.txt"); // di recomenasi di production.. getResourceAsStream membaca inputStream

        printFile(fileInputStream);
    }

    private static void printFile(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }

}


